/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stu594822
 */
public class Sorters {

    static Sorter bubble = new Sorter() {

        @Override
        public void sort(Sortable s) {
            int lastSwap = s.size() - 1;
            for (int i = 1; i < s.size(); i++) {
                boolean is_sorted = true;
                int currentSwap = -1;

                for (int j = 0; j < lastSwap; j++) {
                    if (s.gtr(j, j + 1)) {
                        int temp = j;
                        s.swap(j, j + 1);

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
    };
    static Sorter insert = new Sorter() {

        @Override
        public void sort(Sortable s) {
            for (int i = 1; i < s.size(); i++) {
                int j = i;
                while (j > 0 && s.gtr(j - 1, j)) {
                    s.swap(j, j - 1);
                    j = j - 1;
                }
            }
        }

        @Override
        public String description() {
            return "InsertionSorter";
        }
    };
    static Sorter selection = new Sorter() {
        @Override
        public void sort(Sortable s) {
            int i, j;
            int iMin;
            int temp;

            for (j = 0; j < s.size() - 1; j++) {
                iMin = j;
                for (i = j + 1; i < s.size(); i++) {
                    if (s.gtr(iMin, i)) {
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
    };
    static Sorter heap = new Sorter() {
   void heapify(int i, Sortable s, int n) {  // n is the limit of s
        int l = 2*i+1;
        int r = 2*i+2;
        if (r < n) {
           if (s.gtr(l, i) || s.gtr(r, i)) {
              if (s.gtr(l,r)) {
                  s.swap(i,l);
                  heapify(l,s,n);
              } else {
                  s.swap(i,r);
                  heapify(r,s,n); }}} 
          else if (l < n) {
             if (s.gtr(l, i)) s.swap(i,l);  }
}
        @Override
        public void sort(Sortable s) {
          int n = s.size()-1;
         for(int i = n; i >= 0; i--){
             heapify(i,s,n);
              } 
         for(int i = n; i >= 1; i--){
            s.swap(0, i);
            heapify(0,s,i);
        }
        }

        @Override
        public String description() {
            return "Heap";
        }
    };
    static Sorter[] allSorters = {bubble, heap, insert, selection};
}
