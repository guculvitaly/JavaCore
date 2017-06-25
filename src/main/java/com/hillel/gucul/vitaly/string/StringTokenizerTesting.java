package com.hillel.gucul.vitaly.string;

import org.junit.Test;

/**
 * Created by insomnia on 25.06.17.
 */
public class StringTokenizerTesting {
    @Test
    public void tokenize(){
        String str = "Hello World OK";
        String str2 = "Hello World, OK";
        StringTokenizerExample stringTokenizerExample = new StringTokenizerExample();

        stringTokenizerExample.splitBySpace(str);
        stringTokenizerExample.splitByComa(str2);
    }
}
