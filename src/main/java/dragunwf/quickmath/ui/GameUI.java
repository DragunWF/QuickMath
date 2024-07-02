package dragunwf.quickmath.ui;

import dragunwf.quickmath.scripts.Game;
import dragunwf.quickmath.scripts.WindowManager;
import dragunwf.quickmath.scripts.Data;
import dragunwf.quickmath.scripts.Utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

public class GameUI extends javax.swing.JFrame {
    private final ActionListener gameEndListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                endGame();
                WindowManager.openRetryMenu();
                gameEndTimer.stop();
            } catch (Exception ex) {
                Logger.getLogger(GameUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
    private final ActionListener nextQuestionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            createQuestion();
            nextQuestionTimer.stop();
        }
    };
    private final ActionListener timeListener = new ActionListener() {
        int secondsLeft = Game.BASE_TIME;

        @Override
        public void actionPerformed(ActionEvent ae) {
            secondsLeft--;
            updateTimeLabel(secondsLeft);
            if (secondsLeft <= 0) {
                submissionEnabled = false;
                MathLabel.setText("Time's up!");
                gameEndTimer.start();
                timer.stop();
            }
        };
    };

    private Timer nextQuestionTimer = new Timer(750, nextQuestionListener);
    private Timer gameEndTimer = new Timer(3000, gameEndListener);
    private Timer timer = new Timer(1000, timeListener);

    private int score = 0;
    private boolean submissionEnabled = true;

    public GameUI() {
        initComponents();
        updateTimeLabel(Game.BASE_TIME);
        createQuestion();
    }

    private void createQuestion() {
        Game.randomizeEquation();
        try {
            MathLabel.setText(Game.getEquationText());
        } catch (Exception ex) {
            Logger.getLogger(GameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        timer.start();
    }

    private void updateTimeLabel(int seconds) {
        TimeLabel.setText(
                String.format("Time Left: %s", seconds));
    }
    
    private void submitAnswer() {
        String playerInput = AnswerTextField.getText();
        if (submissionEnabled && playerInput.length() > 0) {
            if (Utils.validateSubmission(playerInput)) {
                int answer = Integer.parseInt(playerInput);
                try {
                    if (answer == Game.getCorrectAnswer()) {
                        onCorrectAnswer();
                    } else {
                        onWrongAnswer();
                    }
                } catch (Exception ex) {
                    Logger.getLogger(GameUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                onWrongAnswer();
            }
            nextQuestionTimer.start();
            AnswerTextField.setText("");
        }
    }

    private void onCorrectAnswer() {
        score += 10;
        updateScoreText();
        MathLabel.setText("Correct!");
    }

    private void onWrongAnswer() {
        score -= 10;
        updateScoreText();
        try {
            MathLabel.setText(
                    String.format(
                            "Wrong! Correct answer was %s!", Game.getCorrectAnswer()));
        } catch (Exception ex) {
            Logger.getLogger(GameUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void updateScoreText() {
        ScoreLabel.setText(
                String.format("Score: %s", score));
    }

    private void endGame() {
        Data.saveScore(score);
        super.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GamePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        MathLabel = new javax.swing.JLabel();
        AnswerTextField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        TimeLabel = new javax.swing.JLabel();
        ScoreLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GamePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TitleLabel.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Solve this equation");
        TitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        MathLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MathLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MathLabel.setText("92 + 32");

        AnswerTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        AnswerTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AnswerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerTextFieldActionPerformed(evt);
            }
        });

        SubmitButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitButtonMouseClicked(evt);
            }
        });

        TimeLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeLabel.setText("Time Left: 30");
        TimeLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ScoreLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ScoreLabel.setText("Score: 0");

        javax.swing.GroupLayout GamePanelLayout = new javax.swing.GroupLayout(GamePanel);
        GamePanel.setLayout(GamePanelLayout);
        GamePanelLayout.setHorizontalGroup(
            GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
            .addComponent(MathLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AnswerTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(SubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GamePanelLayout.setVerticalGroup(
            GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AnswerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(ScoreLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GamePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(GamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnswerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerTextFieldActionPerformed
        submitAnswer();
    }//GEN-LAST:event_AnswerTextFieldActionPerformed

    private void SubmitButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_SubmitButtonMouseClicked
        submitAnswer();
    }// GEN-LAST:event_SubmitButtonMouseClicked

    public void start() {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnswerTextField;
    private javax.swing.JPanel GamePanel;
    private javax.swing.JLabel MathLabel;
    private javax.swing.JLabel ScoreLabel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JLabel TitleLabel;
    // End of variables declaration//GEN-END:variables
}
