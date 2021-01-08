import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

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
    public void shuffledDeckContainsAFullDeck(){
        deck.makeDeck();
        deck.shuffleCards();
        assertEquals(52, deck.getNumberOfCards());
    }

    @Test
    public void shuffledDeckContainsSpecificCard(){
        deck.makeDeck();
        deck.shuffleCards();
        Card card = new Card(SuitType.HEARTS, RankType.ACE);
        assertEquals(true, deck.findCard(card));
    }

}
