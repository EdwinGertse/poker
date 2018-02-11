package za.co.inclusivity.game.poker.service;

import za.co.inclusivity.game.poker.model.Card;

import java.util.Set;

public class Cards {

    public Set<Card> deck;

    public Cards(Set<Card> deck) {
        this.deck = deck;
    }
}
