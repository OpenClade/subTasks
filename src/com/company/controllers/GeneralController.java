package com.company.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.company.data.interfaces.IDB;
import com.company.entity.stones.PreciousStone;
import com.company.entity.trains.Passenger;
import com.company.entity.trains.Train;

public class GeneralController {
private final IDB db;
	
	public GeneralController(IDB db) {
        this.db = db;
    }
	
	
	
	public List<PreciousStone> getStones() {

		 Connection con = null;
	        try {
	            con = db.getConnection();
	            String sql = "SELECT * FROM precious_stone";
	            Statement st = con.createStatement();

	            ResultSet rs = st.executeQuery(sql);
	            List<PreciousStone> users = new LinkedList<>();
	            while (rs.next()) {
	            	 PreciousStone preciousStone = new PreciousStone(rs.getInt("price"), rs.getString("name"), rs.getDouble("weight"));

	                users.add(preciousStone);
	            }

	            return users;
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                con.close();
	            } catch (SQLException throwables) {
	                throwables.printStackTrace();
	            }
	        }
	        return null;
	    }

	public List<Passenger> getPassengers(int id) {

		 Connection con = null;
	        try {
	            con = db.getConnection();
	            String sql = "SELECT passenger.passenger_id, passenger.passenger_side, passenger.passenger_name FROM passenger, train WHERE train.train_id=? AND passenger.train_id=?";
	            PreparedStatement st = con.prepareStatement(sql);
	            st.setInt(1, id);
	            st.setInt(2, id);
	            ResultSet rs = st.executeQuery(sql);
	            List<Passenger> users = new LinkedList<>();
	            while (rs.next()) {
	            	 Passenger passenger = new Passenger(rs.getInt("passenger_id"), rs.getInt("passenger_side"), rs.getString("passenger_name"));

	                users.add(passenger);
	            }

	            return users;
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                con.close();
	            } catch (SQLException throwables) {
	                throwables.printStackTrace();
	            }
	        }
	        return null;
	    }
	public int getTotalPriceOfCompany(int id) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT (SUM(employee.salary) + SUM(programmer.salary)) as total_price FROM employee, "
            		+ "programmer WHERE employee.company_id=? AND programmer.company_id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);
            st.setInt(2, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
               

                return rs.getInt("total_price");
            }
        } catch (SQLException throwables) {
        	System.out.println("Incorrect id of company!");
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
            	System.out.println("Incorrect id of company!");
                throwables.printStackTrace();
            }
        }
        return 0;
    }
	
}
