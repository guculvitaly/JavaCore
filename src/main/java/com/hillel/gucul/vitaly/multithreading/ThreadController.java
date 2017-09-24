package com.hillel.gucul.vitaly.multithreading;

import org.jsoup.Jsoup;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;

/**
 * Created by insomnia on 23.09.17.
 */
public class ThreadController implements Runnable {

    private String url;
    private int counter;
    private Path path = Paths.get(".").toAbsolutePath().getParent();

    public ThreadController(String url) {
        this.url = url;
    }

    @Override
    public void run() {

        try  {
            File linksFile = new File(path + "/src/main/resources/links", Thread.currentThread().getName()+ ".html");
            try (BufferedWriter linksFileWriter = new BufferedWriter(new FileWriter(linksFile, true))) {

                org.jsoup.Connection.Response html = Jsoup.connect(url).execute();
                linksFileWriter.write(html.body());

                System.out.println(Thread.currentThread().getName() + " Started!");

                counter = TestMain.atomicInteger.incrementAndGet();
                System.out.println(counter + " number of Sites are checked!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
