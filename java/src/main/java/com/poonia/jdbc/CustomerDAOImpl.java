package com.poonia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.poonia.core.Customer;

//import java.sql.DriverManager;
public class CustomerDAOImpl implements CustomerDAO {

	private Connection connection;

	public CustomerDAOImpl() throws SQLException {
		connection = DBConnection.getConnection();
	}

	@Override
	public void add(Customer customer) {
		String sql = "insert into customers values(?,?,?)";
		try (PreparedStatement statement = connection.prepareStatement(sql)) {

			connection.setAutoCommit(false);
			statement.setInt(1, customer.getId());
			statement.setString(2, customer.getName());
			statement.setInt(3, customer.getAge());

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void update(Customer customer) {
		String sql = "update customers set customerName=? , contactLastName=? where customerNumber=?";
		try (PreparedStatement statement = connection.prepareStatement(sql)) {

			connection.setAutoCommit(false);
			statement.setInt(1, customer.getId());
			statement.setString(2, customer.getName());
			statement.setInt(3, customer.getAge());
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void delete(int customerid) {
		String sql = "delete from customers where customerNumber=?";
		try (PreparedStatement statement = connection.prepareStatement(sql)) {

			connection.setAutoCommit(false);
			statement.setInt(1, customerid);
			statement.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Customer findById(int customerid) {
		String sql = "select *from customers where customerNumber=+customerid";
		try (Statement statement = connection.createStatement()) {

			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				Customer c = new Customer(rs.getInt(1), rs.getString("customerName"),
						rs.getInt("phone"));
				return c;
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public List<Customer> findAll() {

		String sql = "select *from customers ";
		List<Customer> lst = new LinkedList<Customer>();
		try (Statement statement = connection.createStatement()) {

			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				lst.add(new Customer(rs.getInt(1), rs.getString("customerName"), rs
						.getInt("phone")));
				return lst;
			}

		}

		catch (SQLException e) {
			e.printStackTrace();

		}

		return null;
	}

	@Override
	public int[] executeBatch(Customer[] customer) {
		String sql = "insert into customers values(?,?, ?)";
		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			for (Customer c : customer) {
				ps.setInt(1, c.getId());
				ps.setString(2, c.getName());
				ps.setInt(3, c.getAge());
				ps.addBatch();
			}
			int count[] = ps.executeBatch();
			// connection.commit();
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}
}
