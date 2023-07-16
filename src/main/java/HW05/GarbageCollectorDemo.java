package HW05;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class GarbageCollectorDemo {

    private static final Logger LOGGER = Logger.getLogger(GarbageCollectorDemo.class.getName());

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            objects.add(new Object());
            if (i % 1000 == 0) {
                System.gc();
                LOGGER.info("Garbage collector called at iteration " + i);
            }
        }

        long endTime = System.currentTimeMillis();
        LOGGER.info("Total time: " + (endTime - startTime) + " ms");
    }
}