import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {
    ArrayList<String> Projects = new ArrayList<String>();
    Projects.add("Loyola");
    Projects.add("JStreet");
    Projects.add("Devana");
    Projects.add("NDSUF");
    Projects.add(1,"Morehouse");
    Projects.add("Toledo");
    System.out.println(Projects);
  }
  
}