/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stu594822
 */
public class IntegerArray implements Indexable<Integer>{
    int[] intArray;
    public IntegerArray(int[] intArray){
    this.intArray = intArray.clone();    
    }
    public String toString(){
        String r = "{";
        for(int i=0; i < intArray.length; i++){
            r = r + " " + intArray[i];
        }
       return r + "}"; 
    }

    @Override
    public int size() {
    return intArray.length;    
    }

    @Override
    public Integer get(int i) {
    return intArray[i];    
    }

    @Override
    public void put(int i, Integer obj) {
    intArray[i] = obj;   
    }

    @Override
    public Snapshot snap(int i, int j, int compareCount, int swapCount,  boolean isSwap) {
        return new Snapshot(intArray, i, j, compareCount, swapCount, isSwap);
    }

   

 

 
   
    
}
