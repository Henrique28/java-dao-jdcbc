package application;

import java.text.ParseException;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {

		Department dep = new Department(1, "Computers");		
		Seller sel = new Seller(12, "Fulano", "fulano@gmail.com", new Date(), 3000.00, dep);
		
		System.out.println(sel);
	}

}
