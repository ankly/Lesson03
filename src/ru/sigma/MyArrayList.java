package ru.sigma;

/**
 * Created by Student08 on 10.04.2015.
 */
public class MyArrayList {
    int[] objects = null;
    int size = 0;

    public void add (int element){
        int[] newArray = new int[size+1];
        for (int i = 0; i < size; i++) {
            newArray[i]= objects[i];
        }
        newArray[size]=element;
        objects = newArray;
        size++;
    }

    public void insert (int element, int index){

        if (index>=0 && index< size+1) {

            int[] newArray = new int[size + 1];

            for (int i = 0; i < index; i++) {
                newArray[i] = objects[i];
            }
            newArray[index] = element;

            for (int i = index + 1; i < size + 1; i++) {
                newArray[i] = objects[i - 1];
            }

            objects = newArray;
            size++;
        }
        }

    public void addArray(int [] elements) {

        for (int i = 0; i < elements.length; i++) {
            add(elements[i]);

        }
    }


    public void remove(int index){

    }

}
