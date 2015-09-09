/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maury Miller
 */
public class BwdDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Backwards b = new Backwards(args[0]);        
        System.out.println(b.backward(Integer.parseInt(args[1])));
    }
    
}
