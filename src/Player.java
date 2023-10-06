import java.util.ArrayList;
import java.util.List;

public class Player {
    private int playerid; 
    private String playername; 
    private int score; 
    private List<Ship> ships = new ArrayList<>();
    private List<Torpedo> torpedoes = new ArrayList<>();

    public int getScore() {
        return score;
    }


    Player(String playername){
        this.playerid = (int) (Math.random() * 100.0); 
        this.playername = playername; 
    }


    public int getscore(){
        return score; 
    }

    public void attackwithTorpedoes(Torpedo torpedo) throws Exception{
        if(this.torpedoes.size() < 46){
            this.torpedoes.add(this.torpedoes.size(), torpedo);
        }else {
            throw new Exception("MAX LIMIT REACHED: Only 45 Ships are allowed");
        }
    }

    public void addShip(Ship ship) throws Exception{
        if(this.ships.size() < 6){
            this.ships.add(this.ships.size(), ship);
        }else {
            throw new Exception("MAX LIMIT REACHED: Only 6 Ships are allowed");
        }
    }


    public int getplayerId() {
        return playerid;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public List<Torpedo> getTorpedoes() {
        return torpedoes;
    }

    public String getplayerName() {
       return this.playername; 
    }
    

}
