/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.vehiculo.model;

/**
 *
 * @author Usuario
 */
public class Carros extends Vehiculo {

    /**
     * @return the marca
     */
    @Override
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    @Override
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the placa
     */
    @Override
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the velocidadMaxima
     */
    @Override
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * @param velocidadMaxima the velocidadMaxima to set
     */
    @Override
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * @return the traccion
     */
    public String getTraccion() {
        return traccion;
    }

    /**
     * @param traccion the traccion to set
     */
    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
    private String marca;
    private String modelo;
    private String placa;
    private int velocidadMaxima;
    private String traccion;

    public Carros(String marca, String modelo, String placa, int velocidadMaxima, String traccion) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidadMaxima = velocidadMaxima;
        this.traccion = traccion;
    }

    // Métodos de la clase Carros
    @Override
    public void acelerar() {
        System.out.println("El carro está acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("El carro está frenando");
    }

    @Override
    public void estacionar() {
        System.out.println("El carro está estacionado");
    }

    @Override
    public void direccionar() {
        System.out.println("El carro está cambiando de dirección");
    }
}

