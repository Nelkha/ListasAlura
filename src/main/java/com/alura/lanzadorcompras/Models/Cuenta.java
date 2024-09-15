/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.lanzadorcompras.Models;

/**
 *
 * @author Nelkha
 */
public class Cuenta {

    private double saldo;

    public Cuenta(double saldo) {
        if(saldo<0){
            System.out.println("Saldo no puede ser negativo");
        }
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retiro(double valor) {
       
            this.saldo -= valor;
            
        

    }

}


