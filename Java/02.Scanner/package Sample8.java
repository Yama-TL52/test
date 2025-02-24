package Sample;

import java.util.Scanner;

public class Sample8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		
		String name = scanner.nextLine();
		
		if(name == null || name.trim().isEmpty()) {
			System.out.println("入力値はnullです");
		}
		else {
		System.out.println("Hello," + name + "!");
		}
	}
}