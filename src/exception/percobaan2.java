/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;
import java.util.Scanner;

/**
 *
 * @author siti novi triana
 */
public class percobaan2 {
    public double luas_lingkaran(double diameter) { 
double jari2 = diameter / 2; 
double luas = Math.PI * Math.pow(jari2, 2); 
return luas; 
}   
    
  public double volumetabung(double jari_jari1, double jari_jari2, int tinggi){
        double volume =  (3.14 * jari_jari1 * jari_jari2 * tinggi);
        return volume;
    }
public static void main(String[] args) { 
Scanner input = new Scanner(System.in);
percobaan2 mt = new percobaan2(); 
System.out.println("Masukkan Diameter : "); 
double diameter = input.nextDouble();
System.out.println("Masukkan Jari Jari 1: ");
double jari_jari1 = input.nextDouble();
    System.out.println("Masukkan Jari jari 2 :");
    double jari_jari2 = input.nextDouble();
    System.out.println("Masukkan Tinggi :");
    int tinggi = input.nextInt();
    
    System.out.println("Luas Lingkaran :" + mt.luas_lingkaran(20));
    System.out.println("Volume Tabung :" + mt.volumetabung(14, 14, 21));
}
} 


    

