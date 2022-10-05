package makeclass;

public class Account {
	
	public String userName;
	public String accountName;
	public long amount;
	public long balance;

	public void deposit() {
		System.out.println("입금  [ 이름 = " + userName + ", 계좌이름 = " + accountName + ", 금액 = " + amount + "]");
	}
	
	public void withdrawal() {		
		System.out.println("출금  [ 이름 = " + userName + ", 계좌이름 = " + accountName + ", 금액 = " + amount + "]");
	}
}
