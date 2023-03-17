package org.example;

public class StringExercises {
    public static void main(String[] args) {
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

        System.out.println("Test missingChar");
        System.out.println(missingChar("kitten", 1));  //→ "ktten"
        System.out.println(missingChar("kitten", 0));  //→ "itten"
        System.out.println(missingChar("kitten", 4));  //→ "kittn"
        System.out.println("-".repeat(30));

        System.out.println("Test backAround");
        System.out.println(backAround("cat"));  //→ "tcatt"
        System.out.println(backAround("Hello")); //→ "oHelloo"
        System.out.println(backAround("a")); //→ "aaa"
        System.out.println("-".repeat(30));

        System.out.println("Test startHi");
        System.out.println(startHi("hi there")); // → true
        System.out.println(startHi("hi"));  //→ true
        System.out.println(startHi("hello hi"));  //→ false
        System.out.println("-".repeat(30));

        System.out.println("Test hasTeen");
        System.out.println(hasTeen(13, 20, 10));  //→ true
        System.out.println(hasTeen(20, 19, 10));  //→ true
        System.out.println(hasTeen(20, 10, 13));  //→ true
        System.out.println("-".repeat(30));

        System.out.println("Test mixStart");
        System.out.println(mixStart("mix snacks"));  //→ true
        System.out.println(mixStart("pix snacks"));  //→ true
        System.out.println(mixStart("piz snacks"));  //→ false
        System.out.println("-".repeat(30));

        System.out.println("Test close10");
        System.out.println(close10(8, 13));  //→ 8
        System.out.println(close10(13, 8));  //→ 8
        System.out.println(close10(13, 7));  //→ 0
        System.out.println("-".repeat(30));
    }



    /*
        The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    /*
        Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
     */
    public static int diff21(int n) {
        if (n <= 21) {
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


    /*
        Given a non-empty string and an int n, return a new string where the char at index n has been removed.
        The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
    */
    public static String missingChar(String str, int n) {
        StringBuilder str1 = new StringBuilder(str);
        str1 = str1.deleteCharAt(n);
        return str1.toString();
    }

    /*
        Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt".
        The original string will be length 1 or more.
     */
    public static String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    /*
        Given a string, return true if the string starts with "hi" and false otherwise.
     */
    public static boolean startHi(String str) {
        if(str.length() > 1) {
            return (str.charAt(0) == 'h' && str.charAt(1) == 'i');
        }
        return false;
    }

    /*
        We'll say that a number is "teen" if it is in the range 13..19 inclusive.
        Given 3 int values, return true if 1 or more of them are teen.
     */
    public static boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));
    }

    /*
        Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
     */
    public static boolean mixStart(String str) {
        if(str.length() <= 2){
            return false;
        }
        return (str.substring(1,3).equals("ix"));
    }

    /*
        Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
        Note that Math.abs(n) returns the absolute value of a number.
     */

    public static int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }

}
