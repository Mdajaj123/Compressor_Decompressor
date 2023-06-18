/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import comp_dcomp.Compressor;
import comp_dcomp.Dcompressor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class AppFrame extends JFrame implements ActionListener {
    JButton compressButton;
    JButton decompressButton;
    AppFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        compressButton=new JButton("Select to compress file");
        compressButton.setSize(200,50);
        compressButton.setLocation(300,250);
        compressButton.addActionListener(this);
        this.setVisible(true);
        this.add(compressButton);
        decompressButton=new JButton("Select to decompress file");
         decompressButton.setSize(200,50);
        decompressButton.setLocation(700,250);
        decompressButton.addActionListener(this);
        
        this.add(decompressButton);
       // this.getContentPane().setBackground(Color.green);
        this.setVisible(true);
        
        
    }
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==compressButton)
       {
          JFileChooser filechooser=new JFileChooser(); 
          int response=filechooser.showSaveDialog(null);
          if(response==JFileChooser.APPROVE_OPTION)
          {
              File file=new File(filechooser.getSelectedFile().getAbsolutePath());
              System.out.print(file);
              try
              {
                  Compressor.method(file);
              }
              catch(Exception ee)
              {
                 JOptionPane.showMessageDialog(null,ee.toString());
              }
              
          }
       }
       if(e.getSource()==decompressButton)
       {
           JFileChooser filechooser=new JFileChooser(); 
          int response=filechooser.showSaveDialog(null);
          if(response==JFileChooser.APPROVE_OPTION)
          {
              File file=new File(filechooser.getSelectedFile().getAbsolutePath());
              System.out.print(file);
              try
              {
                  Dcompressor.method(file);
              }
              catch(Exception ee)
              {
                 JOptionPane.showMessageDialog(null,ee.toString());
              }
              
          }
           
       }
        
    }
}
