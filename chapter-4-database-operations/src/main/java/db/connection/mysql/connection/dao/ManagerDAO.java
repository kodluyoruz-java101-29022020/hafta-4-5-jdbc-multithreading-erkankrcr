package db.connection.mysql.connection.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.connection.mysql.connection.DbSQLQuery;
import db.connection.mysql.connection.model.Employee;
import db.connection.mysql.connection.model.Manager;

public class ManagerDAO {

	//Yapıldı
	public List<Manager> loadAllActiveManagers() {
		
		List<Manager> managers = new ArrayList<Manager>();

		ResultSet resultSet = DbSQLQuery.select(
				"select" +
						" dm.emp_no , d.dept_no , dm.from_date , dm.to_date , d.dept_name " +
						", e.birth_date , e.first_name , e.last_name , e.gender , e.hire_date " +
						"from dept_manager dm , departments d , employees e " +
						"where dm.dept_no = d.dept_no and e.emp_no = dm.emp_no");

		try {
			while(resultSet.next()){
				Employee employee = new Employee();
				employee.setLastName(resultSet.getString("last_name"));
				employee.setHireDate(resultSet.getDate("hire_date"));
				employee.setName(resultSet.getString("first_name"));
				employee.setBirthDate(resultSet.getDate("birth_date"));
				employee.setGender(resultSet.getString("gender"));
				employee.setId(resultSet.getLong("emp_no"));
				managers.add(new Manager(employee,resultSet.getString("dept_name")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Burada halen aktif olarak yöneticilik yapan tüm çalışanları departman isimleriyle birlikte liste halinde hazırlayınız.
		// Manager sınıfını sizin oluşturdum. 
		// İpucu: Bu sorgunun bir benzerini derste anlatmıştım. Hatta "sql_query_samples.sql" dosyası içinde benzeri mevcut.
		
		return managers;
	}
	
}
