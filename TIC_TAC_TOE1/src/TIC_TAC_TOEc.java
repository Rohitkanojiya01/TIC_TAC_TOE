
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class TIC_TAC_TOEc extends javax.swing.JFrame {

    /**
     * Creates new form TIC_TAC_TOEc
     */
    private String turn ="O";
    private int xscore = 0 ;
    private int oscore = 0 ;
    private int count = 0 ;
    
    private void choosePlayer(String turn)
    {
        if(turn.equalsIgnoreCase("O"))
        {
            this.turn="X";
        }
        else
        {
            this.turn ="O";
        }
    }
    
    void setScore()
    {
        playerXmarks.setText(String.valueOf(xscore));
        playerOmarks.setText(String.valueOf(oscore));
    }
    private void reset()
    {
        
        btn1.setText("");
        btn1.setEnabled(true);
        btn2.setText("");
        btn2.setEnabled(true);
        btn3.setText("");
        btn3.setEnabled(true);
        btn4.setText("");
        btn4.setEnabled(true);
        btn5.setText("");
        btn5.setEnabled(true);
        btn6.setText("");
        btn6.setEnabled(true);
        btn7.setText("");
        btn7.setEnabled(true);
        btn8.setText("");
        btn8.setEnabled(true);
        btn9.setText("");
        btn9.setEnabled(true);
        
        btn1.setBackground(Color.lightGray);
        btn2.setBackground(Color.lightGray);
        btn3.setBackground(Color.lightGray);
        btn4.setBackground(Color.lightGray);
        btn5.setBackground(Color.lightGray);
        btn6.setBackground(Color.lightGray);
        btn7.setBackground(Color.lightGray);
        btn8.setBackground(Color.lightGray);
        btn9.setBackground(Color.lightGray);
        
       count = 0 ;
    }
    
    void pauseGame()
    {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }
    private void checkWinGame()   // called after entering every input to check is there any winning situation or not
    {
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
        count++;
        
        String win = "";
        
        if(turn.equalsIgnoreCase("X"))
            win = "PLAYER X WON";
        else
            win = "PLAYER O WON";
        
        if( b1 != "" && (b1.equals(b2)) && (b2.equals(b3))  )
        {
            if(turn.equalsIgnoreCase("X"))
            {
                win = "PLAYER X WON";
                xscore++;
            }
            else
            {
                win = "PLAYER O WON";
                oscore++;
            }
             
            pauseGame();
            
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            
            btn1.setBackground(Color.yellow);
            btn2.setBackground(Color.yellow);
            btn3.setBackground(Color.yellow);
            
            JOptionPane.showMessageDialog(this,win ,"TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if( b1 != "" &&  (b1.equals(b4)) && (b4.equals(b7)))
        {
            if(turn.equalsIgnoreCase("X"))
            {
                win = "PLAYER X WON";
                xscore++;
            }
            else
            {
                win = "PLAYER O WON";
                oscore++;
            }
               
            pauseGame();
            
            btn1.setEnabled(true);
            btn4.setEnabled(true);
            btn7.setEnabled(true);
            
            btn1.setBackground(Color.yellow);
            btn4.setBackground(Color.yellow);
            btn7.setBackground(Color.yellow);
            
            JOptionPane.showMessageDialog(this,win ,"TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
            
            
        }
        else if( b1 != "" &&  (b1.equals(b5)) && (b5.equals(b9)))
        {
            if(turn.equalsIgnoreCase("X"))
            {
                win = "PLAYER X WON";
                xscore++;
            }
            else
            {
                win = "PLAYER O WON";
                oscore++;
            }
            
            pauseGame();
            
            btn1.setEnabled(true);
            btn5.setEnabled(true);
            btn9.setEnabled(true);
        
            btn1.setBackground(Color.yellow);
            btn5.setBackground(Color.yellow);
            btn9.setBackground(Color.yellow);
            
            JOptionPane.showMessageDialog(this,win ,"TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
            
            
        }
        else if( b2 != "" &&  (b2.equals(b5)) && (b5.equals(b8)))
        {
            if(turn.equalsIgnoreCase("X"))
            {
                win = "PLAYER X WON";
                xscore++;
            }
            else
            {
                win = "PLAYER O WON";
                oscore++;
            }
            pauseGame();
            
            btn2.setEnabled(true);
            btn5.setEnabled(true);
            btn8.setEnabled(true);
        
            btn2.setBackground(Color.yellow);
            btn5.setBackground(Color.yellow);
            btn8.setBackground(Color.yellow);
            
            JOptionPane.showMessageDialog(this,win ,"TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if( b3 != "" &&  (b3.equals(b6)) && (b6.equals(b9)) )
        {
            if(turn.equalsIgnoreCase("X"))
            {
                win = "PLAYER X WON";
                xscore++;
            }
            else
            {
                win = "PLAYER O WON";
                oscore++;
            }
            pauseGame();
            
            
            btn3.setEnabled(true);
            btn6.setEnabled(true);
            btn9.setEnabled(true);
            
            btn3.setBackground(Color.yellow);
            btn6.setBackground(Color.yellow);
            btn9.setBackground(Color.yellow);
            
            JOptionPane.showMessageDialog(this,win ,"TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if( b3 != "" &&  (b3.equals(b5)) && (b5.equals(b7)) )
        {
            if(turn.equalsIgnoreCase("X"))
            {
                win = "PLAYER X WON";
                xscore++;
            }
            else
            {
                win = "PLAYER O WON";
                oscore++;
            }
            
            pauseGame();
            
            btn3.setEnabled(true);
            btn5.setEnabled(true);
            btn7.setEnabled(true);
            
            btn3.setBackground(Color.yellow);
            btn5.setBackground(Color.yellow);
            btn7.setBackground(Color.yellow);
            
            JOptionPane.showMessageDialog(this,win ,"TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if( b4 != "" &&  (b4.equals(b5)) && (b5.equals(b6)))
        {
            if(turn.equalsIgnoreCase("X"))
            {
                win = "PLAYER X WON";
                xscore++;
            }
            else
            {
                win = "PLAYER O WON";
                oscore++;
            }
            pauseGame();
            
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            
            btn4.setBackground(Color.yellow);
            btn5.setBackground(Color.yellow);
            btn6.setBackground(Color.yellow);
            
            JOptionPane.showMessageDialog(this,win ,"TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if( b7 != "" &&  (b7.equals(b8)) && (b8.equals(b9)))
        {
            if(turn.equalsIgnoreCase("X"))
            {
                win = "PLAYER X WON";
                xscore++;
            }
            else
            {
                win = "PLAYER O WON";
                oscore++;
            }
            pauseGame();
            
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
        
            btn7.setBackground(Color.yellow);
            btn8.setBackground(Color.yellow);
            btn9.setBackground(Color.yellow);
            
            JOptionPane.showMessageDialog(this,win ,"TIC TAC TOE" ,JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if(count==9)
        {
            JOptionPane.showMessageDialog(this , "DRAW" , "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        setScore();
        
    }
    
    public TIC_TAC_TOEc() {
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        playerX = new javax.swing.JLabel();
        playerXmarks = new javax.swing.JLabel();
        playerO = new javax.swing.JLabel();
        playerOmarks = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setLocation(new java.awt.Point(10, 10));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn1.setAlignmentY(100.0F);
        btn1.setMaximumSize(new java.awt.Dimension(100, 7));
        btn1.setMinimumSize(new java.awt.Dimension(100, 7));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 153, 0));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitbtn.setText("EXIT");
        exitbtn.setPreferredSize(new java.awt.Dimension(135, 55));
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn3.setAlignmentY(100.0F);
        btn3.setMaximumSize(new java.awt.Dimension(100, 7));
        btn3.setMinimumSize(new java.awt.Dimension(100, 7));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn2.setAlignmentY(100.0F);
        btn2.setMaximumSize(new java.awt.Dimension(100, 7));
        btn2.setMinimumSize(new java.awt.Dimension(100, 7));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn6.setAlignmentY(100.0F);
        btn6.setMaximumSize(new java.awt.Dimension(100, 7));
        btn6.setMinimumSize(new java.awt.Dimension(100, 7));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn5.setAlignmentY(100.0F);
        btn5.setMaximumSize(new java.awt.Dimension(100, 7));
        btn5.setMinimumSize(new java.awt.Dimension(100, 7));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn4.setAlignmentY(100.0F);
        btn4.setMaximumSize(new java.awt.Dimension(100, 7));
        btn4.setMinimumSize(new java.awt.Dimension(100, 7));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn9.setAlignmentY(100.0F);
        btn9.setMaximumSize(new java.awt.Dimension(100, 7));
        btn9.setMinimumSize(new java.awt.Dimension(100, 7));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn8.setAlignmentY(100.0F);
        btn8.setMaximumSize(new java.awt.Dimension(100, 7));
        btn8.setMinimumSize(new java.awt.Dimension(100, 7));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn7.setAlignmentY(100.0F);
        btn7.setMaximumSize(new java.awt.Dimension(100, 7));
        btn7.setMinimumSize(new java.awt.Dimension(100, 7));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(0, 204, 255));
        resetbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, new java.awt.Color(255, 255, 255)));

        playerX.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerX.setText("Player X  : ");

        playerXmarks.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerXmarks.setForeground(new java.awt.Color(0, 153, 255));
        playerXmarks.setText("---");

        playerO.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerO.setText("Player O  : ");

        playerOmarks.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerOmarks.setForeground(new java.awt.Color(0, 153, 255));
        playerOmarks.setText("---");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerO)
                    .addComponent(playerX, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerOmarks)
                    .addComponent(playerXmarks))
                .addGap(56, 56, 56))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerXmarks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerO, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerOmarks))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        
        btn1.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            btn1.setForeground(Color.red);
        }
        else
        {
            btn1.setForeground(Color.magenta);
        }
        
        btn1.setEnabled(false);
        checkWinGame();
        choosePlayer(turn);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        btn3.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            btn3.setForeground(Color.red);
        }
        else
        {
            btn3.setForeground(Color.magenta);
        }
        
        
        btn3.setEnabled(false);
        checkWinGame();
        choosePlayer(turn);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        btn2.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            btn2.setForeground(Color.red);
        }
        else
        {
            btn2.setForeground(Color.magenta);
        }
        
        btn2.setEnabled(false);
        checkWinGame();
        choosePlayer(turn);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        btn6.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            btn6.setForeground(Color.red);
        }
        else
        {
            btn6.setForeground(Color.magenta);
        }
        
        btn6.setEnabled(false);
        checkWinGame();
        choosePlayer(turn);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        btn5.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            btn5.setForeground(Color.red);
        }
        else
        {
            btn5.setForeground(Color.magenta);
        }
        
        btn5.setEnabled(false);
        checkWinGame();
        choosePlayer(turn);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        btn4.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            btn4.setForeground(Color.red);
        }
        else
        {
            btn4.setForeground(Color.magenta);
        }
        
        btn4.setEnabled(false);
        checkWinGame();
        choosePlayer(turn);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        btn9.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            btn9.setForeground(Color.red);
        }
        else
        {
            btn9.setForeground(Color.magenta);
        }
        
        btn9.setEnabled(false);
        checkWinGame();
        choosePlayer(turn);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        btn8.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            btn8.setForeground(Color.red);
        }
        else
        {
            btn8.setForeground(Color.magenta);
        }
        
        btn8.setEnabled(false);
        checkWinGame();
        choosePlayer(turn);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        btn7.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            btn7.setForeground(Color.red);
        }
        else
        {
            btn7.setForeground(Color.magenta);
        }
        
        btn7.setEnabled(false);
        checkWinGame();
        choosePlayer(turn);
    }//GEN-LAST:event_btn7ActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("EXIT");
        
        
        if(JOptionPane.showConfirmDialog( frame , "confirm if you want to exit" , " TIC TAC TOE" , JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitbtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // setting values to null and enabled button to get a new input
        reset();
        
    }//GEN-LAST:event_resetbtnActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new TIC_TAC_TOEc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel playerO;
    private javax.swing.JLabel playerOmarks;
    private javax.swing.JLabel playerX;
    private javax.swing.JLabel playerXmarks;
    private javax.swing.JButton resetbtn;
    // End of variables declaration//GEN-END:variables
}
