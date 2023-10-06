public class Human extends Player{

    Human(String name) {
        super(name);
    }

    // TAKE INPUT FROM THE USER AND ARRANGE SHIPS ACCORDINGLY
    public void manualShipArrangement() throws Exception{
        Ship a = new Submarine();        
        Ship b = new Submarine();        
        Ship c = new Destroyer();
        Ship d = new Cruiser();
        Ship e = new Carrier();

        this.addShip(a);      
        this.addShip(b);
        this.addShip(c);
        this.addShip(d);
        this.addShip(e);
    } 
    
}
