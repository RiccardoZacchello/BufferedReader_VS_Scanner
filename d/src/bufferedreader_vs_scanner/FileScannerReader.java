/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedreader_vs_scanner;

import java.io.*;
import java.util.*;

/**
 *
 * @author zacchello.riccardo
 */
public class FileScannerReader {

    Scanner input = new Scanner(System.in);

    public void ScannerReader() throws IOException {
        
        File file = new File("FileEs.txt"); 
        Scanner sc = new Scanner(file);
        int []array =new int [500000];
        while (sc.hasNextLine()) {
            int i = sc.nextInt();
            for (int j = 0; j < array.length; j++) {
                array[j]=i;
                
            }
        }
        sc.close();
    }
}
