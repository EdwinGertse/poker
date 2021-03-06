package za.co.inclusivity.game.poker.service;

import com.google.common.collect.Ordering;
import za.co.inclusivity.game.poker.model.Card;
import za.co.inclusivity.game.poker.model.Face;

import java.util.*;
import java.util.stream.Collectors;

public class Cards {

    public Set<Card> deck;

    public Cards(Set<Card> deck) {
        this.deck = deck;
    }

    public LinkedHashSet<Card> shuffle(Set<Card> set) {
        List<Card> list = new ArrayList<>(set);
        Collections.shuffle(list);
        LinkedHashSet<Card> shuffledSet = new LinkedHashSet<>();
        shuffledSet.addAll(list);
        return shuffledSet;
    }

    public void dealCard(){
        //TODO
    }

    public boolean hasCard(Face face) {
        boolean hasCard = false;
        for(Card card : deck){
            hasCard = card.getFace().equals(face);
            if(hasCard) break;
        }
        return hasCard;
    }

    public boolean isAllTheSameSuit() {
        return deck.stream().collect(Collectors.groupingBy(Card::getSuit)).size() == 1;
    }

    public boolean isInSequence() {
        if(Ordering.natural().isOrdered(deck)){
            return false;
        }
        return true;
    }

}
