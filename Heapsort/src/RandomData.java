
import java.util.Random;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stu594822
 */
public class RandomData {

    int[] a;

    public RandomData(int[] a, String description) {
        this.a = a;

    }

    public CC<Integer> getData() {

        return new CC(new GtrInt(), new IntegerArray(a));

        // Copy the data into a CC object 
    }

    public String getDescription() {
        return "RandomData";
    }

    static RandomDataGenerator randomIntegers = new RandomDataGenerator() {

        @Override
        public RandomData generate(int n) {
            Random randomGenerator = new Random();

            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = i + 1;
            }
            for (int i = 0; i < n; i++) {
                int temp = a[i];
                int randomInt = randomGenerator.nextInt(10);
                a[i] = a[randomInt];
                a[randomInt] = temp;

            }

            return new RandomData(a, "Completely Random");
        }
    };

    static RandomDataGenerator almostSortedIntegers = new RandomDataGenerator() {

        @Override
        public RandomData generate(int n) {
            Random randomGenerator = new Random();

            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = i + 1;
            }
            for (int j = 0; j <= 3; j++) {
                
                int randomInt1 = randomGenerator.nextInt(10);
                int randomInt2 = randomGenerator.nextInt(10);
                int temp = a[randomInt1];
                a[randomInt1] = a[randomInt2];
                a[randomInt2] = a[temp];
            }

            return new RandomData(a, "AlmostSortedIntegers");
        }

    };

    static RandomDataGenerator almostSortedReversedIntegers = new RandomDataGenerator() {

        @Override
        public RandomData generate(int n) {
            Random randomGenerator = new Random();

            int a[] = new int[n];
            for (int i = 0; i < n; i++){
                a[i] = (n - i) + 1;
            }
            for (int j = 0; j <= 3; j++) {
                
                int randomInt1 = randomGenerator.nextInt(10);
                int randomInt2 = randomGenerator.nextInt(10);
                int temp = a[randomInt1];
                a[randomInt1] = a[randomInt2];
                a[randomInt2] = a[temp];
            }

            return new RandomData(a, "AlmostSortedIntegers");
        }
    };
     static RandomDataGenerator[] allGenerators = {randomIntegers, almostSortedIntegers,almostSortedReversedIntegers};
}
