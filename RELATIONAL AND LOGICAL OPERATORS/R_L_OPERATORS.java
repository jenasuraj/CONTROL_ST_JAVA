//CHECK GREATER BETWEEN 3 NUMBERS//
import java.util.Scanner;
public class R_L_OPERATORS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("enter second number:");
        int b=sc.nextInt();
        System.out.println(b);
        System.out.println("enter 3rd number");
        int c=sc.nextInt();
        System.out.println(c);

            //CHECKING THE GREATEST AMONG THREE NUMBERS//
          if((a>b) && (a>c))
          {
              System.out.print(a);
              System.out.println(" is bigger");
          }
          else if((b>a) && (b>c)) {
              System.out.print(b);
              System.out.println(" is bigger");
             // System.out.printf("%d is bigger", b);
          }
          else
              {
                  System.out.printf("%d is bigger",c);
              }


          }



    }


