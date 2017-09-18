package com.hillel.gucul.vitaly.collections;

/**
 * Created by insomnia on 04.08.17.
 */
public class FruitIterator {

    private MyOwnArrayList fruitList;
    private int position;

    public FruitIterator(MyOwnArrayList fruitList) {
        this.fruitList = fruitList;
    }

    public boolean hasNext() {
        if (position < fruitList.size())
            return true;
        else
            return false;
    }

    public Object next() {
        Object anyObj = fruitList.get(position);
        position++;
        return anyObj;
    }

    public void remove() {
        fruitList.remove(position);
    }

}
