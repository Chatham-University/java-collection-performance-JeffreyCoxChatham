import java.util.Random;
import java.util.Vector;

public class VectorDemo {
    private final Vector<Integer> nums;

    public VectorDemo(int howManyNums, Random rand, int RWRepetitions) {
        long start = System.currentTimeMillis();
        boolean accuracy = true;

        long fstart = System.currentTimeMillis();
        nums = new Vector<Integer>();
        for(int i = 0; i < howManyNums; i++) {
            nums.add(rand.nextInt(howManyNums));
            if (System.currentTimeMillis() - fstart > 60000) {
                System.out.println(String.format("Vector Fill Test aborted at 1 minute. Current index: %d out of %d.", i, howManyNums));
                accuracy = false;
                break;
            }
        }
        long  fend = System.currentTimeMillis();
        System.out.println(String.format("Vector Fill Time: %.3f seconds", (fend - fstart) / 1000.0));

        long rstart = System.currentTimeMillis();
        float readDummy;
        for(int i = 0; i < RWRepetitions; i++) {
            readDummy = nums.get(rand.nextInt(howManyNums));
            if (System.currentTimeMillis() - rstart > 60000) {
                System.out.println(String.format("Vector Read Test aborted at 1 minute. Current index: %d out of %d.", i, RWRepetitions));
                accuracy = false;
                break;
            }
        }
        long rend = System.currentTimeMillis();
        System.out.println(String.format("Vector Read Time: %.3f seconds", (rend - rstart) / 1000.0));

        long wstart = System.currentTimeMillis();
        for(int i = 0; i < RWRepetitions; i++) {
            nums.setElementAt(rand.nextInt(howManyNums), rand.nextInt(howManyNums));
            if (System.currentTimeMillis() - wstart > 60000) {
                System.out.println(String.format("Vector Write Test aborted at 1 minute. Current index: %d out of %d.", i, RWRepetitions));
                accuracy = false;
                break;
            }
        }
        long wend = System.currentTimeMillis();
        System.out.println(String.format("Vector Write Time: %.3f seconds", (wend - wstart) / 1000.0));

        long end = System.currentTimeMillis();
        System.out.println(String.format("Vector Total Time: %.3f seconds", (end - start) / 1000.0));
        if (!accuracy) {
            System.out.println("Times may be inaccurate due to test abortion.");
        }
    }
}
