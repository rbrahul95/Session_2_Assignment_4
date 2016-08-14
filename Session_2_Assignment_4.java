
package acadglid;
/*
         a code to check total number of days in the given month.  
             
 */
import java.util.Scanner;

public class Session_2_Assignment_4 {
                                   //Problem 4
    public static void main(String[] args) {
        int m, year, numDays;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Month: ");
        m = sc.nextInt();
        System.out.print("Please enter the Year");
        year = sc.nextInt();
        switch (m) {
            case 1://switch control fall 
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("30 days");
                break;
            case 2:
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    System.out.print("29 days");
                } else {
                    System.out.print("28 days");
                }

                break;
            default:
                System.out.print("Invalid input! Please enter month number between 1-12");

        }

    }
}
