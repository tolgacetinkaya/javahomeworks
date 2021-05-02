package interfaceAbstractDemo;



import java.sql.Date;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 =new Customer(1, "Engin", "Demiroð", new Date(1985,1,6), "10987654321");
		Customer customer2 = new Customer(2,"Tolga","Çetinkaya",new Date(1991,7,2),"12345678901");
		
		
		BaseCustomerManager customerManager= new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer1);
		
		BaseCustomerManager customerManager2= new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.save(customer2);
		

	}

}
