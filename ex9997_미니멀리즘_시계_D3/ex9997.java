package ex9997_미니멀리즘_시계_D3;
import java.util.Scanner;

public class ex9997 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int testCase = sc.nextInt();
      
      for(int i=0; i<testCase; i++) {
         double angle = sc.nextDouble();
         double minute = angle*2;
         int time = (int)minute/60;
         
         if(time >=12) {
            time = time - 12;
         }
         System.out.println("#" + (i+1) + " " + time+ " " + (int)minute%60);
         
      }
   }
}