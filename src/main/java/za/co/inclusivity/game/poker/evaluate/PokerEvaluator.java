package za.co.inclusivity.game.poker.evaluate;

import za.co.inclusivity.game.poker.model.Card;
import za.co.inclusivity.game.poker.model.Face;
import za.co.inclusivity.game.poker.model.PokerHand;
import za.co.inclusivity.game.poker.model.Suit;
import za.co.inclusivity.game.poker.rule.RoyalFlush;
import za.co.inclusivity.game.poker.service.Cards;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PokerEvaluator {

    public static final String NO_PAIR = "No Pair";
    public Set<Card> deck = new HashSet<>();

    public String evaluateHandDealt(String hand) {
        //Hand: 'AS, 10C, 10H, 3D, 3S'
        //ace of spades, 10 of clubs, 10 of hearts, 3 of diamonds, 3 of spades
        String[] cards = hand.split(",");
        if(cards.length != 5) return null;

        List<String> listOfCards = Arrays.asList(cards);
        for(String c : listOfCards) {
            Card card = toCard(c);
            deck.add(card);
        }

        return evaluate( new Cards(deck));
    }

    public String evaluate(Cards deck) {
        String hand = NO_PAIR;
        for(PokerHand pokerHand : PokerHand.values()) {
            switch (pokerHand) {
                case ROYAL_FLUSH:
                    if(pokerHand.satisfy(deck)) { hand = pokerHand.getDescription(); }
                    break;
                case STRAIGHT_FLUSH:
                    if(pokerHand.satisfy(deck)) { hand = pokerHand.getDescription(); }
                    break;
            }
        }
        return hand;
    }

    public Card toCard(String dealtCard) {
        String dealtSuit = dealtCard.substring(dealtCard.length() - 1);
        String dealtFace = substringBeforeLast(dealtCard, dealtSuit);

        Suit suit = getSuit(dealtSuit);
        Face face = getFace(dealtFace);

        return new Card(suit, face);
    }

    public static String substringBeforeLast(String str, String separator) {
        if (isEmpty(str) || isEmpty(separator)) {
            return str;
        }
        int pos = str.lastIndexOf(separator);
        if (pos == -1) {
            return str;
        }
        return str.substring(0, pos);
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public Suit getSuit(String card) {
        Suit suit = null;
        for(Suit s : Suit.values()){
            if(s.getSymbol().equals(card))
                suit = s;
        }
        return suit;
    }

    public Face getFace(String card) {
        Face face = null;
        for(Face f : Face.values()) {
            if(f.getDescription().equals(card))
                face = f;
        }
        return face;
    }

}
