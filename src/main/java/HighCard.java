import java.util.ArrayList;

public class HighCard {

    public String playGame(Player player, Player player2){
        ArrayList<Card> playerDeck = player.getPlayerCards();
        ArrayList<Card> player2Deck = player2.getPlayerCards();
        Card player1Card = playerDeck.remove(0);
        Card player2Card = player2Deck.remove(0);
        if(player1Card.getValueFromEnum() > player2Card.getValueFromEnum())
            return "Player 1 wins!";
        return "Player 2 wins!";
    }
}
