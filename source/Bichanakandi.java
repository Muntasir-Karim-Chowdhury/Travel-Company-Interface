
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fed
 */
public class Bichanakandi extends javax.swing.JFrame {

    /**
     * Creates new form Bichanakandi
     */
    public Bichanakandi() {
        initComponents();
    }
     public void close(){

        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

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
        JbtnExit = new javax.swing.JButton();
        JbtnNext = new javax.swing.JButton();
        JbtnPrev = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bichanakandi.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        JbtnExit.setText("Back");
        JbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnExitActionPerformed(evt);
            }
        });

        JbtnNext.setText("Next");
        JbtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnNextActionPerformed(evt);
            }
        });

        JbtnPrev.setText("Previous");
        JbtnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnPrevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JbtnExit)
                .addGap(73, 73, 73)
                .addComponent(JbtnPrev)
                .addGap(70, 70, 70)
                .addComponent(JbtnNext)
                .addGap(42, 42, 42))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1245, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbtnNext)
                    .addComponent(JbtnPrev)
                    .addComponent(JbtnExit))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1263, 787));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnExitActionPerformed
        // TODO add your handling code here:
        this.hide();
        UserOptions s = new UserOptions();
        s.setVisible(true);
    }//GEN-LAST:event_JbtnExitActionPerformed

    private void JbtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnNextActionPerformed
        // TODO add your handling code here:
        this.hide();
        StMartin s = new StMartin();
        s.setVisible(true);
    }//GEN-LAST:event_JbtnNextActionPerformed

    private void JbtnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnPrevActionPerformed
        // TODO add your handling code here:
        this.hide();
        CoxsBazar x  = new CoxsBazar();
        x.setVisible(true);
    }//GEN-LAST:event_JbtnPrevActionPerformed

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
            java.util.logging.Logger.getLogger(Bichanakandi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bichanakandi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bichanakandi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bichanakandi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bichanakandi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnExit;
    private javax.swing.JButton JbtnNext;
    private javax.swing.JButton JbtnPrev;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
