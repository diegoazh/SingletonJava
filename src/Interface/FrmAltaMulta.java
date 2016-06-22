/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import practicaventanas.Municipalidad;
import practicaventanas.Validaciones;
import practicaventanas.Multa;

/**
 *
 * @author AdminFull
 */
public class FrmAltaMulta extends javax.swing.JDialog {
    
    private Municipalidad muni;

    /**
     * Creates new form FrmAltaMulta
     */
    public FrmAltaMulta(java.awt.Frame parent, boolean modal, Municipalidad municipalidad) {
        super(parent, modal);
        this.muni = municipalidad;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_altaMultas = new javax.swing.JPanel();
        lbl_dominio = new javax.swing.JLabel();
        lbl_titular = new javax.swing.JLabel();
        lbl_tipoInfraccion = new javax.swing.JLabel();
        lbl_importe = new javax.swing.JLabel();
        txt_dominio = new javax.swing.JTextField();
        txt_importe = new javax.swing.JTextField();
        txt_titular = new javax.swing.JTextField();
        cbo_tipoInfraccion = new javax.swing.JComboBox<>();
        btn_cargarMulta = new javax.swing.JButton();
        btn_cerrarAltaMulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta de Multas");

        lbl_dominio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_dominio.setText("Dominio");

        lbl_titular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_titular.setText("Titular");

        lbl_tipoInfraccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_tipoInfraccion.setText("Tipo de Infracción");

        lbl_importe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_importe.setText("Importe");

        cbo_tipoInfraccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo", "Adelantamiento indebido", "Consumo de alcohol", "Luces apagadas" }));

        btn_cargarMulta.setText("Cargar");
        btn_cargarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarMultaActionPerformed(evt);
            }
        });

        btn_cerrarAltaMulta.setText("Salir");
        btn_cerrarAltaMulta.setToolTipText("");

        javax.swing.GroupLayout panel_altaMultasLayout = new javax.swing.GroupLayout(panel_altaMultas);
        panel_altaMultas.setLayout(panel_altaMultasLayout);
        panel_altaMultasLayout.setHorizontalGroup(
            panel_altaMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_altaMultasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_altaMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_altaMultasLayout.createSequentialGroup()
                        .addComponent(lbl_dominio)
                        .addGap(77, 77, 77)
                        .addComponent(txt_dominio))
                    .addGroup(panel_altaMultasLayout.createSequentialGroup()
                        .addComponent(lbl_tipoInfraccion)
                        .addGap(18, 18, 18)
                        .addComponent(cbo_tipoInfraccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_altaMultasLayout.createSequentialGroup()
                        .addComponent(lbl_importe)
                        .addGap(78, 78, 78)
                        .addComponent(txt_importe, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                    .addGroup(panel_altaMultasLayout.createSequentialGroup()
                        .addComponent(lbl_titular)
                        .addGap(90, 90, 90)
                        .addComponent(txt_titular, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_altaMultasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_cerrarAltaMulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cargarMulta)))
                .addContainerGap())
        );
        panel_altaMultasLayout.setVerticalGroup(
            panel_altaMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_altaMultasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_altaMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dominio)
                    .addComponent(txt_dominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panel_altaMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_titular)
                    .addComponent(txt_titular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_altaMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipoInfraccion)
                    .addComponent(cbo_tipoInfraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_altaMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_importe)
                    .addComponent(txt_importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panel_altaMultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cargarMulta)
                    .addComponent(btn_cerrarAltaMulta)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_altaMultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_altaMultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cargarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarMultaActionPerformed
        double importe = 0;
        String dominio = txt_dominio.getText();
        String titular = txt_titular.getText();
        String monto = txt_importe.getText();
        int tipo = cbo_tipoInfraccion.getSelectedIndex();
        if (Validaciones.isDouble(monto)) {
            importe = Double.parseDouble(monto);
        }
        
        Multa mult = new Multa(dominio, titular, tipo, importe);
        this.muni.agregarMulta(mult);
    }//GEN-LAST:event_btn_cargarMultaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cargarMulta;
    private javax.swing.JButton btn_cerrarAltaMulta;
    private javax.swing.JComboBox<String> cbo_tipoInfraccion;
    private javax.swing.JLabel lbl_dominio;
    private javax.swing.JLabel lbl_importe;
    private javax.swing.JLabel lbl_tipoInfraccion;
    private javax.swing.JLabel lbl_titular;
    private javax.swing.JPanel panel_altaMultas;
    private javax.swing.JTextField txt_dominio;
    private javax.swing.JTextField txt_importe;
    private javax.swing.JTextField txt_titular;
    // End of variables declaration//GEN-END:variables
}
