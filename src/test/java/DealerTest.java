import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
    public void canDealCard(){
        deck.makeDeck();
        dealer.dealCard(deck.shuffleCards());
        assertEquals(51, deck.getNumberOfCards());
    }

    @Test
    public void canDeal2Cards(){
        deck.makeDeck();
        dealer.dealCard(deck.shuffleCards());
        dealer.dealCard(deck.shuffleCards());
        assertEquals(50, deck.getNumberOfCards());
    }

}
