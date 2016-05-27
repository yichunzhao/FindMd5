/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locatemd5key;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author YNZ
 */
public class Dictionary {

    private static StringBuilder sb = new StringBuilder();

    static {
        FileReader in = null;
        File file = new File("src/wordlist.txt");

        try {
            in = new FileReader(file);
            int c;
            while ((c = in.read()) != -1) {
                sb.append((char) c);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("" + ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println("" + ex.getMessage());
                }
            }

        }

    }

    public static String getDictionary() {
        return sb.toString();
    }

}
