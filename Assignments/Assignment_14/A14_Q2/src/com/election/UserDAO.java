package com.election;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements AutoCloseable {
	private Connection con;

	public UserDAO() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// Add new User
	public int save(User c) throws SQLException {
		String sql = "Insert into users values(default,?,?,?,?,?,0,'voter')";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, c.getFname());
			stmt.setString(2, c.getLname());
			stmt.setString(3, c.getEmail());
			stmt.setString(4, c.getPassword());
			java.sql.Date sDate = new java.sql.Date(c.getDob().getTime());
			stmt.setDate(5, sDate);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	// Delete User
	public int deleteById(int id) throws SQLException {
		String sql = "Delete from users where id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	// Update User
	public int update(User c) throws SQLException{
			String sql = "update users set first_name = ?,last_name = ?,email=?,password=?,dob=? where id=?";
			try (PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setString(1, c.getFname());
				stmt.setString(2, c.getLname());
				stmt.setString(3, c.getEmail());
				stmt.setString(4, c.getPassword());
				java.sql.Date sDate = new java.sql.Date(c.getDob().getTime());
				stmt.setDate(5, sDate);
				stmt.setInt(6, c.getId());
				int cnt = stmt.executeUpdate();
				return cnt;
			}
		}
	
	//show all Users
	
	public List<User> showAll() throws SQLException {
		String sql = "select * from users";
		List<User> list = new ArrayList<User>();
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					User c = new User();
					c.setId(rs.getInt("id"));
					c.setFname(rs.getString("first_name"));
					c.setLname(rs.getString("last_name"));
					c.setEmail(rs.getString("email"));
					c.setPassword(rs.getString("Password"));
					java.util.Date udate = new java.util.Date(rs.getDate("dob").getTime());
					c.setDob(udate);
					list.add(c);
				}
			}
		}
		return list;
	}
	
}
