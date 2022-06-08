package pe.unjfsc.quiz.java11.view;

import java.util.HashSet;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.quiz.java11.entity.CECliente;
import pe.unjfsc.quiz.java11.logical.CLCliente;
import pe.unjfsc.quiz.java11.model.CICCambioCliente;
import pe.unjfsc.quiz.java11.modelo.imp.CMCambiarCliemte;

public class CVMostrarInformacion extends javax.swing.JFrame {

    private static final Logger LOG = LoggerFactory.getLogger("CVMostrarInformacion");

    private HashSet<CECliente> oHsData;
    private CICCambioCliente oCICliente;
    CECliente oCliente;
    CMCambiarCliemte oCMCategoria;

    public CVMostrarInformacion() {
        oCMCategoria = new CMCambiarCliemte();
        oCliente = new CECliente();

        initComponents();
        String[] aTitulo = {"O.Pedido", "Orden", "Cliente", "Importe P.", "Imp 18%", "Total P.", "Retenc 20%", "Retenc 30%", "Retenc 40%"};
        DefaultTableModel oModel = new DefaultTableModel(loadData(), aTitulo);

        tbl.setModel(oModel);

        this.setLocationRelativeTo(null);
    }

    private Object[][] loadData() {
        oCICliente = oCMCategoria;
        oHsData = oCICliente.consultAllClienteCIC();
        CLCliente oLogicalCategoria = new CLCliente();
        return oLogicalCategoria.convertHashSetArray(oHsData);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        txtOrden = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(47, 147, 136));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("IMPUESTOS");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 350, 50));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel3.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 80));

        txtOrden.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtOrden.setForeground(new java.awt.Color(102, 102, 102));
        txtOrden.setBorder(null);
        jPanel1.add(txtOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 140, 30));

        jSeparator8.setBackground(new java.awt.Color(24, 46, 74));
        jSeparator8.setForeground(new java.awt.Color(24, 46, 74));
        jSeparator8.setAlignmentX(1.5F);
        jSeparator8.setAlignmentY(1.5F);
        jSeparator8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSeparator8.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 140, 10));

        jLabel19.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Orden:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 90, 40));

        txtNombre.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 140, 30));

        jSeparator9.setBackground(new java.awt.Color(24, 46, 74));
        jSeparator9.setForeground(new java.awt.Color(24, 46, 74));
        jSeparator9.setAlignmentX(1.5F);
        jSeparator9.setAlignmentY(1.5F);
        jSeparator9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSeparator9.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 140, 10));

        jLabel20.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Nombre:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 90, 40));

        txtApellido.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(102, 102, 102));
        txtApellido.setBorder(null);
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 140, 30));

        jSeparator10.setBackground(new java.awt.Color(24, 46, 74));
        jSeparator10.setForeground(new java.awt.Color(24, 46, 74));
        jSeparator10.setAlignmentX(1.5F);
        jSeparator10.setAlignmentY(1.5F);
        jSeparator10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSeparator10.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 140, 10));

        jLabel21.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Apellido:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 90, 40));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 470, 170));

        jPanel5.setBackground(new java.awt.Color(47, 147, 136));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMostrar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(51, 51, 51));
        btnMostrar.setText("MOSTRAR");
        btnMostrar.setContentAreaFilled(false);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel5.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 120, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 120, 40));

        jPanel6.setBackground(new java.awt.Color(47, 147, 136));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(51, 51, 51));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setContentAreaFilled(false);
        jPanel6.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 5, 110, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        txtOrden.setText(tbl.getValueAt(tbl.getSelectedRow(), 0).toString());
        txtNombre.setText(tbl.getValueAt(tbl.getSelectedRow(), 1).toString());


    }//GEN-LAST:event_tblMouseClicked

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrarDatos();
    }//GEN-LAST:event_btnMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(CVMostrarInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CVMostrarInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CVMostrarInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CVMostrarInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CVMostrarInformacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOrden;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatos() {
        String[] aTitulo = {"O.Pedido", "Orden", "Cliente", "Importe P.", "Imp 18%", "Total P.", "Retenc 20%", "Retenc 30%", "Retenc 40%"};
        DefaultTableModel oModel = new DefaultTableModel(loadCondicion(), aTitulo);

        tbl.setModel(oModel);
    }

    private Object[][] loadCondicion() {
        oCICliente = oCMCategoria;
        oHsData = oCICliente.consultAllClienteCIC();
        CLCliente oLogicalCategoria = new CLCliente();

        return oLogicalCategoria.codicion(oHsData);

    }

}
