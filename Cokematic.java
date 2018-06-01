public class Cokematic {
  int numberOfCans;
  String location; 
  int cansSold;    
  double cashIn;
  public Cokematic(){
     numberOfCans = 0;
     location = "";
     cansSold = 0;
     cashIn = 0;
  }
  public Cokematic(int cans, String loc, int sold, double cash){
    numberOfCans = cans;   
    location = loc;        
    cansSold = sold;       
    cashIn = cash;         
    System.out.println("Adding machine");
  }

  public void buyCoke(){
    if (numberOfCans > 0){
      numberOfCans = numberOfCans - 1;
      cansSold = cansSold + 1;  
      cashIn = cashIn + 1.25;   
      System.out.println("Have a Coke");
      System.out.println(numberOfCans + " remaining");
    } else {
      System.out.println("Sold out. ver old");
    }
  }    

  public String getLocation() { return location;}
  
  public int getCansSold() { return cansSold;}
  
  public double getCashIn() { return cashIn;}
  
  public void reloadMachine(int newCans) {
    numberOfCans = numberOfCans + newCans;
    System.out.println("reloading machine");
  }

  public int getNumberOfCans() { 
     return numberOfCans;
  }

  public String toString() {
    return (location + "  sold: " + cansSold + " left:  " + numberOfCans 
    + " made: " + cashIn);
  }   
}
