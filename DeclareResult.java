package Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import practice.JTable;

public class DeclareResult extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt,stm,st;
    ResultSet rs,rs1;
    DefaultTableModel model;
    String stri;
    int i=0,r;
    public DeclareResult(String str) throws SQLException {
        initComponents();
        con=ConDb.conLink();
        model =(DefaultTableModel)tb_1.getModel();
        stri=str;
        this.setLocationRelativeTo(null);
         try {
              stmt=con.prepareStatement("select stud_username,job_name from placement where com_name=? ");
             stmt.setString(1,stri);
              rs=stmt.executeQuery();
          while(rs.next()){
               
                 stm=con.prepareStatement("select stud_cgpa from student_details where stud_username=? ");
               
                 stm.setString(1,rs.getString(1));
            rs1=stm.executeQuery();
             rs1.next();
            model.addRow(new Object[]{rs.getString(1),rs1.getString(1),rs.getString(2),""});
            }
            
            
               } catch (SQLException ex) {
            Logger.getLogger(JTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("COORDINATOR");

        tb_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "CGPA", "JOB", "RESULT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_1);

        jLabel2.setText("jLabel2");

        jLabel3.setText("STUDENTS PLACED");

        jButton1.setText("UPDATE RESULT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(65, 65, 65))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            model=(DefaultTableModel)tb_1.getModel();
            System.out.println(model.getValueAt(i,3).toString());
            stmt=con.prepareStatement("select stud_username,job_name from placement where com_name=?");
            stmt.setString(1,stri);
            rs=stmt.executeQuery();
            
            while(rs.next()){
                
            st=con.prepareStatement("update placement set placed=? where com_name=? and job_name=? and stud_username=?");
            System.out.println(model.getValueAt(i,3).toString()+"\n   ");
            if(model.getValueAt(i,3).toString()==""){
                st.setString(1,"false");
            }
            else{
            st.setString(1,model.getValueAt(i,3).toString());
            }
            
            st.setString(2,stri);
            st.setString(3,rs.getString(2));
            st.setString(4,rs.getString(1));
            r+=st.executeUpdate();
            
             i++;
            }
             
             JOptionPane.showMessageDialog(null,r+"row updated");
            
            
            
               } catch (SQLException ex) {
            Logger.getLogger(JTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    (new CoordinatorLogin(stri)).setVisible(true);
    }//GEN-LAST:event_formWindowClosing
 public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DeclareResult("").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DeclareResult.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_1;
    // End of variables declaration//GEN-END:variables

   
}
