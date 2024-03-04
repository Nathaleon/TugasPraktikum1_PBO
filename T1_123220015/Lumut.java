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
public class Lumut extends Tumbuhan {
    Lumut(String nama) {
        super(nama, "Lumut");
    }

    void fotosintesis() {
        System.out.println(nama + " melakukan fotosintesis menggunakan cahaya matahari.");
    }

    void reproduksi() {
        System.out.println(nama + " berkembang biak melalui spora.");
    }
}
