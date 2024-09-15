/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.alura.lanzadorcompras;

import com.alura.lanzadorcompras.Models.Compra;
import com.alura.lanzadorcompras.Models.Cuenta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nelkha
 */
public class LanzadorCompras {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;
        System.out.println("Ingrese el limite de su tarjeta");
        double limiteTarjeta = scanner.nextDouble();
        scanner.nextLine();
        Cuenta cuenta = new Cuenta(limiteTarjeta);
        List<Compra> compras = new ArrayList<>();
        while (opcion != 9) {
            String s = """
                     --------------------------------------
                     *Presione 1 para comprar
                     *Presione 2 para consultar su saldo
                     *Presione 3 para consultar sus compras
                     *Presione 9 para terminar
                     --------------------------------------
                     """;
            System.out.println(s);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Compra compraRealizada = realizarCompra(cuenta);
                    if (compraRealizada != null) {
                        System.out.println(compraRealizada.toString());
                        cuenta.getSaldo();
                        compras.add(compraRealizada);
                        Collections.sort(compras);
                    }
                    break;
                case 2:
                    System.out.println(cuenta.getSaldo());
                    break;
                case 3:
                    for (Compra compra : compras) {
                        System.out.println(compra.toString());
                    }
                    break;
                case 9:
                    System.out.println("Gracias por comprar , vuelta pronto");
                    break;
                default:
                    System.out.println("No es una opcion valida");

            }

        }
    }

    public static Compra realizarCompra(Cuenta cuenta) {
        scanner.nextLine();
        System.out.println("Ingrese la descripcion de la compra");
        String descripcion = scanner.nextLine();
        System.out.println("Ingrese la valor de la compra");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        if (valor > cuenta.getSaldo()) {
            System.out.println("Saldo insuficiente");
            return null;
        } else {
            Compra compra = new Compra(descripcion, valor);
            cuenta.retiro(compra.getPrecio());
            return compra;
        }

    }
}
