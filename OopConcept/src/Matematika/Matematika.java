/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author Morganz
 */
public class Matematika {
     int hasil;

    void pertambahan(int a, int b) {
        hasil = a + b;
        System.out.println("Hasil Tambah : " + a + " + " + b + " : " + hasil);
    }

    void pengurangan(int a, int b) {
        hasil = a - b;
        System.out.println("Hasil Perkurangan :" + a + " - " + b + " : " + hasil);
    }

    void perkalian(int a, int b) {
        hasil = a * b;
        System.out.println("Hasil Perkalian : " + a + " * " + b + " : " + hasil);
    }

    void pembagian(int a, int b) {
        hasil = a / b;
        System.out.println("Hasil Pembagian : " + a + " / " + b + " : " + hasil);
    }
}
