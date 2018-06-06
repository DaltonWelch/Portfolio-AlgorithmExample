/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stu594822
 */
public class BubbleSorter implements Sorter {

    @Override
    public void sort(Sortable s) {
        int lastSwap = s.size() - 1;
        for (int i = 1; i < s.size(); i++) {
            boolean is_sorted = true;
            int currentSwap = -1;

            for (int j = 0; j < lastSwap; j++) {
                if (s.gtr(j, j+1)) {
                    int temp = j;
                    s.swap(j, j+1);
                    
                    is_sorted = false;
                    currentSwap = j;
                }
            }

            if (is_sorted) {
                return;
            }
            lastSwap = currentSwap;
        }
    }




    @Override
        public String description() {
        return "BubbleSorter";
    }

}
