/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rifquabdillah.latihanmvcjdbc.main;
import edu.rifquabdillah.latihanmvcjdbc.database.BarbershopDataBase;
import edu.rifquabdillah.latihanmvcjdbc.entity.Pelanggan;
import edu.rifquabdillah.latihanmvcjdbc.error.PelangganException;
import edu.rifquabdillah.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author M Rifqu Abdillah
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws edu.rifquabdillah.latihanmvcjdbc.error.PelangganException
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
       PelangganDao dao = BarbershopDataBase.getPelangganDao();
       List <Pelanggan> list = dao.selectAllPelanggan();
        for (Pelanggan pelanggan : list ) {
         System.out.println("Telepon "+pelanggan.getTelepon());             
        }
       
       
      
    }
    
}
