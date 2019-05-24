package Chatbot;

import java.util.HashMap;

public class ChatbotDB {

    HashMap <String, String> db = new HashMap<>();


    protected void addDataToHashmap(String key, String value){
        db.put(key, value);
    }

}
