package sedLab01;
import java.io.*;
import java.util.Scanner;

public class CheckLeapYear {
    public static void isLeapYear(int year)
    {
        boolean is_leap_year = false;

        if (year % 4 == 0) {
            is_leap_year = true;

            if (year % 100 == 0) {
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }
        else
            is_leap_year = false;

        if (!is_leap_year)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(system.in);
        system.out.println("Enter Year");
        int year = sc.nextInt();

        isLeapYear(year);
    }

}
