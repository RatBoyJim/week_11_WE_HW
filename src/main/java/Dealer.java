import java.util.ArrayList;
import java.util.Collections;

public class Dealer {
    private String name;
    private ArrayList<Card> shuffledDeck;

    public Dealer(String name){
        this.name = name;
        this.shuffledDeck = new ArrayList<Card>();
    }

    public int getNumberOfShuffledCards() {
        return this.shuffledDeck.size();
    }

    public Boolean findCard(Card card) {
        if (this.shuffledDeck.contains(card));
        return true;
    }

    public ArrayList<Card> shuffleCards(ArrayList<Card> deck){
        this.shuffledDeck = deck;
        Collections.shuffle(this.shuffledDeck);
        return this.shuffledDeck;
    }

    public Card dealQueenOfHearts(Player player){
        Card card = new Card(SuitType.HEARTS, RankType.QUEEN);
        ArrayList<Card> playerDeck = player.getPlayerCards();
        playerDeck.add(card);
        return card;
    }

    public Card dealFourOfClubs(Player player){
        Card card = new Card(SuitType.CLUBS, RankType.FOUR);
        ArrayList<Card> playerDeck = player.getPlayerCards();
        playerDeck.add(card);
        return card;
    }

    public Card dealCard(Player player) {
        Card card = shuffledDeck.remove(0);
        ArrayList<Card> playerDeck = player.getPlayerCards();
        playerDeck.add(card);
        return card;
    }

}
