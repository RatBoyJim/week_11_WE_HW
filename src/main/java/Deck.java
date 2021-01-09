import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;
    
    public Deck(){
        this.deck = new ArrayList<Card>();
    }
    
    public ArrayList<Card> makeDeck(){
        for (SuitType suit : SuitType.values()) {
            for (RankType rank: RankType.values()) {
                Card card = new Card(suit, rank);
                this.deck.add(card);
            }
        }
        return this.deck;
    }

    public int getNumberOfCards() {
        return this.deck.size();
    }

    public ArrayList<Card> getDeck(){
        return this.deck;
    }

    public Boolean findCard(Card card) {
        if (this.deck.contains(card));
        return true;
    }

}
