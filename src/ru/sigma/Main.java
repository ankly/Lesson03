package ru.sigma;

/**
 * Created by Student08 on 10.04.2015.
 */
public class Main {
    public static void main(String[] args) {
       /* Human h1 = new Human();
        h1.name = "Vova";
        h1.age = 21;
        h1.gender = "male";

        h1.eat();

        System.out.println(h1.name);


        Algorithms al = new Algorithms();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);

        }
        int min = al.findMin(array);
        System.out.println(min);*/

        MyArrayList list = new MyArrayList();

        list.add(5);
        list.add(10);

        for (int i = 0; i < list.size; i++) {
            System.out.print(list.objects[i] + " ");

        }

        list.insert(6, 1);

        list.addArray(addArr);


       System.out.println();
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.objects[i] + " ");

        }

        list.insertArray(insArr, 5);

        System.out.println();
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.objects[i] + " ");

        }

        list.remove(5);

        System.out.println();
        for (int i = 0; i < list.size; i++) {
            System.out.print(list.objects[i] + " ");

        }

        list.clear();

        list.addArray(insArr);
        list.add(5);
        list.remove(1);
        list.insertArray(addArr,1);

        System.out.println();
        for (int i = 0; i < list.size; i++) {

            System.out.print(list.objects[i] + " ");

        }




    }
}
