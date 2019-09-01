package Student;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class StudentDetails extends javax.swing.JFrame {
 Connection con;
    PreparedStatement stmt,stm;
    ResultSet rs,rs1;
    String stri;
    File f;
    FileInputStream fin;
    Blob b;
    public StudentDetails(String str) throws SQLException {
      
        
        initComponents();
        con=ConDb.conLink();
        this.setLocationRelativeTo(null);
        stri=str;
        l_sid.setText(stri);
         stm=con.prepareStatement("select email,mobile from student_login where stud_username=?");
         stm.setString(1,stri);
         rs=stm.executeQuery();
         rs.next();
         tf_e.setText(rs.getString(1));
         tf_m.setText(rs.getString(2));
         stmt=con.prepareStatement("select stud_username from student_details where stud_username=?");
         stmt.setString(1,stri);
         rs=stmt.executeQuery();
         if(!rs.next()){
         stm=con.prepareStatement("insert into student_details(stud_username) values(?)");
         stm.setString(1,stri);
         stm.executeUpdate();
         }
         
         stmt=con.prepareStatement("select * from student_details where stud_username=?");
         stmt.setString(1,stri);
         rs1=stmt.executeQuery();
         if(rs1.next()){
             if(rs1.getBlob(17)!=null){
              System.out.println("\nh000000000000rahahai");
             tf_n.setText(rs1.getString(1));
             tf_d.setText(rs1.getString(2));
             tf_cgpa.setText(rs1.getString(3));
             tf_12.setText(rs1.getString(4));
             tf_10.setText(rs1.getString(5));
             tf_y.setText(rs1.getString(6));
             tf_si.setText(rs1.getString(7));
             tf_in.setText(rs1.getString(8));
             tf_pd.setText(rs1.getString(9));
             tf_ts.setText(rs1.getString(10));
             tf_ac.setText(rs1.getString(11));
             tf_lp.setText(rs1.getString(12));
             tf_ho.setText(rs1.getString(13));
             tf_ad.setText(rs1.getString(14));
             tf_b.setText(rs1.getString(15));
             b=rs1.getBlob(17);
             byte []photo=b.getBytes(1,(int)b.length());
 
             ImageIcon img=new ImageIcon(new ImageIcon(photo).getImage().getScaledInstance(pic.getWidth(),pic.getHeight(),Image.SCALE_DEFAULT));
             pic.setIcon(img);
             }
             }
        
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_si = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf_in = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tf_pd = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tf_ts = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        tf_ac = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        tf_lp = new javax.swing.JTextArea();
        b1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        okkkk = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane7 = new javax.swing.JScrollPane();
        tf_ho = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tf_ad = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        l_sid = new javax.swing.JLabel();
        tf_n = new javax.swing.JTextField();
        tf_d = new javax.swing.JTextField();
        tf_cgpa = new javax.swing.JTextField();
        tf_12 = new javax.swing.JTextField();
        tf_10 = new javax.swing.JTextField();
        tf_y = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_b = new javax.swing.JTextField();
        tf_e = new javax.swing.JLabel();
        tf_m = new javax.swing.JLabel();
        btn_upload = new javax.swing.JButton();
        pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Year Of Passing:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Email Id :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Self-Introduction:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        tf_si.setColumns(20);
        tf_si.setRows(5);
        jScrollPane1.setViewportView(tf_si);

        tf_in.setColumns(20);
        tf_in.setRows(5);
        jScrollPane2.setViewportView(tf_in);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Internship Details:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Technical Skills:");

        tf_pd.setColumns(20);
        tf_pd.setRows(5);
        jScrollPane3.setViewportView(tf_pd);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Accomplishments:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Project Details");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Language Proficiency:");

        tf_ts.setColumns(20);
        tf_ts.setRows(5);
        jScrollPane4.setViewportView(tf_ts);

        tf_ac.setColumns(20);
        tf_ac.setRows(5);
        jScrollPane5.setViewportView(tf_ac);

        tf_lp.setColumns(20);
        tf_lp.setRows(5);
        jScrollPane6.setViewportView(tf_lp);

        b1.setText("UPDATE");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("DOB");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("MOBILE");

        okkkk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        okkkk.setText("STUD_12");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("STUD_10");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("STUD_CGPA");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("STUDENT DETAILS");

        tf_ho.setColumns(20);
        tf_ho.setRows(5);
        jScrollPane7.setViewportView(tf_ho);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Hobbies");

        tf_ad.setColumns(20);
        tf_ad.setRows(5);
        jScrollPane8.setViewportView(tf_ad);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Address");

        l_sid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        l_sid.setText(".");

        tf_n.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nKeyTyped(evt);
            }
        });

        tf_cgpa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_cgpaFocusLost(evt);
            }
        });
        tf_cgpa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cgpaKeyTyped(evt);
            }
        });

        tf_12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_12KeyTyped(evt);
            }
        });

        tf_10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_10KeyTyped(evt);
            }
        });

        tf_y.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_yKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("BRANCH");

        tf_b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_bKeyTyped(evt);
            }
        });

        tf_e.setText(".");

        tf_m.setText(".");

        btn_upload.setText("UPLOAD PHOTO");
        btn_upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uploadActionPerformed(evt);
            }
        });

        pic.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(767, 767, 767)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14))
                                    .addGap(43, 43, 43)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tf_n, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(100, 100, 100)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tf_b))
                                        .addComponent(tf_e))
                                    .addGap(118, 118, 118)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel18)
                                                .addComponent(okkkk))
                                            .addGap(82, 82, 82)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tf_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tf_cgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(145, 145, 145)
                                            .addComponent(tf_d)))
                                    .addGap(139, 139, 139)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addGap(82, 82, 82)
                                            .addComponent(tf_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tf_y)
                                                .addComponent(tf_m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(l_sid)
                                    .addGap(474, 474, 474)
                                    .addComponent(jLabel15)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_upload))
                            .addGap(45, 45, 45)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(635, 635, 635)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_10, tf_12, tf_cgpa, tf_y});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(l_sid))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(tf_cgpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(tf_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tf_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(okkkk)
                            .addComponent(tf_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(tf_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(tf_e)
                                    .addComponent(tf_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addGap(7, 7, 7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(tf_m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_upload)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
     try {
        System.out.println("\nhiiiiiiiiiii");
         stmt=con.prepareStatement("update student_details set  NAME=?, DOB=?, STUD_CGPA =?,STUD_12=? ,STUD_10=?,YEAR_OF_PASSING=? , SELF_INTRODUCTION=?,INTERNSHIP_DETAILS=?,PROJECT_DETAILS =?,TECHNICAL_SKILLS =?,ACCOMPLISHMENTS =?,LANGUAGE_PROFICIENCY=?,HOBBIES=?, ADDRESS=?,BRANCH=?,PHOTO=? where stud_username=?");
         stmt.setString(1,tf_n.getText());
         stmt.setString(2,tf_d.getText());
         stmt.setString(3,tf_cgpa.getText());
         stmt.setString(4,tf_12.getText());
         stmt.setString(5,tf_10.getText());
         stmt.setString(6,tf_y.getText());
         stmt.setString(7,tf_si.getText());
         stmt.setString(8,tf_in.getText());
         stmt.setString(9,tf_pd.getText());
         stmt.setString(10,tf_ts.getText());
         stmt.setString(11,tf_ac.getText());
         stmt.setString(12,tf_lp.getText());
         stmt.setString(13,tf_ho.getText());
         stmt.setString(14,tf_ad.getText());
         stmt.setString(15,tf_b.getText());
         
         if(f==null){
             stmt.setBlob(16, b);
         }
         else{
             fin=new FileInputStream(f);
            stmt.setBinaryStream(16,fin, fin.available());
         }
         stmt.setString(17,stri);
         int r=stmt.executeUpdate();
         JOptionPane.showMessageDialog(null,r+" row updated");
         
     } catch (SQLException ex) {
         Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
     } catch (FileNotFoundException ex) {
         Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
     }
        
    }//GEN-LAST:event_b1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
     try {
         (new StudentLogin(stri)).setVisible(true);
     } catch (SQLException ex) {
         Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_formWindowClosing

    private void tf_cgpaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cgpaFocusLost
        
    }//GEN-LAST:event_tf_cgpaFocusLost

    private void tf_cgpaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cgpaKeyTyped
            char c=evt.getKeyChar();
            if(!((c>=48 && c<=57) || c==46)){
                evt.consume();;
                Toolkit.getDefaultToolkit().beep();
            }
    }//GEN-LAST:event_tf_cgpaKeyTyped

    private void tf_nKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nKeyTyped
       char c=evt.getKeyChar();
            if(!((c>=65 && c<=95) || (c>=97 && c<=122) || c==' ')){
                evt.consume();;
                Toolkit.getDefaultToolkit().beep();
            }
    }//GEN-LAST:event_tf_nKeyTyped

    private void tf_10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_10KeyTyped
          char c=evt.getKeyChar();
            if(!((c>=48 && c<=57) || c==46)){
                evt.consume();;
                Toolkit.getDefaultToolkit().beep();
            }
    }//GEN-LAST:event_tf_10KeyTyped

    private void tf_12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_12KeyTyped
          char c=evt.getKeyChar();
            if(!((c>=48 && c<=57) || c==46)){
                evt.consume();;
                Toolkit.getDefaultToolkit().beep();
            }
    }//GEN-LAST:event_tf_12KeyTyped

    private void tf_yKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_yKeyTyped
          char c=evt.getKeyChar();
            if(!((c>=48 && c<=57) || c==46)){
                evt.consume();;
                Toolkit.getDefaultToolkit().beep();
            }
    }//GEN-LAST:event_tf_yKeyTyped

    private void tf_bKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_bKeyTyped
        char c=evt.getKeyChar();
            if(!((c>=65 && c<=95) || (c>=97 && c<=122) || c==' ')){
                evt.consume();;
                Toolkit.getDefaultToolkit().beep();
            }
    }//GEN-LAST:event_tf_bKeyTyped

    private void btn_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uploadActionPerformed
        JFileChooser jf=new JFileChooser();
        jf.showOpenDialog(null);
        f=jf.getSelectedFile();
        ImageIcon img=new ImageIcon(new ImageIcon(""+f).getImage().getScaledInstance(pic.getWidth(),pic.getHeight(),Image.SCALE_DEFAULT));
        pic.setIcon(img);
    }//GEN-LAST:event_btn_uploadActionPerformed
  public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new StudentDetails("").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton btn_upload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel l_sid;
    private javax.swing.JLabel okkkk;
    private javax.swing.JLabel pic;
    private javax.swing.JTextField tf_10;
    private javax.swing.JTextField tf_12;
    private javax.swing.JTextArea tf_ac;
    private javax.swing.JTextArea tf_ad;
    private javax.swing.JTextField tf_b;
    private javax.swing.JTextField tf_cgpa;
    private javax.swing.JTextField tf_d;
    private javax.swing.JLabel tf_e;
    private javax.swing.JTextArea tf_ho;
    private javax.swing.JTextArea tf_in;
    private javax.swing.JTextArea tf_lp;
    private javax.swing.JLabel tf_m;
    private javax.swing.JTextField tf_n;
    private javax.swing.JTextArea tf_pd;
    private javax.swing.JTextArea tf_si;
    private javax.swing.JTextArea tf_ts;
    private javax.swing.JTextField tf_y;
    // End of variables declaration//GEN-END:variables
}