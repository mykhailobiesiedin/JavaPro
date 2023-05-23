package lesson_6;

import java.util.ArrayList;
import java.util.List;

public class Lesson6 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(8);
        integerList.add(17);
        integerList.add(5);
        integerList.add(0, 10);
        System.out.println(integerList.get(1));
        System.out.println(integerList);

        List<Integer> newList = new ArrayList<>();
        newList.add(10);
        newList.add(11);
        newList.add(12);
        newList.add(10);


        integerList.addAll(newList);
        System.out.println(integerList);
        boolean yn = integerList.contains(17);

        System.out.println(yn);
        System.out.println(integerList.indexOf(112));
        System.out.println(integerList.indexOf(10));
        System.out.println(integerList.isEmpty());
        integerList.clear();
        System.out.println(integerList);
        System.out.println(integerList.size());

        System.out.println("********************");
        RubberArray rb = new RubberArray();
        rb.add(8);
        rb.add(17);
        rb.add(10);
        rb.add(15);
        System.out.println(rb);


        rb.addByIndex(0, 12);
        rb.remove(1);
        System.out.println(rb);
        System.out.println("********************");
        int[] numbers = {12, 13, 14};
        rb.addAll(numbers);
        System.out.println(rb);

        System.out.println(rb.contains(18));
        System.out.println(rb.contains(17));

        System.out.println(rb.indexOF(12));

           rb.clear();
        System.out.println(rb);
        rb.add(1);
        System.out.println(rb);
        System.out.println("Array is empty: " + rb.isEmpty());
        System.out.println("Elements in array: " + rb.size());

    }

}
