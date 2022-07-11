public class Game {
    private Integer player1Points;
    private Integer player2Points;

    public Game() {
        player1Points = 0;
        player2Points = 0;
    }

    public Game(String player, Integer currentPlayer1Points, Integer currentPlayer2Points) {
        player1Points = currentPlayer1Points;
        player2Points = currentPlayer2Points;
        if(player.equals("player1")) {
            player1Points++;
        } else {
            player2Points++;
        }
    }

    public String getScore() {
        if(player2Points == 1) {
            return "Love-Fifteen";
        }
        if(player1Points == 2) {
            return "Thirty-Love";
        }
        if(player1Points == 1) {
            return "Fifteen-Love";
        }
        return "Love-All";
    }

    public Game roundWon(String player) {
        Game game = new Game(player, player1Points, player2Points);
        return game;
    }
}
