
//WRITE A SWITCH CASE CODE USING CHARACTERS/STRING...
import java.util.Scanner;
public class sw2_case {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your school name:");
        String name= sc.nextLine();
        System.out.println(name);
        switch(name){
            case "kusumdegi":{
                System.out.println("suraj you are so so so lucky");
                break;
            }
            case "vikash":
            {
                System.out.println("suraj you are lucky:");
                break;
            }
            case "trident":
            {

                System.out.println("that's where you are right now:");
                break;
            }
            default:
            {
                System.out.println("you're nowhere");
            }



        }

    }
}
