/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodx;

import java.util.Scanner;

/**
 *
 * @author sitin
 */
public class Methodx {
 public double luaslingkaran(int diameter){
        int jari2 = diameter / 2;
        double luas= Math.PI * Math.pow(jari2, 2);
        return luas;
    }
 public double VolumeBola(double diameter, double jariJari){
     double volume = (4.0 / 3) * Math.PI * Math.pow(jariJari, 3);
        return volume;
    }
     
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Methodx mt  = new Methodx();
        System.out.println(mt.luaslingkaran(20));
        
        System.out.print("Masukkan Diameter Bola : ");
        double diameter = input.nextDouble();
        System.out.print("Masukkan Jari jari Bola : ");
        double jariJari = input.nextDouble();
        double volume = (mt.VolumeBola(3, 3));
        System.out.println("Volume bola adalah: " + volume);

        mt.luaslingkaran(20);
        mt.VolumeBola(diameter, jariJari);
    }
}