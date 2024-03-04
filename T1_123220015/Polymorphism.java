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
public class Polymorphism {
    public static void main(String[] args) {
        Bunga bunga = new Bunga("Mawar");
        Pohon pohon = new Pohon("Pohon Jati");
        Lumut lumut = new Lumut("Lumut Hutan");

        bunga.fotosintesis();
        bunga.reproduksi();
        bunga.tumbuh();
        bunga.siramAir();
        bunga.pemupukan();
        bunga.potongDaun();

        pohon.fotosintesis();
        pohon.reproduksi();
        pohon.tumbuh();
        pohon.siramAir();
        pohon.pemupukan();
        pohon.potongDaun();

        lumut.fotosintesis();
        lumut.reproduksi();
        lumut.tumbuh();
    }
}
