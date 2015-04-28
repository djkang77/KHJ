package net.hb.day28;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("Two.java");
		
		int age;
		age=1;
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("나이입력?");
		age=stdIn.nextInt(); //반드시 정수형 입력
		
		System.out.println("나이=" + age);
		System.out.println("\n영수증출력 10:03 10:31");

		stdIn.close();
	}

}
