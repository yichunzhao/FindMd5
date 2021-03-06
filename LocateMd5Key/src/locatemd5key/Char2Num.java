/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locatemd5key;

import java.util.HashMap;

/**
 *
 * @author YNZ
 */
public class Char2Num {

    public static final HashMap<Character, Integer> charNum = new HashMap<>();

    static {

        for (int n = 1, c = 'a'; c <= 'z'; c++, n++) {
            Integer b = charNum.put((char) c, n);
        }
    }

    public static long convert(char[] word) {
        if(null==charNum) throw new NullPointerException();
        
        long wordNum = 0;
        for (char c : word) {
            
            wordNum = wordNum + charNum.get(c);
        }
        return wordNum;
    }

}
