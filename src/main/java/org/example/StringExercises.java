package org.example;

public class StringExercises
{
    public static void main( String[] args )
    {
        System.out.println("Test sleepIn");
        System.out.println(sleepIn(false, false)); //→ true
        System.out.println(sleepIn(true, false));  //→ false
        System.out.println(sleepIn(false, true));  //→ true
        System.out.println("-".repeat(30));

        System.out.println("Test diff21");
        System.out.println(diff21(19));  //→ 2
        System.out.println(diff21(10));  //→ 11
        System.out.println(diff21(21));  //→ 0
        System.out.println("-".repeat(30));

        System.out.println("Test nearHundred");
        System.out.println(nearHundred(93));  //→ true
        System.out.println(nearHundred(90));  //→ true
        System.out.println(nearHundred(89));  //→ false
        System.out.println("-".repeat(30));
    }

    /*
        The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation) {
            return true;
        }
        return false;
    }

    /*
        Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
     */
    public static int diff21(int n) {
        if(n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    /*
            Given an int n, return true if it is within 10 of 100 or 200.
     */
    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }
}
