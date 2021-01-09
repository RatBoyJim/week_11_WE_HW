import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> playerCards;

    public Player(String name){
        this.name = name;
        this.playerCards = new ArrayList<Card>();
    }

    public int getNumberOfCards() {
        return this.playerCards.size();
    }

    public ArrayList<Card> getPlayerCards() {
        return this.playerCards;
    }
}
