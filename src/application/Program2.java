package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Find By ID ===");
		System.out.println(departmentDao.findById(2));
		
		System.out.println("\n=== insert ===");
		Department depI = new Department(null, "Tools");
		//departmentDao.insert(depI);
		
		System.out.println("\n=== update ===");
		Department depU = new Department(2, "Toolss");
		//departmentDao.update(depU);
		
		System.out.println("\n=== delete ===");
		departmentDao.deleteById(8);
		
		System.out.println("\n=== Find All ===");
		List<Department> listAll = departmentDao.findAll();		
		for(Department dep : listAll) {
			System.out.println(dep);
		}		
	}

}
