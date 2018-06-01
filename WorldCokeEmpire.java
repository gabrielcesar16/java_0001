public class WorldCokeEmpire extends CokeEmpire{
	Cokematic2018[] collectione;     
  public WorldCokeEmpire() {
    collectione = new Cokematic2018[10];   
  }
  public void addCokematic(int index, int cans, String loc, int sold, double cash) {
    collectione[index] = new Cokematic2018(cans, loc, sold, cash);
  }
  public Cokematic2018 getCokematic(int index) {
    return collectione[index];
  }
}
