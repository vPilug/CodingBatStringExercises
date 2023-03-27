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

        System.out.println("Test stringE");
        System.out.println(stringE("Hello"));  //→ true
        System.out.println(stringE("Heelle"));  //→ true
        System.out.println(stringE("Heelele"));  //→ false
        System.out.println("-".repeat(30));

        System.out.println("Test everyNth");
        System.out.println(everyNth("Miracle", 2));  //→ "Mrce"
        System.out.println(everyNth("abcdefg", 2));  //→ "aceg"
        System.out.println(everyNth("abcdefg", 3));  //→ "adg"
        System.out.println("-".repeat(30));

        System.out.println("Test monkeyTrouble");
        System.out.println(monkeyTrouble(true, true));  //→ true
        System.out.println(monkeyTrouble(false, false));  //→ true
        System.out.println(monkeyTrouble(true, false));  //→ false
        System.out.println("-".repeat(30));

        System.out.println("Test parotTrouble");
        System.out.println(parrotTrouble(true, 6));  //→ true
        System.out.println(parrotTrouble(true, 7));  //→ false
        System.out.println(parrotTrouble(false, 6));  //→ false
        System.out.println("-".repeat(30));

        System.out.println("Test pasNeg");
        System.out.println(posNeg(1, -1, false));  //→ true
        System.out.println(posNeg(-1, 1, false));  //→ true
        System.out.println(posNeg(-4, -5, true));  //→ true
        System.out.println("-".repeat(30));

        System.out.println("Test frontBack");
        System.out.println(frontBack("code"));  //→ "eodc"
        System.out.println(frontBack("a"));  //→ "a"
        System.out.println(frontBack("ab"));  //→ "ba"
        System.out.println("-".repeat(30));

        System.out.println("Test or35");
        System.out.println(or35(3));  //→ true
        System.out.println(or35(10));  //→ true
        System.out.println(or35(8));  //→ false
        System.out.println("-".repeat(30));

        System.out.println("Test icyHot");
        System.out.println(icyHot(120, -1));  //→ true
        System.out.println(icyHot(-1, 120));  //→ true
        System.out.println(icyHot(2, 120));  //→ false
        System.out.println("-".repeat(30));

        System.out.println("Test laneTeen");
        System.out.println(loneTeen(13, 99));  //→ true
        System.out.println(loneTeen(21, 19));  //→ true
        System.out.println(loneTeen(13, 13));  //→ false
        System.out.println("-".repeat(30));

        System.out.println("Test startOz");
        System.out.println(startOz("ozymandias"));  //→ "oz"
        System.out.println(startOz("bzoo"));  //→ "z"
        System.out.println(startOz("oxx"));  //→ "o"
        System.out.println("-".repeat(30));

        System.out.println("Test in3050");
        System.out.println(in3050(30, 31));  //→ true
        System.out.println(in3050(30, 41));  //→ false
        System.out.println(in3050(40, 50));  //→ true
        System.out.println("-".repeat(30));

        System.out.println("Test lastDigit");
        System.out.println(lastDigit(7, 17));  //→ true
        System.out.println(lastDigit(6, 17));  //→ false
        System.out.println(lastDigit(3, 113));  //→ true
        System.out.println("-".repeat(30));

        System.out.println("Test sumDouble");
        System.out.println(sumDouble(1, 2));  //→ 3
        System.out.println(sumDouble(3, 2));  //→ 5
        System.out.println(sumDouble(2, 2));  //→ 8
        System.out.println("-".repeat(30));

        System.out.println("Test makes10");
        System.out.println(makes10(9, 10));  //→ true
        System.out.println(makes10(9, 9));  //→ false
        System.out.println(makes10(1, 9));  //→ true
        System.out.println("-".repeat(30));

        System.out.println("Test notString");
        System.out.println(notString("candy"));  //→ "not candy"
        System.out.println(notString("x"));  //→ "not x"
        System.out.println(notString("not bad"));  //→ "not bad"
        System.out.println("-".repeat(30));

        System.out.println("Test front3");
        System.out.println(front3("Java"));  //→ "JavJavJav"
        System.out.println(front3("Chocolate"));  //→ "ChoChoCho"
        System.out.println(front3("abc"));  //→ "abcabcabc"
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

    /*
        Return true if the given string contains between 1 and 3 'e' chars.
     */

    public static boolean stringE(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'e')
                count++;
        }
        return (count >= 1 && count <= 3);
    }

    /*

        Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string.
        So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
     */

    public static String everyNth(String str, int n) {
        String result = "";
        for(int i = 0; i < str.length(); i = i + n){
            result = result + str.charAt(i);
        }
        return result;
    }

    /*
        We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
        We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
     */

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile == bSmile){
            return true;
        }
        return false;
    }

    /*

        We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
        We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
     */

    public static boolean parrotTrouble(boolean talking, int hour) {
        return (talking  && (hour < 7 || hour > 20));
    }

    /*

        Given 2 int values, return true if one is negative and one is positive.
        Except if the parameter "negative" is true, then return true only if both are negative.
     */

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative){
            return (a < 0 && b < 0);
        }
        return ((a > 0 && b < 0) || (a < 0 && b > 0));
    }

    /*
        Given a string, return a new string where the first and last chars have been exchanged.
     */

    public static String frontBack(String str) {
        if(str.length() <= 1){
            return str;
        }
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        String medium = str.substring(1, str.length()-1);
        return last + medium + first;
    }

    /*
        Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
        Use the % "mod" operator.
     */

    public static boolean or35(int n) {
        return ((n % 3 == 0) || (n % 5 == 0));
    }

    /*
        Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     */

    public static boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100));
    }

    /*
        We'll say that a number is "teen" if it is in the range 13..19 inclusive.
         Given 2 int values, return true if one or the other is teen, but not both.
     */

    public static boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    /*
       Given a string, return a string made of the first 2 chars (if present),
       however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
     */

    public static String startOz(String str) {
        String result = "";
        if(str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }
        if(str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }

    /*
        Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
     */

    public static boolean in3050(int a, int b) {
        return (a >= 30 && a <= 40) && (b >= 30 && b <= 40)
                || (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
    }

    /*
        Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
     */
    public static boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    /*
        Given two int values, return their sum. Unless the two values are the same, then return double their sum.
     */

    public static int sumDouble(int a, int b) {
        if(a != b){
            return a + b;
        }
        return (a + b) * 2;
    }

    /*
        Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
     */

    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    /*

        Given a string, return a new string where "not " has been added to the front.
        However, if the string already begins with "not", return the string unchanged.
     */

    public static String notString(String str) {
        if(str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

    /*
        Given a string, we'll say that the front is the first 3 chars of the string.
        If the string length is less than 3, the front is whatever is there.
        Return a new string which is 3 copies of the front.
     */

    public static String front3(String str) {
        if(str.length() < 3) {
            return str + str + str;
        }
        return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
    }


}
