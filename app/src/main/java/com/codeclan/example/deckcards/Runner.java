package com.codeclan.example.deckcards;

/**
 * Created by user on 01/03/2017.
 */

public class Runner {

    public static void main(String[] args) {

//        needs to be if statements in RPS game
        Deck deck = new Deck();
        Dealer dealer = new Dealer(deck);
        Card card = dealer.deal();
        Card card2 = dealer.deal();
        System.out.println(card.rank + " of " + card.suit);
        System.out.println(card2.rank + " of " + card2.suit);
//        System.out.println(card.suit == Suit.HEARTS);
        System.out.println(card.rank.ordinal() > card2.rank.ordinal());


//        Player player1 = new Player("Player1");
//        player1.recieveACard(dealer);
//        System.out.println("Card is a " + player1.getHandValue());

    }
}
