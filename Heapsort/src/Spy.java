
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stu594822
 */
public class Spy implements Sortable {
    
    CC<Integer> real;
    int countCompares;
    int countSwaps;
    ArrayList<Snapshot> Snapshots = new ArrayList<>();

    public Spy(CC<Integer> real) {
        this.real = real;
Snapshots.add(real.container.snap(-1, -1, real.getCompares(), real.getSwaps(), false));
    }

    @Override
    public int size() {
        return real.size();
    }

    @Override
    public boolean gtr(int i, int j) {
        Snapshots.add(real.container.snap(i, j, real.getCompares(), real.getSwaps(), false));
        
        return real.gtr(i, j);
    }

    @Override
    public void swap(int i, int j) {
        real.swap(i, j);
        
        
        Snapshots.add(real.container.snap(i, j, real.getCompares(), real.getSwaps(), true));
    }

    @Override
    public int getCompares() {
        return countCompares;
    }

    @Override
    public int getSwaps() {
        return countSwaps;
    }

}
