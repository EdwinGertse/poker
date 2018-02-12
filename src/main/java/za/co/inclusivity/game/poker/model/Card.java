package za.co.inclusivity.game.poker.model;

public class Card implements Comparable<Card> {
    private final Suit suit;
    private final Face face;

    public Card(Suit suit, Face face) {
        this.suit = suit;
        this.face = face;
    }

    public Suit getSuit() {
        return suit;
    }

    public Face getFace() {
        return face;
    }

    @Override
    public int compareTo(Card c) {
        return face.getValue() - c.getFace().getValue();
    }
}
