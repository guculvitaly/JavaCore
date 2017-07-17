package com.hillel.gucul.vitaly.exception;

/**
 * Created by insomnia on 16.07.17.
 */
public class ExceptionTest {
    public static void main(String[] args) {

    }

    //RuntimeExceptions

    //ArithmeticException  - арифметическая ошибка
//
//        int x = 5 / 0;
//        int y = 5 % 0;
//        System.out.println(y);

    //ArrayIndexOutOfBoundsException - выход индекса за границу массива
//
//        Integer[] arr3 = {3, 4, 5};
//        System.out.println(arr3[arr3.length]);

//         Integer[] arr3 = {3, 4, 5};
//
//            System.out.println(arr[arr.length]);
//
    // ArrayStoreException  - присваивание элементу массива объекта несовместимого типа
//
//            Object arr1 [] = new Integer[4];
//            arr1[0] = 4.4;

    //ClassCastException - неверное приведение
//        Object x = new Integer(1);
//        System.out.println((String) x);

    //NegativeArraySizeException - создан массив отрицательного размера

//       int [] mass = new int[-10];

    //NullPointerException - неверное использование пустой ссылки

//       int[] nullArray = null;
//
//        for (int i = 0; i < nullArray.length; i++)
//            System.out.println(nullArray[i]);


    /** area value
     * @param x
     * @param y
     * @return
     */
    public static int getAreaValue(int x, int y){
        if (x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' " +
        " is negative: x = " + x + ", y = "+ y );

        return x * y;
    }
}
