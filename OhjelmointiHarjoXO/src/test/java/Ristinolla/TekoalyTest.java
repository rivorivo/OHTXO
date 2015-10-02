/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ristinolla;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rivorivo
 */
public class TekoalyTest {
    public String[] pelilauta;
    public Logiikka peli;
    public Tekoaly tekis;
    Integer[] ruudut;
    
    public TekoalyTest() {
        pelilauta = new String[8];
        peli = new Logiikka(pelilauta);
        tekis = new Tekoaly(peli);
        ruudut= new Integer[8];        
        for (int i = 0; i < ruudut.length; i++) {
           ruudut[i]=i+1;            
        }
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void palauttaaRandom(){
        
               
    }
    @Test
    public void tunnistaaTyhjan(){
     assertEquals("",tekis.palauta(0));
    }
    
    @Test  
    public void satunnainenToimii(){
        
        int arvo=tekis.satunnainen();
        boolean onko=false;
        for (int i = 0; i < ruudut.length; i++) {
            if(i==arvo){
                onko=true;
            }
        }
        assertTrue(onko);            
    }
    
    @Test
    public void lukeeMerkit(){
        peli.teeSiirto(2);
        assertEquals(tekis.palauta(2),"X");
    }
    
    @Test 
    public void satunnainenEiLaitaVarattuu(){
        peli.teeSiirto(0);
        assertNotSame(0,tekis.satunnainen());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    /**
     * Test of siirto method, of class Tekoaly.
     */
    @Test
    public void blokkaaJoitakin() {
        peli.teeSiirto(0);
        peli.teeSiirto(4);
        peli.teeSiirto(1);
        assertEquals(tekis.siirto(),2);
    }
    
    @Test
    public void hyokkaa(){
        peli.teeSiirto(0);
        peli.teeSiirto(1);
        peli.teeSiirto(2);
        peli.teeSiirto(4);
        peli.teeSiirto(3);
        assertEquals(tekis.siirto(),7);
    }
    
   
//        System.out.println("siirto");
//        Tekoaly instance = null;
//        int expResult = 0;
//        int result = instance.siirto();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of blokkaus method, of class Tekoaly.
//     */
//    @Test
//    public void testBlokkaus() {
//        System.out.println("blokkaus");
//        Tekoaly instance = null;
//        int expResult = 0;
//        int result = instance.blokkaus();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}