package MethodPractice.Level_3;

import java.util.Scanner;

public class CalendarDisplay {


    static String[] monthNames = {
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };


    static int[] monthDays = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

   
    public static int getDaysInMonth(int month, int year) {
        if (month == 1 && isLeapYear(year)) {
            return 29;
        }
        return monthDays[month];
    }

   
   
    public static int getFirstDay(int month, int year) {
   
        int d = 1;  // Always 1st day of the month
   
        int y0 = year - (14 - (month + 1)) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
   
        int m0 = (month + 1) + 12 * ((14 - (month + 1)) / 12) - 2;
   
        int day = (d + x + (31 * m0) / 12) % 7;
        return day;
    }

    // Print calendar
    public static void printCalendar(int month, int year) {
        int startDay = getFirstDay(month, year);
        int numOfDays = getDaysInMonth(month, year);

        System.out.println("\n" + monthNames[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int date = 1; date <= numOfDays; date++) {
            System.out.print((date < 10 ? "  " + date : " " + date) + " ");
            if ((date + startDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt() - 1; // convert to 0-indexed
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month < 0 || month > 11) {
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
            return;
        }

        printCalendar(month, year);
    }
}
