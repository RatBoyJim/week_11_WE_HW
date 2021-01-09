public class HighCard {

    public String playGame(Player player, Player player2) {
        Card playerCard = player.getHighestCard();
        Card player2Card = player2.getHighestCard();
        if (playerCard.getValueFromEnum() > player2Card.getValueFromEnum()) {
            System.out.println(player.getName() + "'s highest card was a " + playerCard.getRank() + " of " + playerCard.getSuit());
            System.out.println(player2.getName() + "'s highest card was a " + player2Card.getRank() + " of " + player2Card.getSuit());
            System.out.println("so...");
            System.out.println(player.getName().toUpperCase() + " WINS!");
            System.out.println("");
            return "Player 1 wins!";
        } else if (player2Card.getValueFromEnum() > playerCard.getValueFromEnum()) {
            System.out.println(player.getName() + "'s highest card was a " + playerCard.getRank() + " of " + playerCard.getSuit());
            System.out.println(player2.getName() + "'s highest card was a " + player2Card.getRank() + " of " + player2Card.getSuit());
            System.out.println("so...");
            System.out.println(player2.getName().toUpperCase() + " WINS!");
            System.out.println("");
            return "Player 2 wins!";
        } else {
            System.out.println(player.getName() + "'s highest card was a " + playerCard.getRank() + " of " + playerCard.getSuit());
            System.out.println(player2.getName() + "'s highest card was a " + player2Card.getRank() + " of " + player2Card.getSuit());
            System.out.println("so...");
            System.out.println("It's a boring old draw :(");
            System.out.println("");
            return "It's a boring old draw :(";
        }
    }
}
