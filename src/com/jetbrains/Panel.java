package com.jetbrains;
import java.util.ArrayList;

public class Panel {

    // (1) create a java int array
    int[] intArray = new int[6];

    // (2) some time later ... assign elements to the array
    intArray[0] = 1;
    intArray[1] = 2;
    intArray[2] = 3;
    intArray[3] = 4;
    intArray[4] = 5;
    intArray[5] = 6;

    // (3) print our java int array
       for (int i=0; i<intArray.length; i++)
    {
        System.out.println(intArray[i]);
    }
}
