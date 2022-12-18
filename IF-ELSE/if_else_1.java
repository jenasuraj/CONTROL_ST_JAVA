
//CHECK GREATER BETWEEN TWO NUMBERS ALSO SHOW THAT EITHER A PERSON IS ELIGIBLE FOR VOTING OR NOT//
//IF_ELSE CONDITIONAL STATEMENTS//

import java.util.Scanner;
public class if_else_1 {
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        //int a;
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("both numbers are");
        //System.out.println(a);
        //System.out.println(b);
        System.out.printf("%d,%d\n",a,b);
        //check which one is greater
        if(a>b)
        {
            System.out.println("a is bigger");
        }
        else {

            System.out.println("b is bigger");
        }
        if(a>18)
        {

            System.out.println("person is eligible for voting");
        }
        else if(a==0)
        {

            System.out.println("person is immature");
        }
        else{

            System.out.println("person is not eligible for voting");
        }
    }
}
