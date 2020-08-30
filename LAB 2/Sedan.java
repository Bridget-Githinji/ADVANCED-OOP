package vehicle;

/**
 *
 * @author BRIDGET GITHINJI
 */
public class Sedan extends Vehicle implements Automobile {
    
    @Override
    public void gas(){
    System.out.println("The Sedan needs more gas");
    }
    
    @Override
    public void accelerate(){
    System.out.println("The Sedan is accelerating.");
    }
    
    public void accelerate(double speed){
    System.out.println("The Sedan is accelerating at "+speed+"km/hr.");
    }
    
    @Override
    public void carryPeople(){
    System.out.println("The Sedan is carrying four people");
    }
    
    @Override
    public void stop(){
    System.out.println("The Sedan has reached it destination, it needs to stop");
    }
}
