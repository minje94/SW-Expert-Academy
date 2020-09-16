package ex10505_¼Òµæ_ºÒ±ÕÇü_D3;

import java.util.Scanner;

public class ex10505 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int testCase = sc.nextInt();
      
      for(int i=0; i<testCase; i++) {
         int number = sc.nextInt();
         int [] numArr = new int [number];
         int avg = 0, count = 0;
         
         for(int j=0; j<number; j++) {
            numArr[j] = sc.nextInt();
            avg = avg + numArr[j];
         }
         
         avg = avg/number;
         
         for(int j=0; j<numArr.length; j++) {
            if(numArr[j] <= avg) {
               count++;
            }
         }
         System.out.println("#" + (i+1) + " " + count);
         
         
      }
   }
}