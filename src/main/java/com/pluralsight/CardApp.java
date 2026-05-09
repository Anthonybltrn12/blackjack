package com.pluralsight;

import java.util.Scanner;

public class CardApp {
    static Scanner theScanner = new Scanner(System.in);
    public static void main(String[] args) {

        menu();



    }

    public static void menu(){
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Would you like to play Blackjack?(Y/N)");
            String userInput = theScanner.nextLine();
            switch (userInput) {
                case "y":
                    dealCards();
                    break;
                default:
                    System.out.println("Exiting");
                    isRunning = false;
            }
        }


    }

    public static void dealCards(){
        System.out.println("What is your name?");
        String player1 = theScanner.nextLine();
        System.out.println("Would you like to be dealt a hand?(Y/N)");
        String beDealt = theScanner.nextLine();
        String player2 = "Dealer";
        switch (beDealt){
            case "y":
                //we need a deck
                Deck deck = new Deck();

                //shuffle all the cards
                deck.shuffle();
                Hand hand1 = new Hand();
                Card card1 = deck.deal();
                hand1.deal(card1);
                Card card2 = deck.deal();
                hand1.deal(card2);
                System.out.println(player1 +":" + hand1.getValue());
                Hand hand2 = new Hand();
                Card card3 = deck.deal();
                hand2.deal(card3);
                Card card4 = deck.deal();
                hand2.deal(card4);
                System.out.println(player2 + ":" + hand2.getValue());
                if(hand1.getValue() > hand2.getValue()){
                    System.out.println(player1 + "wins!");
                } else if (hand2.getValue() > hand1.getValue()) {
                    System.out.println(player2 + "wins!");

                }


        }
    }


}
