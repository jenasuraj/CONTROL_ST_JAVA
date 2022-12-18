//GIVE AN EXAMPLE OF SWITCH CASE USING NUMBERS...


import java.util.Scanner;
public class sw_case {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your mark:");
        int mark = sc.nextInt();
        System.out.println(mark);
        switch (mark) {
            case 90: {
                System.out.println("you're topper");
                break;
            }
            case 60: {
                System.out.println("you're an average student");
                break;
            }
            case 30: {
                System.out.println("you're failed");
                break;
            }
            default:
                System.out.println("lol...you're nowhere");

        }
    }
}
