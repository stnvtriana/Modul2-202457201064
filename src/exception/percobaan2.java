/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author siti novi triana
 */
public class percobaan2 {
    public double luas_lingkaran(int diameter) { 
int jari2 = diameter / 2; 
double luas = Math.PI * Math.pow(jari2, 2); 
return luas; 
}   
    
  public double volumetabung(int jari_jari1, int jari_jari2, int tinggi){
        int volume = (int) (3.14 * jari_jari1 * jari_jari2 * tinggi);
        return volume;
    }
public static void main(String[] args) { 
percobaan2 mt = new percobaan2(); 
System.out.println("Luas Lingkaran : " +mt.luas_lingkaran(20)); 
System.out.println("Volume Tabung :" +mt.volumetabung(14, 14, 24));
System.exit(0);

}
} 


    

