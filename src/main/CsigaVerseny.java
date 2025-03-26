/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MatwiZiad(Szf_N_2024
 */
public class CsigaVerseny {
    private String[] szinLista;
    private Csiga[] csigak;
    private String csigaAbra;
    private final String RESET;
    private final Random RND;
    private int fogadas;
    private final Scanner SCN;
    
    public CsigaVerseny(){
        this.csigak = new Csiga[]{new Csiga(0),new Csiga(1), new Csiga(2)};
        this.szinLista = new String[]{"\u001B[31m","\u001B[32m","\u001B[34m"};
        this.RESET = "\u001B[0m";
        this.RND = new Random();
        this.csigaAbra = "@_//";
        this.SCN = new Scanner(System.in);
        
    }
    
    public void versenyIndit(int kor){
        this.fogadas();
        for (int i = 0; i < kor; i++) {
            System.out.println(this.versenyKor(i));
            try {
            Thread.sleep(1000);  // Waits for 3000 milliseconds (3 seconds
            } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.print("\u001B[H\u001B[2J");
            System.out.flush();
        }
        System.out.println(this.versenyEredmeny());
    }
    
    public String versenyKor(int kor){
        String szoveg = kor+1 + ".kör\n";
        int listahossz = this.csigak.length;
        int haladas;
        for (int i = 0; i < listahossz; i++) {
            haladas = RND.nextInt(0,4);
            if (RND.nextInt(1,15)==1){
                csigaGyorsit(haladas,i);
            }
            else{
                csigak[i].halad(haladas,false);
            }
            szoveg += szinLista[i] + csigak[i].getHaladas()+ "|" + csigaAbra + RESET +"\n";
        }
        return szoveg;
    }
    
    public String versenyEredmeny(){
        String szoveg = "";
        int index = nyertes();
        szoveg += "EREDMÉNY: \n" + "A NYERTES: " + szinLista[index] + csigaAbra + RESET + "\n";
        if(this.fogadas == index){
            szoveg += "NYERTÉL!!!";
        }
        else{
            szoveg += "VESZTETTÉL :(";
        }
        return szoveg;
    }
    
    public void csigaGyorsit(int haladas, int index){
        if(haladas == 0){
          csigak[index].halad(1, true);
        }else{
        csigak[index].halad(haladas*2, true);}
    }
    
    public int nyertes(){
        int maxIndex = 0;
        for (int i = 1; i < csigak.length; i++) {
            if (csigak[i].getHaladas().length()>csigak[maxIndex].getHaladas().length()){
                maxIndex = i;
            }
        }
        return maxIndex;
            
 
    }
    
    public void fogadas(){
        do{
        System.out.println("Kérlek fogadj egy csigára\n PIROS[1] ZÖLD[2] KÉK[3]\n");
        this.fogadas = SCN.nextInt();}while(!(this.fogadas > 0 && this.fogadas < 4));
        
    }
    
    
    
    
        
        
        
        
    }
    
    
    

