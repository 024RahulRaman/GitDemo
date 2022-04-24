package OOPConceptPart2;

public class HSBCbank implements USBank, BrazilBank{
	
	public void credit() {
	System.out.println("HSBC---Credit");
	}
	public void debit() {
		System.out.println("HSBC--Debit");
	}
	public void transferMoney() {
		System.out.println("HSBC---Transfer Money");
	}
	public void educationloan() {
		System.out.println("HSBC--education loan");}
		
		public void MutalFund() {
			System.out.println("HSBC---MutualFund");
			
		}
	
		// Brazil Bank
		public void IR() {
			System.out.println("HSBC---IR");
		}
		public void TopUp() {
			System.out.println("HSBC---TopUp");
			
		}
		
	}

	


