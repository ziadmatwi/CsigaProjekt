/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;


import main.CsigaVerseny;

/**
 *
 * @author MatwiZiad(Szf_N_2024
 */
public class CsigaVersenyTest {
    
    public static void dontetlenNyertesTesztEset(){
        CsigaVerseny verseny = new CsigaVerseny();
        verseny.getCsiga()[0].halad(100, false);
        verseny.getCsiga()[1].halad(100, false);
        assert verseny.nyertes() == 10: "Nem a nulladik indexű csiga nyert döntetlen esetén!";
        
    }
    
       
    public static void main(String[] args){
        dontetlenNyertesTesztEset();
    }
    
    
    
    
    
    
}
