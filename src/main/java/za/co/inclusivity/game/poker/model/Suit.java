package za.co.inclusivity.game.poker.model;

public enum Suit {
    SPADES("S"),
    CLUBS("C"),
    DIAMONDS("D"),
    HEARTS("H");

    private final String symbol;

    private Suit(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString(){
        return symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
