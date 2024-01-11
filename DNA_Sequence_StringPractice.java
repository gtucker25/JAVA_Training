// This program analyzes strings to determine if the string represents a protein or not.
public class DNA {
    public static void main(String[] args) {
      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATTAATATGTACTGA";
      // This is where you set the dna variable you want to test for proteins
      String dna = dna3;
      System.out.println("Length: "+dna1.length());
      int start = dna.indexOf("ATG");
      System.out.println("Start: "+start);
      int stop = dna.indexOf("TGA");
      if(start != -1 &&
       stop != -1 && 
       (stop - start) % 3 == 0){
        String protein = dna.substring(start,stop+3);
        System.out.println("Protein: "+protein);
      }
      else{
        System.out.println("No protein.");
      }
    }
  }