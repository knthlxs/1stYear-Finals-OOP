package Frames;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Kenth Alexis Osila
 */
public class WinnerP2JFrame extends javax.swing.JFrame {

    /**
     * Creates new form CongratulationsP2
     */
    public WinnerP2JFrame() {
        initComponents();
        rescaleImages();
         // Set the frame icon
        ImageIcon img = new ImageIcon("C:\\Users\\aisa\\Documents\\NetBeansProjects\\Mathema-TicTacToe\\src\\Images\\gameLogo.png");
        this.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBg = new javax.swing.JPanel();
        lblFontCongratulations = new javax.swing.JLabel();
        btnPlayAgain = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblTrophy = new javax.swing.JLabel();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MATHEMA-TICTACTOE");
        setMinimumSize(new java.awt.Dimension(1366, 768));

        panelBg.setMaximumSize(new java.awt.Dimension(1366, 768));
        panelBg.setMinimumSize(new java.awt.Dimension(1366, 768));
        panelBg.setPreferredSize(new java.awt.Dimension(1366, 768));
        panelBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFontCongratulations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFontCongratulations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FontCongratulationsP2.png"))); // NOI18N
        panelBg.add(lblFontCongratulations, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 650, 240));

        btnPlayAgain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnPlayAgain.png"))); // NOI18N
        btnPlayAgain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayAgainActionPerformed(evt);
            }
        });
        panelBg.add(btnPlayAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 220, 80));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnExit.png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        panelBg.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 630, 220, 80));

        lblTrophy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrophy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Trophy.png"))); // NOI18N
        lblTrophy.setMaximumSize(new java.awt.Dimension(1000, 1000));
        lblTrophy.setMinimumSize(new java.awt.Dimension(1000, 1000));
        lblTrophy.setPreferredSize(new java.awt.Dimension(1000, 1000));
        panelBg.add(lblTrophy, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -80, 1000, 1000));

        lblBg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg1.png"))); // NOI18N
        lblBg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelBg.add(lblBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method rescale all the images that have been used in the frame.
     */
    public void rescaleImages() {
        // Rescale background image
        Icon iBg = lblBg.getIcon();
        ImageIcon imgBg = (ImageIcon) iBg;
        Image imageBg = imgBg.getImage().getScaledInstance(lblBg.getWidth(), lblBg.getHeight(), Image.SCALE_SMOOTH);
        lblBg.setIcon(new ImageIcon(imageBg));

        // Rescale trophy image
        Icon iTrophy = lblTrophy.getIcon();
        ImageIcon imgTrophy = (ImageIcon) iTrophy;
        Image imageTrophy = imgTrophy.getImage().getScaledInstance(lblTrophy.getWidth(), lblTrophy.getHeight(), Image.SCALE_SMOOTH);
        lblTrophy.setIcon(new ImageIcon(imageTrophy));

        // Rescale play again button
        Icon iPlayAgain = btnPlayAgain.getIcon();
        ImageIcon imgPlayAgain = (ImageIcon) iPlayAgain;
        Image imagePlayAgain = imgPlayAgain.getImage().getScaledInstance(btnPlayAgain.getWidth(), btnPlayAgain.getHeight(), Image.SCALE_SMOOTH);
        btnPlayAgain.setIcon(new ImageIcon(imagePlayAgain));

        // Rescale exit button
        Icon iBtnExit = btnExit.getIcon();
        ImageIcon imgBtnExit = (ImageIcon) iBtnExit;
        Image imageBtnExit = imgBtnExit.getImage().getScaledInstance(btnExit.getWidth(), btnExit.getHeight(), Image.SCALE_SMOOTH);
        btnExit.setIcon(new ImageIcon(imageBtnExit));
    }

    /**
     * This method will make the players go back to the first frame (MainJFrame)
     *
     * @param evt - action event
     */
    private void btnPlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayAgainActionPerformed
        MainJFrame mainJFrame = new MainJFrame();
        mainJFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPlayAgainActionPerformed

    /**
     * This method show a confirm dialog if the players want to exit the game. 
     * @param evt - action event
     */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "CONFIRM EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(WinnerP2JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinnerP2JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinnerP2JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinnerP2JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinnerP2JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPlayAgain;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblFontCongratulations;
    private javax.swing.JLabel lblTrophy;
    private javax.swing.JPanel panelBg;
    // End of variables declaration//GEN-END:variables
}
