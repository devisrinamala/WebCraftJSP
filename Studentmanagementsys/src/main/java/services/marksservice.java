package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import models.marks;

public class marksservice {

	private Connection conn;
	
	public marksservice(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean addmarks(marks m) {
		boolean f = false;
		
		try {
			
			String sql = "insert into marks(pinnumber,cns,bda,ml,ads,swm,ipr) values(?,?,?,?,?,?,?)";
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, m.getpinnumber());
			pmst.setInt(2, m.getcns());
			pmst.setInt(3, m.getbda());
			pmst.setInt(4, m.getml());
			pmst.setInt(5, m.getads());
			pmst.setInt(6, m.getswm());
			pmst.setInt(7, m.getipr());
			
			int i = pmst.executeUpdate();
			if(i==1) {
				f = true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	
	public List<marks> getall(){
		List<marks> list = new ArrayList<marks>();
		
		marks m = null;
		
		try {
			
			String sql = "select * from marks";
			PreparedStatement pmst = conn.prepareStatement(sql);
			ResultSet rs = pmst.executeQuery();
			
			while (rs.next()) {
				m = new marks();
				m.setpinnumber(rs.getString(1));
				m.setcns(rs.getInt(2));
				m.setbda(rs.getInt(3));
				m.setml(rs.getInt(4));
				m.setads(rs.getInt(5));
				m.setswm(rs.getInt(6));
				m.setipr(rs.getInt(7));
				list.add(m);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	public marks getbypin(String pinnumber) {
		
		marks m = null;
		
		try {
			
			String sql = "Select * from marks where pinnumber = ?";
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, pinnumber);
			
			ResultSet rs = pmst.executeQuery();
			
			while(rs.next()) {
				m = new marks();
				m.setpinnumber(rs.getString(1));
				m.setcns(rs.getInt(2));
				m.setbda(rs.getInt(3));
				m.setml(rs.getInt(4));
				m.setads(rs.getInt(5));
				m.setswm(rs.getInt(6));
				m.setipr(rs.getInt(7));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return m;
	}
	
	public boolean deletemar(String pinnumber) {
		
		boolean f = false;
		
		try {
			
			String sql = "delete from marks where pinnumber = ?";
			PreparedStatement pmst = conn.prepareStatement(sql);
			
			pmst.setString(1, pinnumber);
			
			int i = pmst.executeUpdate();
			
			if(i==1) {
				f = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public boolean updatemar(marks m) {
		
		boolean f = false;
		
		try {
			
			String sql = "update marks set cns=?,bda=?,ml=?,ads=?,swm=?,ipr=? where pinnumber=?";
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setInt(1, m.getcns());
			pmst.setInt(2, m.getbda());
			pmst.setInt(3, m.getml());
			pmst.setInt(4, m.getads());
			pmst.setInt(5, m.getswm());
			pmst.setInt(6, m.getipr());
			pmst.setString(7, m.getpinnumber());
			
			int i = pmst.executeUpdate();
			
			if(i==1) {
				f = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
