import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> playerCards;
    private Card highestCard;

    public Player(String name){
        this.name = name;
        this.playerCards = new ArrayList<Card>();
        this.highestCard = new Card(SuitType.CLUBS, RankType.ACE);
    }

    public int getNumberOfCards() {
        return this.playerCards.size();
    }

    public ArrayList<Card> getPlayerCards() {
        return this.playerCards;
    }

    public Card getHighestCard(){
        for (Card card: playerCards) {
            if (card.getValueFromEnum() > highestCard.getValueFromEnum()){
                highestCard = card;
            }
        }
        return highestCard;
    }

    public String getName() {
        return this.name;
    }
}
