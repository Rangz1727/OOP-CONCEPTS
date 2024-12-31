/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author Morganz
 */
public class BankBeraksi {
    public static void main(String[] args) {
        
         Bank baru = new Bank (5000000);
        baru.getSaldo();
        baru.simpanUang(900000);
        baru.ambil(700000);
    }
}
