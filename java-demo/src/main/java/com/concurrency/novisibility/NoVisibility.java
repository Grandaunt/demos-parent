package com.concurrency.novisibility;

public class NoVisibility {
    private static int number;
    private static boolean ready;

    private static class ReadThread extends  Thread{

        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.printf("number:" + number);

        }

    }

    public static void main(String[] args) {
        new ReadThread().start();
        number = 42;
        ready=true;
    }
}
