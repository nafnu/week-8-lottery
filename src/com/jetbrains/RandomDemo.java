package com.jetbrains;
import java.util.Random;

public class RandomDemo extends Panel{

    public static void main(String[] args){
    Random rand = new Random();
    // Generate random integers in range 0 to 999
    int rand_int1 = rand.nextInt(50);
    int rand_int2 = rand.nextInt(1000);
    }
}
