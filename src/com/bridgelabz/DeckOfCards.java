package com.bridgelabz;
import java.util.*;

public class DeckOfCards {
  // here declared total number of cards with type int ,numberof cards is 52
  //here taken newcards and rankofcards  with unique name and number of cards

    int[] deck = new int[52];
    String[] Newcards = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] rankofCards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

   // created method constructor as DeckOfCards to pass type
    // call method by using this. keyword
    //why this.? because of member function and local variable

    public DeckOfCards(int[] deck, String[] Rank) {
        this.Newcards = Newcards;
        this.rankofCards = rankofCards;
    }
}
