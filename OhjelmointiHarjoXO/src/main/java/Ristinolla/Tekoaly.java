/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ristinolla;

import java.util.Random;

/**
 *
 * @author rivorivo
 */
public class Tekoaly {

    private final Random random = new Random();
    private final Logiikka peli;

    /**
     *luo tekoälyn pelille
     * @param game
     */
    public Tekoaly(Logiikka game) {
        this.peli = game;
    }
/**
 * palauttaa ruudussa olevan merkin. Jos ruutu on tyhjä, niin tyhjän 
 * merkkijonon, jotta vertailu helpottuu.
 * @param i
 */
    public String palauta(int i) {
        if (peli.getMerkkiRuudussa(i) == null) {
            return "";
        }

        return peli.getMerkkiRuudussa(i);
    }
/**
 * Luo random kokonaisluvun 0-8 ja jos sitä vastaava ruutu on tyhjä 
 * palauttaa sen.Jos taas lukua vastaava ruutu ei ole tyhjä, kutsuu itseään 
 * rekursiivisesti.
 * @return int luku
 */
    public int satunnainen() {
        int luku = random.nextInt(8);
        if (palauta(luku).equals("")) {
            return luku;
        } else {
            return satunnainen();
        }
    }
/**
 * Jos havaitsee kaksi peräkkäistä 0-merkkiä palauttaa voiton tuovan sijainnin,
 * jos ei niin kutsuu blokkaus-metodia
 * @return int 0-8
 */
    public int siirto() {

        if (palauta(0).equals("0") && palauta(1).equals("0") && palauta(2).equals("")) {
            return 2;
        } else if (palauta(0).equals("0") && palauta(3).equals("0") && palauta(6).equals("")) {
            return 6;
        } else if (palauta(0).equals("0") && palauta(4).equals("0") && palauta(8).equals("")) {
            return 8;
        } else if (palauta(1).equals("0") && palauta(4).equals("0") && palauta(7).equals("")) {
            return 7;
        } else if (palauta(2).equals("0") && palauta(4).equals("0") && palauta(6).equals("")) {
            return 6;
        } else if (palauta(2).equals("0") && palauta(5).equals("0") && palauta(8).equals("")) {
            return 8;
        } else if (palauta(0).equals("0") && palauta(2).equals("0") && palauta(1).equals("")) {
            return 1;
        } else if (palauta(6).equals("0") && palauta(7).equals("0") && palauta(8).equals("")) {
            return 8;
        } else if (palauta(8).equals("0") && palauta(7).equals("0") && palauta(6).equals("")) {
            return 6;
        } else if (palauta(8).equals("0") && palauta(6).equals("0") && palauta(7).equals("")) {
            return 7;
        }else if (palauta(0).equals("0") && palauta(6).equals("0") && palauta(3).equals("")) {
            return 3;
        } else if (palauta(0).equals("0") && palauta(8).equals("0") && palauta(4).equals("")) {
            return 4;
        } else if (palauta(1).equals("0") && palauta(7).equals("0") && palauta(4).equals("")) {
            return 4;
        } else if (palauta(2).equals("0") && palauta(6).equals("0") && palauta(4).equals("")) {
            return 4;
        } else if (palauta(2).equals("0") && palauta(8).equals("0") && palauta(5).equals("")) {
            return 5;
        } else if (palauta(3).equals("0") && palauta(5).equals("0") && palauta(4).equals("")) {
            return 4;
        } else if (palauta(3).equals("0") && palauta(4).equals("0") && palauta(5).equals("")) {
            return 5;
        } else if (palauta(1).equals("0") && palauta(2).equals("0") && palauta(0).equals("")) {
            return 0;
        } else if (palauta(3).equals("0") && palauta(6).equals("0") && palauta(0).equals("")) {
            return 0;
        } else if (palauta(4).equals("0") && palauta(8).equals("0") && palauta(0).equals("")) {
            return 0;
        } else if (palauta(4).equals("0") && palauta(7).equals("0") && palauta(1).equals("")) {
            return 1;
        } else if (palauta(8).equals("0") && palauta(5).equals("0") && palauta(2).equals("")) {
            return 2;
        } else if (palauta(5).equals("0") && palauta(4).equals("0") && palauta(3).equals("")) {
            return 3;
        }else if (palauta(4).equals("0") && palauta(6).equals("0") && palauta(2).equals("")) {
            return 2;
        } else {
            return blokkaus();
        }
    }
/**
 * Jos havaitsee kaksi vastustajan merkkiä, palauttaa ruudun, jolla paikka 
 * blokataan. Muuten jos keskimmäinen vapaa, palauttaa sen (4) ja muussa 
 * tapauksessa kutsuu satunnainen-metodia.
 * @return 
 */
    public int blokkaus() {
        if (palauta(0).equals("X") && palauta(1).equals("X") && palauta(2).equals("")) {
            return 2;
        } else if (palauta(0).equals("X") && palauta(3).equals("X") && palauta(6).equals("")) {
            return 6;
        } else if (palauta(0).equals("X") && palauta(4).equals("X") && palauta(8).equals("")) {
            return 8;
        } else if (palauta(1).equals("X") && palauta(4).equals("X") && palauta(7).equals("")) {
            return 7;
        } else if (palauta(2).equals("X") && palauta(4).equals("X") && palauta(6).equals("")) {
            return 6;
        } else if (palauta(2).equals("X") && palauta(5).equals("X") && palauta(8).equals("")) {
            return 8;
        } else if (palauta(0).equals("X") && palauta(2).equals("X") && palauta(1).equals("")) {
            return 1;
        } else if (palauta(6).equals("X") && palauta(7).equals("X") && palauta(8).equals("")) {
            return 8;
        } else if (palauta(8).equals("X") && palauta(7).equals("X") && palauta(6).equals("")) {
            return 6;
        } else if (palauta(8).equals("X") && palauta(6).equals("X") && palauta(7).equals("")) {
            return 7;
        } else if (palauta(0).equals("X") && palauta(6).equals("X") && palauta(3).equals("")) {
            return 3;
        } else if (palauta(0).equals("X") && palauta(8).equals("X") && palauta(4).equals("")) {
            return 4;
        } else if (palauta(1).equals("X") && palauta(7).equals("X") && palauta(4).equals("")) {
            return 4;
        } else if (palauta(2).equals("X") && palauta(6).equals("X") && palauta(4).equals("")) {
            return 4;
        } else if (palauta(2).equals("X") && palauta(8).equals("X") && palauta(5).equals("")) {
            return 5;
        } else if (palauta(3).equals("X") && palauta(5).equals("X") && palauta(4).equals("")) {
            return 4;
        } else if (palauta(3).equals("X") && palauta(4).equals("X") && palauta(5).equals("")) {
            return 5;
        } else if (palauta(1).equals("X") && palauta(2).equals("X") && palauta(0).equals("")) {
            return 0;
        } else if (palauta(3).equals("X") && palauta(6).equals("X") && palauta(0).equals("")) {
            return 0;
        } else if (palauta(4).equals("X") && palauta(8).equals("X") && palauta(0).equals("")) {
            return 0;
        } else if (palauta(4).equals("X") && palauta(7).equals("X") && palauta(1).equals("")) {
            return 1;
        } else if (palauta(8).equals("X") && palauta(5).equals("X") && palauta(2).equals("")) {
            return 2;
        } else if (palauta(4).equals("X") && palauta(5).equals("X") && palauta(3).equals("")) {
            return 3;
        } else if (palauta(4).equals("X") && palauta(6).equals("X") && palauta(2).equals("")) {
            return 2;
        } else if(palauta(4).equals("")){
            return 4;
        }else {
           // int rdm = satunnainen();
           // System.out.println(rdm);
           // return rdm;
            return satunnainen();
        }
    
    }
}
