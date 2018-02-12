package za.co.inclusivity.game.poker.model;

import za.co.inclusivity.game.poker.rule.RoyalFlush;
import za.co.inclusivity.game.poker.service.Cards;

public enum PokerHand {
    ROYAL_FLUSH("Royal Flush", 10){
        @Override public boolean satisfy(Cards deck){ return new RoyalFlush().matches(deck); }
    },//All Same Suit
    STRAIGHT_FLUSH("Straight Flush", 9){
        @Override public boolean satisfy(Cards deck){ return false; }
    },//Five cards in sequence, same suit
    FOUR_OF_KIND("Four Of a Kind", 8){
        @Override public boolean satisfy(Cards deck){ return false; }
    },//Same Rank
    FULL_HOUSE("Full House", 7){
        @Override public boolean satisfy(Cards deck){ return false; }
    },//Three of A Kind with pair
    FLUSH("Flush", 6){
        @Override public boolean satisfy(Cards deck){ return false; }
    },//Five of same suit
    STRAIGHT("Straight", 5){
        @Override public boolean satisfy(Cards deck){ return false; }
    },//Five cards in sequence, not same suit
    THREE_OF_KIND("Three Of Kind", 4){
        @Override public boolean satisfy(Cards deck){ return false; }
    },//Same Rank
    TWO_PAIR("Two Pair", 3){
        @Override public boolean satisfy(Cards deck){ return false; }
    },//Two different Pair
    PAIR("Pair", 2){
        @Override public boolean satisfy(Cards deck){ return false; }
    },//Two cards, same rank
    HIGH_RANK("High Rank", 1){
        @Override public boolean satisfy(Cards deck){ return false; }
    };//Not hand, Highest Card Plays

    private final String description;
    private final int rank;

    private PokerHand(String description, int rank) {
        this.description = description;
        this.rank = rank;
    }

    public String getDescription(){
        return description;
    }

    public int getRank() {
        return rank;
    }

    public abstract boolean satisfy(Cards deck);
}
