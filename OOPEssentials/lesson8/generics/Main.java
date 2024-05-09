package lesson8.generics;

import lesson8.generics.generic_list.MyList;
import lesson8.generics.shapes.Test;
import lesson8.visitor.uicomponents.Kvadrat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(5);
        list.add(4);
        list.add(3);

        doSomething(list);

//        for (int i = 0; i <list.size(); i++) {
//            int a = (Integer) list.get(i) + 23;
//            System.out.println(a);
//        }
//
//        System.out.println(list);

        System.out.println("=============================");


        MyList<Integer> myList = new MyList<Integer>();
        myList.add(4);
        myList.add(7);

//        System.out.println(myList.get(3));

        for (int i = 0; i < myList.size(); i++) {
            System.out.println((Integer) myList.get(i) + 3);
        }


        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");


        List<String> data = new ArrayList<>();
        data.add("A");
        data.add("B");


        //Generics => method

        System.out.println(wrap("hello"));
        System.out.println(wrap(4));
        System.out.println(wrap('A'));
        System.out.println(wrap(myList));

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Argument Integer alacaq, cast edecek string'e
        String o = wrap2(45);
        System.out.println(o);

        //Argument char, return type Object
        Object o2 = wrap2('A');

        //Argument String, return type Character
        Character o3 = wrap2("Test");


        Test test = new Test();
//        test.accept(new Noqte()) >> not compile
        test.accept(new Kvadrat());

        //Functional Interface
        Supplier<String> supplier = () -> "Hello";
        supplier.get(); // return => Hello
    }

    private static void doSomething(List list) {
        list.add("5");
    }

    public static <T> String wrap(T data) {
        return "Data: " + data;
    }

    public static <T, E> E wrap2(T data) {
        return (E) ("Data: " + data);
    }
}
