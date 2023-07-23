package day11.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import day11.solved.ConnectionUtil;

//import day11.solved.ConnectionUtil;

class Task {
	int id;
	String name;
	String status;
	
	Task(String name, String status){

		this.name = name;
		this.status = status;
	}
	
}


public class TaskDAO {
	
	public static boolean createTask(Task task) throws DAOException {

		
		if(task == null) {
			throw new DAOException("Task Obj Can't be Null");
		}
		
		String url = "jdbc:mysql://localhost:3306/fssa";
		String userName = "root";
		String passWord = "123456";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userName, passWord);
		}catch(SQLException  e) {
			throw new DAOException("Can't Create Connection");
		}
		
		String query = "INSERT INTO users (first_name,last_name,email_id,password,github_username) VALUES (?,?,?,?,?)";
		String first_name = "aakash";
		String last_name = "balamurugan";
		String email_id ="aaksh@gmail.com";
		String password1 = "12345";
		String github_username = "aakash205";
		
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, first_name );
			pst.setString(2, last_name);
			pst.setString(3, email_id);
			pst.setString(4, password1);
			pst.setString(5, github_username);
			pst.executeUpdate();
		}catch(SQLException e) {
			throw new DAOException("Can't Run Prepared Statement");
		}
		
		ConnectionUtil.close(con, null, null);
		
		System.out.println("Task Completed");
		
		return true;
		
		
	} 
	
	public static void main(String[] args) throws DAOException {

		Task t1 = new Task("Learn JDBC", "Completed");
		
		try {
			createTask(t1);
		}catch(DAOException e) {
			throw new DAOException(e.getMessage());
		}
		
	}

}