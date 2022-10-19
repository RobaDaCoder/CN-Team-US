/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.server;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import javax.imageio.ImageIO;
import javax.swing.UIManager;
import org.apache.commons.lang3.StringUtils;
/**
 *
 * @author LEGION
 */
public class program {
    public static Socket sserver;
    public static BufferedReader is;
    public static BufferedWriter os;
    public static String signal;
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        server server = new server();
        server.setVisible(true);
//            try {
//            String line;
//            Process p = Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
//            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
//            int i;
//            for(i = 0; (line = input.readLine()) != null;i++) {
//                line = input.readLine();
//                input.readLine();
//                if (i>2)
//                {
//                    System.out.println(line);
//                }
//            }
////            line = "lsass.exe                     1128 Services                   0     26,220 K";
////            String[] splitline = StringUtils.split(line);
////            for (i = 0; i < splitline.length;i++)
////            {
////                System.out.println(splitline[i]);
////            }
//            input.close();
//            } catch (Exception err) {
//            err.printStackTrace();
//            }
        }
}
