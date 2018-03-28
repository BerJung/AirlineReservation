package airlineReservation;

import java.sql.*;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class memberDataAccess {
	private static final String DRIVER
    = "oracle.jdbc.driver.OracleDriver";
	private static final String URL
    = "jdbc:oracle:thin:@192.168.0.3:1521:ORCL";
	
	private static final String USER = ""; //DB ID
    private static final String PASS = ""; //DB Password
    Member_List mList;

    public memberDataAccess() {
    	   
    }
    
    public memberDataAccess(Member_List mList) {
    	this.mList = mList;
        System.out.println("DataAccess=> " + mList);
    }
    
    public Connection getConn() {
        Connection con = null;
       
        try {
            Class.forName(DRIVER); //Driver loading
            con = DriverManager.getConnection(URL, USER, PASS); //Connecting driver
           
        } catch(Exception e) {
            e.printStackTrace();
        }
       
        return con;
    }
    
    public memberDataAccess getmemberDataAccess(String id) {
        
    	memberDataAccess dt = new memberDataAccess();
    	
    	 Connection con = null;       //Connect
         PreparedStatement ps = null; //Order
         ResultSet rs = null;         //Result
         
         try {
             
             con = getConn();
             String sql = "select * from tb_member where id = ?";
             ps = con.prepareStatement(sql);
             ps.setString(1, id);
            
             rs = ps.executeQuery();
            
             if(rs.next()) {
            	 dt.setFirstName(rs.getString("First"));
            	 dt.setLastName(rs.getString("Last"));
            	 dt.setAddr(rs.getString("Address"));
                 dt.setZip(rs.getString("Zip"));
                 dt.setState(rs.getString("State"));
                 dt.setId(rs.getString("id"));
                 dt.setPwd(rs.getString("Pass."));
                 dt.setEmail(rs.getString("email"));
                 dt.setSsn(rs.getString("SSN"));
                
             }
         } catch(Exception e) {
             e.printStackTrace();
         }      
        
         return dt;
    }
    
    public boolean insertMember (memberDataAccess dto) {
    	boolean ok = false;
        
        Connection con = null;       //Connect
        PreparedStatement ps = null; //Order
       
        try {
           
            con = getConn();
            String sql = "insert into tb_member(" +
                    "First, Last, Address, Zip, State, " +
                    "id, Pass., email, SSN) "+
                    "values(?,?,?,?,?,?,?,?,?)";
       
            ps = con.prepareStatement(sql);
            ps.setString(1, dt.getFirstName());
            ps.setString(2, dt.getLastName());
            ps.setString(3, dt.getAddr());
            ps.setString(4, dt.getZip());
            ps.setString(5, dt.getState());
            ps.setString(6, dt.getId());
            ps.setString(7, dt.getPwd());
            ps.setString(8, dt.getEmail());
            ps.setString(9, dt.getSsn());
        
            int r = ps.executeUpdate(); //Execute => Save
            if(r > 0) {
                System.out.println("Success!");   
                ok = true;
            } else {
                System.out.println("Fail! Try again...");
            }
        
        } catch(Exception e) {
            e.printStackTrace();
        }
        return ok;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
