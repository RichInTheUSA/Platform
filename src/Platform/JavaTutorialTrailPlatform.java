package Platform;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pi
 */
public class JavaTutorialTrailPlatform {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //My application has a property file
        
        Properties p = new Properties();
        p.setProperty("AUTHOR", "Rich");
        FileOutputStream f = null;
        try {
            f = new FileOutputStream("myproperties.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaTutorialTrailPlatform.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            p.store( f ,"test");
        } catch (IOException ex) {
            Logger.getLogger(JavaTutorialTrailPlatform.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Now let's read the properties back.
        
        Properties nP = new Properties();
        FileInputStream i = null;
        try {
            i = new FileInputStream("myproperties.txt");
        } catch (FileNotFoundException e){
            Logger.getLogger(JavaTutorialTrailPlatform.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            nP.load(i);
            if ( i != null) {
                i.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(JavaTutorialTrailPlatform.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        nP.list(System.out);
        
        
        // Command line arguments
        for (String s : args) {
            System.out.println (s);
        }
        
        System.out.println(System.getProperty("file.seperator"));
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("line.separator"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("path.seperator"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));
        
    }
    
}
