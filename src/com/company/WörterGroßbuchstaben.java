package com.company;

public class WörterGroßbuchstaben {
    public static void main(String[] args) {
        System.out.println(toUpperCase("this method is the hardest shit evah"));
    }

    public static String toUpperCase(String original) {
        String str = new String();
        char c = ' ';
        for (int i = 0; i < original.length(); i++) {
            c = original.charAt(i);
        if (i == 0 || i > 0 && original.charAt(i-1) == ' ') {
            c = Character.toUpperCase(original.charAt(i));

        }
        str = str + c ;
        }
        return str;


    }
}
