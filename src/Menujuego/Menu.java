/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menujuego;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Luis Miguel
 */
public class Menu extends javax.swing.JFrame {
    String mostrar="",mostrar2="",tr="S";
    int Tama,j;
    int vecadena[]=new int[Tama];
    Random ran=new Random();
    
    
    public Menu() {
        initComponents();
         this.setLocationRelativeTo(null);// esto es para que se quede en el centro de la pantalla
         SetImageLabel(Imagen3,"src/Images/Mario2.png");
         SetImageLabel(Imagen2,"src/Images/Mario3.png");
         SetImageLabel(Imagen4,"src/Images/Mario3.png");
         SetImageLabel(Imagen1,"src/Images/Mario1.png");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondomenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Nombremenu = new javax.swing.JLabel();
        Imagen2 = new javax.swing.JLabel();
        Imagen4 = new javax.swing.JLabel();
        Imagen1 = new javax.swing.JLabel();
        Elegirop = new javax.swing.JLabel();
        Creararreglo = new javax.swing.JButton();
        Mostrarjuego = new javax.swing.JButton();
        Ejemploreal = new javax.swing.JButton();
        Imagen3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondomenu.setBackground(new java.awt.Color(255, 255, 255));
        Fondomenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        Nombremenu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nombremenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombremenu.setText("MENÚ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(Nombremenu, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(Imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Nombremenu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(Imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondomenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 80));
        Fondomenu.add(Imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 190, 200));

        Elegirop.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Elegirop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Elegirop.setText("Elige una opción");
        Fondomenu.add(Elegirop, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 190, 40));

        Creararreglo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Creararreglo.setText("Crear ");
        Creararreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreararregloActionPerformed(evt);
            }
        });
        Fondomenu.add(Creararreglo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 90, -1));

        Mostrarjuego.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Mostrarjuego.setText("Juego");
        Mostrarjuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarjuegoActionPerformed(evt);
            }
        });
        Fondomenu.add(Mostrarjuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 90, -1));

        Ejemploreal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Ejemploreal.setText("Ejemplo");
        Ejemploreal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjemplorealActionPerformed(evt);
            }
        });
        Fondomenu.add(Ejemploreal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 90, -1));
        Fondomenu.add(Imagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 200, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondomenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondomenu, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void CreararregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreararregloActionPerformed
      Crear nuevaventana = new Crear();
       nuevaventana.setVisible(true);
       this.dispose();
        
      
    }//GEN-LAST:event_CreararregloActionPerformed

    private void MostrarjuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarjuegoActionPerformed
       Juego nuevaventana = new Juego();
       nuevaventana.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_MostrarjuegoActionPerformed

    private void EjemplorealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjemplorealActionPerformed
       Ejemplo nuevaventana = new Ejemplo();
        nuevaventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EjemplorealActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon Icon = new ImageIcon( image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(Icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Creararreglo;
    private javax.swing.JButton Ejemploreal;
    private javax.swing.JLabel Elegirop;
    private javax.swing.JPanel Fondomenu;
    private javax.swing.JLabel Imagen1;
    private javax.swing.JLabel Imagen2;
    private javax.swing.JLabel Imagen3;
    private javax.swing.JLabel Imagen4;
    private javax.swing.JButton Mostrarjuego;
    private javax.swing.JLabel Nombremenu;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
