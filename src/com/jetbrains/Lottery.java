package com.jetbrains;
import java.util.ArrayList;
import java.util.Random;

public class Lottery /* extends Tickets */{

   /** private ArrayList<Tickets> listOfTickets = new ArrayList<Tickets>();**/

   private int [ ] lotteryNumbers = new int[6];
   int randomNum;

   public Lottery () {

       for (int i = 0; i < 6; i++){
           randomNum = (int) (Math.random() * 50);
           for( int x = 0; x < i; x++){
               if (lotteryNumbers[x] == randomNum){
                   randomNum = (int)(Math.random() * 50);
                   x = -1;
               }
           }
           lotteryNumbers[i] = randomNum;
       }

       for (int lotteryNumber : lotteryNumbers) {
           System.out.print(lotteryNumber + "");
       }
   }
}


