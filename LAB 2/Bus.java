package vehicle;

/**
 *
 * @author BRIDGET GITHINJI
 */
public class Bus extends Vehicle {
    @Override
    public void gas(){
    System.out.println("The bus needs some gas");
    }
    
    @Override
    public void accelerate(){
    System.out.println("The bus is accelerating");
    };
    
    @Override
    public void stop(){
    System.out.println("The bus needs to stop to pick someone");
    };
}
