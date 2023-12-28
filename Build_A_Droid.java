public class Droid{
    // Initiate variables
    int batteryLevel;
    String name;  
  public static void main(String[] args){
    // Create a droid
    Droid Codey = new Droid("Codey");
    // Print the Droid's name. Somehow with the toString method
    System.out.println(Codey);
    System.out.println("Battery Level is: "+Codey.batteryLevel);
    //Send the droid to the perform task method and print the results
    Codey.performTask("Mop the Kitchen");
    System.out.println("Battery Level is now: "+Codey.batteryLevel);

  }
  public Droid(String droidName){
    name = droidName;
    batteryLevel=100;
  }
  public String toString(){
      return "Hello, I'm the droid: "+name;
    }

  public void performTask(String task){
    System.out.println(name+" is performing task: "+task);
    batteryLevel-= 10;
  }
}