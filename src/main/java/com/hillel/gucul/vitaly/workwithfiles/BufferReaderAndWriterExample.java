package com.hillel.gucul.vitaly.workwithfiles;

import java.io.*;
import java.util.regex.Pattern;

/**
 * Created by insomnia on 11.08.17.
 */
public class BufferReaderAndWriterExample {
    public static void main(String[] args) throws IOException {

        final String FILES_PATH = "/home/insomnia/sonic/src/test/resources/test";
        final String FILE_CSV_NAME = "File.csv";

        File [] files = new File(FILES_PATH).listFiles();

        File fileCSV = new File(FILES_PATH + "/" + FILE_CSV_NAME);

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileCSV, true))) {
            for (File file : files) {
                if (file.length() < 10) {
                    file.delete();
                    System.out.println(file.getName() + "deleted!");
                }

                bufferedWriter.write("TEST/" + file.getName().replace(".srt", "") + ","
                 + file.getName().replace(".srt", ""));
                bufferedWriter.newLine();

            }
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
            try{
                srtHoursDuration(FILES_PATH);
            }catch (IOException e) {
            e.printStackTrace();
            }

    }

    public static void srtHoursDuration(String filePath) throws IOException{

        Pattern pattern = Pattern.compile("\\d\\d:\\d\\d:\\d\\d,\\d\\d\\d");

        Pattern pattern2 = Pattern.compile(":\\d\\d,\\d\\d\\d");

        String line;

        String formatTimeLine;

        String [] hourMin;

        Float hour;

        Float mins;

        Float minsInHours;

        Float srtHours;

        Float hourSum = 0.0f;

        File [] files = new File(filePath).listFiles();

        for (File item : files) {
            if (item.getName().endsWith(".srt")) {
                try (RandomAccessFile reader = new RandomAccessFile(item, "r")) {
                    for (int k = 0; k <= reader.length() ; k++) {
                        reader.seek(reader.length() - k);
                        line = reader.readLine();
                        System.out.println(line);

                        if (line != null && pattern.matcher(line).matches()) {
                            formatTimeLine = pattern2.matcher(line).replaceAll("");
                            hourMin = formatTimeLine.split(":");
                            hour = Float.parseFloat(hourMin[0]);
                            mins = Float.parseFloat(hourMin[1]);
                            minsInHours = mins / 60;
                            srtHours = hour + minsInHours;
                            System.out.println(item.getName() + ": ");
                            System.out.print("   ");
                            System.out.println(srtHours + " hours");
                            hourSum += srtHours;
                            break;

                        }
                    }
                }
            }
        }
        System.out.println("Total hours: " + hourSum);
    }

}
