/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.server;
import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import javax.swing.JOptionPane;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import javax.imageio.stream.MemoryCacheImageOutputStream;
import javax.swing.ImageIcon;
import org.apache.commons.lang3.StringUtils;
/**
 *
 * @author LEGION
 */

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.*;
import java.io.*;


public class server extends javax.swing.JFrame {

    /**
     * Creates new form server
     */
    public server() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Server = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Server.setText("Mở server");
        Server.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(Server, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Server, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void receiveSignal()
    {
        try{
//           program.is = new BufferedReader(new InputStreamReader(program.sserver.getInputStream()));
           program.signal = program.is.readLine();
        }catch (IOException e) {
           program.signal = "QUIT";
        }
    }
    
    private void ServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServerActionPerformed
       ServerSocket listener = null;
       System.out.println("Server is waiting to accept user...");
       try {
           listener = new ServerSocket(6920);
           program.sserver = listener.accept();
           program.is = new BufferedReader(new InputStreamReader(program.sserver.getInputStream()));
           program.os = new BufferedWriter(new OutputStreamWriter(program.sserver.getOutputStream()));
           boolean perform = true;
           while (perform)
           {
               receiveSignal();
               switch (program.signal)
               {
                    case "KEYLOG" -> {keylog();break;}
                    case "SHUTDOWN" -> {shutdown();break;}
                    case "REGISTRY" -> {registry();break;}
                    case "TAKEPIC" -> {takepic();break;}
                    case "PROCESS" -> {process();break;}
                    case "APPLICATION" -> {application();break;}
                    case "CHECKSCREEN" -> {checkscreen();break;}
                    case "EXIT" -> {
                        program.sserver.close();
                        listener.close();
                        return;
                    }
               }
           }
       } catch (IOException e) {
           JOptionPane.showMessageDialog(rootPane, "Không thể mở server");
       } 
    }//GEN-LAST:event_ServerActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Flatlaf Light".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new server().setVisible(true);
//            }
//        });
//    }
    
    int i = 0;
    public void hookKey(KeyLogger k){
        i += 1;
        if(i == 1){
            try{
                GlobalScreen.registerNativeHook();
                System.out.println("hook 1");
            }catch (NativeHookException e){
                e.printStackTrace();
            }
            GlobalScreen.addNativeKeyListener(k);

            System.out.println("hook");
        } else{
            
        }
        
    }

    public void unHookKey(KeyLogger k) throws NativeHookException{
        k = null;
//        GlobalScreen.unregisterNativeHook();
        System.out.println("unhook");
    }

    public void print(KeyLogger k) {

        String mes = "";

        try {
            if(k == null){
                System.out.println("null object");
                mes = "null object";
                program.os.write("n1");
                program.os.newLine();
                program.os.flush();
                
                program.os.write("n2");
                program.os.newLine();
                program.os.flush();
            }
            else{
                System.out.println("not null");
                mes = k.store;
                if(mes != ""){
                    System.out.println(mes);
                    program.os.write("oke");
                    program.os.newLine();
                    program.os.flush();
                    
                    program.os.write(mes);
                    program.os.newLine();
                    program.os.flush();
                    k.store = "";
                }
                else {
                    program.os.write("ko");
                    program.os.newLine();
                    System.out.println("null22");
                    program.os.flush();
                    
                    program.os.write("null22");
                    program.os.newLine();
                    program.os.flush();
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("print");
    }

    public void keylog() throws IOException{
                    
        KeyLogger k = new KeyLogger();
//        System.out.println("hook");
        while(true){
            receiveSignal();
            switch (program.signal){
                case "HOOK" ->{
                    hookKey(k);
                    System.out.println("hook");
                    break;
                    
                }
                case "UNHOOK"->{
                try {
                    // k = null;
                    unHookKey(k);
                } catch (NativeHookException ex) {
                    Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("unhook");
                break;
                }
                case "PRINT"->{
                    print(k);
                    System.out.println("print");
                    break;
                }
                case "QUIT"->{
                    break;
                }
            }
        }
    }
    
    public void shutdown()
    {
        try{
            Runtime runtime = Runtime.getRuntime();
            Process proc = runtime.exec("shutdown -s -t 5");
            System.exit(0);
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public void application() throws IOException
    {
        boolean indo = true;
        while (indo)
        {
            receiveSignal();
            switch(program.signal)
            {
                case "XEM" ->                 {
                    try {
                        String line = null;
                        Process p = Runtime.getRuntime().exec("powershell.exe Get-Process | Where-Object { $_.MainWindowTitle } | Format-Table ID,Name,Mainwindowtitle –AutoSize");
                        BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));                  
                        int soprocess = 0;
                        while(input.readLine() != null){
                            soprocess++;
                        }
                        String soprocess1 = Integer.toString(soprocess);
                        program.os = new BufferedWriter(new OutputStreamWriter(program.sserver.getOutputStream()));
                        program.os.write(soprocess1);
                        program.os.newLine();
                        program.os.flush();
                        Process p1 = Runtime.getRuntime().exec("powershell.exe Get-Process | Where-Object { $_.MainWindowTitle } | Format-Table ID,Name,Mainwindowtitle –AutoSize");
                        BufferedReader input1 = new BufferedReader(new InputStreamReader(p1.getInputStream())); 
                        try (ObjectOutputStream out = new ObjectOutputStream(program.sserver.getOutputStream())) {
                            for(int i = 0; (i<soprocess) ;i++) {
                                line = input1.readLine();
                                line = line.trim();
                                if (i>=3) 
                                {
                                    if (i == soprocess-1)
                                    {
                                        break;
                                    }
                                    line = line.replaceAll("\\s{1,100}", " ");
                                    String[] splitline = line.split(" ",3);
                                    String data[] = {splitline[0],splitline[1],splitline[2]};
                                    out.writeObject(data);
                                    out.flush();
                                }
                            }
                        }
                    }
                    catch(IOException e)
                    {
                      JOptionPane.showMessageDialog(null,e);
                    }
                }
                  case "QUIT" -> {
                      indo = false;
                      return;
                }
            }
        }
    }
    
    public void registry()
    {
        String ss = null;
    }
    
    public void process()
    {
        boolean indo = true;
        while (indo)
        {
            receiveSignal();
            switch(program.signal)
            {
                case "XEM" ->                 {
                    try {
                        String line = null;
                        Process p = Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
                        BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));                  
                        int soprocess = 0;
                        while(input.readLine() != null){
                            soprocess++;
                        }
                        String soprocess1 = Integer.toString(soprocess);
                        program.os = new BufferedWriter(new OutputStreamWriter(program.sserver.getOutputStream()));
                        program.os.write(soprocess1);
                        program.os.newLine();
                        program.os.flush();
                        Process p1 = Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
                        BufferedReader input1 = new BufferedReader(new InputStreamReader(p1.getInputStream())); 
                        try (ObjectOutputStream out = new ObjectOutputStream(program.sserver.getOutputStream())) {
                            for(int i = 0; (i<soprocess) ;i++) {
                                line = input1.readLine();
                                if (i>=3)
                                {
                                    for (int u =0; u < line.length()-2;u++)
                                    {
                                        if ((line.charAt(u)>64 && line.charAt(u)<=122)&&(line.charAt(u+2)>64 && line.charAt(u+2)<=122) && line.charAt(u+1)==' ')
                                        {
                                            line = line.substring(0,u+1)+"_"+line.substring(u+2,line.length());
                                        }
                                    }
                                    String[] splitline = line.trim().split("\\s{1,100}");
                                    String data[] = {splitline[0],splitline[1],splitline[2],splitline[3],splitline[4]+splitline[5]};
                                    out.writeObject(data);
                                    out.flush();
                                }
                            }
                        }
                    }
                    catch(IOException e)
                    {
                      JOptionPane.showMessageDialog(null,e);
                    }
                }
                  case "QUIT" -> {
                      indo = false;
                      return;
                }
            }
        }
    }
public void takepic()
    {
        System.out.println("unhook");
        boolean indo = true;
        while (indo)
        {
            receiveSignal();
            switch(program.signal)
            {
                case "TAKE" ->                 {
                    try{
                        robot = new Robot();
                        ByteArrayOutputStream ous = new ByteArrayOutputStream();
                        bimg = robot.createScreenCapture(new Rectangle(0,0,(int) d.getWidth(), (int) d.getHeight()));
                        ImageIO.write(bimg, "png", program.sserver.getOutputStream());
                        program.sserver.getOutputStream().write(ous.toByteArray());
                        ous.flush();
                        break;
                    } catch(Exception ex){
                            JOptionPane.showMessageDialog(null,ex);
                    }
                }
                case "QUIT" ->                 {
                    indo = false;
                    return;
                }
            }
        }
    }
    
    public void checkscreen()
    {
        boolean indo = true;
        while (indo)
        {
            receiveSignal();
            switch(program.signal)
            {
                case "START" ->                 {
                    try{
                        Robot robot = new Robot();
                        Toolkit toolkit = Toolkit.getDefaultToolkit();
                        Dimension d = toolkit.getScreenSize();

                        while (true){
                            ByteArrayOutputStream ous = new ByteArrayOutputStream();
                            BufferedImage img = robot.createScreenCapture(new Rectangle(0,0,(int) d.getWidth(), (int) d.getHeight()));
                            ImageIO.write(img, "png", ous);
                            program.sserver.getOutputStream().write(ous.toByteArray());
                            ous.flush();
                            ous.reset();
                            ous.close();
                            try {
                                Thread.sleep(30);
                            } catch (Exception e) {
                            }
                        }
                    } catch(Exception ex){
                            JOptionPane.showMessageDialog(null,ex);
                    }
                }
                case "QUIT" ->                 {
                    indo = false;
                    return;
                }
            }
        }
    }
    private Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    private Image newimg;
    private Robot robot;
    private static BufferedImage bimg;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Server;
    // End of variables declaration//GEN-END:variables
//    private ByteArrayOutputStream ous = new ByteArrayOutputStream();
    void setvisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String Str(int read) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
