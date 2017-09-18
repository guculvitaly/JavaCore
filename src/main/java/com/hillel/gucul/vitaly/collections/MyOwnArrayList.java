package com.hillel.gucul.vitaly.collections;

import java.io.Serializable;
import java.util.RandomAccess;

/**
 * Created by insomnia on 04.08.17.
 */
public class MyOwnArrayList implements RandomAccess, Cloneable, Serializable {

    private transient Object[] elementData; //Making one array to hold data
    private int size;
    protected transient int modCount = 0; //Counter to find how many times Array is re-sized
    private static final long serialVersionUID = 1234L;

    public MyOwnArrayList() { this(10);}

    public MyOwnArrayList(int initialCapasity) {
        super();
        if (initialCapasity < 0)
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapasity);
        this.elementData = new Object[initialCapasity];
    }

    public boolean add(Object obj) {
        validateCapacity(size + 1);
        elementData[size++] = obj;
        return true;
    }

    public Object get(int index) {
        Object obj = elementData[index];
        return obj;
    }

    public int size() {
        return size;
    }


    public void validateCapacity(int minCapacity) {
        modCount++;
        int oldCapacity = elementData.length;
        if (minCapacity > oldCapacity) {
            Object oldData[] = elementData;
            int newCapacity = (oldCapacity * 3)/2;//Size increase by 1.5 times

            if (newCapacity < minCapacity)
                newCapacity = minCapacity;

            elementData = new Object[newCapacity];
            System.arraycopy(oldData, 0, elementData, 0, size);//src, srcPos, dest,destPos,length
        }
    }

    public Object remove(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " +index+", Size: " + size);

        modCount++;
        Object oldValue = elementData[index];

        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null; //Let go do its work
        return oldValue;
    }

    //Defining iterator method
    public FruitIterator iterator() {
        System.out.println("My overridded iterator method called in Fruit class");
        return new FruitIterator(this);
    }


}
