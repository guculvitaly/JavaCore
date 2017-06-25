package com.hillel.gucul.vitaly.string;
import org.junit.Test;

import java.util.StringTokenizer;

/**
 * Created by insomnia on 25.06.17.
 */
public class StringTokenizerExample {

    public void splitBySpace(String str) {

        StringTokenizer st = new StringTokenizer(str);

        System.out.println("---- Split by space ----");
        while (st.hasMoreElements()){
            System.out.println(st.nextElement());
        }
    }

    public void splitByComa(String str){
        System.out.println("---- Split by coma ',' ----");
        StringTokenizer st2 = new StringTokenizer(str, ",");

        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }

    }

    @Test
    public void reaCSV(){
        String path = "/home/insomnia/sonic/src/main/resources/file.csv";
        ReadFile.readCsv(path);
    }


}
