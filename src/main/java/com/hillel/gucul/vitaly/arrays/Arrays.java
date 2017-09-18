package com.hillel.gucul.vitaly.arrays;

/**
 * created by gucul_vitaly
 */
public class Arrays {
    protected Arrays(){}
    public static void main(String[] args) {
        int [][] arr = new int [7][4];
        System.out.println(" Arrays of random numbers :");
            for (int i = 0; i < arr.length; i ++){
                for (int y = 0; y < arr.length; y ++){
                    arr[i][y] = (int) (Math.random() * 11)-5;
                    System.out.println(" [ "+ arr[i][y] + " ] ");

                }
            }
    }
}
