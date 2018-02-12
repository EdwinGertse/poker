package za.co.inclusivity.game.poker.rule;

import za.co.inclusivity.game.poker.model.Face;
import za.co.inclusivity.game.poker.service.Cards;

public class RoyalFlush implements Rule {

    @Override
    public boolean matches(Cards deck) {
        return deck.isAllTheSameSuit()
                && deck.hasCard(Face.ACE)
                && deck.hasCard(Face.KING)
                && deck.hasCard(Face.QUEEN)
                && deck.hasCard(Face.JACK)
                && deck.hasCard(Face.TEN);
    }
}
