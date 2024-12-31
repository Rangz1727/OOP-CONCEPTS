/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ac;

/**
 *
 * @author Morganz
 */
public class AcBeraksi {
     public static void main(String[] args) {
        Ac acmahal  = new Ac();
        
        System.out.println("Status Ac : AC mahal mu mati bang");
        acmahal.hidupkan();
        acmahal.matikan();
        acmahal.matikan();
        acmahal.hidupkan();
        acmahal.hidupkan();
        
        System.out.println("Status suhu sekarang : Atur dulu lah");
        acmahal.dinginkan();
        acmahal.panaskan();
        acmahal.panaskan();
        acmahal.dinginkan();
        acmahal.dinginkan();
     }
}
