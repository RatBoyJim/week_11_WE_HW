import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Deck deck;
    Dealer dealer;
    Player player;
    Player player2;

    @Before
    public void setUp(){
        deck = new Deck();
        dealer = new Dealer("Kim Deal");
        player = new Player("Frank Black");
        player2 = new Player("Dave");
    }


    @Test
    public void shuffledDeckContainsAFullDeck(){
        deck.makeDeck();
        dealer.shuffleCards(deck.getDeck());
        assertEquals(52, dealer.getNumberOfShuffledCards());
    }

    @Test
    public void shuffledDeckContainsSpecificCard(){
        deck.makeDeck();
        dealer.shuffleCards(deck.getDeck());
        Card card = new Card(SuitType.HEARTS, RankType.SEVEN);
        assertEquals(true, dealer.findCard(card));
    }

    @Test
    public void canDealCard(){
        deck.makeDeck();
        dealer.shuffleCards(deck.getDeck());
        dealer.dealCard(player);
        assertEquals(51, dealer.getNumberOfShuffledCards());
    }

    @Test
    public void canDeal2Cards(){
        deck.makeDeck();
        dealer.shuffleCards(deck.getDeck());
        dealer.dealCard(player);
        dealer.dealCard(player);
        assertEquals(50, dealer.getNumberOfShuffledCards());
    }

    @Test
    public void canDealCardToPlayer(){
        deck.makeDeck();
        dealer.shuffleCards(deck.getDeck());
        dealer.dealCard(player);
        assertEquals(1, player.getNumberOfCards());
    }

    @Test
    public void canDealCardsToTwoPlayers(){
        deck.makeDeck();
        dealer.shuffleCards(deck.getDeck());
        dealer.dealCard(player);
        dealer.dealCard(player2);
        assertEquals(1, player.getNumberOfCards());
        assertEquals(1, player2.getNumberOfCards());
    }



}
