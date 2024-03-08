/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package api.vehiculo;

import api.vehiculo.model.Carros;
import api.vehiculo.model.Motos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Ingresar los datos de una moto
        System.out.println("Ingrese los datos de la moto:");
        System.out.print("Marca: ");
        String marcaMoto = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloMoto = scanner.nextLine();
        System.out.print("Placa: ");
        String placaMoto = scanner.nextLine();
        System.out.print("Velocidad máxima: ");
        int velocidadMaximaMoto = scanner.nextInt();
        System.out.print("Cilindraje: ");
        int cilindraje = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        Motos moto = new Motos(marcaMoto, modeloMoto, placaMoto, velocidadMaximaMoto, cilindraje);

        // Prueba de ruta de la moto
        moto.acelerar();
        moto.frenar();
        moto.estacionar();
        moto.direccionar();

        // Ingresar los datos de un carro
        System.out.println("Ingrese los datos del carro:");
        System.out.print("Marca: ");
        String marcaCarro = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Placa: ");
        String placaCarro = scanner.nextLine();
        System.out.print("Velocidad máxima: ");
        int velocidadMaximaCarro = scanner.nextInt();
        System.out.print("Tracción (mecánica/automática): ");
        String traccion = scanner.next();
        scanner.nextLine(); // consume the newline

        Carros carro = new Carros(marcaCarro, modeloCarro, placaCarro, velocidadMaximaCarro, traccion);

        // Realizar la prueba de ruta del carro
        carro.acelerar();
        carro.frenar();
        carro.estacionar();
        carro.direccionar();

        scanner.close();
    }
}
    
   
