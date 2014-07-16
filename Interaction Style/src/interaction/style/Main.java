/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interaction.style;

/**
 *
 * @author Mark
 */
public class Main {
    
    public static void main(String args[])
    {
        System.out.println("There are four interaction styles: "
                + "Harmony, Production, Connection, and Status Quo. ");
        
        System.out.println("\nTo find out what sort of interaction style you are,"
                + "I will ask you a series of questions.\n"
                + "You will then answer with a number between 1 - 4 followed by a corresponding to the "
                + "interaction style follow by a space. \n\n"
                + "As an example, your answer should look like, 4 3 2 1, this means "
                + "that you give harmony a 4, production a 3 and so on\n");
        
        
        System.out.println("Harmony | Production | Connection | Status Quo");
        InteractionStyles iS = new InteractionStyles();
        iS.run();
    }
    
}
