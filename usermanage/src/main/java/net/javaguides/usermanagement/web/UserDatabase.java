package net.javaguides.usermanagement.web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import net.javaguides.usermanagement.model.Users;


public class UserDatabase {
	Connection con ;

    public UserDatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean saveUser(Users user){
        boolean set = false;
        try{
            //Insert register data to database
            String query = "insert into user(name,email,password) values(?,?,?)";
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, user.getName());
           pt.setString(2, user.getEmail());
           pt.setString(3, user.getPassword());
           
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }

public Users logUsr(String logname, String logpass) {
	// TODO Auto-generated method stub
	Users usr=null;
    try{
        String query ="select * from user where name=? and password=?";
        PreparedStatement pst = this.con.prepareStatement(query);
        pst.setString(1, logname);
        pst.setString(2, logpass);
        
        ResultSet rs = pst.executeQuery();
        
        if(rs.next()){
            usr = new Users();
            usr.setId(rs.getInt("id"));
            usr.setName(rs.getString("name"));
            usr.setEmail(rs.getString("email"));
            usr.setPassword(rs.getString("password"));
            
        }
        
    }catch(Exception e){
        e.printStackTrace();
    }
    return usr;
}
}




