package Chatbot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Engine sc = new Engine();
        sc.addSomeDataToChatbot();


        System.out.println("Let's start a conversation " + "\n" +
                "Give me a question.");
        String input = scan.nextLine();
        sc.changeDB(input);


    }
}
