package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Consumers;

public class ConsumerDTO {

	Connection con = null;

	public Connection getConnection() {
		String driveName = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "michael";
		String password = "welcome123";

		try {
			Class.forName(driveName);
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public List<Consumers> retrieveAllConsumers() {
		con = getConnection();
		List<Consumers> consumer = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement("SELECT * from Consumers");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Consumers cons = new Consumers(rs.getInt(1), rs.getString(2), rs.getString(3));
				consumer.add(cons);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return consumer;
	}

	public Consumers retrieveUsingId(int id) {
		con = getConnection();
		Consumers cons = null;
		try {
			PreparedStatement ps = con.prepareStatement("select * from Consumers where CONSUMER_NUM=?");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				cons = new Consumers(rs.getInt(1), rs.getString(2), rs.getString(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cons;
	}
}