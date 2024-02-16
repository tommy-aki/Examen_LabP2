/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen_labp2;

import javax.swing.JOptionPane;

/**
 *
 * @author Tommy Lee Pon
 */
public class UberSocial_FORM extends javax.swing.JFrame {
    private SocialClass logged;
    /**
     * Creates new form Twitter_FORM
     */
    public UberSocial_FORM(SocialClass cuenta) {
        logged=cuenta;
        initComponents();
        mainArea.setText(logged.timeline());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        perfilButton = new javax.swing.JButton();
        amigoButton = new javax.swing.JButton();
        comentButton = new javax.swing.JButton();
        cerrarButton = new javax.swing.JButton();
        buscarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        postArea = new javax.swing.JTextArea();
        postButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mainArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(42, 64, 86));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel1.setText("Bienvenido, ");

        nombreLabel.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        nombreLabel.setText("[USER]");

        perfilButton.setText("Ver Perfil");
        perfilButton.setContentAreaFilled(false);
        perfilButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        perfilButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                perfilButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                perfilButtonMouseExited(evt);
            }
        });
        perfilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilButtonActionPerformed(evt);
            }
        });

        amigoButton.setText("Agregar Amigo");
        amigoButton.setContentAreaFilled(false);
        amigoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        amigoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                amigoButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                amigoButtonMouseExited(evt);
            }
        });
        amigoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amigoButtonActionPerformed(evt);
            }
        });

        comentButton.setText("Comentar Post");
        comentButton.setContentAreaFilled(false);
        comentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comentButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comentButtonMouseExited(evt);
            }
        });
        comentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comentButtonActionPerformed(evt);
            }
        });

        cerrarButton.setText("Cerrar Sesion");
        cerrarButton.setContentAreaFilled(false);
        cerrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarButtonActionPerformed(evt);
            }
        });

        buscarButton.setText("Buscar perfil");
        buscarButton.setContentAreaFilled(false);
        buscarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarButtonMouseExited(evt);
            }
        });
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(amigoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(perfilButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cerrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(buscarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreLabel)
                .addGap(35, 35, 35)
                .addComponent(perfilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amigoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(cerrarButton)
                .addContainerGap())
        );

        postArea.setColumns(20);
        postArea.setRows(5);
        jScrollPane1.setViewportView(postArea);

        postButton.setText("Postear");
        postButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postButtonActionPerformed(evt);
            }
        });

        mainArea.setEditable(false);
        mainArea.setBackground(new java.awt.Color(52, 49, 72));
        mainArea.setColumns(20);
        mainArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mainArea.setForeground(new java.awt.Color(255, 255, 255));
        mainArea.setRows(5);
        jScrollPane2.setViewportView(mainArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(postButton)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(postButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comentButtonActionPerformed
        // TODO add your handling code here:
        new Commen_FORM(logged).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_comentButtonActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        // TODO add your handling code here:
        String user = JOptionPane.showInputDialog(null, "Usuario: ");
        mainArea.setText(Main_FORM.cuentas.profileFrom(user));
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void perfilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilButtonActionPerformed
        // TODO add your handling code here:
        mainArea.setText(Main_FORM.cuentas.profileFrom(logged.getUsername()));
    }//GEN-LAST:event_perfilButtonActionPerformed

    private void cerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarButtonActionPerformed
        // TODO add your handling code here:
        new Main_FORM().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cerrarButtonActionPerformed

    private void amigoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amigoButtonActionPerformed
        // TODO add your handling code here:
        String user = JOptionPane.showInputDialog(null, "Buscar usuario a agregar:");
        String user1=logged.getUsername();
        Main_FORM.cuentas.agregarAmigo(user1, user);
    }//GEN-LAST:event_amigoButtonActionPerformed

    private void postButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postButtonActionPerformed
        // TODO add your handling code here:
        String post = postArea.getText();
        logged.addPost(post);
    }//GEN-LAST:event_postButtonActionPerformed

    private void perfilButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilButtonMouseEntered
        // TODO add your handling code here:
        lighten(perfilButton);
    }//GEN-LAST:event_perfilButtonMouseEntered

    private void perfilButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilButtonMouseExited
        // TODO add your handling code here:
        back(perfilButton);
    }//GEN-LAST:event_perfilButtonMouseExited

    private void amigoButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amigoButtonMouseEntered
        // TODO add your handling code here:
        lighten(amigoButton);
    }//GEN-LAST:event_amigoButtonMouseEntered

    private void comentButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comentButtonMouseEntered
        // TODO add your handling code here:
        lighten(comentButton);
    }//GEN-LAST:event_comentButtonMouseEntered

    private void comentButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comentButtonMouseExited
        // TODO add your handling code here:
        back(comentButton);
    }//GEN-LAST:event_comentButtonMouseExited

    private void buscarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarButtonMouseEntered
        // TODO add your handling code here:
        lighten(buscarButton);
    }//GEN-LAST:event_buscarButtonMouseEntered

    private void buscarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarButtonMouseExited
        // TODO add your handling code here:
        back(buscarButton);
    }//GEN-LAST:event_buscarButtonMouseExited

    private void amigoButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amigoButtonMouseExited
        // TODO add your handling code here:
        back(amigoButton);
    }//GEN-LAST:event_amigoButtonMouseExited

    
    public void lighten(javax.swing.JButton boton){
        boton.setForeground(new java.awt.Color(100,100,100));
    }
    public void back(javax.swing.JButton boton){
        boton.setForeground(new java.awt.Color(0,0,0));
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UberSocial_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UberSocial_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UberSocial_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UberSocial_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UberSocial_FORM(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton amigoButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JButton cerrarButton;
    private javax.swing.JButton comentButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea mainArea;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JButton perfilButton;
    private javax.swing.JTextArea postArea;
    private javax.swing.JButton postButton;
    // End of variables declaration//GEN-END:variables
}