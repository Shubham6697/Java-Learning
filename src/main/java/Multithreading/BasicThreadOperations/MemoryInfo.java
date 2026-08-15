package Multithreading.BasicThreadOperations;

public class MemoryInfo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;
        long maxMemory = runtime.maxMemory();

        System.out.println(Thread.currentThread().getName() + " is running");

        System.out.println("Total Memory : " + totalMemory / (1024 * 1024) + " MB");
        System.out.println("Used Memory  : " + usedMemory / (1024 * 1024) + " MB");
        System.out.println("Free Memory  : " + freeMemory / (1024 * 1024) + " MB");
        System.out.println("Max Memory   : " + maxMemory / (1024 * 1024) + " MB");

    }
}