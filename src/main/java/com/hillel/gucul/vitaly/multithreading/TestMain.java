package com.hillel.gucul.vitaly.multithreading;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by insomnia on 23.09.17.
 */
public class TestMain {

    public static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) throws Exception {

        String mainLink = "https://rozetka.com.ua/";
        List<String> links = new ArrayList<>();

        Integer threadsQuantity = 10;

        Document document = Jsoup.connect(mainLink).get();
        Elements linksTags = document.select("a[href]");

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(threadsQuantity);

        String link;
        for (Element element: linksTags ) {
            link = element.attr("href");
            if (link.startsWith("https://rozetka.com.ua")) {
                links.add(link);
            }

        }

        for (int i = 0; i < threadsQuantity ; i++) {
            ThreadController threadsController = new ThreadController(links.get(i));
            executor.execute(threadsController);
        }

        executor.shutdown();
    }
}
