/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package locatemd5key;

import java.io.UnsupportedEncodingException;
import java.security.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author YNZ
 */
public class Str2Md5 {
    private final String str;
    
    private Str2Md5(String answer) {
        this.str = answer;
    }
    
    public byte[] convert() throws UnsupportedEncodingException, NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] b=str.getBytes("UTF-8");
        md.update(b);
        return md.digest(b);              
        
    }
    
    public static void main(String args[]){
        try {
            //Str2Md5 convertor = new Str2Md5("poultry outwits ants");
            Str2Md5 convertor = new Str2Md5("poultry outwits ants");
            byte[] digested=convertor.convert();
            StringBuilder sb = new StringBuilder();
            for(byte b: digested){
                 sb.append(String.format("%02x",b));
            }
            //"4624d200580677270a54ccff86b9610e"
            //"04f8d3ecb3215ac22e0741d7485b68cc"
            //"03cdda2cda6efb4e71e30c8e985c4f14"
            
            System.out.println(sb.toString()+" its length = "+ sb.length());
            System.out.println(sb.toString().toLowerCase()+" its length = "+ sb.length());
            System.out.println(sb.toString().equals(sb.toString().toLowerCase()) );
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException ex) {
            Logger.getLogger(Str2Md5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
