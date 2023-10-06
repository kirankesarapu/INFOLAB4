import java.util.Date;

public class Game { 
    private Date startTime; 
    private Date endTime;  
    private Grid player1Grid; 
    private Grid player2Grid; 
    private Player player1;    
    private Player player2; 
    private String status; 


    Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }


    public void playGame() {
        this.startTime = new Date();
        this.status = "running"; 
    }

    public Result getResult() {
        Result result = new Result(this.player1, this.player2); 
        return result;
    }


    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
    
    public void setPlayer1Grid(Grid player1Grid) {
        this.player1Grid = player1Grid;
    }

    public void setPlayer2Grid(Grid player2Grid) {
        this.player2Grid = player2Grid;
    }
}
