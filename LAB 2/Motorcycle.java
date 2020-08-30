package vehicle;

/**
 *
 * @author BRIDGET GITHINJI
 */
public class Motorcycle extends Vehicle {
    @Override
    public void gas(){
    System.out.println("The motorcycle needs more gas");
    };
    
    @Override
    public void accelerate(){
    System.out.println("The motorcycle is accelerating");
    };
    
    @Override
    public void stop(){
    System.out.println("The motorcycle has reached it destination, it needs to stop");
    };
    
}
