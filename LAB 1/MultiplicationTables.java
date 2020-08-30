package multiplicationtables;

/**
 *
 * @author BRIDGET GITHINJI
 */
//import java.util.Arrays;
public class MultiplicationTables {
    int name;
    int multNum;
    int rangeFrom;
    int rangeTo;
    
    public MultiplicationTables(int jina, int mNum, int rFrom, int rTo){
    name = jina;    
    multNum = mNum;
    rangeFrom = rFrom;
    rangeTo = rTo;
    }
    
    public int getName(){
    return name;
    }

    
    
    public static void main(String[] args) {
        MultiplicationTables Three = new MultiplicationTables(3,3,17,25);
        System.out.println("The Multiplication Table of "+ Three.getName()+" is: ");
        Three.printTable();
        MultiplicationTables Seventeen = new MultiplicationTables(17,17,3,49);
        System.out.println("The Multiplication Table of "+ Seventeen.getName()+" is: ");
        Seventeen.printTable();
        MultiplicationTables Zero = new MultiplicationTables(0,0,1,5);
        System.out.println("The Multiplication Table of "+ Zero.getName()+" is: ");
        Zero.printTable();
        
        MultiplicationTables[] MultiplicationTable = new MultiplicationTables[3];
        MultiplicationTable[0] = Three;
        MultiplicationTable[1] = Seventeen;
        MultiplicationTable[2] = Zero;
    }
        
    public void printTable(){
    for(int i=rangeFrom;i<=rangeTo;i++){
    int result = i * multNum;
    System.out.println(i+" * "+ multNum+" = "+ result);
    }
    System.out.println();
    }
    
    
    
}
    

