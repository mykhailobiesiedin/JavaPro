package lesson_6;

import java.lang.reflect.Array;
import java.util.List;

public class RubberArray {
    private int[] array;

    public RubberArray() {
        array = new int[0];
    }

    public void add(int value) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = value;
        array = newArray;
    }

    public int get(int index) {
        return array[index];
    }

    public void remove(int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        array = newArray;
    }

    public void addByIndex(int index, int element) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        newArray[index] = element;
        array = newArray;
    }

    public void addAll(int [] array1) {
        int[] newArray = new int[array.length + array1.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.arraycopy(array1, 0, newArray, array.length , array1.length );
        array = newArray;
    }

    public boolean contains(int element){
        for (int j : array) {
            if (j == element) {
                return true;
            }
        }
        return false;
    }

    public int indexOF(int value){
        for (int i=0; i< array.length; i++){
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        return array.length == 0;

    }
    public void clear(){
        int [] newArray = new int[0];
        array = newArray;
    }

    public int size(){
        int count = 0;
        for (int elements : array) {
            count++;
        }
       return count;
    }



    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        for (int i = 0; i < array.length; i++) {
            stringBuffer.append(array[i]);
            if (i < array.length - 1) {
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.append("]").toString();
    }
}
