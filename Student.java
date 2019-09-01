package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Student extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    String str;
    public Student() throws SQLException {
        initComponents();
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","raj","neop");
        this.setLocationRelativeTo(null);
         this.getRootPane().setDefaultButton(b_l);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_l = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t_p = new javax.swing.JPasswordField();
        t_u = new javax.swing.JTextField();
        b_s = new javax.swing.JButton();
        b_fp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        b_l.setBackground(new java.awt.Color(255, 255, 255));
        b_l.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b_l.setText("LOGIN");
        b_l.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.white));
        b_l.setContentAreaFilled(false);
        b_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_lActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("PASSWORD");

        t_p.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        t_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_pActionPerformed(evt);
            }
        });

        t_u.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        b_s.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b_s.setText("SIGNUP");
        b_s.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.white));
        b_s.setContentAreaFilled(false);
        b_s.setFocusPainted(false);
        b_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sActionPerformed(evt);
            }
        });

        b_fp.setBackground(new java.awt.Color(255, 255, 255));
        b_fp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b_fp.setText("FORGOT PASSWORD?");
        b_fp.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.white));
        b_fp.setBorderPainted(false);
        b_fp.setContentAreaFilled(false);
        b_fp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_fpActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("STUDENT LOGIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_l, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_s))
                    .addComponent(t_u, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t_p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
                .addContainerGap(261, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_fp, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(307, 307, 307))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(342, 342, 342))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {t_p, t_u});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {b_l, b_s});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(t_u, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_l)
                    .addComponent(b_s))
                .addGap(36, 36, 36)
                .addComponent(b_fp, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {t_p, t_u});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {b_fp, b_l, b_s});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_fpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_fpActionPerformed
        JOptionPane.showMessageDialog(null,"Contact ADMIN");
    }//GEN-LAST:event_b_fpActionPerformed

    private void t_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_pActionPerformed

    private void b_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_lActionPerformed
        
        try {
            
            stmt=con.prepareStatement("select * from student_login where stud_username=?");
            stmt.setString(1,t_u.getText());
            rs=stmt.executeQuery();
            if(rs.next()){
            if(rs.getString(2).equals(t_p.getText()))
            {
                this.dispose();
                JOptionPane.showMessageDialog(null,"login sucessful");
                str=t_u.getText();
                System.out.println(str);
                 (new StudentLogin(str)).setVisible(true);
            }
                else{
                JOptionPane.showMessageDialog(null,"login failed");}
            }
            else
            {JOptionPane.showMessageDialog(null,"no data");}
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_b_lActionPerformed

        
    private void b_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_sActionPerformed
        try {
            (new StudentSignup()).setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b_sActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        (new HomePage()).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Student().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_fp;
    private javax.swing.JButton b_l;
    private javax.swing.JButton b_s;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField t_p;
    private javax.swing.JTextField t_u;
    // End of variables declaration//GEN-END:variables
}
