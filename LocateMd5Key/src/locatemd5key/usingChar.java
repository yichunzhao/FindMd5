/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locatemd5key;

/**
 *
 * @author YNZ
 */
public class usingChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 'a';
        //int b = 1 + a;
        
        do {
            a++;
            System.out.println((char) a);
        } while ('z' != (char) a);
    }

}
