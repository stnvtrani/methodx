/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodx;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Methodx mt  = new Methodx();
        System.out.println(mt.luaslingkaran(20));
        System.exit(0);
    }
    
}
