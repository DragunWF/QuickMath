package dragunwf.quickmath.ui;

import dragunwf.quickmath.scripts.WindowManager;
import dragunwf.quickmath.scripts.Data;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RetryMenuUI extends javax.swing.JFrame {
    public RetryMenuUI() {
        initComponents();
        onReady();
    }

    private void onReady() {
        ScoreLabel.setText(String.format("Score: %s", Data.getSavedScore()));
        HighScoreLabel.setText(String.format("High Score: %s", Data.getHighScore()));
        PromptLabel.setText(
                !Data.isNewHighScore() ? "Try again?" : "New high score! Try again?");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        ScoreLabel = new javax.swing.JLabel();
        HighScoreLabel = new javax.swing.JLabel();
        PromptLabel = new javax.swing.JLabel();
        RetryButton = new javax.swing.JButton();
        MainMenuButton = new javax.swing.JButton();
        QuitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(555, 405));

        MainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TitleLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Gameover");

        ScoreLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ScoreLabel.setText("Score: 0");

        HighScoreLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        HighScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HighScoreLabel.setText("High Score: 0");

        PromptLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PromptLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PromptLabel.setText("Try again?");

        RetryButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RetryButton.setText("Retry");
        RetryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetryButtonMouseClicked(evt);
            }
        });

        MainMenuButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MainMenuButton.setText("Main Menu");
        MainMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainMenuButtonMouseClicked(evt);
            }
        });

        QuitButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        QuitButton.setText("Quit");
        QuitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ScoreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HighScoreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PromptLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(QuitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RetryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScoreLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HighScoreLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PromptLabel)
                .addGap(18, 18, 18)
                .addComponent(RetryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QuitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuitButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_QuitButtonMouseClicked
        System.exit(0);
    }// GEN-LAST:event_QuitButtonMouseClicked

    private void MainMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_MainMenuButtonMouseClicked
        try {
            WindowManager.openMainMenu();
            super.dispose();
        } catch (Exception ex) {
            Logger.getLogger(RetryMenuUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_MainMenuButtonMouseClicked

    private void RetryButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_RetryButtonMouseClicked
        try {
            Data.onNewGame();
            WindowManager.openGame();
            super.dispose();
        } catch (Exception ex) {
            Logger.getLogger(RetryMenuUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_RetryButtonMouseClicked

    public void start() {
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RetryMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetryMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetryMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetryMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetryMenuUI().setVisible(true);
            }
        });

        /* onReady (Custom) */
        onReady();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HighScoreLabel;
    private javax.swing.JButton MainMenuButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel PromptLabel;
    private javax.swing.JButton QuitButton;
    private javax.swing.JButton RetryButton;
    private javax.swing.JLabel ScoreLabel;
    private javax.swing.JLabel TitleLabel;
    // End of variables declaration//GEN-END:variables
}
