import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Deck fullDeck;

    @Before
    public void setUp(){
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.getNumberOfCards());
    }

    @Test
    public void deckHas52Cards(){
        deck.makeDeck();
        assertEquals(52, deck.getNumberOfCards());
    }

    @Test
    public void deckContainsSpecificCard(){
        deck.makeDeck();
        Card card = new Card(SuitType.HEARTS, RankType.ACE);
        assertEquals(true, deck.findCard(card));
    }

    @Test
    public void shuffledDeckContainsADeck(){
        deck.makeDeck();
        deck.shuffleCards();
        assertEquals(52, deck.getNumberOfCards());
    }

    @Test
    public void canPickACard(){
        deck.makeDeck();
        assertEquals(RankType.ACE, deck.pickCard());
    }

    @Test
    public void canDealCard(){
        deck.makeDeck();
        deck.shuffleCards();
        deck.dealCard();
        assertEquals(51, deck.getNumberOfCards());
    }

    @Test
    public void canDeal2Cards(){
        deck.makeDeck();
        deck.shuffleCards();
        deck.dealCard();
        deck.dealCard();
        assertEquals(50, deck.getNumberOfCards());
    }
}
