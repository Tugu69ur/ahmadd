package ahmadd;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

import javax.swing.table.DefaultTableModel;
import com.sun.tools.javac.Main;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.border.AbstractBorder;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;



public class List extends javax.swing.JFrame {
    //DefaultTableModel model;
    private String aa=null;
    private String aluurcin=null;
    private String alurcin=null;
    private String qq=null;
   // private JPanel jPanel4;
    private ArrayList<String> registrationHistory;
    
    private DefaultListModel<String> historyListModel;
    
    public List() throws SQLException {
        
        initComponents();
        setIcon();
        activity = new JPanel();
        activity.setLayout(new BoxLayout(activity, BoxLayout.Y_AXIS));
        registrationHistory = new ArrayList<>();
        //setUndecorated(true);  
        Connection con;
        Statement st;
        ResultSet rs;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT company='Кашмер Холдинг',count(*) FROM sudalgaa group by company;");
        if(rs.next()){
           ahmad1.setText(rs.getString(2));
        }
        }catch(ClassNotFoundException ex){
        }
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_hoyr) FROM sudalgaa where arvan_hoyr=1 and company='Кашмер Холдинг';");
        if(rs.next()){
           arvan_hoyr1.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery("SELECT count(arvan_gurav) FROM sudalgaa where arvan_gurav=1 and company='Кашмер Холдинг';");
        if(rs.next()){
           arvan_gurav1.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad","root","Tuugii0713");
        st=con.createStatement();
        rs=st.executeQuery(" SELECT count(odoo_ajillaj) FROM sudalgaa where odoo_ajillaj=1 and company='Кашмер Холдинг';");
        if(rs.next()){
           odoo_ajillaj1.setText(rs.getString(1));
        }
        }catch(ClassNotFoundException ex){
        }
        
        
        
    }
    @SuppressWarnings("unchecked")
   
    private String cc=null;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Container = new javax.swing.JPanel();
        Main = new javax.swing.JPanel()
        ;
        company = new javax.swing.JLabel();
        zuraas = new javax.swing.JPanel();
        Info = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nemeh = new javax.swing.JButton();
        k_holding = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ahmad1 = new javax.swing.JLabel();
        arvan_hoyr1 = new javax.swing.JLabel();
        arvan_gurav1 = new javax.swing.JLabel();
        odoo_ajillaj1 = new javax.swing.JLabel();
        t_shirees = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        zuraas1 = new javax.swing.JPanel();
        zuraas2 = new javax.swing.JPanel();
        zuraas3 = new javax.swing.JPanel();
        zuraas4 = new javax.swing.JPanel();
        zuraas5 = new javax.swing.JPanel();
        zuraas6 = new javax.swing.JPanel();
        zuraas7 = new javax.swing.JPanel();
        m_myndas = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        e_od = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        g_myndas = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        h_shonhor = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        evseg = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        data = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        textField = new javax.swing.JTextField();
        burtgel = new javax.swing.JPanel();
        activity = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        nuur = new javax.swing.JLabel();
        baiguullaguud = new javax.swing.JLabel();
        burtgell = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(247, 248, 252));
        setPreferredSize(new java.awt.Dimension(1900, 850));
        setSize(new java.awt.Dimension(1900, 850));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(247, 248, 252));
        jPanel1.setForeground(new java.awt.Color(247, 248, 252));
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(1900, 850));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Arig-Gal_logo12.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/woman.png"))); // NOI18N
        jButton1.setText("Hey, BaasanJav");
        jButton1.setActionCommand("Hey, BaasanJav !");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new FlowLayout());
        Main = new RoundJPanel(214, 76); // Set background color as needed
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setPreferredSize(new java.awt.Dimension(1095, 695));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        company.setBackground(new java.awt.Color(0, 0, 0));
        company.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        company.setForeground(new java.awt.Color(53, 58, 76));
        company.setText("Компаниуд");
        Main.add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 11, 216, 61));

        zuraas.setPreferredSize(new java.awt.Dimension(710, 1));

        javax.swing.GroupLayout zuraasLayout = new javax.swing.GroupLayout(zuraas);
        zuraas.setLayout(zuraasLayout);
        zuraasLayout.setHorizontalGroup(
            zuraasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        zuraasLayout.setVerticalGroup(
            zuraasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Main.add(zuraas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 78, 1095, -1));

        Info.setBackground(new java.awt.Color(242, 242, 246));
        Info.setPreferredSize(new java.awt.Dimension(990, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("№");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Бүх Ахмадууд");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("<html>2012 өмнө т/гарсан</html>");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Компани");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("<html>2013 өмнө т/гарсан</html>");

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("<html>Одоо компанид ажиллаж байгаа ахмад</html>");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout InfoLayout = new javax.swing.GroupLayout(Info);
        Info.setLayout(InfoLayout);
        InfoLayout.setHorizontalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        InfoLayout.setVerticalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InfoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        Main.add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 990, 60));

        nemeh.setBackground(new java.awt.Color(69, 85, 241));
        nemeh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add (1).png"))); // NOI18N
        nemeh.setAlignmentX(0.5F);
        nemeh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        nemeh.setContentAreaFilled(false);
        nemeh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nemeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nemehActionPerformed(evt);
            }
        });
        Main.add(nemeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 50, 50));

        k_holding.setBackground(new java.awt.Color(255, 255, 255));
        k_holding.setForeground(new java.awt.Color(255, 255, 255));
        k_holding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                k_holdingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                k_holdingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                k_holdingMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                k_holdingMouseReleased(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(69, 85, 241));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(69, 85, 241));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("1");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Кашмер Холдинг");

        ahmad1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ahmad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_hoyr1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_hoyr1.setForeground(new java.awt.Color(255, 51, 51));
        arvan_hoyr1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        arvan_gurav1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arvan_gurav1.setForeground(new java.awt.Color(255, 51, 51));
        arvan_gurav1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        odoo_ajillaj1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        odoo_ajillaj1.setForeground(new java.awt.Color(0, 255, 102));
        odoo_ajillaj1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout k_holdingLayout = new javax.swing.GroupLayout(k_holding);
        k_holding.setLayout(k_holdingLayout);
        k_holdingLayout.setHorizontalGroup(
            k_holdingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(k_holdingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(ahmad1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(arvan_hoyr1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arvan_gurav1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(odoo_ajillaj1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        k_holdingLayout.setVerticalGroup(
            k_holdingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ahmad1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(k_holdingLayout.createSequentialGroup()
                .addGroup(k_holdingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(k_holdingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(k_holdingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(arvan_hoyr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arvan_gurav1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(odoo_ajillaj1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        Main.add(k_holding, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 990, 65));

        t_shirees.setBackground(new java.awt.Color(255, 255, 255));
        t_shirees.setForeground(new java.awt.Color(255, 255, 255));
        t_shirees.setPreferredSize(new java.awt.Dimension(990, 60));
        t_shirees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_shireesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t_shireesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t_shireesMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(69, 85, 241));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("6");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Тансаг ширээс");

        javax.swing.GroupLayout t_shireesLayout = new javax.swing.GroupLayout(t_shirees);
        t_shirees.setLayout(t_shireesLayout);
        t_shireesLayout.setHorizontalGroup(
            t_shireesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t_shireesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(752, Short.MAX_VALUE))
        );
        t_shireesLayout.setVerticalGroup(
            t_shireesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t_shireesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addComponent(jLabel19))
        );

        Main.add(t_shirees, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        zuraas1.setPreferredSize(new java.awt.Dimension(850, 1));

        javax.swing.GroupLayout zuraas1Layout = new javax.swing.GroupLayout(zuraas1);
        zuraas1.setLayout(zuraas1Layout);
        zuraas1Layout.setHorizontalGroup(
            zuraas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        zuraas1Layout.setVerticalGroup(
            zuraas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Main.add(zuraas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 225, 990, -1));

        zuraas2.setPreferredSize(new java.awt.Dimension(990, 1));

        javax.swing.GroupLayout zuraas2Layout = new javax.swing.GroupLayout(zuraas2);
        zuraas2.setLayout(zuraas2Layout);
        zuraas2Layout.setHorizontalGroup(
            zuraas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        zuraas2Layout.setVerticalGroup(
            zuraas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Main.add(zuraas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 295, -1, -1));

        zuraas3.setPreferredSize(new java.awt.Dimension(990, 1));

        javax.swing.GroupLayout zuraas3Layout = new javax.swing.GroupLayout(zuraas3);
        zuraas3.setLayout(zuraas3Layout);
        zuraas3Layout.setHorizontalGroup(
            zuraas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        zuraas3Layout.setVerticalGroup(
            zuraas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Main.add(zuraas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 433, -1, -1));

        zuraas4.setPreferredSize(new java.awt.Dimension(990, 1));

        javax.swing.GroupLayout zuraas4Layout = new javax.swing.GroupLayout(zuraas4);
        zuraas4.setLayout(zuraas4Layout);
        zuraas4Layout.setHorizontalGroup(
            zuraas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        zuraas4Layout.setVerticalGroup(
            zuraas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Main.add(zuraas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 503, -1, -1));

        zuraas5.setPreferredSize(new java.awt.Dimension(990, 1));

        javax.swing.GroupLayout zuraas5Layout = new javax.swing.GroupLayout(zuraas5);
        zuraas5.setLayout(zuraas5Layout);
        zuraas5Layout.setHorizontalGroup(
            zuraas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        zuraas5Layout.setVerticalGroup(
            zuraas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Main.add(zuraas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));

        zuraas6.setFocusable(false);
        zuraas6.setPreferredSize(new java.awt.Dimension(990, 1));

        javax.swing.GroupLayout zuraas6Layout = new javax.swing.GroupLayout(zuraas6);
        zuraas6.setLayout(zuraas6Layout);
        zuraas6Layout.setHorizontalGroup(
            zuraas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        zuraas6Layout.setVerticalGroup(
            zuraas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Main.add(zuraas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 638, -1, -1));

        zuraas7.setPreferredSize(new java.awt.Dimension(990, 1));

        javax.swing.GroupLayout zuraas7Layout = new javax.swing.GroupLayout(zuraas7);
        zuraas7.setLayout(zuraas7Layout);
        zuraas7Layout.setHorizontalGroup(
            zuraas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        zuraas7Layout.setVerticalGroup(
            zuraas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Main.add(zuraas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 365, -1, -1));

        m_myndas.setBackground(new java.awt.Color(255, 255, 255));
        m_myndas.setForeground(new java.awt.Color(255, 255, 255));
        m_myndas.setPreferredSize(new java.awt.Dimension(990, 65));
        m_myndas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_myndasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m_myndasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m_myndasMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(69, 86, 241));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("2");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Мон-Мяндас");

        javax.swing.GroupLayout m_myndasLayout = new javax.swing.GroupLayout(m_myndas);
        m_myndas.setLayout(m_myndasLayout);
        m_myndasLayout.setHorizontalGroup(
            m_myndasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m_myndasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(753, Short.MAX_VALUE))
        );
        m_myndasLayout.setVerticalGroup(
            m_myndasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m_myndasLayout.createSequentialGroup()
                .addGroup(m_myndasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Main.add(m_myndas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 228, -1, -1));

        e_od.setBackground(new java.awt.Color(255, 255, 255));
        e_od.setForeground(new java.awt.Color(255, 255, 255));
        e_od.setPreferredSize(new java.awt.Dimension(990, 65));
        e_od.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e_odMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                e_odMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                e_odMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(69, 85, 241));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("4");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Эвсэг-Од");

        javax.swing.GroupLayout e_odLayout = new javax.swing.GroupLayout(e_od);
        e_od.setLayout(e_odLayout);
        e_odLayout.setHorizontalGroup(
            e_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(e_odLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel17)
                .addContainerGap(826, Short.MAX_VALUE))
        );
        e_odLayout.setVerticalGroup(
            e_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(e_odLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Main.add(e_od, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 367, -1, -1));

        g_myndas.setBackground(new java.awt.Color(255, 255, 255));
        g_myndas.setForeground(new java.awt.Color(255, 255, 255));
        g_myndas.setPreferredSize(new java.awt.Dimension(990, 65));
        g_myndas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g_myndasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                g_myndasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                g_myndasMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(69, 85, 241));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("5");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Говийн мяндас");

        javax.swing.GroupLayout g_myndasLayout = new javax.swing.GroupLayout(g_myndas);
        g_myndas.setLayout(g_myndasLayout);
        g_myndasLayout.setHorizontalGroup(
            g_myndasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(g_myndasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(750, Short.MAX_VALUE))
        );
        g_myndasLayout.setVerticalGroup(
            g_myndasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(g_myndasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(g_myndasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Main.add(g_myndas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 436, -1, -1));

        h_shonhor.setBackground(new java.awt.Color(255, 255, 255));
        h_shonhor.setForeground(new java.awt.Color(255, 255, 255));
        h_shonhor.setPreferredSize(new java.awt.Dimension(990, 65));
        h_shonhor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_shonhorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                h_shonhorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                h_shonhorMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(69, 85, 241));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("3");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Хавт Шонхор");

        javax.swing.GroupLayout h_shonhorLayout = new javax.swing.GroupLayout(h_shonhor);
        h_shonhor.setLayout(h_shonhorLayout);
        h_shonhorLayout.setHorizontalGroup(
            h_shonhorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_shonhorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(774, Short.MAX_VALUE))
        );
        h_shonhorLayout.setVerticalGroup(
            h_shonhorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_shonhorLayout.createSequentialGroup()
                .addGroup(h_shonhorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Main.add(h_shonhor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 298, -1, -1));

        evseg.setBackground(new java.awt.Color(255, 255, 255));
        evseg.setForeground(new java.awt.Color(255, 255, 255));
        evseg.setPreferredSize(new java.awt.Dimension(990, 65));
        evseg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                evsegMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                evsegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                evsegMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(69, 85, 241));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("7");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Эвсэг ХХК");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout evsegLayout = new javax.swing.GroupLayout(evseg);
        evseg.setLayout(evsegLayout);
        evsegLayout.setHorizontalGroup(
            evsegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(evsegLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(788, Short.MAX_VALUE))
        );
        evsegLayout.setVerticalGroup(
            evsegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(evsegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Main.add(evseg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 572, -1, -1));

        home.setBackground(new java.awt.Color(102, 0, 102));
        home.setPreferredSize(new java.awt.Dimension(1095, 695));

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );

        data.setBackground(new java.awt.Color(255, 255, 255));
        data.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        data.setPreferredSize(new java.awt.Dimension(1095, 696));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setForeground(new java.awt.Color(51, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ажилтаны код", "Компани", "Овог нэр", "2012 оноос өмнө т/гарсан", "2013 оноос өмнө т/гарсан", "Одоо компанид ажиллаж байгаа ахмад"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setSelectionBackground(new java.awt.Color(51, 51, 51));
        table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
            table.getColumnModel().getColumn(1).setPreferredWidth(150);
            table.getColumnModel().getColumn(3).setPreferredWidth(100);
            table.getColumnModel().getColumn(4).setPreferredWidth(100);
            table.getColumnModel().getColumn(5).setPreferredWidth(250);
        }

        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dataLayout = new javax.swing.GroupLayout(data);
        data.setLayout(dataLayout);
        dataLayout.setHorizontalGroup(
            dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
            .addGroup(dataLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dataLayout.setVerticalGroup(
            dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataLayout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        burtgel.setBackground(new java.awt.Color(0, 255, 204));
        burtgel.setPreferredSize(new java.awt.Dimension(1095, 695));

        javax.swing.GroupLayout burtgelLayout = new javax.swing.GroupLayout(burtgel);
        burtgel.setLayout(burtgelLayout);
        burtgelLayout.setHorizontalGroup(
            burtgelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1095, Short.MAX_VALUE)
        );
        burtgelLayout.setVerticalGroup(
            burtgelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(burtgel, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(data, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContainerLayout.createSequentialGroup()
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContainerLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(burtgel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );

        activity.setBackground(new java.awt.Color(247, 248, 252));
        activity.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(190, 80));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        activity.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        activity.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 200, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        activity.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(0, 80));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        activity.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 385, 200, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Latest activity");
        activity.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 195, 40));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(0, 80));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        activity.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 200, -1));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(0, 80));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        activity.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 200, -1));

        nuur.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nuur.setForeground(new java.awt.Color(0, 0, 128));
        nuur.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nuur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/house (4).png"))); // NOI18N
        nuur.setText("Нүүр");
        nuur.setToolTipText("");
        nuur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuurMouseClicked(evt);
            }
        });

        baiguullaguud.setBackground(new java.awt.Color(187, 187, 187));
        baiguullaguud.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        baiguullaguud.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        baiguullaguud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/enterprise.png"))); // NOI18N
        baiguullaguud.setText("Байгууллагууд");
        baiguullaguud.setForeground(new java.awt.Color(187,187,187));
        baiguullaguud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                baiguullaguudMouseClicked(evt);
            }
        });

        burtgell.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        burtgell.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        burtgell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/content-creator.png"))); // NOI18N
        burtgell.setText("Бүртгэл");
        burtgell.setForeground(new java.awt.Color(187,187,187));
        burtgell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                burtgellMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(burtgell, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(nuur, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(baiguullaguud, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(activity, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activity, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(nuur, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(baiguullaguud, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(burtgell, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 1540, 840));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void evsegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evsegMouseExited
        // TODO add your handling code here:
        evseg.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_evsegMouseExited

    private void evsegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evsegMouseEntered
        // TODO add your handling code here:
        evseg.setBackground(new Color(242,242,246));
    }//GEN-LAST:event_evsegMouseEntered

    private void evsegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evsegMouseClicked
        cc="evseg";
        Company e=new Company(cc);
        e.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_evsegMouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void h_shonhorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_shonhorMouseExited
        // TODO add your handling code here:
        h_shonhor.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_h_shonhorMouseExited

    private void h_shonhorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_shonhorMouseEntered
        // TODO add your handling code here:
        h_shonhor.setBackground(new Color(242,242,246));
    }//GEN-LAST:event_h_shonhorMouseEntered

    private void h_shonhorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_shonhorMouseClicked
        cc="h_shonhor";
        Company hs=new Company(cc);
        hs.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_h_shonhorMouseClicked

    private void g_myndasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g_myndasMouseExited
        // TODO add your handling code here:
        g_myndas.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_g_myndasMouseExited

    private void g_myndasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g_myndasMouseEntered
        // TODO add your handling code here:
        g_myndas.setBackground(new Color(242,242,246));
    }//GEN-LAST:event_g_myndasMouseEntered

    private void g_myndasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g_myndasMouseClicked
        // TODO add your handling code here:
        cc="g_myndas";
        Company gm=new Company(cc);
        gm.show();
    }//GEN-LAST:event_g_myndasMouseClicked

    private void e_odMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_odMouseExited
        // TODO add your handling code here:
        e_od.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_e_odMouseExited

    private void e_odMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_odMouseEntered
        // TODO add your handling code here:
        e_od.setBackground(new Color(242,242,246));
    }//GEN-LAST:event_e_odMouseEntered

    private void e_odMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_odMouseClicked
        cc="e_od";
        Company ed=new Company(cc);
        ed.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_e_odMouseClicked

    private void m_myndasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_myndasMouseExited
        // TODO add your handling code here:
        m_myndas.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_m_myndasMouseExited

    private void m_myndasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_myndasMouseEntered
        // TODO add your handling code here:
        m_myndas.setBackground(new Color(242,242,246));
    }//GEN-LAST:event_m_myndasMouseEntered

    private void m_myndasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_myndasMouseClicked
        // TODO add your handling code here:
        cc="m_myndas";
        Company mm=new Company(cc);
        mm.show();
    }//GEN-LAST:event_m_myndasMouseClicked

    private void t_shireesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_shireesMouseExited
        // TODO add your handling code here:
        t_shirees.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_t_shireesMouseExited

    private void t_shireesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_shireesMouseEntered
        // TODO add your handling code here:
        t_shirees.setBackground(new Color(242,242,246));

    }//GEN-LAST:event_t_shireesMouseEntered

    private void t_shireesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_shireesMouseClicked
        cc="t_shirees";
        Company ts=new Company(cc);
        ts.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_t_shireesMouseClicked

    private void k_holdingMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k_holdingMouseReleased
        // TODO add your handling code here:
        k_holding.setBackground(new Color(65,65,65));
    }//GEN-LAST:event_k_holdingMouseReleased

    private void k_holdingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k_holdingMouseExited
        // TODO add your handling code here:
        k_holding.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_k_holdingMouseExited

    private void k_holdingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k_holdingMouseEntered
        // TODO add your handling code here:
        k_holding.setBackground(new Color(242,242,246));
    }//GEN-LAST:event_k_holdingMouseEntered

    private void k_holdingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k_holdingMouseClicked
        // TODO add your handling code here:
        aa="k_holding";
        
        burtgel.setVisible(false);
        data.setVisible(true);
        home.setVisible(false);
        Main.setVisible(false);
    }//GEN-LAST:event_k_holdingMouseClicked

    private void nemehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nemehActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nemehActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
        String searchQuery = textField.getText().trim();
        // Check if the search query is empty
        if (searchQuery.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Хайлт хоосон байж болохгүй.");
        } else {
            try {
                performSearch(searchQuery);
            } catch (SQLException ex) {
                Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_textFieldActionPerformed

    private void nuurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuurMouseClicked
        // TODO add your handling code here:
//        String path = "house (4).png";
//        ImageIcon icon = new ImageIcon(getClass().getResource(path));
//        nuur.setIcon(icon);
//        
//        String path1 = "enterprise.png";
//        ImageIcon icon1 = new ImageIcon(getClass().getResource(path1));
//        baiguullaguud.setIcon(icon1);
//        
//        String path2 = "content-creator.png";
//        ImageIcon icon2 = new ImageIcon(getClass().getResource(path2));
//        nuur.setIcon(icon2);
        
        // Assuming "nuur.png" is in the same directory as your Java file
        nuur.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\house (4).png"));
        baiguullaguud.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\enterprise.png"));
        burtgell.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\content-creator.png"));
        
        Font boldFont = nuur.getFont().deriveFont(Font.BOLD);
        nuur.setFont(boldFont);
        
        
        baiguullaguud.setFont(new Font("Segoe UI",Font.PLAIN,16));
        burtgell.setFont(new Font("Segoe UI",Font.PLAIN,16));
        
        Color c=new Color(0,0,128);
        Color v=new Color(187,187,187);
        nuur.setForeground(c);
        baiguullaguud.setForeground(v);
        burtgell.setForeground(v);
        
        
        Main.setVisible(false);
        burtgel.setVisible(false);
        data.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_nuurMouseClicked

    private void baiguullaguudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baiguullaguudMouseClicked
        // TODO add your handling code here:
//        String path = "house (3).png";
//        ImageIcon icon = new ImageIcon(getClass().getResource(path));
//        nuur.setIcon(icon);
//        
//        String path1 = "enterprise (1).png";
//        ImageIcon icon1 = new ImageIcon(getClass().getResource(path1));
//        baiguullaguud.setIcon(icon1);
//        
//        String path2 = "content-creator.png";
//        ImageIcon icon2 = new ImageIcon(getClass().getResource(path2));
//        nuur.setIcon(icon2);
//         
        
        nuur.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\house (3).png"));
        baiguullaguud.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\enterprise (1).png"));
        burtgell.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\content-creator.png"));
        
        
        Font boldFont = baiguullaguud.getFont().deriveFont(Font.BOLD);
        baiguullaguud.setFont(boldFont); 
        
        nuur.setFont(new Font("Segoe UI",Font.PLAIN,16));
        burtgell.setFont(new Font("Segoe UI",Font.PLAIN,16));
        
        Color c=new Color(0,0,128);
        Color v=new Color(187,187,187);
        nuur.setForeground(v);
        baiguullaguud.setForeground(c);
        burtgell.setForeground(v); 
        
        burtgel.setVisible(false);
        data.setVisible(false);
        home.setVisible(false);
        Main.setVisible(true);
    }//GEN-LAST:event_baiguullaguudMouseClicked

    private void burtgellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_burtgellMouseClicked
        // TODO add your handling code here:
//        String path = "house (3).png";
//        ImageIcon icon = new ImageIcon(getClass().getResource(path));
//        nuur.setIcon(icon);
//        
//        String path1 = "enterprise.png";
//        ImageIcon icon1 = new ImageIcon(getClass().getResource(path1));
//        baiguullaguud.setIcon(icon1);
//        
//        String path2 = "content-creator (1).png";
//        ImageIcon icon2 = new ImageIcon(getClass().getResource(path2));
//        nuur.setIcon(icon2);
        
        nuur.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\house (3).png"));
        baiguullaguud.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\enterprise.png"));
        burtgell.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\content-creator (1).png"));

        Font boldFont = burtgell.getFont().deriveFont(Font.BOLD);
        burtgell.setFont(boldFont);
        
        baiguullaguud.setFont(new Font("Segoe UI",Font.PLAIN,16));
        nuur.setFont(new Font("Segoe UI",Font.PLAIN,16));
        
        Color c=new Color(0,0,128);
        Color v=new Color(187,187,187);
        nuur.setForeground(v);
        baiguullaguud.setForeground(v);
        burtgell.setForeground(c);
        
        data.setVisible(false);
        home.setVisible(false);
        Main.setVisible(false);
        burtgel.setVisible(true);
    }//GEN-LAST:event_burtgellMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        
        int row = table.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) table.getModel();
        String company=model.getValueAt(row,1).toString();
        String ner=model.getValueAt(row,2).toString();
//        Profile pro=new Profile(company,ner);
//        pro.show();
        JOptionPane.showMessageDialog(null, ner);
        
    }//GEN-LAST:event_tableMouseClicked
    private void performSearch(String searchQuery) throws SQLException {
        DefaultTableModel searchResultModel = (DefaultTableModel) table.getModel();
        searchResultModel.setRowCount(0);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ahmad", "root", "Tuugii0713"); // e1.printStackTrace();
        if(searchQuery==null){
         String query = "SELECT * FROM ahmad.sudalgaa where company='Кашмер Холдинг';";
            try (Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    int bcodeField = resultSet.getInt("a_code");
                    String UovogField = resultSet.getString("company");
                    String ovogField = resultSet.getString("ovog");
                    String nerField = resultSet.getString("ner");
                    String rd = resultSet.getString("arvan_hoyr");
                    
                    String utas = resultSet.getString("arvan_gurav");
                    
                    String ger = resultSet.getString("odoo_ajillaj");
                    
                   
                    
                    searchResultModel.addRow(new Object[]{bcodeField, UovogField,ovogField+nerField, rd, utas,ger});
                    
//                    Object[] obj ={bcodeField, UovogField,ovogField+nerField, rd, utas,ger};
//                    model = (DefaultTableModel)table.getModel();
//                    model.addRow(obj);
                }
            }
        }
        if(aa=="k_holding"){
            if (searchQuery.equalsIgnoreCase("all")) {
            // Fetch all students
            String query = "SELECT * FROM ahmad.sudalgaa where company='Кашмер Холдинг';";
            try (Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    int bcodeField = resultSet.getInt("a_code");
                    String UovogField = resultSet.getString("company");
                    String ovogField = resultSet.getString("ovog");
                    String nerField = resultSet.getString("ner");
                    String rd = resultSet.getString("arvan_hoyr");
                    
                    String utas = resultSet.getString("arvan_gurav");
                    
                    String ger = resultSet.getString("odoo_ajillaj");
                    
                   
                    searchResultModel.addRow(new Object[]{bcodeField, UovogField,ovogField+nerField, rd, utas,ger});
                }
            }
        } else {
            // Perform a regular search
            String query = "SELECT * FROM ahmad.sudalgaa where company='Кашмер Холдинг'and ner like ? ;";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                String wildcardSearchQuery = "%" + searchQuery + "%";
                preparedStatement.setString(1, wildcardSearchQuery);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        int bcodeField = resultSet.getInt("a_code");
                        String UovogField = resultSet.getString("company");
                        String ovogField = resultSet.getString("ovog");
                        String nerField = resultSet.getString("ner");
                        String rd = resultSet.getString("arvan_hoyr");                       
                        String utas = resultSet.getString("arvan_gurav");                       
                        String ger = resultSet.getString("odoo_ajillaj");
                        searchResultModel.addRow(new Object[]{bcodeField, UovogField, ovogField+nerField, rd, utas,ger});
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }catch(SQLException e){
                    e.printStackTrace();
                }
        }
    }
    }
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
        ImageIcon img=new ImageIcon("C:\\Users\\Dell 5415\\Documents\\NetBeansProjects\\Ahmadd\\src\\img\\cashmere-holding.jpg");
        Image img1=img.getImage();
        Image s = img1.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
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
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        img=new ImageIcon(s);
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new List().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        });
    }

    private void setIcon() {
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Arig-Gal_logo1.png")));
    }
    class RoundJPanel extends JPanel {
    private Shape shape;

    public RoundJPanel(int width, int height) {
        setPreferredSize(new Dimension(width, height));
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 25, 25);
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getBackground());
        g2d.fill(shape);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor((Color.WHITE));
        g2d.draw(shape);
    }

        private Color getBackground(Color white) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
        private void updateHistoryPanel() {
        // Clear existing labels
        activity.removeAll();

        // Add labels for each entry in the registration history
        for (String entry : registrationHistory) {
            JLabel label = new JLabel(entry);
            activity.add(label);
        }

        // Update the UI
        activity.revalidate();
        activity.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Info;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel activity;
    private javax.swing.JLabel ahmad1;
    private javax.swing.JLabel arvan_gurav1;
    private javax.swing.JLabel arvan_hoyr1;
    private javax.swing.JLabel baiguullaguud;
    private javax.swing.JPanel burtgel;
    private javax.swing.JLabel burtgell;
    private javax.swing.JLabel company;
    private javax.swing.JPanel data;
    private javax.swing.JPanel e_od;
    private javax.swing.JPanel evseg;
    private javax.swing.JPanel g_myndas;
    private javax.swing.JPanel h_shonhor;
    private javax.swing.JPanel home;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel k_holding;
    private javax.swing.JPanel m_myndas;
    private javax.swing.JButton nemeh;
    private javax.swing.JLabel nuur;
    private javax.swing.JLabel odoo_ajillaj1;
    private javax.swing.JPanel t_shirees;
    private javax.swing.JTable table;
    private javax.swing.JTextField textField;
    private javax.swing.JPanel zuraas;
    private javax.swing.JPanel zuraas1;
    private javax.swing.JPanel zuraas2;
    private javax.swing.JPanel zuraas3;
    private javax.swing.JPanel zuraas4;
    private javax.swing.JPanel zuraas5;
    private javax.swing.JPanel zuraas6;
    private javax.swing.JPanel zuraas7;
    // End of variables declaration//GEN-END:variables
}
