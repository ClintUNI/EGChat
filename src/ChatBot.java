import input.IntegerInputListener;
import input.StringInputListener;
import response.IntegerQuestion;
import response.StringResponse;
import response.StringQuestion;
import response.ResponseMessage;

import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ResponseMessage response0 = new StringResponse("Pick a letter, it must be between A and D.");
        StringQuestion response1 = new StringQuestion("B", "Good guess!");
        StringQuestion response2 = new StringQuestion("", "Ready for the next game?");
        StringResponse response4 = new StringResponse("Pick a number, it must be between 1 and 4.");
        IntegerQuestion response5 = new IntegerQuestion(2, "Very good guess!");

        StringInputListener botInput1 = new StringInputListener(scanner, response1);
        IntegerInputListener botInput3 = new IntegerInputListener(scanner, response5);

        response0.respond();
        botInput1.beginInput();
        response2.respond();
        response4.respond();
        botInput3.beginInput();
    }
//    private HashMap<String, Integer> possibleInputs; //[UserInput] = Number Index to locate the response
//    private ArrayList<String> responses;
//
//    public static void main(String[] args) {
//        HashMap<String, String> testInputsAndResponses = new HashMap<String, String>();
//
//        testInputsAndResponses.put("Hello", "Hi, how are you?");
//
//        ChatBot chatBot = new ChatBot(testInputsAndResponses);
//    }
//
//    public ChatBot(HashMap<String, String> responses) {
//        this.possibleInputs = new HashMap<String, Integer>();
//
//        this.responses = new ArrayList<String>();
//
//        for (String userInput : responses.keySet()) {
//            this.setResponse(userInput, responses.get(userInput));
//        }
//
//        System.out.println(this.getResponse("Hello"));
//    }
//
//    public String getResponse(String input) {
//        try {
//            return this.responses.get(this.possibleInputs.get(input));
//        } catch (Exception err) {
//            return "Sorry, I don't know how to respond.";
//        }
//    }
//
//    public void setResponse(String input, String response) {
//        this.responses.add(response);
//        this.possibleInputs.put(input, this.responses.size() - 1);
//    }
}
