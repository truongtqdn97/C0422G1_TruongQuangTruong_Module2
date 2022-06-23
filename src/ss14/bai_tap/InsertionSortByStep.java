package ss14.bai_tap;

import java.util.Arrays;

public class InsertionSortByStep {
    public static void insertionSort(int[] list){
        int x;
        int pos;
        for (int i = 0; i < list.length; i++) {

            x = list[i];
            pos = i;
            System.out.println(x+" = list["+i+"]" );
            while (0<pos&& x<list[pos-1]){
                list[pos] = list[pos-1];
                pos--;
            }
            System.out.println("i ="+i);
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
