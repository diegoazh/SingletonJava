/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import practicaventanas.Municipalidad;


/**
 *
 * @author AdminFull
 */
public class FrmReporteMultas extends javax.swing.JDialog {
    
    private Municipalidad muni;

    /**
     * Creates new form FrmReporteMultas
     */
    public FrmReporteMultas(java.awt.Frame parent, boolean modal, Municipalidad municipalidad) {
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

        jPanel1 = new javax.swing.JPanel();
        lbl_infPorTipo = new javax.swing.JLabel();
        lbl_totalRecaudado = new javax.swing.JLabel();
        lbl_porcentajeTipo2 = new javax.swing.JLabel();
        lbl_infractorMultaMasElevada = new javax.swing.JLabel();
        lbl_tipo1 = new javax.swing.JLabel();
        lbl_resulTotalRecaudado = new javax.swing.JLabel();
        lbl_resulPorcentaje = new javax.swing.JLabel();
        lbl_resulInfractor = new javax.swing.JLabel();
        lbl_tipo2 = new javax.swing.JLabel();
        lbl_tipo3 = new javax.swing.JLabel();
        lbl_resultTipo1 = new javax.swing.JLabel();
        lbl_resulTipo2 = new javax.swing.JLabel();
        lbl_resulTipo3 = new javax.swing.JLabel();
        btn_cerarReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte de Multas");

        lbl_infPorTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_infPorTipo.setText("Infracciones por tipo");

        lbl_totalRecaudado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_totalRecaudado.setText("Total Recaudado");

        lbl_porcentajeTipo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_porcentajeTipo2.setText("Porcentaje multas tipo 2");

        lbl_infractorMultaMasElevada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_infractorMultaMasElevada.setText("Infractor multa más elevada");

        lbl_tipo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_tipo1.setText("Adelantamiento indebido");

        lbl_resulTotalRecaudado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_resulTotalRecaudado.setText("...");

        lbl_resulPorcentaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_resulPorcentaje.setText("...");

        lbl_resulInfractor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_resulInfractor.setText("...");

        lbl_tipo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_tipo2.setText("Consumo de alcohol");

        lbl_tipo3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_tipo3.setText("Luces apagadas");

        lbl_resultTipo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_resultTipo1.setText("...");

        lbl_resulTipo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_resulTipo2.setText("...");

        lbl_resulTipo3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_resulTipo3.setText("...");

        btn_cerarReporte.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_infPorTipo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_infractorMultaMasElevada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_resulInfractor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_totalRecaudado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_resulTotalRecaudado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_porcentajeTipo2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_tipo3)
                                    .addComponent(lbl_tipo2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lbl_tipo1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_resulPorcentaje, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_resultTipo1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_resulTipo2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_resulTipo3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_cerarReporte)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_infPorTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipo1)
                    .addComponent(lbl_resultTipo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipo2)
                    .addComponent(lbl_resulTipo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipo3)
                    .addComponent(lbl_resulTipo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_totalRecaudado)
                    .addComponent(lbl_resulTotalRecaudado))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_porcentajeTipo2)
                    .addComponent(lbl_resulPorcentaje))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_infractorMultaMasElevada)
                    .addComponent(lbl_resulInfractor))
                .addGap(18, 18, 18)
                .addComponent(btn_cerarReporte))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton btn_cerarReporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_infPorTipo;
    private javax.swing.JLabel lbl_infractorMultaMasElevada;
    private javax.swing.JLabel lbl_porcentajeTipo2;
    private javax.swing.JLabel lbl_resulInfractor;
    private javax.swing.JLabel lbl_resulPorcentaje;
    private javax.swing.JLabel lbl_resulTipo2;
    private javax.swing.JLabel lbl_resulTipo3;
    private javax.swing.JLabel lbl_resulTotalRecaudado;
    private javax.swing.JLabel lbl_resultTipo1;
    private javax.swing.JLabel lbl_tipo1;
    private javax.swing.JLabel lbl_tipo2;
    private javax.swing.JLabel lbl_tipo3;
    private javax.swing.JLabel lbl_totalRecaudado;
    // End of variables declaration//GEN-END:variables
}