/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stu594822
 */
public class SelectionSorter implements Sorter{
 

    @Override
    public void sort(Sortable s) {
        int i, j;
        int iMin;
        int temp;

        /* advance the position through the entire array */
        /*   (could do j < n-1 because single element is also min element) */
        for (j = 0; j < s.size() - 1; j++) {
            /* find the min element in the unsorted a[j .. n-1] */

            /* assume the min is the first element */
            iMin = j;
            /* test against elements after j to find the smallest */
            for (i = j + 1; i < s.size(); i++) {
                /* if this element is less, then it is the new minimum */
                if (s.gtr(iMin, i)) {
                    /* found new minimum; remember its index */
                    iMin = i;
                
                }
             
            }

            if (iMin != j) {
                temp = j;
                s.swap(j, iMin); 
                iMin = temp;
            }

        }
    }  
    

    @Override
    public String description() {
       return "SelectionSorter"; 
    }
}
