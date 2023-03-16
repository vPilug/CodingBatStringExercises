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
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static int diff21(int n) {
        if(n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

}
