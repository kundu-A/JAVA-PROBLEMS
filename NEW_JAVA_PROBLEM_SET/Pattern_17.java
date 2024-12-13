/*
Pattern Shape:
ABCDE
 ABCD
  ABC
   AB
    A
 */
import java.util.*;
public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the pattern: ");
        int size=sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i-1;j++)
                System.out.print(" ");
            for(int k=1;k<=size-i+1;k++)
                System.out.print((char)(65+k-1));
            System.out.println();
        }
        sc.close();
    }
}