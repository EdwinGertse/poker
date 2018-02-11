package za.co.inclusivity.game.poker.rule;

import za.co.inclusivity.game.poker.service.Cards;

public interface Rule {
    boolean matches(Cards deck);
}
