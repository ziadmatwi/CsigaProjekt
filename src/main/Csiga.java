/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author PonauerSzilviaMária(
 */
public class Csiga {
    private int szin;
    private String haladas;

    public Csiga(int szin) {
        this.szin = szin;
        this.haladas = "";
    }
    
    public void halad(int tavolsag, boolean gyorsitott){
        String vonal = "";  
         
        if (gyorsitott) {
            vonal = "=";  
        } else {
            vonal = "_";  
        }
        
        for (int i = 0; i < tavolsag; i++) {
            this.haladas +=  vonal;  
        }
    }

    public int getSzin() {
        return szin;
    }

    public String getHaladas() {
        return haladas;
    }
    
}
