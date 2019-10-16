package game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++)
            System.out.println("Argument #" + i + " " + args[i]);

		Scanner input = new Scanner(System.in);
        String name;

        System.out.println("What is your name?");
        name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        int age;
        System.out.println("How old are you?");
        age = input.nextInt();
        System.out.println("Dang, " + age + " is old");	
        input.close();
	}
		
//	private static void printRoom(Player player) {
//		
//	}
//
//	private static String[] collectInput() {
//		
//	}
//		
//	private static void parse(String[] command, Player player) {
//		
//	}
}
