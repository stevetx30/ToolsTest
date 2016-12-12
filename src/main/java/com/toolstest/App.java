package com.toolstest;

/**
 * Hello world!
 */
public class App {

    private String name;
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public void bar(int x, int y, int z) {
        if (x>y) {
            if (y>z) {
                if (z==x) {
                    // whew, too deep
                }
            }
        }
    }
}
