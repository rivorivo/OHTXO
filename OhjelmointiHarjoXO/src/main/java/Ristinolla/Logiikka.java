
package Ristinolla;

import java.util.Arrays;

/**
 *
 * @author rivorivo Luo pelilaudan ja pitää kirjaa siirroista, sekä tarkistaa
 * päättyykö peli. Tarkistaa kumpi pelaaja voitti vai tuliko tasapeli ja pitää
 * kirjaa näistä.
 *
 */
public class Logiikka {

    private final String[] pelilauta;

    /**
     * Luo uuden pelilaudan, joka tallentaa siirrot.
     *
     * @param pelilauta
     */
    public Logiikka(String[] pelilauta) {
        this.pelilauta = new String[9];
    }

    /**
     * Vuorolaskuri, joka pitää kirjaa monesko vuoro on meneillään, voitto- ja
     * tasapelilaskurit, voittajan/tasapelistä kertova muuttuja.
     */
    private int vuoro;
    private int voitotRisti;
    private int voitotNolla;
    private int tasapelit;
    private String voittaja;

    /**
     * Aloittaa uuden pelin tyhjentämällä pelilaudan ja vuorolaskurin sekä
     * voittajan.
     */
    public void uusiPeli() {
        for (int i = 0; i < pelilauta.length; i++) {
            this.pelilauta[i] = null;
        }
        this.vuoro = 0;
        this.voittaja = null;
    }

    /**
     * Lisää vuorolaskurin lukua yhdellä ja tarkistaa onko parametrin mukainen
     * ruutu vapaana. Siirtää vuoron mukaisen merkin vapaaseen ruutuun.
     *
     * @param ruutu
     */
    public void teeSiirto(int ruutu) {

        this.vuoro++;
        if (pelilauta[ruutu] != null) {
            throw new IllegalArgumentException("Ruutu ei ole vapaa.");
        }
        switch (getVuoro()) {
            case "X":
                this.pelilauta[ruutu] = "X";
                break;
            case "0":
                this.pelilauta[ruutu] = "0";
                break;
        }

    }

    /**
     * Asettaa voittaja-muuttujan arvon "X","0" tai "tasan", mikäli peli on
     * loppunut.
     */
    public void voittikoJoku() {

        if (this.vuoro >= 5) {

            for (int i = 0; i < 3; i++) {
                
                if (this.pelilauta[i] != null){
                String mesta = this.pelilauta[i];

                if (mesta.equals(this.pelilauta[i + 3]) && mesta.equals(this.pelilauta[i + 6])) {
                    this.voittaja = mesta;
                }
                }
            }

            for (int i = 0; i < 9; i = i + 3) {
                    if (this.pelilauta[i] != null){
                String mesta = this.pelilauta[i];

                if (mesta.equals(this.pelilauta[i + 1]) && mesta.equals(this.pelilauta[i + 2])) {
                    this.voittaja = mesta;
                }
                    }
            }

            if (this.pelilauta[0] != null) {
                 
                String mesta = this.pelilauta[0];

                if (mesta.equals(this.pelilauta[4]) && mesta.equals(this.pelilauta[8])) {
                    this.voittaja = mesta;
                }
                    
            }

            if (this.pelilauta[2] != null) {
                String mesta = this.pelilauta[2];

                if (mesta.equals(this.pelilauta[4]) && mesta.equals(this.pelilauta[6])) {
                    this.voittaja = mesta;
                }
            }
        }

        if (this.vuoro == this.pelilauta.length && this.voittaja == null) {
            this.voittaja = "tasan";
        }

    }

    /**
     * Lisää voittojen tai tasapelien määrää tilanteen mukaan.
     *
     * @param voittanut
     */
    private void kasvataVoittoja(String voittanut) {
        switch (voittanut) {
            case "X":
                this.voitotRisti++;
                break;
            case "0":
                this.voitotNolla++;
                break;
            case "tasan":
                this.tasapelit++;
                break;
        }
    }

    /**
     * Tarkistaa onko peli loppu ja jos on kutsuu kasvataVoittoja-metodia
     * voittajalle tai tasapelille.
     */
    public void loppumisenTarkistus() {
        voittikoJoku();
        if (this.voittaja != null) {
            kasvataVoittoja(this.voittaja);
        }
    }

    /**
     * Kertoo onko peli loppu.
     *
     * @return totuusarvo
     */
    public boolean onkoLoppu() {
        return this.voittaja != null;
    }

    /**
     * Tarkistaa onko X:n vai 0:n vuoro.
     *
     * @return vuorossa oleva merkki
     */
    public String getVuoro() {

            if (this.vuoro % 2 != 0) {
            return "0";
        }else{
        return "X";
        }
    }

    /**
     * Parametrin ruudussa olevan merkin palautus.
     *
     * @param ruutu
     */
    public String getMerkkiRuudussa(int ruutu) {
        return this.pelilauta[ruutu];
    }

    /**
     * @return voitot/tasapelit
     */
       
    public int getVoitotNolla() {
        return this.voitotNolla;
    }

    public int getVoitotRisti() {
        return this.voitotRisti;
    }

    public int getTasapelit() {
        return this.tasapelit;
    }
    /**
     * Palauttaa voittajan tai tasapelin.
     * @return voittaja
     */
    public String getVoittaja(){
        return this.voittaja;
    }
       

}
