/*
Pattern Shape:
 */
import java.util.*;
public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please ente the size of the pattern: ");
        int size=sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++)
                System.out.print((char)(65+j-1)+" ");
            System.out.println();
        }
        sc.close();
    }
}
