package Day12;

public class Account5a {
	/*
	 // and getter methods create manually
	private int accno;
	private String name;
	private double amount;

	void setAccno(int accno)
	{
		this.accno=accno;
	}
	
	int getAccno()
	{
		return accno;
	}
	*/
	
	//setter and getter methods create by using eclipse shortcut
	
	//Source menu...>generate setter and getter...>select all...>generate
	
	private int accno;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private double amount;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	
}
