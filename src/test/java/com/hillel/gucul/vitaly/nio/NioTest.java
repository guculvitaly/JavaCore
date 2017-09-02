package com.hillel.gucul.vitaly.nio;

import com.hillel.gucul.vitaly.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by insomnia on 13.08.17.
 */
public class NioTest {

    @org.junit.Test
    public void copy() {

        //Get the instance of Path of Source File
        Path pathSource = Paths.get("/home/insomnia/sonic/", "paths.txt");

        //get the File to be written
        File destFile = new File("/home/insomnia/sonic/newTest1.txt");
        File sourceFile = new File("/home/insomnia/sonic/newTest1.txt");
        try (FileOutputStream fos = new FileOutputStream(destFile);
             FileInputStream fis = new FileInputStream(sourceFile)) {

                 //copy a file to destination file and returns no of bytes written
                 long noOfBytes = Files.copy(pathSource, fos);
                System.out.println(noOfBytes);

                Path destPath1 = Paths.get("/home/insomnia/sonic/newTest2.txt");

                noOfBytes= Files.copy(fis, destPath1, StandardCopyOption.REPLACE_EXISTING);
                System.out.println(noOfBytes);

                //Using Path for source and destination of file with Files.copy
                Path destPaths2 = Paths.get("/home/insomnia/sonic/newTest3.txt");
                Path target = Files.copy(pathSource, destPaths2, StandardCopyOption.REPLACE_EXISTING);
            System.out.println(target.getFileName());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void directory() throws IOException {

        Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxrwx--x");
        FileAttribute<Set<PosixFilePermission>> fileAttribute = PosixFilePermissions.asFileAttribute(perms);
        Path path = Paths.get("/home/insomnia/sonic/", "Parent", "Child");

        Files.createDirectories(path, fileAttribute);

        Files.createTempDirectory(path, "Concreatepage");
    }


    @org.junit.Test
    public void file() throws IOException {

        Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxrwx--x");
        FileAttribute<Set<PosixFilePermission>> fileAttributes = PosixFilePermissions.asFileAttribute(perms);
        Path path = Paths.get("/home/insomnia/", "sonic", "file.txt");

        Files.createFile(path, fileAttributes);

        //another variant
        Set<PosixFilePermission> posixFilePermissions = new HashSet<>();
        posixFilePermissions.add(PosixFilePermission.OWNER_READ);
        FileAttribute<Set<PosixFilePermission>> fileAttributes2 = PosixFilePermissions.asFileAttribute(posixFilePermissions);
        Path path2 = Paths.get("/home/insomnia/", "sonic", "fileNew.txt");
        Files.createFile(path2, fileAttributes2);

    }


}
