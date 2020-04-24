package db.connection.mysql.connection.service;

import db.connection.mysql.connection.dao.DepartmentDAO;
import db.connection.mysql.connection.model.Department;

import java.util.List;

public class DepartmentService {

	private DepartmentDAO departmentDAO;
	
	public DepartmentService(DepartmentDAO departmentDAO) { this.departmentDAO = departmentDAO; }

	//Yapıldı
	public List<Department> allDepartment(){ return this.departmentDAO.getAll(); }

}
