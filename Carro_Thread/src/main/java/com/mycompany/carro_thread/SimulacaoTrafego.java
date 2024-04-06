/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carro_thread;

/**
 *
 * @author Jorge
 */
public class SimulacaoTrafego {
    public static void main(String[] args) {
        Carro car1 = new Carro("Carro 1", 200); // Carro com velocidade 200 ms
        Carro car2 = new Carro("Carro 2", 300); // Carro com velocidade 300 ms
        Carro car3 = new Carro("Carro 3", 250); // Carro com velocidade 250 ms

        car1.start();
        car2.start();
        car3.start();
    }
}

