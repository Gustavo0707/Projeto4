package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 double calculator;
	 int radius;

		Scanner scanner = new Scanner(System.in);

		System.out.println("type the radius of your circle");
		radius = scanner.nextInt();

		calculator = 3.14 * (radius * radius);

		System.out.println("the area of your circle is " + calculator);


    }
}
