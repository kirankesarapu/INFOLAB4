public class App {
    public static void main(String[] args) throws Exception {
        
  
        Account account = Account.login("Kiran","kirankesarapu");

        account.setpassword("hikiranabc");

        Human mainPlayer = new Human("Kiran");
        Computer computer = new Computer(); 

    
        Game game1 = new Game(mainPlayer, computer);

        
        computer.randomlyArrangeShips(); 
        mainPlayer.manualShipArrangement(); 
         


        System.out.println("");
        System.out.println("Game: " +  mainPlayer.getplayerName()  + " vs " + computer.getplayerName());
        System.out.println("");
        System.out.println("Player 1 " + mainPlayer.getplayerName()  + "'s ships :");
        for (Ship ship : mainPlayer.getShips()) {
            System.out.println("Ship Name : " +  ship.getType() + ", Size : " + ship.getSize());
        }
        System.out.println("");
        System.out.println("Player 2 " + computer.getplayerName()  + "'s ships :");
        for (Ship ship : computer.getShips()) {
            System.out.println("Ship Name : " +  ship.getType() + ", Size : " + ship.getSize());
        }
        
    }
}
