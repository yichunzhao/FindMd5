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
public class LocateMd5Key {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //System.out.println(""+Dictionary.getDictionary());
        String[] strs = Dictionary.getDictionary().split("\r\n");
        
        for(String str:strs){
            long num = Char2Num.convert(str.toCharArray());
            System.out.print(num+" ");
        }
                
    }

}
