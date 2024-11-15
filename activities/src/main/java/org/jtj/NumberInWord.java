package org.jtj;

public class NumberInWord {
    public static void printNumberInWord(int number){
        String text = "";
        switch(number){
            case 0 -> text = "ZERO";
            case 1 -> text = "ONE";
            case 2 -> text = "TWO";
            case 3 -> text = "THREE";
            case 4 -> text = "FOUR";
            case 5 -> text = "FIVE";
            case 6 -> text = "SIX";
            case 7 -> text = "SEVEN";
            case 8 -> text = "EIGHT";
            case 9 -> text = "NINE";
            default -> text = "OTHER";

        }

        System.out.println(text);

    }

    public static void main(String[] args) {
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);

    }
}

//Number In Word
//Write a method called printNumberInWord. The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.
//
//
//
//        NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
//
//        NOTE: Do not add main method to solution code.