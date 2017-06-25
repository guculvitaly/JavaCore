package com.hillel.gucul.vitaly.string;
import java.util.*;
/**
 * Created by insomnia on 25.06.17.
 */
public class StringData {
    public static void main(String[] args) {
        String str = "Hello World!";

        //first variant
        char [] chr = str.toCharArray();

        for (int i = 0; i < chr.length; i ++){
            System.out.print(" [ " + chr[i] + " ] ");
        }

        System.out.println();

        //string variant

        for (int i = 0; i < str.length(); i ++){
            if (str.charAt(i) == ' '){
                System.out.print(" ");
            }else {
                System.out.print(" [ " + str.charAt(i) + " ] ");
            }
        }
        System.out.println();

        //Create string using  an array of chars in constructor
        char[] c = {'H', 'E', 'L', 'L', 'O'};
        String constructorString = new String (c);
        System.out.println(constructorString);


        //Create an array of chars from string
        char [] ch = constructorString.toCharArray();

        //Iterate an array of chars
         for (int i = 0; i < ch.length; i ++){
             System.out.print(ch[i]);
         }

        //Reverse an array of chars
        for (int i = 0; i < ch.length / 2; i ++){
             char tmp = ch[i];
             ch[i] = ch[ch.length - i - 1];
             ch[ch.length - i - 1] = tmp;

        }
        System.out.println();
        //Результат
        for (int i = 0; i < ch.length; i ++){
            System.out.print(ch[i]);
        }
        System.out.println();


        StringBuffer buf = new StringBuffer("Hello Ok");
        System.out.println(buf);


        //Revert string using StringBuffer
        String reverseString = new StringBuffer(" Alexey").reverse().toString();
        System.out.println(reverseString);

        //Соеденинние строк
        String first = "Milan";
        String second = "Berlin";

        System.out.println(first + second );

        //String concat
        String third;
        third = first.concat(second);
        System.out.println(third + " !!! ");
        System.out.println(first.concat(second));
        System.out.println(first);

        String ua = "Kiev";

        //String Ends with "in"
        System.out.println(second.endsWith("in"));

        //String contains "il"
        System.out.println(first.contains("il"));

        //UpperCase method
        System.out.println(second.toUpperCase());
        //LoverCase
        System.out.println(first.toLowerCase());

        System.out.println(first.replace('M', 'B') + second.replace('B', 'M'));

        //Create new

        Employee employee = new Employee();

        employee.setName("Ivan");
        employee.setAge(25);
        employee.setSalary(1234);

        System.out.println(employee);


        //Разбить строку на массивы строк
        String splitString = "We love New Year";

        String splitStringArray [] = splitString.split(" ");
        //Вывели массив целиком
        System.out.println(Arrays.toString(splitStringArray));

        //перебрали массив и поменяли символ на последний каждого слова
        for (int i = 0; i < splitStringArray.length; i++){

            splitStringArray[i] = splitStringArray[i]
                    .replace(splitStringArray[i].charAt(0),
                        splitStringArray[i].charAt(splitStringArray[i].length() - 1));
        }

        System.out.println(Arrays.toString(splitStringArray));

        //Capacity
        StringBuffer strbf = new StringBuffer("New Word");
        System.out.println(strbf);
        System.out.println(strbf.capacity());

        String str1 = "Товар стоит ";
        String str2 = " баксов";
        int sum = 10;

        StringBuffer sb = new StringBuffer(20);
        sb.append(str1).append(sum).append(str2);
        System.out.println(sb);

        //Write an array af strings to StringBuffer
        String[] stringArray = {"My name is Petia", "I`m president of Ukraine", "I have factory"};

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < stringArray.length; i++){
            buffer.append(" [ " + stringArray[i] + " ] ");
        }

        System.out.println(buffer);

        //Меняем местами строки в массиве строк
        String[] changeWords = {"Ivan Petrov", "Stas Ivanov", "Petr Stasovich"};

        System.out.println(Arrays.toString(changeWords));

       String tmp = changeWords[0];
       changeWords[0] = changeWords[changeWords.length - 1];
       changeWords[changeWords.length - 1] = tmp;

        System.out.println(Arrays.toString(changeWords));
        System.out.println(StringData.createRandomString());

    }

    //Generic password

    private static final String mCHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final int STR_LENGHT = 13; // длина генерируемой строки

    public static String createRandomString(){
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        System.out.println(mCHAR.length());

            for (int i = 0; i < STR_LENGHT; i++){
                int number = random.nextInt(mCHAR.length());
                //System.out.println(number);
                char ch = mCHAR.charAt(number);
                builder.append(ch);
            }
                return builder.toString();

    }


}
