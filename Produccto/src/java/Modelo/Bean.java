/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Obustillosh
 */
public class Bean {
    private String idProd;
    private String nombreProd;
    private String precioProd;
    
    public Bean(String idProd, String nombreProd, String precioProd){
        this.idProd = idProd;
        this.nombreProd = nombreProd;
        this.precioProd = precioProd;
    }
    
    public Bean(){
        
    }
    public String getIdProd(){
        return idProd;
    }
    public void setIdProd(String idProd){
        this.idProd = idProd;
    }
    
    public String getNombreProd(){
        return nombreProd;
    }
    public void setNombreProd(String nombreProd){
        this.nombreProd = nombreProd;
    }
    
    public String getPrecioProd(){
        return precioProd;
    }
    
    public void setPrecioProd(String precioProd){
        this.precioProd = precioProd;
    }
    
}
