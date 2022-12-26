/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uas_Smt_3;

/**
 *
 * @author Acer Swift3
 */
public final class KomputerCetak {
    final void cetak (Komputer[] obj){
        for (Komputer k : obj){
            k.hidupkan_os();
            k.matikan_os();
            k.klik_kanan();
            k.klik_kiri();
            k.cetak_data();
            System.out.println("");
        }
        
    }   
    public static void main(String[] args){
        Komputer[] obj1 = {new PC()};
        Komputer[] obj2 = {new Laptop()};
        Komputer[] obj3 = {new Notebook()};
        KomputerCetak hasil = new KomputerCetak();
        System.out.println("=====PC=====");
        hasil.cetak(obj1);
        System.out.println("=====Laptop=====");
        hasil.cetak(obj2);
        System.out.println("=====Notebook=====");
        hasil.cetak(obj3);
    }
}
