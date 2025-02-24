import java.util.Random;
import java.util.Vector;

public class VectorDemo {
    private final Vector<Integer> nums;

    public VectorDemo(int howManyNums, Random rand) {
        long start = System.currentTimeMillis();

        long fstart = System.currentTimeMillis();
        nums = new Vector<Integer>();
        for(int i = 0; i < howManyNums; i++) {
            nums.add(rand.nextInt(howManyNums));
        }
        long  fend = System.currentTimeMillis();
        System.out.println(String.format("Vector Fill Time: %.3f seconds", (fend - fstart) / 1000.0));

        long end = System.currentTimeMillis();
        System.out.println(String.format("Vector Total Time: %.3f seconds", (end - start) / 1000.0));
    }
}
