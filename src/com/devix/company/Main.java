package com.devix.company;

public class Main {

    public static void main(String[] args) {

        String value = "Jose";
        //First two characters
        System.out.println(value.charAt(0));
        System.out.println(value.charAt(1));

        //Last two characters
        System.out.println(value.charAt(value.length() - 1));
        System.out.println(value.charAt(value.length() - 2));
    }
}
