public class CokeEmpire {
  Cokematic[] collection;     // what does this do?
  public CokeEmpire() {
    collection = new Cokematic[10];   // what does this do?
  }
  public void addCokematic(int index, int cans, String loc, int sold, double cash) {
    collection[index] = new Cokematic(cans, loc, sold, cash);
  }
  public Cokematic getCokematic(int index) {
    return collection[index];
  }
}
