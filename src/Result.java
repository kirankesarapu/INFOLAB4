public class Result {
    private Player gamewinner; 
    private int score; 


    Result(Player player1, Player player2){
        int player1Score = player1.getScore();         
        int player2Score = player2.getScore(); 
        
        this.score = player1Score > player2Score ? player1Score :  player2Score;
        this.gamewinner = player1Score > player2Score ? player1 : player2;
    }

    public Player getgameWinner() {
        return gamewinner;
    }

 
    
}
