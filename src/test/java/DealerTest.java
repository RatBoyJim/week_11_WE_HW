import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Deck deck;
    Dealer dealer;

    @Before
    public void setUp(){
        deck = new Deck();
        dealer = new Dealer("Kim Deal");
    }


    @Test
    public void shuffledDeckContainsAFullDeck(){
        deck.makeDeck();
        dealer.shuffleCards(deck.getDeck());
        assertEquals(52, dealer.getNumberOfShuffledCards());
    }

    @Test
    public void canDealCard(){
        deck.makeDeck();
        dealer.shuffleCards(deck.getDeck());
        dealer.dealCard();
        assertEquals(51, dealer.getNumberOfShuffledCards());
    }

    @Test
    public void canDeal2Cards(){
        deck.makeDeck();
        dealer.shuffleCards(deck.getDeck());
        dealer.dealCard();
        dealer.dealCard();
        assertEquals(50, dealer.getNumberOfShuffledCards());
    }

}
