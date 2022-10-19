/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.client;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
/**
 *
 * @author LEGION
 */
public class client extends javax.swing.JFrame {
    public client() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iptext = new javax.swing.JTextField();
        ipconnect = new javax.swing.JButton();
        KeyStroke = new javax.swing.JButton();
        AppRunning = new javax.swing.JButton();
        ShutDown = new javax.swing.JButton();
        Screenshot = new javax.swing.JButton();
        FixRegistry = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        ProcessRunning = new javax.swing.JButton();
        checkscreen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iptext.setText("Nhập IP");
        iptext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptextActionPerformed(evt);
            }
        });

        ipconnect.setText("Kết nối");
        ipconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipconnectActionPerformed(evt);
            }
        });

        KeyStroke.setText("Keystroke");
        KeyStroke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeyStrokeActionPerformed(evt);
            }
        });

        AppRunning.setText("App Running");
        AppRunning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppRunningActionPerformed(evt);
            }
        });

        ShutDown.setText("Shut Down");
        ShutDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShutDownActionPerformed(evt);
            }
        });

        Screenshot.setText("Screenshot");
        Screenshot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScreenshotActionPerformed(evt);
            }
        });

        FixRegistry.setText("Fix Registry");
        FixRegistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FixRegistryActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        ProcessRunning.setText("Process Running");
        ProcessRunning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessRunningActionPerformed(evt);
            }
        });

        checkscreen.setText("CheckScreen");
        checkscreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkscreenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iptext, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ipconnect))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ProcessRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(FixRegistry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ShutDown)
                                .addGap(9, 9, 9)
                                .addComponent(Screenshot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkscreen))
                            .addComponent(AppRunning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KeyStroke, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iptext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ipconnect))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AppRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ShutDown, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Screenshot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(KeyStroke, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FixRegistry, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ProcessRunning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iptextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptextActionPerformed
      
    }//GEN-LAST:event_iptextActionPerformed

    private void ipconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipconnectActionPerformed
        String s;  
        boolean test = true;
        final String ip = iptext.getText(); //Tạo biến ip (kiểu string) lấy từ khung iptext.
        try{          
            SocketAddress socketaddr = new InetSocketAddress(ip,6920); //tạo socket address với biến socketaddr cùng vời địa chỉ ip và port
            program.sclient = new Socket();
            program.sclient.connect(socketaddr); //connect với server
            JOptionPane.showMessageDialog(rootPane, "Kết nối thành công"); // tạo messagebox kết nói thành công
        } catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Kết nối thất bại tới " + ip);
            test = false;
            program.sclient = null;
        }
        if (test)
        {
            try {
                program.is = new BufferedReader(new InputStreamReader(program.sclient.getInputStream()));
                program.os = new BufferedWriter(new OutputStreamWriter(program.sclient.getOutputStream()));
            } catch (IOException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ipconnectActionPerformed

    private void ProcessRunningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessRunningActionPerformed
        if(program.sclient == null)
        {
            JOptionPane.showMessageDialog(rootPane, "Chưa kết nối tới server");
            return;
        }
        String s = "PROCESS";
        try {
//            program.os = new BufferedWriter(new OutputStreamWriter(program.sclient.getOutputStream()));
            program.os.write(s);
            program.os.newLine();
            program.os.flush();
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
        process process = new process();
        process.show();
    }//GEN-LAST:event_ProcessRunningActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        if(program.sclient == null)
        {
            JOptionPane.showMessageDialog(rootPane, "Chưa kết nối tới server");
            return;
        }
        String s = "EXIT";
        try {
//            program.os = new BufferedWriter(new OutputStreamWriter(program.sclient.getOutputStream()));
            program.os.write(s);
            program.os.newLine();
            program.os.flush();
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose(); 
    }//GEN-LAST:event_ExitActionPerformed

    private void ScreenshotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScreenshotActionPerformed
        if(program.sclient == null)
        {
            JOptionPane.showMessageDialog(rootPane, "Chưa kết nối tới server");
            return;
        }
        String s = "TAKEPIC";
        try {
//            program.os = new BufferedWriter(new OutputStreamWriter(program.sclient.getOutputStream()));
            program.os.write(s);
            program.os.newLine();
            program.os.flush();    
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
        pic pic = new pic();
        
        pic.show();
    }//GEN-LAST:event_ScreenshotActionPerformed

    private void AppRunningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppRunningActionPerformed
        if(program.sclient == null)
        {
            JOptionPane.showMessageDialog(rootPane, "Chưa kết nối tới server");
            return;
        }
        listApp listApp = new listApp();
        listApp.show();
        String s = "APPLICATION";
        try {
//            program.os = new BufferedWriter(new OutputStreamWriter(program.sclient.getOutputStream()));
            program.os.write(s);
            program.os.newLine();
            program.os.flush();
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AppRunningActionPerformed

    private void ShutDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShutDownActionPerformed
        if(program.sclient == null)
        {
            JOptionPane.showMessageDialog(rootPane, "Chưa kết nối tới server");
            return;
        }
        String s = "SHUTDOWN";
        try {
//            program.os = new BufferedWriter(new OutputStreamWriter(program.sclient.getOutputStream()));
            program.os.write(s);
            program.os.newLine();
            program.os.flush();
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ShutDownActionPerformed

    private void KeyStrokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeyStrokeActionPerformed
        if(program.sclient == null)
        {
            JOptionPane.showMessageDialog(rootPane, "Chưa kết nối tới server");
            return;
        }
        keylog keylog = new keylog();
        keylog.show();
        String s = "KEYLOG";
        try {
//            program.os = new BufferedWriter(new OutputStreamWriter(program.sclient.getOutputStream()));
            program.os.write(s);
            program.os.newLine();
            program.os.flush();
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_KeyStrokeActionPerformed

    private void FixRegistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FixRegistryActionPerformed
        if(program.sclient == null)
        {
            JOptionPane.showMessageDialog(rootPane, "Chưa kết nối tới server");
            return;
        }
        registry registry = new registry();
        registry.show();
        String s = "REGISTRY";
        try {
//            program.os = new BufferedWriter(new OutputStreamWriter(program.sclient.getOutputStream()));
            program.os.write(s);
            program.os.newLine();
            program.os.flush();
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FixRegistryActionPerformed

    private void checkscreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkscreenActionPerformed
        if(program.sclient == null)
        {
            JOptionPane.showMessageDialog(rootPane, "Chưa kết nối tới server");
            return;
        }
        checkscreen checkscreen = new checkscreen();
        checkscreen.show();
        String s = "CHECKSCREEN";
        try {
//            program.os = new BufferedWriter(new OutputStreamWriter(program.sclient.getOutputStream()));
            program.os.write(s);
            program.os.newLine();
            program.os.flush();
            
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkscreenActionPerformed

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
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new client().setVisible(true);
//                
//            }
//        });
//
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AppRunning;
    private javax.swing.JButton Exit;
    private javax.swing.JButton FixRegistry;
    private javax.swing.JButton KeyStroke;
    private javax.swing.JButton ProcessRunning;
    private javax.swing.JButton Screenshot;
    private javax.swing.JButton ShutDown;
    private javax.swing.JButton checkscreen;
    private javax.swing.JButton ipconnect;
    private javax.swing.JTextField iptext;
    // End of variables declaration//GEN-END:variables
}
