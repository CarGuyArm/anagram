package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static boolean AnagramString(char [] str1,char [] str2) {

        int i, n1, n2;
        n1 = str1.length;
        n2 = str2.length;
        if (n1 != n2)
        System.out.println("Lengths are not equal!");

        Arrays.sort(str1);
        Arrays.sort(str2);
        for (i = 0; i < n1; i++) {
            if (str1[i] == str2[i])
                return true;
        }
            return false;
    }
/*
    public static boolean AnagramInt(int num1,int num2){

    }
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First Input: ");
        char [] str1 = scan.next().toCharArray();
        System.out.println("Second Input: ");
        char [] str2 = scan.next().toCharArray();

/*
        String str3 = str1.toString(),str4=str2.toString();
        int num1 = Integer.parseInt(str3);
        int num2 = Integer.parseInt(str4);
*/

        if(AnagramString(str1,str2))
            System.out.println("Anagram");
        else
            System.out.println("Not anagram");
    }
}
