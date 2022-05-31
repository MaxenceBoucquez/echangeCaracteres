/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enlever2PremCar;
import enleverA2PremCar.EnleverA2PremCar;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author Maxence
 */
public class Enlever2PremCar {
    
    @Test
    public void testEnlever2PremCar()
    {
        String test1 ="ABCD";
        String test2 ="BBAA";
        String test3 ="AACD";
        String test4 ="AABAA";
        String test5 ="AB";
        String test6 ="B";
        String test7 ="A";
        String test8 ="";
        EnleverA2PremCar Enlever1 = new EnleverA2PremCar(test1);
        EnleverA2PremCar Enlever2 = new EnleverA2PremCar(test2);
        EnleverA2PremCar Enlever3 = new EnleverA2PremCar(test3);
        EnleverA2PremCar Enlever4 = new EnleverA2PremCar(test4);
        EnleverA2PremCar Enlever5 = new EnleverA2PremCar(test5);
        EnleverA2PremCar Enlever6 = new EnleverA2PremCar(test6);
        EnleverA2PremCar Enlever7 = new EnleverA2PremCar(test7);
        EnleverA2PremCar Enlever8 = new EnleverA2PremCar(test8);
        assertEquals(Enlever1.enleverA2PremCar(),"BCD");
        assertEquals(Enlever2.enleverA2PremCar(),"BBAA");
        assertEquals(Enlever3.enleverA2PremCar(),"CD");
        assertEquals(Enlever4.enleverA2PremCar(),"BAA");
        assertEquals(Enlever5.enleverA2PremCar(),"B");
        assertEquals(Enlever6.enleverA2PremCar(),"B");
        assertEquals(Enlever7.enleverA2PremCar(),"");
        assertEquals(Enlever8.enleverA2PremCar(),"");
    }
}
