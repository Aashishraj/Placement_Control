package Student;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HomePage extends javax.swing.JFrame {
    
    public HomePage() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(Color.white);
        this.setForeground(Color.white);
        //ImageIcon img=new ImageIcon(new ImageIcon(""+f).getImage().getScaledInstance(pic.getWidth(),pic.getHeight(),Image.SCALE_DEFAULT));
        //ImageIcon img=new ImageIcon(new ImageIcon("D:\\img_sl.jpg").getImage().getScaledInstance(b_sl.getWidth(),b_sl.getHeight(),Image.SCALE_DEFAULT )); 
        //b_sl.setIcon(img);
        //validate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        b_co = new javax.swing.JButton();
        b_sl = new javax.swing.JButton();
        b_ad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("PLACEMENT CONTROL");

        b_co.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b_co.setForeground(new java.awt.Color(102, 102, 102));
        b_co.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Student/coo.jpg"))); // NOI18N
        b_co.setText("          COORDINATOR LOGIN");
        b_co.setBorderPainted(false);
        b_co.setContentAreaFilled(false);
        b_co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_coActionPerformed(evt);
            }
        });

        b_sl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b_sl.setForeground(new java.awt.Color(102, 102, 102));
        b_sl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Student/studentLogin2 (2).jpg"))); // NOI18N
        b_sl.setText("STUDENT LOGIN");
        b_sl.setBorderPainted(false);
        b_sl.setContentAreaFilled(false);
        b_sl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_slActionPerformed(evt);
            }
        });

        b_ad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b_ad.setForeground(new java.awt.Color(102, 102, 102));
        b_ad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Student/admin1 (2).jpg"))); // NOI18N
        b_ad.setText("ADMIN LOGIN");
        b_ad.setBorderPainted(false);
        b_ad.setContentAreaFilled(false);
        b_ad.setOpaque(true);
        b_ad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_adMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_adMouseExited(evt);
            }
        });
        b_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_adActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(b_co, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b_sl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b_ad, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(b_co, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b_sl, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_sl, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(b_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(b_co, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 246, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_adActionPerformed
        //this.dispose();
        try {
            this.dispose();
            (new Admin()).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b_adActionPerformed

    private void b_slActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_slActionPerformed
        try {
            //this.dispose();
            (new Student()).setVisible(true);
            this.dispose();
        
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b_slActionPerformed

    private void b_coActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_coActionPerformed
       // this.dispose();
        try {
            this.dispose();
            (new Coordinator()).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_b_coActionPerformed

    private void b_adMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_adMouseEntered
        b_ad.setBackground(Color.red);
    }//GEN-LAST:event_b_adMouseEntered

    private void b_adMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_adMouseExited
       b_ad.setBackground(Color.white);
    }//GEN-LAST:event_b_adMouseExited
 public static void main(String args[]) {
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_ad;
    private javax.swing.JButton b_co;
    private javax.swing.JButton b_sl;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
