/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ac;

/**
 *
 * @author Morganz
 */
public class Ac implements InterfaceAc {

    int statusAcmahal;

    @Override
    public void matikan() {
        if (statusAcmahal == KEADAAN_HIDUP_AC) {
            statusAcmahal = KEADAAN_MATI_AC;
            System.out.println("matikan AC mahal --> Ac mahal kamu telah di matikan ");
        } else {
            System.out.println("matikan AC mahal --> Ac mahal kamu sudah mati_- ");
        }
    }

    @Override
    public void hidupkan() {
        if (statusAcmahal == KEADAAN_MATI_AC) {
            statusAcmahal = KEADAAN_HIDUP_AC;
            System.out.println("Hidupkan AC mahal --> Ac mahal kamu telah di hidupkan ");
        } else {
            System.out.println("Hidupkan AC mahal --> Ac mahal kamu sudah hidup_- ");
        }
    }

    @Override
    public void dinginkan() {
        if (statusAcmahal == KEADAAN_PANAS_AC) {
            statusAcmahal = KEADAAN_DINGIN_AC;
            System.out.println("Dinginkan AC mahal --> Ac mahal kamu sudah dingin ");
        } else {
            System.out.println("Dinginkan AC --> Ac mahal mu sudah di dinginkan_-");
        }
    }

    @Override
    public void panaskan() {
        if (statusAcmahal== KEADAAN_DINGIN_AC) {
            statusAcmahal = KEADAAN_PANAS_AC;
            System.out.println("Panaskan AC mahal --> Ac mahal kamu telah di di panaskan ");
        } else {
            System.out.println("Panaskan AC mahal --> Ac mahal kamu sudah panas_-");
        }
    }
}
