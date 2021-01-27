/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rifquabdillah.latihanmvcjdbc.event;

import edu.rifquabdillah.latihanmvcjdbc.entity.Pelanggan;
import edu.rifquabdillah.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author M Rifqu Abdillah
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);
    
    
}
