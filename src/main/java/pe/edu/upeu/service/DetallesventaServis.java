/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.Detallesventa;
        
/**
 *
 * @author Alumnos
 */
public interface DetallesventaServis {
    public List<Detallesventa> listarEntidad();
    public Detallesventa buscarEntidadId(int id);
    public void guardarEntidad(Detallesventa entidad);
    public void eliminarEntidadId(int id);
    public void modificarEntidadId(Detallesventa entidad);  
    public List<Detallesventa> listarPorNombre(String dato);
    
    
}