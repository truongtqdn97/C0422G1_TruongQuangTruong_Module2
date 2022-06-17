package ss10.bai_tap.mylist;

import java.util.Arrays;

public class MyList<E>{
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        if (capacity>=0)
        elements = new Object[capacity];
        else throw new  IllegalArgumentException("capacity "+ capacity);
    }

    public void add(E e, int index) {
        if (index>elements.length){
            throw new IllegalArgumentException("index + "+index);
        }
        else
        if (size == elements.length) {
            ensureCapa();
        }
        if (elements[index]==null){
            elements[index] = e;
            size++;
        }
        else {
            for (int i = size + 1; i >= index ; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = e;
            size++;
        }
    }

    public E remove(int index){
        if (index<0||index>elements.length){
            throw new IllegalArgumentException("Error index: "+index);
        }
        for (int i = index; i < size-1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return (E) elements[index];
    }

    public int size(){
        return this.size;
    }

    public boolean contains(E e){
        return this.indexOf(e)>=0;
    }

    public int indexOf(E e){
        int index = -1;
        for (int i = 0; i <size ; i++) {
            if (this.elements[i].equals(e)){
                return i;
            }
        }
        return index;
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i +", Size "+i);
        }
        return (E) elements[i];
    }


    public boolean add(E e){
        if (elements.length == size){
            this.ensureCapa();
        }
        elements[size] = e;
        size++;
        return true;
    }

    public MyList<E> clone(){
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }

    public void clear(){
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }



}
