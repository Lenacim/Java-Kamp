package interfaceAbstractDemo;

public class Main {
	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer customer = new Customer(1,"Aleyna","Isnýk","2000","145879654875");
        customerManager.Save(customer);
	}

}
