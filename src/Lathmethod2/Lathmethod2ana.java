/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lathmethod2;

import javax.swing.JOptionPane;

/**
 *
 * @author siti novi triana
 */
public class Lathmethod2ana {
    void kalkulator(String operasi, double bill, double bil2){
        double hasil;
       
        switch (operasi){
            case "penjumlahan":
                hasil = bill+bil2;
                break;
            case "pengurangan":
                hasil = bill-bil2;
                break;
            case "perkalian":
                hasil = bill*bil2;
                break;                
            case "pembagian":
                hasil = bill/bil2;
                break;
            default:
                hasil =0;
                
        }
        String txtMessage = "Hasil Operasi " + operasi + " " + bill + " dan " + bil2 + " adalah " + hasil;
        JOptionPane.showMessageDialog(null, txtMessage, "Hasil Operasi", JOptionPane.PLAIN_MESSAGE);
    }
    public static void main(String[] args) {
        Lathmethod2ana lm = new Lathmethod2ana();
        lm.kalkulator("penjumlahan", 30, 5);
        lm.kalkulator("pengurangan", 30, 5);
        lm.kalkulator("perkalian", 30, 5);
        lm.kalkulator("pembagian", 30, 5);
        lm.kalkulator("pembagian", 30, 0);
    }
    
}
