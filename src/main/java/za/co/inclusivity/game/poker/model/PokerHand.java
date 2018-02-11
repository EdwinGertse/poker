package za.co.inclusivity.game.poker.model;

public enum PokerHand {
    ROYAL_FLUSH("Royal Flush", 10),//All Same Suit
    STRAIGHT_FLUSH("Straight Flush", 9),//Five cards in sequence, same suit
    FOUR_OF_KIND("Four Of a Kind", 8),//Same Rank
    FULL_HOUSE("Full House", 7),//Three of A Kind with pair
    FLUSH("Flush", 6),//Five of same suit
    STRAIGHT("Straight", 5),//Five cards in sequence, not same suit
    THREE_OF_KIND("Three Of Kind", 4),//Same Rank
    TWO_PAIR("Two Pair", 3),//Two different Pair
    PAIR("Pair", 2),//Two cards, same rank
    HIGH_RANK("High Rank", 1);//Not hand, Highest Card Plays

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
}
