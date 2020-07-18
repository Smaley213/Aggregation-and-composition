package by.htp.less.bankAccount;

public class View {

public void printCustomer(Customer customer) {
		
		System.out.println(customer);
		
	}
	
	public void printSum(int sum) {
		
		System.out.println("Сумма по счетам " + sum);
	}
	
	public void printAccount(BankAccount account) {
		
		System.out.println(account);
	}

}
