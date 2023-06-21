package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nit.model.Employee;

@Repository("mysqlEmpDAO")
@Profile({"dev","test","default"})
public class MySQLEmployeeDAOImpl implements IEmployeeDAO {

	private static final String GET_EMPS_BY_DESG = "SELECT * FROM EMPLOYEE WHERE DESG IN(?,?,?) ORDER BY DESG";

	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeesByDesg(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeDAOImpl.getEmployeesByDesg()ds " + ds.getClass());
		List<Employee> list = null;
		
		// get pooled jdbc connection object
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(GET_EMPS_BY_DESG)) {
			
			// set the values to query parameters
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			try (ResultSet rs = ps.executeQuery()) {
				// copy each records of result set to Employee object
				list = new ArrayList<>();
				while (rs.next()) {
					Employee emp = new Employee();
					
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setEaddrs(rs.getString(3));
					emp.setDesg(rs.getString(4));
					emp.setSalary(rs.getDouble(5));
					emp.setDeptno(rs.getInt(6));
					list.add(emp);
			}
				}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}

}
