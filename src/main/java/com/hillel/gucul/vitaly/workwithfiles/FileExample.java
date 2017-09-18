package com.hillel.gucul.vitaly.workwithfiles;

import java.io.*;

/**
 * Created by insomnia on 11.08.17.
 */
public class FileExample {
    public static void main(String[] args) {

        final String PATH = "/home/insomnia/sonic/src/test/resources/files_data/";

        File file;
        File [] files = null;
        String str = "";

        try {
            for (int i = 0; i < 15 ; i++) {
                file = new File(PATH + "Test" + i + ".txt");

                System.out.println(file.createNewFile());
                System.out.println(file.getName());
                System.out.println(file.toString());
                System.out.println(file.canExecute());
                System.out.println(file.canWrite());
                System.out.println(file.delete());
                System.out.println(file.createNewFile());
                System.out.println(file.getParent());

            }

            File folder = new File(PATH);

            files = folder.listFiles();

            for (File  everyFile : files) {
                System.out.println(everyFile);
            }

        }catch(IOException e) {
            e.printStackTrace();

        }
        System.out.println("+++++++++===========++++++++=");

        File inputFile = new File("/home/insomnia/sonic/src/test/resources/Song.txt");
        System.out.println(inputFile.length());

        if (inputFile.exists() && inputFile.length() > 0) {
            try(FileInputStream fileInputStream = new FileInputStream(inputFile)){

                byte [] bytes = new byte[(int) inputFile.length()];

                int x = fileInputStream.read(bytes);

                System.out.println(x);

                char symbol;
                for (byte b : bytes) {
                    symbol = (char) b;
                    System.out.print(symbol);
                    str += symbol;
                }

                System.out.println();
                System.out.println(str);

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("---------------------");

        boolean toWrite = false;
        boolean toModify = false;




        if (files != null) {
            for (File everyFile : files) {
                if (everyFile.length() == 0) {
                    toWrite = true;
                }else  {
                    toModify = true;
                }

                if (toWrite) {
                    try
                            (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(everyFile))) {
                        objectOutputStream.writeObject(str);

                    }catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (toModify) {
                    try
                            (FileOutputStream  fileOutputStream = new FileOutputStream(everyFile, true);
                             ObjectOutputStream  objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                        objectOutputStream.writeObject("THE BEATLES");

                    }catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
