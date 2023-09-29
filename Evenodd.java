import java.util.*;
public class Evenodd{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number : ");
       int x=sc.nextInt();
       if((x&1)==1)
        System.out.println("Odd");
        else
         System.out.println("Even");
    }
}
