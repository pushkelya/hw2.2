package com.groupqal;

public class Main {

    public static void main(String[] args) {
	int number = 225;
	int reverse;
	int a, b, c;

	a = number % 10;
	b = (number / 10) % 10;
	c = number / 100;

        System.out.println("reverse = " + a + b + c);

    }
}
