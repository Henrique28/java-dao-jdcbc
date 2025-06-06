package application;

import java.util.Date;
import java.util.List;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Find By ID ===");
		System.out.println(sellerDao.findById(3));
		
		System.out.println("\n=== Find By Department ===");		
		Department dep = new Department(1, null);
		List<Seller> ListByDepartmen = sellerDao.findByDepartment(dep);
		
		for(Seller seller : ListByDepartmen) {
			System.out.println(seller);
		}

		System.out.println("\n=== Insert ===");
		Department depI = new Department(1, null);
		Seller objInsert = new Seller(null, "Teste25", "teste25@teste.com", new Date(), 3500.00, depI);
		//sellerDao.insert(objInsert);
		
		System.out.println("\n=== Update ===");
		Seller otherSeller = sellerDao.findById(1);
		//sellerDao.update(otherSeller);

		System.out.println("\n=== delete ===");
		sellerDao.deleteById(20);
		
		System.out.println("\n=== Find All ===");	
		List<Seller> ListAll = sellerDao.findAll();
		
		for(Seller allSeller : ListAll) {
			System.out.println(allSeller);
		}
		
		DB.closeConnection();
	}

}
