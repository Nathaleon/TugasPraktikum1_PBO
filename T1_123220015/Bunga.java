/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1_123220015;

/**
 *
 * @author Nathaleon
 */
public class Bunga extends Tumbuhan implements Perawatan {
    Bunga(String nama){
        super(nama, "Bunga");
    }
    
    void fotosintesis(){
        System.out.println(nama + " melakukan fotosintesis menggunakan cahaya matahari.");
    }
    
    void reproduksi() {
        System.out.println(nama + " berkembang biak melalui biji atau anakan.");
    }
    
    public void siramAir() {
        System.out.println(nama + " perlu disiram air secara teratur");
    }
    
    public void pemupukan() {
        System.out.println(nama + " perlu dipupuk untuk mendapatkan nutrisi yang cukup.");
    }

    public void potongDaun() {
        System.out.println(nama + " perlu daunnya dipotong agar tetap segar.");
    }
}
