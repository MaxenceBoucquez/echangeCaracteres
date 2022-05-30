/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package echangecaracteres;

/**
 *
 * @author maxen
 */
public class EchangeCaracteres {

    static String WordToChange;
    
    EchangeCaracteres()
    {
        WordToChange = "";
    }
    
    EchangeCaracteres(String WordToChange)
    {
        this.WordToChange = WordToChange;
    }
    
    public static void main(String[] args) {
        WordToChange = "ANTICONSITUTIONNELLEMENT";
        System.out.println(echangerMot());
    }   
    public static String echangerMot()
    { 
        return new String(WordToChange.substring(0,WordToChange.length()-2)+WordToChange.charAt(WordToChange.length()-1)+WordToChange.charAt(WordToChange.length()-2));
    }
    
    
}
