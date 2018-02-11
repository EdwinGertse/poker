package za.co.inclusivity.game.poker.rule;

import za.co.inclusivity.game.poker.service.Cards;

public class RoyalFlush implements Rule {

    @Override
    public boolean matches(Cards deck) {
        return false;
    }
}
