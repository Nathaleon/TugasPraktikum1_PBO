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
public abstract class Tumbuhan {
    protected String nama;
    protected String jenis;
        
    public Tumbuhan(String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
}

abstract void fotosintesis();
        
abstract void reproduksi();
        
void tumbuh(){
     System.out.println(nama + " tumbuh dengan cara merambat atau mengeluarkan tunas baru.");
     System.out.println(nama + " termasuk tumbuhan jenis " + jenis);
    }
}
