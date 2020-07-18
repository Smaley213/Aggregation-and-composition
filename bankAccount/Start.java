package by.htp.less.bankAccount;

import java.util.ArrayList;
import java.util.List;

public class Start {

public static void main(String[] args) {
		
		Logic logic = new Logic();
		View print = new View();
		
		BankAccount a1 = new BankAccount(220, 300, true);
		BankAccount a2 = new BankAccount(5, 55, true);
		BankAccount a3 = new BankAccount(9, -30, false);
		BankAccount a4 = new BankAccount(19, 1500, true);
		
		
		BankAccount b1 = new BankAccount(245, 5000, true);
		BankAccount b2 = new BankAccount(70, -15, true);
		BankAccount b3 = new BankAccount(6, -12, false);
		BankAccount b4 = new BankAccount(100, 35, true);
		
		List<BankAccount> listBankAccount1 = new ArrayList<BankAccount>();
		List<BankAccount> listBankAccount2 = new ArrayList<BankAccount>();
		
		listBankAccount1.add(a1);
		listBankAccount1.add(a2);
		listBankAccount1.add(a3);
		listBankAccount1.add(a4);
		
		listBankAccount2.add(b1);
		listBankAccount2.add(b2);
		listBankAccount2.add(b3);
		listBankAccount2.add(b4);
		
		Customer ivanov = new Customer("Сидор", "Иванов", listBankAccount1);
		Customer sidorov = new Customer("Петр", "Сидоров", listBankAccount2);
		
		print.printAccount(logic.findAccount(ivanov, 10));
		
		logic.blockAccount(sidorov, 53, false);
		
		print.printCustomer(sidorov);
		
		print.printCustomer(logic.sortAccount(ivanov));
		
		print.printSum(logic.sumAccount(sidorov));
		
		print.printSum(logic.sumPositiveBalanceAccount(sidorov));
		
		print.printSum(logic.sumNegativeBalanceAccount(sidorov));
		

	}

}
