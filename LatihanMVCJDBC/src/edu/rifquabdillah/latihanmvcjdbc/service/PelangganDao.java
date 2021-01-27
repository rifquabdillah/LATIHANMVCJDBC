/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rifquabdillah.latihanmvcjdbc.service;

import edu.rifquabdillah.latihanmvcjdbc.entity.Pelanggan;
import edu.rifquabdillah.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author M Rifqu Abdillh
 */
public interface PelangganDao {
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    public void deletePelanggan(Integer Id) throws PelangganException;
    public Pelanggan getPelanggan(Integer Id) throws PelangganException;
    public Pelanggan getPelanggan(String email) throws PelangganException;
    public List <Pelanggan> selectAllPelanggan()throws PelangganException;
        
    
}
