package com.hillel.gucul.vitaly.collections;

import com.hillel.gucul.vitaly.annotations.Test;

import java.util.*;

/**
 * Created by insomnia on 30.07.17.
 */
public class CollectionsTest {

    @org.junit.Test
    public void arrayList() {

        String str1 = "First";
        String str2 = "Second";
        String str3 = "Third";
        String str4 = "Forth";
        String str5 = "Fifth";

        Integer int1 = 5;
        Integer int2 = 9;
        Integer int3 = 2;
        Integer int4 = 8;
        Integer int5 = 1;

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        List<String> stringList = new ArrayList<>();
        stringList.add(str1);
        stringList.add(str5);
        stringList.add(str3);
        stringList.add(str2);
        stringList.add(str4);
        stringList.add(str5);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(int1);
        integerList.add(int2);
        integerList.add(int3);
        integerList.add(int4);
        integerList.add(int5);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));

        }

        for (String string : stringList) {
            System.out.println(string);

        }

        System.out.println();

        System.out.println(stringList.get(2));

        System.out.println(stringList.size());

        stringList.remove(1); //remove index

        System.out.println(stringList);

        stringList.add(stringList.size(), "Zero"); // add element

        System.out.println(stringList);

        stringList.set(3,"Hello"); // переаписываем эелемент

        System.out.println(stringList);

        System.out.println(integerList);

        integerList.set(4, null);

        System.out.println(integerList);

        List<Integer> newInt = new ArrayList<>();

        newInt.add(60);
        newInt.add(100);

        integerList.addAll(1, newInt);
        System.out.println(integerList);

        student1.setName("Ivan");
        student1.setSecondName("Ivanovich");
        student1.setAge(25);

        student2.setName("Oleg");
        student2.setSecondName("Olegovich");
        student2.setAge(25);

        student3.setName("Maksim");
        student3.setSecondName("Maksimovich");
        student3.setAge(18);

        for (Student student: students) {
            System.out.println(student.getName() + " " + student.getSecondName() +
            " " + student.getAge());

        }

        Set<Integer> treeSet = new TreeSet<>();

        System.out.println(treeSet);

        List<Integer> listX = new ArrayList<>();
        listX.add(5);
        listX.add(7);
        listX.add(6);
        System.out.println(listX);

        Set<Integer> treeSet2 = new TreeSet<>(listX);
        System.out.println(treeSet2);

    }

    @org.junit.Test
    public void linkedList() {

        Integer int1 = 5;
        Integer int2 = 9;
        Integer int3 = 2;
        Integer int4 = 8;
        Integer int5 = 1;

        List<Integer> integerList = new LinkedList<>();
        integerList.add(int1);
        integerList.add(int2);
        integerList.add(int3);
        integerList.add(int4);
        integerList.add(int5);

        System.out.println(integerList);

        integerList.add(1);
        System.out.println(integerList);

        Iterator iterator = integerList.iterator();

        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        if (iterator.hasNext())
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            //System.out.println(iterator.next());

        System.out.println();

        ListIterator listIterator = integerList.listIterator();

        while (listIterator.hasNext())
            System.out.print(listIterator.next());
        System.out.println();

        while (listIterator.hasPrevious())
            System.out.print(listIterator.previous());
    }

    @org.junit.Test
    public void hashSet() {

        Integer int1 = 5;
        Integer int2 = 9;
        Integer int3 = 2;
        Integer int4 = 8;
        Integer int5 = 1;

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(int1);
        integerSet.add(int2);
        integerSet.add(int3);
        integerSet.add(int4);
        integerSet.add(int5);

        System.out.println(integerSet);

        System.out.println(integerSet.add(9)); //if add number 9


        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setName("Ivan");
        student1.setSecondName("Ivanovich");
        student1.setAge(25);

        student2.setName("Oleg");
        student2.setSecondName("Olegovich");
        student2.setAge(25);

        student3.setName("Maksim");
        student3.setSecondName("Maksimovich");
        student3.setAge(18);

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());

        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSecondName() +
            " " + student.getAge());
        }

        HashSet<String> countryHashSet = new HashSet<>();
        countryHashSet.add("США");
        countryHashSet.add("Кот-Д'Ивуар");
        countryHashSet.add("Франция");
        countryHashSet.add("Гондурас");
        countryHashSet.add("Кот-Д'Ивуар");

        Iterator<String> iterator = countryHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ", ");
        }

    }

    @org.junit.Test
    public void linkedHashSet() {
        Set<String> countryHashSet = new LinkedHashSet<>();
        countryHashSet.add("США");
        countryHashSet.add("Кот-Д'Ивуар");
        countryHashSet.add("Франция");
        countryHashSet.add("Гондурас");
        countryHashSet.add("Кот-Д'Ивуар");

        Iterator<String> iterator = countryHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ", ");
        }
    }

    @org.junit.Test
    public  void treeSet() {

        Integer int1 = 5;
        Integer int2 = 9;
        Integer int3 = 2;
        Integer int4 = 8;
        Integer int5 = 1;

        List<Integer> list = new ArrayList<>();
        list.add(int1);
        list.add(int2);
        list.add(int3);
        list.add(int4);
        list.add(int5);

        Set<Integer> integerSet = new TreeSet<>(list);
        System.out.println(integerSet);

        Random random = new Random();
        SortedSet<Integer> numberSet = new TreeSet<>();

        Integer randomInt = null;
        for (int i = 0; i < 30; i++) {
            randomInt = random.nextInt(10);
            System.out.print(randomInt);
            numberSet.add(randomInt);

        }
        System.out.println();

        System.out.println(numberSet);

        System.out.println(numberSet.first()); //first element

        System.out.println(numberSet.last()); // last element

        System.out.println(numberSet.subSet(0,5)); //от и до

        System.out.println(numberSet.tailSet(5)); // хвостовая часть

        numberSet.clear();

        System.out.println(numberSet);
    }
}
