package JavaA3;

import java.util.Set;
import java.util.TreeSet; 

public class BankAccountList {
	
	 public static void main(String[] args) {
	
	 SavingAccount sal1=new SavingAccount(13579, 246, "Ravi", true);
	 SavingAccount sal2=new SavingAccount(24680, 135, "Teja", true);
	 SavingAccount sal3=new SavingAccount(97531, 468, "Naveen", false);
	 SavingAccount sal4=new SavingAccount(86420, 357, "Sai", true);
	 SavingAccount sal5=new SavingAccount(75391, 680, "Subbu", false);
     

		sal1.deposit(1500);
		sal2.withdraw(1000);
		System.out.println(sal1.getAcc_balance());
		System.out.println(sal2.getAcc_balance());

		Set <SavingAccount> BankAccList = new TreeSet<>();
		
		BankAccList.add(sal5);
		BankAccList.add(sal4);
		BankAccList.add(sal3);
		BankAccList.add(sal2);
		BankAccList.add(sal1);
     
		java.util.Iterator<SavingAccount> it = BankAccList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
     
		}

   }
	 
}
