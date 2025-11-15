package Vista;

import Modelo.AutorDAO;
import java.util.List;
import javax.swing.ButtonGroup;


public class AgregarProducto extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AgregarProducto.class.getName());

    public AgregarProducto() {
        initComponents();
        
        // Cursor tipo mano en los botones añadir artista
        btnAnadirArtista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnadirArtista1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        // Cursor tipo mano en el boton subir imagen
        btnSubirImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        // Cursor tipo mano en el boton agregar album
        btnAgregarAlbum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        // Cursor tipo mano en el boton asociar cancion
        btnAsociarCan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        // Cursor tipo mano en el boton agregar cancion
        btnAgregarCancion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        // Agrupar radios
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rdbSi);
        grupo.add(rdbNo);
        
        cargarArtistas();
    }
    private void cargarArtistas() {
        AutorDAO dao = new AutorDAO();
        List<String> lista = dao.obtenerAutores();

        cmbArtistaVinl.removeAllItems();
        cmbArtistaCan.removeAllItems();

        for (String artista : lista) {
            cmbArtistaVinl.addItem(artista);
            cmbArtistaCan.addItem(artista);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbVendedor = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbVendedor1 = new javax.swing.JLabel();
        lbVendedor2 = new javax.swing.JLabel();
        lbVendedor3 = new javax.swing.JLabel();
        lbVendedor4 = new javax.swing.JLabel();
        lbVendedor5 = new javax.swing.JLabel();
        txtNomAlbum = new javax.swing.JTextField();
        txtGeneroAlb = new javax.swing.JTextField();
        txtAnioAlb = new javax.swing.JTextField();
        txtPrecioAlb = new javax.swing.JTextField();
        btnAgregarAlbum = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lbVendedor6 = new javax.swing.JLabel();
        lbVendedor7 = new javax.swing.JLabel();
        cmbArtistaVinl = new javax.swing.JComboBox<>();
        btnSubirImagen = new javax.swing.JButton();
        btnAsociarCan = new javax.swing.JButton();
        lbVendedor8 = new javax.swing.JLabel();
        txtIDAlbum = new javax.swing.JTextField();
        lbVendedor9 = new javax.swing.JLabel();
        txtInventario = new javax.swing.JTextField();
        lbVendedor10 = new javax.swing.JLabel();
        rdbSi = new javax.swing.JRadioButton();
        rdbNo = new javax.swing.JRadioButton();
        lbVendedor11 = new javax.swing.JLabel();
        lbVendedor12 = new javax.swing.JLabel();
        lbVendedor13 = new javax.swing.JLabel();
        lbVendedor14 = new javax.swing.JLabel();
        lbVendedor15 = new javax.swing.JLabel();
        txtNombreCancion = new javax.swing.JTextField();
        txtGeneroCancion = new javax.swing.JTextField();
        txtDuracionCan = new javax.swing.JTextField();
        txtTamanioCan = new javax.swing.JTextField();
        txtCalidadCan = new javax.swing.JTextField();
        btnAgregarCancion = new javax.swing.JButton();
        btnAnadirArtista = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbVendedor16 = new javax.swing.JLabel();
        lbVendedor17 = new javax.swing.JLabel();
        txtPrecioCancion = new javax.swing.JTextField();
        cmbArtistaCan = new javax.swing.JComboBox<>();
        btnAnadirArtista1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbVendedor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbVendedor.setText("Agregar nuevo vinilo");
        getContentPane().add(lbVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 6, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 44, 710, 10));

        lbVendedor1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor1.setText("ID álbum");
        getContentPane().add(lbVendedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, -1, -1));

        lbVendedor2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor2.setText("Artista");
        getContentPane().add(lbVendedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 94, -1, -1));

        lbVendedor3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor3.setText("Precio");
        getContentPane().add(lbVendedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 221, -1, -1));

        lbVendedor4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor4.setText("Inventario de vinilos");
        getContentPane().add(lbVendedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 253, -1, -1));

        lbVendedor5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor5.setText("Año");
        getContentPane().add(lbVendedor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 189, -1, -1));

        txtNomAlbum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtNomAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 125, 269, -1));

        txtGeneroAlb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtGeneroAlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 156, 269, -1));

        txtAnioAlb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtAnioAlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 188, 269, -1));

        txtPrecioAlb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtPrecioAlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 220, 269, -1));

        btnAgregarAlbum.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarAlbum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregarAlbum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mas 15px.png"))); // NOI18N
        btnAgregarAlbum.setText("Agregar Álbum");
        getContentPane().add(btnAgregarAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 200, -1));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 326, 710, 11));

        lbVendedor6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbVendedor6.setText("Agregar nueva canción (mp3)");
        getContentPane().add(lbVendedor6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 343, -1, -1));

        lbVendedor7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo musica grande.png"))); // NOI18N
        getContentPane().add(lbVendedor7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 220, 280));

        cmbArtistaVinl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbArtistaVinl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbArtistaVinl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbArtistaVinlActionPerformed(evt);
            }
        });
        getContentPane().add(cmbArtistaVinl, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 92, 129, -1));

        btnSubirImagen.setBackground(new java.awt.Color(153, 153, 153));
        btnSubirImagen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSubirImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/subir.png"))); // NOI18N
        btnSubirImagen.setText("Subir imagen");
        btnSubirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirImagenActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubirImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 200, -1));

        btnAsociarCan.setBackground(new java.awt.Color(204, 204, 204));
        btnAsociarCan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAsociarCan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/letras-de-canciones.png"))); // NOI18N
        btnAsociarCan.setText("Asociar canciones");
        getContentPane().add(btnAsociarCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 293, 200, -1));

        lbVendedor8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor8.setText("Nombre álbum");
        getContentPane().add(lbVendedor8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 128, -1, -1));

        txtIDAlbum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtIDAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 60, 269, -1));

        lbVendedor9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor9.setText("Género");
        getContentPane().add(lbVendedor9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 160, -1, -1));

        txtInventario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 252, 269, -1));

        lbVendedor10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor10.setText("Desea agregarlo a formato disco mp3?");
        getContentPane().add(lbVendedor10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 296, -1, -1));

        rdbSi.setText("Si");
        rdbSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSiActionPerformed(evt);
            }
        });
        getContentPane().add(rdbSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 299, -1, -1));

        rdbNo.setText("No");
        getContentPane().add(rdbNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 299, -1, -1));

        lbVendedor11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor11.setText("Género");
        getContentPane().add(lbVendedor11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 452, -1, -1));

        lbVendedor12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor12.setText("Artista");
        getContentPane().add(lbVendedor12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 420, -1, -1));

        lbVendedor13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor13.setText("Calidad (Kbps)");
        getContentPane().add(lbVendedor13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 548, -1, -1));

        lbVendedor14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor14.setText("Duración");
        getContentPane().add(lbVendedor14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 484, -1, -1));

        lbVendedor15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor15.setText("Tamaño (MB)");
        getContentPane().add(lbVendedor15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 516, -1, -1));

        txtNombreCancion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtNombreCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 387, 269, -1));

        txtGeneroCancion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtGeneroCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 451, 269, -1));

        txtDuracionCan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtDuracionCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 483, 269, -1));

        txtTamanioCan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtTamanioCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 515, 269, -1));

        txtCalidadCan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtCalidadCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 547, 269, -1));

        btnAgregarCancion.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarCancion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregarCancion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mas 15px.png"))); // NOI18N
        btnAgregarCancion.setText("Agregar canción");
        getContentPane().add(btnAgregarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 429, -1));

        btnAnadirArtista.setBackground(new java.awt.Color(204, 204, 204));
        btnAnadirArtista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAnadirArtista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mas 15px.png"))); // NOI18N
        btnAnadirArtista.setText("Añadir artista");
        btnAnadirArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirArtistaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnadirArtista, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 92, 140, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 200, 160));

        lbVendedor16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor16.setText("Nombe");
        getContentPane().add(lbVendedor16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 388, -1, -1));

        lbVendedor17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbVendedor17.setText("Precio");
        getContentPane().add(lbVendedor17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

        txtPrecioCancion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtPrecioCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 269, -1));

        cmbArtistaCan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbArtistaCan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbArtistaCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbArtistaCanActionPerformed(evt);
            }
        });
        getContentPane().add(cmbArtistaCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 129, -1));

        btnAnadirArtista1.setBackground(new java.awt.Color(204, 204, 204));
        btnAnadirArtista1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAnadirArtista1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mas 15px.png"))); // NOI18N
        btnAnadirArtista1.setText("Añadir artista");
        btnAnadirArtista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirArtista1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnadirArtista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 420, 140, -1));

        jPanel1.setBackground(new java.awt.Color(89, 89, 89));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubirImagenActionPerformed

    private void rdbSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbSiActionPerformed

    private void btnAnadirArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirArtistaActionPerformed
        AñadirArtista art = new AñadirArtista();
        art.setVisible(true);
        art.setLocationRelativeTo(null);
        art.setResizable(false);
        dispose();
    
    }//GEN-LAST:event_btnAnadirArtistaActionPerformed

    private void cmbArtistaVinlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbArtistaVinlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbArtistaVinlActionPerformed

    private void cmbArtistaCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbArtistaCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbArtistaCanActionPerformed

    private void btnAnadirArtista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirArtista1ActionPerformed
        AñadirArtista art = new AñadirArtista();
        art.setVisible(true);
        art.setLocationRelativeTo(null);
        art.setResizable(false);
        dispose();
    }//GEN-LAST:event_btnAnadirArtista1ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new AgregarProducto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlbum;
    private javax.swing.JButton btnAgregarCancion;
    private javax.swing.JButton btnAnadirArtista;
    private javax.swing.JButton btnAnadirArtista1;
    private javax.swing.JButton btnAsociarCan;
    private javax.swing.JButton btnSubirImagen;
    private javax.swing.JComboBox<String> cmbArtistaCan;
    private javax.swing.JComboBox<String> cmbArtistaVinl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbVendedor;
    private javax.swing.JLabel lbVendedor1;
    private javax.swing.JLabel lbVendedor10;
    private javax.swing.JLabel lbVendedor11;
    private javax.swing.JLabel lbVendedor12;
    private javax.swing.JLabel lbVendedor13;
    private javax.swing.JLabel lbVendedor14;
    private javax.swing.JLabel lbVendedor15;
    private javax.swing.JLabel lbVendedor16;
    private javax.swing.JLabel lbVendedor17;
    private javax.swing.JLabel lbVendedor2;
    private javax.swing.JLabel lbVendedor3;
    private javax.swing.JLabel lbVendedor4;
    private javax.swing.JLabel lbVendedor5;
    private javax.swing.JLabel lbVendedor6;
    private javax.swing.JLabel lbVendedor7;
    private javax.swing.JLabel lbVendedor8;
    private javax.swing.JLabel lbVendedor9;
    private javax.swing.JRadioButton rdbNo;
    private javax.swing.JRadioButton rdbSi;
    private javax.swing.JTextField txtAnioAlb;
    private javax.swing.JTextField txtCalidadCan;
    private javax.swing.JTextField txtDuracionCan;
    private javax.swing.JTextField txtGeneroAlb;
    private javax.swing.JTextField txtGeneroCancion;
    private javax.swing.JTextField txtIDAlbum;
    private javax.swing.JTextField txtInventario;
    private javax.swing.JTextField txtNomAlbum;
    private javax.swing.JTextField txtNombreCancion;
    private javax.swing.JTextField txtPrecioAlb;
    private javax.swing.JTextField txtPrecioCancion;
    private javax.swing.JTextField txtTamanioCan;
    // End of variables declaration//GEN-END:variables
}
