/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stu594822
 */
public class InsertSorter implements Sorter {

    @Override
    public void sort(Sortable s) {
      for(int i = 1; i < s.size(); i++){
        int j = i;
        while (j > 0 && s.gtr(j-1, j))
        {
            s.swap(j, j-1);
            j = j-1;
        }
      }
    }
    @Override
    public String description() {
return "InsertionSorter";
    }

}
