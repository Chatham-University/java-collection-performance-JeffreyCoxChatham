import java.util.Random;

public class ArrayDemo {
    private int[] nums;

    public ArrayDemo(int howManyNums, Random rand) {
        long start = System.currentTimeMillis();

        long fstart = System.currentTimeMillis();
        nums = new int[howManyNums];
        for(int i = 0; i < howManyNums; i++) {
            nums[i] = rand.nextInt(howManyNums);
        }
        long fend = System.currentTimeMillis();
        System.out.println(String.format("Array Fill Time: %.3f seconds", (fend - fstart) / 1000.0));

        long end = System.currentTimeMillis();
        System.out.println(String.format("Array Total Time: %.3f seconds", (end - start) / 1000.0));
    }
}