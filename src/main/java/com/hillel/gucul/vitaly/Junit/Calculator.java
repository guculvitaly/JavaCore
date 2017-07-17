package com.hillel.gucul.vitaly.Junit;

import java.util.StringTokenizer;

/**
 * Created by insomnia on 14.07.17.
 */
public class Calculator {

    public static int sum(int x, int y){
        return x + y;
    }

    public int multiply(int x, int y){
        return x * y;
    }

    public static int findMax(int arr[]){
        int max=arr[0];//arr[0]
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i])
                max=arr[i];
        }
        return max;
    }

    public static int cube(int n){
        return n*n*n;
    }

    public static String reverseWord(String str){

        StringBuilder result = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(str, " ");

        while (tokenizer.hasMoreTokens()){
            StringBuilder sb = new StringBuilder();
            sb.append(tokenizer.nextToken());
            sb.reverse();

            result.append(sb);
            result.append(" ");

        }
        return result.toString();
    }

}
