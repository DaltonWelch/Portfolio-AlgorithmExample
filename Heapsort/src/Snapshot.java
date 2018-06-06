
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stu594822
 */
public class Snapshot {

    int[] snapArray;
    int countSwaps;
    int countCompares;
    boolean isSwap;
    int i, j;

    public Snapshot(int[] snapArray, int i, int j, int countSwaps, int countCompares, boolean isSwap) {
        this.snapArray = snapArray.clone();
        this.countSwaps = countSwaps;
        this.countCompares = countCompares;
        this.isSwap = isSwap;
        this.i = i;
        this.j = j;

    }

    public void paintWithColor(Graphics g) {
        for (int x = 0; x < snapArray.length; x++) {
            if (x == i || x == j) {
                if (isSwap) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.BLACK);
                }
            } else {
                g.setColor(Color.CYAN);
            }
            g.fillRect(x * 10 + 10, 10, 6, snapArray[x] * 5);
        }

    }
}
