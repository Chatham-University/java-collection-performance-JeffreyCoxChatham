import java.util.Random;
import java.util.LinkedList;

public class LinkedListDemo {
    private final LinkedList<Integer> nums;

    public LinkedListDemo(int howManyNums, Random rand) {
        boolean accuracy = true;

        long fstart = System.currentTimeMillis();
        nums = new LinkedList<Integer>();
        for(int i = 0; i < howManyNums; i++) {
            nums.add(rand.nextInt(howManyNums));
            if (System.currentTimeMillis() - fstart > 60000) {
                System.out.println(String.format("LinkedList Fill Test aborted at 1 minute. Current progress: %d out of %d.", i, howManyNums));
                accuracy = false;
                break;
            }
        }
        long fend = System.currentTimeMillis();
        long ftotal = (fend - fstart);
        System.out.println(String.format("LinkedList Fill Time: %.3f seconds", ftotal / 1000.0));

        long rstart = System.currentTimeMillis();
        float readDummy;
        for(int i = 0; i < howManyNums / 1000.0; i++) {
            readDummy = nums.get(rand.nextInt(howManyNums));
            if (System.currentTimeMillis() - rstart > 60000) {
                System.out.println(String.format("LinkedList Read Test aborted at 1 minute. Current progress: %d out of %d.", i, howManyNums));
                accuracy = false;
                break;
            }
        }
        long rend = System.currentTimeMillis();
        long rtotal = (rend - rstart)*1000;
        System.out.println(String.format("LinkedList Read Time Extrapolative Estimate: %.0f seconds", rtotal / 1000.0));

        long wstart = System.currentTimeMillis();
        for(int i = 0; i < howManyNums / 1000.0; i++) {
            nums.set(rand.nextInt(howManyNums), rand.nextInt(howManyNums));
            if (System.currentTimeMillis() - wstart > 60000) {
                System.out.println(String.format("LinkedList Write Test aborted at 1 minute. Current progress: %d out of %d.", i, howManyNums));
                accuracy = false;
                break;
            }
        }
        long wend = System.currentTimeMillis();
        long wtotal = (wend - wstart)*1000;
        System.out.println(String.format("LinkedList Write Time Extrapolative Estimate: %.0f seconds", wtotal / 1000.0));

        System.out.println(String.format("LinkedList Total Time: %.3f seconds", (ftotal + rtotal + wtotal) / 1000.0));
        if (!accuracy) {
            System.out.println("Times may be inaccurate due to test abortion.");
        }
    }
}
