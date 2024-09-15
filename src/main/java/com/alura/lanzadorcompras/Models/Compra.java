/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.lanzadorcompras.Models;

/**
 *
 * @author Nelkha
 */
public class Compra implements Comparable<Compra> {
    
    private String descripcion;
    private double precio;

    public Compra(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Compro:"+"\n"+descripcion+ " a "+precio;
    }

   

    @Override
    public int compareTo(Compra c) {
        return Double.compare(this.getPrecio(),c.getPrecio());
    }
    
    
}
