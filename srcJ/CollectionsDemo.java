import java.util.Random;

public class CollectionsDemo {

    // 10^3 = 1,000
    // 10^6 = 1 million
    // 10^9 = 1 billion
    // 10^10 = 10 billion, too big for Phil's computer
    public static final int HOW_MANY_NUMS = (int) Math.pow(10,6);
    public static final int RWRepetitions = (int) Math.pow(10,3);

    public static void main(String[] args) {
        // Make a new random number generator for us to use. I'm
        // initializing it with a single "seed" so that we will all
        // see the same results in class. This is a terrible practice
        // in most cases!
        final Random rand = new Random(5564011392837540628L);

        System.out.println("Begin Array Tests:");
        new ArrayDemo(HOW_MANY_NUMS, rand, RWRepetitions);
        System.out.println("End Array Tests.");

        System.out.println("Begin Vector Tests:");
        new VectorDemo(HOW_MANY_NUMS, rand, RWRepetitions);
        System.out.println("End Vector Tests.");

        System.out.println("Begin LinkedList Tests:");
        new LinkedListDemo(HOW_MANY_NUMS, rand, RWRepetitions);
        System.out.println("End LinkedList Tests.");
    }
}
