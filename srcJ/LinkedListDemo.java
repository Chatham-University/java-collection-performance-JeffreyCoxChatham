import java.util.Random;
import java.util.LinkedList;

public class LinkedListDemo {
    private final LinkedList<Integer> nums;

    public LinkedListDemo(int howManyNums, Random rand) {
        long start = System.currentTimeMillis();

        long fstart = System.currentTimeMillis();
        nums = new LinkedList<Integer>();
        for(int i = 0; i < howManyNums; i++) {
            nums.add(rand.nextInt(howManyNums));
        }
        long fend = System.currentTimeMillis();
        System.out.println(String.format("LinkedList Fill Time: %.3f seconds", (fend - fstart) / 1000.0));

        long end = System.currentTimeMillis();
        System.out.println(String.format("LinkedList Total Time: %.3f seconds", (end - start) / 1000.0));
    }
}
