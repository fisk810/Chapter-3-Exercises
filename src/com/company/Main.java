package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner seconds = new Scanner(System.in);

        System.out.println("test");
        int second = seconds.nextInt();

        int hour = second / 3600;
        int hourR = second % 3600;
        int minute = hourR / 60;
        int minuteR = hourR % 60;

        System.out.println(second + " seconds = " + hour + " hours, " + minute + " minutes, and " + minuteR + " seconds.");



        
    }
}
