/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enleverA2PremCar;

/**
 *
 * @author Maxence
 */
public class EnleverA2PremCar {
    String WordToChange;
    
    public EnleverA2PremCar()
    {
        this.WordToChange = "";
    }
    
    public EnleverA2PremCar(String WordToChange)
    {
        this.WordToChange = WordToChange;
    }
    
    public String enleverA2PremCar()
    {
        if(WordToChange.length()>=2)
        {
            return new String(WordToChange.substring(0, 2).replaceAll("A", "")+WordToChange.substring(2));
        }
        else if(WordToChange.length() == 1)
        {
            return new String(WordToChange.replaceAll("A", ""));
        }
        return WordToChange;
    }
}
