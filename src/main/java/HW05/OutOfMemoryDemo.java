package HW05;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryDemo {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        int i = 0;

        // Установка размера Heap-а в 5 МБ
        String heapSize = "-Xmx5m";
        System.out.println("Heap size: " + heapSize);

        try {
            while (true) {
                objects.add(new Object());
                i++;
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory at iteration " + i);
            System.out.println("Saving heap dump...");

            // Сохранение heap dump в файл
            String fileName = "heap_dump.hprof";
            String command = "jmap -dump:format=b,file=" + fileName + " " + getPid();
            try {
                Process process = Runtime.getRuntime().exec(command);
                process.waitFor();
                System.out.println("Heap dump saved to " + fileName);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            throw e;
        }
    }

    // Получение ID процесса JVM
    private static String getPid() {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        return name.substring(0, name.indexOf('@'));
    }
}
