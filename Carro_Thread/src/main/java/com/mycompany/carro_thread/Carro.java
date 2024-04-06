/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carro_thread;

/**
 *
 * @author Jorge
 */
public class Carro extends Thread {
    private String name;
    private int speed;

    public Carro (String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(name + " está se movendo.");
                Thread.sleep(speed); // Simulando o movimento do carro
            }
            System.out.println(name + " chegou ao destino.");
        } catch (InterruptedException e) {
            System.out.println(name + " foi interrompido.");
        }
    }
}

