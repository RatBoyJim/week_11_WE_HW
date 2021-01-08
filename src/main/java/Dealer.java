import java.util.ArrayList;
import java.util.Collections;

public class Dealer {
    private String name;
    private ArrayList<Card> shuffledDeck;

    public Dealer(String name){
        this.name = name;
        this.shuffledDeck = new ArrayList<Card>();
    }


    public Card dealCard(ArrayList<Card> deck) {
        Card card = deck.remove(0);
        System.out.println(card.getRank());
        System.out.println(card.getSuit());
        return card;
    }

}
