package za.co.inclusivity.game.poker.rule;

import za.co.inclusivity.game.poker.service.Cards;

public class StraightFlush implements Rule {
    @Override
    public boolean matches(Cards deck) {
        return deck.isAllTheSameSuit();
    }
}
