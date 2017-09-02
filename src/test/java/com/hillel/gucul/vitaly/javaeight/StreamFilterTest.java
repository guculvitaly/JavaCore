package com.hillel.gucul.vitaly.javaeight;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by insomnia on 20.08.17.
 */
public class StreamFilterTest {

    @Test
    public void filter() {

        List<String> lines = Arrays.asList("first", "second", "third");

        List<String> result = lines.stream().filter(line -> !"second".equals(line)).collect(Collectors.toList());

        result.forEach(System.out::println);
    }

    @Test
    public void filterSecond() {

        List<Person> persons = Arrays.asList(
                new Person(1, "first", 39),
                new Person(2, "second", 20),
                new Person(3, "third", 40)
        );

        Person result1 = persons.stream().parallel()
                .filter(x -> x.getId().equals(2)).findAny().orElse(null);
        System.out.println(result1);

        Person result2 = persons.stream()
                .filter(x -> x.getId().equals(5)).findAny().orElse(null);
        System.out.println(result2);

    }

    @Test
    public void filterAndMap() {

        List<Person> persons = Arrays.asList(
                new Person(1, "first", 30),
                new Person(2, "second", 20),
                new Person(3, "third", 40)

        );

        String name = persons.stream().parallel()
                .filter(x -> "second".equals(x.getName()))
                .map(Person::getName)
                .findAny()
                .orElse("");

        System.out.println("name : " + name);

        System.out.println("-----------------------------");

        List<String> collect = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);


        System.out.println("--------------------------------");

        Integer id = persons.stream().filter(x -> x.getId().equals(3))
                .map(Person::getId)
                .findAny()
                .orElse(null);

        System.out.println("id : " + id);

        Person person = persons.stream().filter(x -> x.getId().equals(id))
                .findAny().orElse(null);

        System.out.println(person);

        List<Integer> collectId = persons.stream().map(Person::getId).collect(Collectors.toList());
        collectId.forEach(System.out::println);

        List<Person> personList = persons.stream().collect(Collectors.toList());
        personList.forEach(System.out::println);

        List<String> personList1 = persons.stream().map(Person::toString).collect(Collectors.toList());
        personList1.forEach(System.out::println);

        persons.forEach(System.out::println);

    }

    @Test
    public void map() {

        List<String> alpha = Arrays.asList("a", "b", "c", "d");

        //Before Java8
        List<String> alpaUpper = new ArrayList<>();
        for (String s: alpha) {
            alpaUpper.add(s.toUpperCase());
        }

        System.out.println(alpha); // [a, b, c, d]
        System.out.println(alpaUpper); // [A,B,C,D]


        //Java8
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect); // [A,B,C,D]

        //Extra, streams apply to any dara type
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); // result [2,4,6,8,10]
    }

    @Test
    public void mapObject() {

        List<Person> staff = Arrays.asList(
                new Person(1, "first", 30),
                new Person(2, "second", 27),
                new Person(3, "third", 33)
        );


        //convert inside the map() method directly.
        List<Person> resul2 = staff.stream().map(temp -> {
            Person obj = new Person();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            return obj;
        }).collect(Collectors.toList());

        System.out.println(resul2);

    }

    @Test
    public void groupingBy() {

        List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

        Map<String, Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);

        Map<String, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and to finalMap
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long> comparingByKey().reversed()).
                forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        System.out.println(finalMap);

        Stream.of("AAA", "BBB", "CCC").parallel().forEach(s -> System.out.println("Output:" + s));
        System.out.println("---------------");
        Stream.of("AAA", "BBB", "CCC").parallel().forEachOrdered(s -> System.out.println("Output:" + s));


    }

    @Test
    public void filterNull() {

        Supplier<Stream <String>> languageSupplier = () -> Stream.of("java", "python", "node", null, "ruby", null, "php");

        List<String> result = languageSupplier.get().filter(x -> x!=null).collect(Collectors.toList());
        result.forEach(System.out::println);

        System.out.println("------------------");

        List<String> resultNew = languageSupplier.get().filter(Objects::nonNull).collect(Collectors.toList());
        resultNew.forEach(System.out::println);
    }


    @Test
    public void arrayToStream() {

        String[] array = {"a", "b", "c", "d", "e"};

        //Arrays.stream
        Stream<String> stream1 = Arrays.stream(array);
        stream1.forEach(System.out::println);

        //Stream.of
        Stream<String> stream2 = Stream.of(array);
        stream2.forEach(System.out::println);
    }

    @Test
    public void primitiveArrayToStream() {

        int [] intArray = {1,2,3,4,5};

        //1. Arrays.stream -> IntStream
        IntStream intStream1 = Arrays.stream(intArray);
        intStream1.forEach(System.out::println);

        //2. Stream.of -> Stream <int []>
        Stream<int[]> temp = Stream.of(intArray);

        //Cant print Stream<int[]> directly, convert / flat it to IntStream
        IntStream intStream2 = temp.flatMapToInt(Arrays::stream);
        intStream2.forEach(System.out::println);
    }


    @Test
    public void convertStreamToList() {

        Stream<String> language = Stream.of("java", "python", "node");

        //Convert a Stream to List
        List<String> result = language.collect(Collectors.toList());

        result.forEach(System.out::println);


        Stream<Integer> number = Stream.of(1, 2, 3, 4, 5);

        List<Integer> result2 = number.filter(x -> x!= 3).collect(Collectors.toList());

        result2.forEach(System.out::println);

        List<Person> staff = Arrays.asList(
                new Person(1, "first", 30),
                new Person(2, "second", 27),
                new Person(3,"third", 33)
        );

        Map<Integer, String> map = new HashMap<>();

        map = mapObj(staff);

        map.forEach((x, y) -> {
            System.out.println(x + " " + y);
        });

        map = staff.stream().collect(Collectors.toMap(Person::getId, Person::getName));

        map.forEach((x, y) ->{
            System.out.println(x + " " + y);
        });
    }

    public HashMap<Integer, String> mapObj(List<Person> personList) {
        HashMap<Integer, String> map = new HashMap<>();
        personList.forEach((x) -> {
            map.put(x.getId(), x.getName());
        });
        return map;
    }

}
