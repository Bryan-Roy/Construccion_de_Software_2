/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana07.teorico;

import java.util.ArrayList;

/**
 *
 * @author BRYANROY
 */
public class ejercicio04 extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio04
     */
    ArrayList<Integer> listanum;
    public ejercicio04() {
        initComponents();
        listanum=new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        btngrabar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txainicial = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txavectorfinal = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtelementos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingresar Numero:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 14, -1, -1));

        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });
        getContentPane().add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 11, 137, -1));

        btngrabar.setText("Grabar");
        btngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarActionPerformed(evt);
            }
        });
        getContentPane().add(btngrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 49, -1, -1));

        btnmostrar.setText("Mostrar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 49, -1, -1));

        txainicial.setColumns(20);
        txainicial.setRows(5);
        jScrollPane1.setViewportView(txainicial);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 104, 158, 114));

        txavectorfinal.setColumns(20);
        txavectorfinal.setRows(5);
        jScrollPane2.setViewportView(txavectorfinal);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 104, 155, 114));

        jLabel2.setText("Elementos sin cambiar ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 254, -1, -1));

        txtelementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtelementosActionPerformed(evt);
            }
        });
        getContentPane().add(txtelementos, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 251, 80, -1));

        jLabel3.setText("Vector Inicial");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 84, -1, -1));

        jLabel4.setText("Vector Final");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 84, -1, -1));

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 49, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtelementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtelementosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtelementosActionPerformed

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
        // TODO add your handling code here:
        int n=Integer.parseInt(txtnumero.getText());
        for(int i=0; i<n ;i++){
            listanum.add(aleatorio(1,30));
        }
        txainicial.setText(mostrarlista(listanum));
    }//GEN-LAST:event_btngrabarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        // TODO add your handling code here:
        int contador=0;
        ArrayList<Integer> listanueva=new ArrayList<>();
        for(Integer i:listanum){
            if(i<=10){
                listanueva.add(0);
                contador++;
            }else if(i>=20){
                listanueva.add(1);
                contador++;
            }else{
                listanueva.add(i);
            }
        }
        txavectorfinal.setText(mostrarlista(listanueva));
        txtelementos.setText(String.valueOf(contador));
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio04().setVisible(true);
            }
        });
    }
    int aleatorio(int max, int min){
        return (int)((max-min+1)*Math.random()+min);
    }
    String mostrarlista(ArrayList<Integer> list){
        String cad="";
        for(Integer i:list){
            cad+=i+"\n";
        }
        return cad;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngrabar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txainicial;
    private javax.swing.JTextArea txavectorfinal;
    private javax.swing.JTextField txtelementos;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtnumero.setText("");
        txtelementos.setText("");
        txavectorfinal.setText("");
        txainicial.setText("");
    }
}
