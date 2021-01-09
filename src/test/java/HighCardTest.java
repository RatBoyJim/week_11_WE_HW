import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighCardTest {

    Deck deck;
    Dealer dealer;
    Player player;
    Player player2;
    HighCard game;

    @Before
    public void setUp(){
        deck = new Deck();
        dealer = new Dealer("Kim Deal");
        player = new Player("Frank Black");
        player2 = new Player("Dave Lovering");
        game = new HighCard();
    }


    @Test
    public void canReturnP1AsWinner(){
        deck.makeDeck();
        dealer.dealQueenOfHearts(player);
        dealer.dealFourOfClubs(player2);
        assertEquals("Player 1 wins!", game.playGame(player, player2));
    }

    @Test
    public void canReturnP2AsWinner(){
        deck.makeDeck();
        dealer.dealQueenOfHearts(player2);
        dealer.dealFourOfClubs(player);
        assertEquals("Player 2 wins!", game.playGame(player, player2));
    }

    @Test
    public void canBeADraw(){
        deck.makeDeck();
        dealer.dealQueenOfHearts(player);
        dealer.dealQueenOfDiamonds(player2);
        assertEquals("It's a boring old draw :(", game.playGame(player, player2));
    }

    @Test
    public void canReturnP1AsWinnerInTwoCardGame(){
        deck.makeDeck();
        dealer.dealQueenOfHearts(player);
        dealer.dealQueenOfDiamonds(player);
        dealer.dealTwoOfHearts(player2);
        dealer.dealNineOfSpades(player2);
        assertEquals("Player 1 wins!", game.playGame(player, player2));
    }

    @Test
    public void canReturnP2AsWinnerInTwoCardGame(){
        deck.makeDeck();
        dealer.dealTwoOfHearts(player);
        dealer.dealNineOfSpades(player);
        dealer.dealQueenOfHearts(player2);
        dealer.dealQueenOfDiamonds(player2);
        assertEquals("Player 2 wins!", game.playGame(player, player2));
    }

    @Test
    public void canBeADrawInTwoCardGame(){
        deck.makeDeck();
        dealer.dealQueenOfHearts(player);
        dealer.dealNineOfSpades(player);
        dealer.dealQueenOfDiamonds(player2);
        dealer.dealTwoOfHearts(player2);
        assertEquals("It's a boring old draw :(", game.playGame(player, player2));
    }



//    @Test
//    public void canReturnP1AsWinnerInTwoCardGame(){
//        deck.makeDeck();
//        dealer.shuffleCards(deck.getDeck());
//        dealer.dealCard(player);
//        dealer.dealCard(player);
//        dealer.dealCard(player);
//        dealer.dealCard(player);
//        dealer.dealCard(player);
//        dealer.dealCard(player);
//        dealer.dealCard(player2);
//        dealer.dealCard(player2);
//        dealer.dealCard(player2);
//        dealer.dealCard(player2);
//        dealer.dealCard(player2);
//        dealer.dealCard(player2);
//        assertEquals("Player 2 wins!", game.playGame(player, player2));
//    }

}
