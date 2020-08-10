package com.company;

;
public class Card implements Comparable {
    private Suits suit;
    private Values value;

    public Suits getSuit() {
        return this.suit;
    }

    public Values getValue() {
        return value;
    }

    public Card(Suits suit, Values value) {
        this.suit = suit;
        this.value = value;

    }

    @Override
    public int compareTo(Object o) {
        Card other = (Card) o;
        if (this.value == other.value)
            return (Integer.compare(this.suit.ordinal(), other.suit.ordinal()));
        else
            return (Integer.compare(this.value.ordinal(), other.value.ordinal()));
    }
    @Override
    public String toString() {
        return String.format(this.value.toString() + " of " + this.suit.toString());
    }
}
