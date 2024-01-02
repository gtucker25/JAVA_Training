import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    //Creating Playlist
    ArrayList<String> desertIslandPlaylist = new ArrayList<>();
    //Adding Songs
    desertIslandPlaylist.add("Holly");
    desertIslandPlaylist.add("Noah Kahan");
    desertIslandPlaylist.add("Into Your Room");
    desertIslandPlaylist.add("Shade of Yellow");
    desertIslandPlaylist.add("Paris");
    //Printing songs and size of playlist
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    //Removing one
    desertIslandPlaylist.remove("Noah Kahan");
    // checking playlist and size again
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    // swapping two songs to mix up the order
    int indexA = desertIslandPlaylist.indexOf("Paris");
    int indexB = desertIslandPlaylist.indexOf("Shade of Yellow");
    String tempA = "Shade of Yellow";
    String tempB = "Paris";

    desertIslandPlaylist.set(indexA,tempA);
    desertIslandPlaylist.set(indexB,tempB);

    //Print out final version of Playlist
    System.out.println(desertIslandPlaylist);

  }
  
}