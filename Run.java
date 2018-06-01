//Gabriel Cesar

public class Run {
	public static void main(String[] args) {
		CokeEmpire john = new CokeEmpire();
		WorldCokeEmpire mary = new WorldCokeEmpire();
		john.addCokematic(0,120,"Alter do chao",0,0);
		mary.addCokematic(0,300,"Long Beach California",0,0);
		john.addCokematic(1,80,"Pajuçara",0,0);
		mary.addCokematic(1,250,"Jardim des Tuileries",0,0);
		for(int i = 1;i<=10;i++){
			john.getCokematic(0).buyCoke();
		}
		mary.getCokematic(0).buymanycoke(30);
		for(int i = 1;i<=22;i++){
			john.getCokematic(1).buyCoke();
		}
		mary.getCokematic(1).buymanycoke(10);
		int marysold = 0;
		double marycash = 0;
		for(int i = 0;i <= 9;i++ ){
			if(mary.getCokematic(i)!=null){
				marysold = marysold + mary.getCokematic(i).getCansSold();
				marycash = marycash + mary.getCokematic(i).getCashIn();
			}
				
		}
		int johnsold = 0;
		double johncash = 0;
		for(int i = 0;i <= 9;i++ ){
			if(john.getCokematic(i)!=null){
				johnsold = johnsold + john.getCokematic(i).getCansSold();
				johncash = johncash + john.getCokematic(i).getCashIn();
				}
		}
	
		System.out.println("O Imperio John vendeu mais "+johnsold+" e faturou R$ "+johncash+"0");
		System.out.println("O Imperio Mary vendeu mais "+marysold+" e faturou R$ "+marycash+"0");
			
				
 	}
}
