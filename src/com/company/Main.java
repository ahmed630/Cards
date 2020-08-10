package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List cards = new ArrayList<Card>();
        cards.add(new Card(Suits.Hearts, Values.Ace));
        cards.add(new Card(Suits.Spades, Values.Ace));
        cards.add(new Card(Suits.Clubs, Values.Three));
        cards.add(new Card(Suits.Hearts, Values.Seven));

        Collections.sort(cards);
        System.out.println(cards);
    }
}
