//This class defines a car loan and calculates the monthly payment.
public class CarLoan {
  int carLoan = 10000;
  int loanLength = 3;
  int interestRate = 5;
  int downPayment = 2000;
// This is a constructor for a CarLoan object. It uses conditional statements to validate the loan. 
  public CarLoan(int loanAmount, int lengthOfLoan, int loanInterest, int loanDownPayment){
    loanAmount = carLoan;
    lengthOfLoan = loanLength;
    loanInterest = interestRate;
    loanDownPayment = downPayment;
    if (lengthOfLoan <= 0 || loanInterest <= 0){
      System.out.println("Error! You must take out a valid car loan.");
    }
    else if (loanDownPayment >= loanAmount){
      System.out.println("The car can be paid in full.");
    }
    else {
      int remainingBalance = loanAmount-loanDownPayment;
      int loanInMonths = lengthOfLoan*12;
      int monthlyBalance = remainingBalance/loanInMonths;
      int interest = (monthlyBalance*loanInterest)/100;
      int monthlyPayment = monthlyBalance+interest;
      System.out.println("The monthly payment is: $"+monthlyPayment);
    }



  }
	public static void main(String[] args) {
    CarLoan garetCarLoan = new CarLoan(10000,3,5,2000);
	

	}
}