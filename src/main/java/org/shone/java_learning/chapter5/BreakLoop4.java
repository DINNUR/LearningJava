package org.shone.java_learning.chapter5;

public class BreakLoop4 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Connector " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break;

                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loop was broken.");
    }
}
