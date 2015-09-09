/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maury Miller
 */
public class Backwards {
    String str;
    
    public Backwards(String str) {
        this.str = str;
    }
    
    public String backward(int i) {
		if (i < 0) {
			return "";
		}

        int j = i + 1;
        if (i < str.length()) {
            return str.charAt(str.length()-1-i) + backward(j);
        }
        
        return "";
    }
}
