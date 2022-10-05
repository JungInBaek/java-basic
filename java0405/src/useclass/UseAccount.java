package useclass;

import makeclass.Account;

public class UseAccount {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.userName = "홍길동";
		account1.accountName = "튼튼적금";
		account1.amount = 1000;
		Account account2 = new Account();
		account2.userName = "박길동";
		account2.accountName = "튼튼예금";
		account2.amount = 2000;
		Account account3 = new Account();
		account3.userName = "홍기사";
		account3.accountName = "다음적금";
		account3.amount = 3000;
		
		account1.deposit();
		account1.withdrawal();
		account2.deposit();
		account2.withdrawal();
		account3.deposit();
		account3.withdrawal();
	}

}
