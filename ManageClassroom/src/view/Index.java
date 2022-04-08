package view;

import java.util.concurrent.TimeUnit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author holohoi
 */
public class Index extends javax.swing.JFrame {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello world");
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Login frameDesignTest = new Login();
//                frameDesignTest.setVisible(true);
//            }
//        });
        Login frameDesignTest = new Login();
        frameDesignTest.setVisible(true);
        TimeUnit.SECONDS.sleep(1);

    }
}
