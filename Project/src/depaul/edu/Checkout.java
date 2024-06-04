package depaul.edu;

public class Checkout {
	private String cardNum;
	private String cardHolderName;
	
	public Checkout(String cardNum, String cardHolderName) {
		this.cardNum = cardNum;
		this.cardHolderName = cardHolderName;
	}

	public boolean getCardDetails() {
		if (cardHolderName != null) {
			if (cardNum.length() != 9) {
				System.out.println("Card number is not valid");
				return false;
			}
			else {
				return true;
			}
		}
		else {
			System.out.println("Card holder name should not be null");
			return false;
		}
	}
}
