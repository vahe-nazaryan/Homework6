package Chatbot;
import java.util.Scanner;

public class Engine {

   private Scanner scan = new Scanner(System.in);
   private ChatbotDB obj = new ChatbotDB();


    protected void addSomeDataToChatbot(){

        obj.addDataToHashmap("Hi", "Hello");
        obj.addDataToHashmap("How are you?", "I am fine thank you");
        obj.addDataToHashmap("What is your name", "My name is ChatBot");
        obj.addDataToHashmap("Paris", "Paris is the capital and most populous city of France.");

    }

    protected String searchInHashmap (String key){
        String result = "I don't understand you";
        for (String a : obj.db.keySet()){
            if (a.contains(key)){
                result = obj.db.get(a);
            }
        }
        return result;
    }

    protected void changeDB(String input){
        if(!searchInHashmap(input).equals("I don't understand you")){
            System.out.println(searchInHashmap(input));
        } else{
            System.out.println("I don't understand you!" + "\n" +
                    "You can add required data to the memory." + "\n"+
                    "Please enter answer to the question.");
            String value = scan.nextLine();
            obj.addDataToHashmap(input, value);
            System.out.println("Success!!! you added " + input + " to memory" + "\n" +
                    "Now you can search for " + input + " as well");
            String key = scan.nextLine();
            System.out.println(searchInHashmap(key));

        }
    }





}
