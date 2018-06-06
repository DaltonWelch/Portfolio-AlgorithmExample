/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stu594822
 */
public class CC<T> implements Sortable{

    int compareCount;
    int swapCount;
    Comparable<T> compare;
    Indexable<T> container;

    public CC(Comparable<T> compare, Indexable<T> container) {
        this.compare = compare;
        this.container = container;

    }

    public String toString() {
        return container.toString();
    }

    @Override
    public int size() {
        return container.size();
    }

    @Override
    public boolean gtr(int i, int j) {
    T x = container.get(i);
    T y = container.get(j);
    compareCount++;
    
    return compare.gtr(x, y);
    }

    @Override
    public void swap(int i, int j) {
    T x = container.get(i);
    T y = container.get(j);
    swapCount++;
    
    container.put(i, y);
    container.put(j, x);
    }

    @Override
    public int getCompares() {
        return compareCount;
    }

    @Override
    public int getSwaps() {
        return swapCount;
    }
}

