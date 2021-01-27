/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rifquabdillah.latihanmvcjdbc.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.rifquabdillah.latihanmvcjdbc.impl.PelangganDaoImpl;
import edu.rifquabdillah.latihanmvcjdbc.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author M Rifqu Abdillah
 */
public class BarbershopDataBase { 
    
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException{
        if(connection==null){
            
            
            MysqlDataSource dataSource = new MySqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/barbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();  
        }
       return connection; 
    }
    
    public static PelangganDao getPelangganDao() throws SQLException{
        if(pelangganDao==null){
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
    }
}
