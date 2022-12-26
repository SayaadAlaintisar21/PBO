/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uas_Smt_3;

/**
 *
 * @author Acer Swift3
 */
public class PC extends Komputer implements Mouse, Keyboard, Printer{

    @Override
    void hidupkan_os() {
        System.out.println("hidupkan Operating System"); 
   }

    @Override
    void matikan_os() {
        System.out.println("matikan Operating System");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Mouse klik kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Mouse klik kiri");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Keyboard Enter");
    }

    @Override
    public void cetak_data() {
        System.out.println("Print Data");
    }
    
}
