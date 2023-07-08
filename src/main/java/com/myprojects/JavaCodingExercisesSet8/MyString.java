package com.myprojects.JavaCodingExercisesSet8;

import java.util.Scanner;

public class MyString {

    public String str;

    public MyString(String str) {
        this.str = str;
    }

    public boolean isHexadecimalChar(char ch) {
        return (ch >= 'A' && ch <='F' || ch >= 'a' && ch <= 'f');
    }

    public boolean isHexadecimal() {
        if (str == null || str.length() == 0) {
            return false;
        }

        for (char ch:str.toCharArray()) {
            if (!Character.isDigit(ch) && !isHexadecimalChar(ch) ) {
                return false;
            }
        }
        return true;
    }

    private static void hexadecimalCheckerWithInputFromUser(Scanner scanner) {
        System.out.println("Provide a string: ");
        String str = scanner.nextLine();
        System.out.println("Provide a character: ");
        char c = scanner.next().charAt(0);
        MyString myString = new MyString(str);
        System.out.println("The string provided " + str + " is hexadecimal: " + myString.isHexadecimal());
        System.out.println("The character provided " + c + " is hexadecimal: " + myString.isHexadecimalChar(c));
    }

    public static void main(String[] args) {
        MyString myString = new MyString("abcdef1234567890");
        System.out.println("The string created is hexadecimal: " + myString.isHexadecimal());
        System.out.println("The character created is hexadecimal: " + myString.isHexadecimalChar('a'));

        Scanner scanner = new Scanner(System.in);
        hexadecimalCheckerWithInputFromUser(scanner);
    }
}