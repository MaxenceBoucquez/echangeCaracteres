/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package echangeCaracteresTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import echangecaracteres.*;

/**
 *
 * @author maxen
 */
public class EchangeCaracteresTest {
    
    @Test
    public void testEchangeChaineAvec2Car()
    {
        String test1 = "AB";
        String test2 = "RAIN";
        String test3 = "TENRAIN";
        String test4 = "A";
        String test5 = "";
        EchangeCaracteres echange1 = new EchangeCaracteres(test1);
        EchangeCaracteres echange2 = new EchangeCaracteres(test2);
        EchangeCaracteres echange3 = new EchangeCaracteres(test3);
        EchangeCaracteres echange4 = new EchangeCaracteres(test4);
        EchangeCaracteres echange5 = new EchangeCaracteres(test5);
        assertEquals(echange1.echange2DerniersCar(),"BA");
        assertEquals(echange2.echange2DerniersCar(),"RANI");
        assertEquals(echange3.echange2DerniersCar(),"TENRANI");
        assertEquals(echange4.echange2DerniersCar(),"A");
        assertEquals(echange5.echange2DerniersCar(),"");

    }


}
