package com.hillel.gucul.vitaly.nio;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by insomnia on 13.08.17.
 */
public class TestReadFile {

    @Test
    public void testReader() {
        String fileName = "/home/insomnia/sonic/pom.xml";

        //read file into stream, try-with-resources
        try (Stream <String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(System.out:: println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testSecondReader() {

        String fileName = "/home/insomnia/sonic/pom.xml";
        List<String> list = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            //1.filter line
            //2. convert all content to uppercase
            //3. convert it into a List

            list = stream
                    .filter(line ->line.startsWith("<"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
        }catch (IOException e) {
            e.printStackTrace();
        }

        list.forEach(System.out::println);
    }

    public static void square(int num) {
        System.out.println(Math.pow(num, 2));
    }


    @Test
    public void testReference() {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);

        arrayList.forEach(TestReadFile::square);
    }


    @Test
    public void paths()  throws IOException{

        Path path = Paths.get("/home/insomnia/sonic/paths.txt");
        String question ="To be or not to be?";
        Files.write(path, question.getBytes());

        Path path2 = Paths.get("/home/insomnia/sonic/paths.txt");
        System.out.println(path2.getFileName() + " " +
        path2.getName(0) + " " +
        path2.getNameCount() + " " +
        path2.subpath(0, 2) + " " +
        path2.getParent() + " " + 
        path2.getRoot());

        TestReadFile.convertPaths();
    }

     private static void convertPaths() {
         Path relative= Paths.get("Song.txt");
         System.out.println("Relative path: " + relative);
         Path absolute = relative.toAbsolutePath();
         System.out.println("Absolute path: " + absolute);
     }


     @Test
    public void copy() {
        Path oldFile = Paths.get("/home/insomnia/sonic/", "paths.txt");
        Path newFile = Paths.get("src/main/resources/", "newFile.txt");

        try (OutputStream os = new FileOutputStream(newFile.toFile())) {
            Files.copy(oldFile, os);
        } catch (IOException ex){
            ex.printStackTrace();
        }
     }


}
