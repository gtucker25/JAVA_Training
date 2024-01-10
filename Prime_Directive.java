// Import statement:
import java.util.ArrayList;
class PrimeDirective {
  
  // Take an integer in and figure out if it's prime
  public boolean isPrime(int number){
    if(number==2){
      return true;
    }
    else if(number<2){
      return false;
    }
      for (int i = 2; i < number; i++ ){
            if(number % i == 0){
            return false;  
            }
            
              
          
    }
    return true;
    
  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.isPrime(7));
    System.out.println(pd.isPrime(28));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(0));
    System.out.println(pd.onlyPrimes(numbers));

  }
  // Take an ArrayList of Integers in and return only the Primes by passing each one into the isPrime method
  public ArrayList<Integer> onlyPrimes(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<>();
    for(int num : numbers){
      if (isPrime(num)==true){
        primes.add(num);
      }
    }
    return primes;
  }  

}