public class Cokematic2018 extends Cokematic{
	public Cokematic2018(int cans, String loc, int sold,double cash){
		super(cans, loc, sold, cash);
	}
	public void buymanycoke(int num){
		if (numberOfCans >= num) {
			numberOfCans = numberOfCans - num;
			cansSold = cansSold + num;  
			cashIn = cashIn + num * 6.25 ; 
			System.out.println("Pegue as " + num + " cocas");
			System.out.println(numberOfCans + " restantes");
		} else 
			System.out.println("Sold out.");	
	}
}
