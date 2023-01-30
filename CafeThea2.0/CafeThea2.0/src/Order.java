
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Adam
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form Order
     */
    String item;
    double price, itemTotal, totalPrice;
    CardLayout cardLayout;
    
    public Order() {
        initComponents();
        
        
        
        CGO = new ImageIcon(NewResCGO);
        ImageCGO.setIcon(CGO); 
        
        PWB = new ImageIcon(NewResPWB);
        ImagePWB.setIcon(PWB); 
        
        SA = new ImageIcon(NewResSA);
        ImageSA.setIcon(SA); 
        
        PM = new ImageIcon(NewResPM);
        ImagePM.setIcon(PM); 
        
        CB = new ImageIcon(NewResCB);
        ImageCB.setIcon(CB); 
        
        CA = new ImageIcon(NewResCA);
        ImageCA.setIcon(CA); 
        
        SSP = new ImageIcon(NewResSSP);
        ImageSSP.setIcon(SSP); 
        
        PC = new ImageIcon(NewResPC);
        ImagePC.setIcon(PC); 
        
        SH = new ImageIcon(NewResSH);
        ImageSH.setIcon(SH); 
        
        LP = new ImageIcon(NewResLP);
        ImageLP.setIcon(LP); 
        
        SGC = new ImageIcon(NewResSGC);
        ImageSGC.setIcon(SGC); 
        
        SP = new ImageIcon(NewResSP);
        ImageSP.setIcon(SP); 
        
        BF = new ImageIcon(NewResBF);
        ImageBF.setIcon(BF); 
        
        LD = new ImageIcon(NewResLD);
        ImageLD.setIcon(LD); 
        
         SC= new ImageIcon(NewResSC);
        ImageSC.setIcon(SC); 
        
         BC = new ImageIcon(NewResBC);
        ImageBC.setIcon(BC); 
        
         SS = new ImageIcon(NewResSS);
        ImageSS.setIcon(SS); 
        
        BS = new ImageIcon(NewResBS);
        ImageBS.setIcon(BS); 
        
         SR = new ImageIcon(NewResSR);
        ImageSR.setIcon(SR); 
        
         BR = new ImageIcon(NewResBR);
        ImageBR.setIcon(BR); 
        
        
        CHB = new ImageIcon(NewResCHB);
        ImageCHB.setIcon(CHB); 
        
        W = new ImageIcon(NewResW);
        ImageW.setIcon(W); 
        
        
        cardLayout = (CardLayout)(jPanel2.getLayout());
    }

    private int countCGO = 0;
    private int countPWB = 0;
    private int countSA = 0;
    private int countPM = 0;
    private int countCB = 0;
    private int countCA = 0;
    private int countSSP = 0;
    private int countPC = 0;
    private int countSH = 0;
    private int countLP = 0;
    private int countSGC = 0;
    private int countSP = 0;
    private int countLD = 0;
    private int countBF = 0;
    private int countSC = 0;
    private int countBC = 0;
    private int countSS = 0;
    private int countBS = 0;
    private int countSR = 0;
    private int countBR = 0;
    private int countCHB = 0;
    private int countW = 0;
    
    ImageIcon CGO = new ImageIcon("Sauce1.jpg");
    Image ResCGO = CGO.getImage();
    Image NewResCGO = ResCGO.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon PWB = new ImageIcon("Sauce2.jpg");
    Image ResPWB = PWB.getImage();
    Image NewResPWB = ResPWB.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon SA = new ImageIcon("Sauce3.png");
    Image ResSA = SA.getImage();
    Image NewResSA = ResSA.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon PM = new ImageIcon("Sauce3.png");
    Image ResPM = PM.getImage();
    Image NewResPM = ResPM.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon CB = new ImageIcon("Tray1.jpg");
    Image ResCB = CB.getImage();
    Image NewResCB = ResCB.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon CA = new ImageIcon("Tray2.jpg");
    Image ResCA = CA.getImage();
    Image NewResCA = ResCA.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon SSP = new ImageIcon("Tray3.jpg");
    Image ResSSP = SSP.getImage();
    Image NewResSSP = ResSSP.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon PC = new ImageIcon("Tray4.jpg");
    Image ResPC = PC.getImage();
    Image NewResPC = ResPC.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon SH = new ImageIcon("Tray5.jpg");
    Image ResSH = SH.getImage();
    Image NewResSH = ResSH.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon LP = new ImageIcon("Tray6.jpg");
    Image ResLP = LP.getImage();
    Image NewResLP = ResLP.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon SGC = new ImageIcon("Tray7.jpg");
    Image ResSGC = SGC.getImage();
    Image NewResSGC = ResSGC.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon SP = new ImageIcon("Tray8.jpg");
    Image ResSP = SP.getImage();
    Image NewResSP = ResSP.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon BF = new ImageIcon("Meal1.jpg");
    Image ResBF = BF.getImage();
    Image NewResBF = ResBF.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon LD = new ImageIcon("Meal2.jpg");
    Image ResLD = LD.getImage();
    Image NewResLD = ResLD.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon SC = new ImageIcon("drink1.jpg");
    Image ResSC = SC.getImage();
    Image NewResSC = ResSC.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon BC = new ImageIcon("drink2.png");
    Image ResBC = BC.getImage();
    Image NewResBC = ResBC.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon SS = new ImageIcon("drink3.png");
    Image ResSS = SS.getImage();
    Image NewResSS = ResSS.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon BS = new ImageIcon("drink4.jpeg");
    Image ResBS = BS.getImage();
    Image NewResBS = ResBS.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon SR = new ImageIcon("drink5.png");
    Image ResSR = SR.getImage();
    Image NewResSR = ResSR.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon BR = new ImageIcon("drink6.jpg");
    Image ResBR = BR.getImage();
    Image NewResBR = ResBR.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon CHB = new ImageIcon("drink7.jpg");
    Image ResCHB = CHB.getImage();
    Image NewResCHB = ResCHB.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon W = new ImageIcon("drink8.jpg");
    Image ResW = W.getImage();
    Image NewResW = ResW.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TrayButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        SauceButton = new javax.swing.JButton();
        DetailsButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        TrayPanel = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        MinusCB = new javax.swing.JButton();
        TextCountCB = new javax.swing.JLabel();
        PlusCB = new javax.swing.JButton();
        ImageCB = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        MinusCA = new javax.swing.JButton();
        TextCountCA = new javax.swing.JLabel();
        PlusCA = new javax.swing.JButton();
        ImageSSP = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        MinusSSP = new javax.swing.JButton();
        TextCountSSP = new javax.swing.JLabel();
        PlusSSP = new javax.swing.JButton();
        ImageCA = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        MinusPC = new javax.swing.JButton();
        TextCountPC = new javax.swing.JLabel();
        PlusPC = new javax.swing.JButton();
        ImagePC = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        MinusSH = new javax.swing.JButton();
        TextCountSH = new javax.swing.JLabel();
        PlusSH = new javax.swing.JButton();
        ImageSH = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        MinusLP = new javax.swing.JButton();
        TextCountLP = new javax.swing.JLabel();
        PlusLP = new javax.swing.JButton();
        ImageLP = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        MinusSGC = new javax.swing.JButton();
        TextCountSGC = new javax.swing.JLabel();
        PlusSGC = new javax.swing.JButton();
        ImageSGC = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        MinusSP = new javax.swing.JButton();
        TextCountSP = new javax.swing.JLabel();
        PlusSP = new javax.swing.JButton();
        ImageSP = new javax.swing.JLabel();
        MealPanel = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        MinusBF = new javax.swing.JButton();
        TextCountBF = new javax.swing.JLabel();
        PlusBF = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        MinusLD = new javax.swing.JButton();
        TextCountLD = new javax.swing.JLabel();
        PlusLD = new javax.swing.JButton();
        ImageLD = new javax.swing.JLabel();
        ImageBF = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        DrinksPanel = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        MinusSC = new javax.swing.JButton();
        TextCountSC = new javax.swing.JLabel();
        PlusSC = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        MinusSS = new javax.swing.JButton();
        TextCountSS = new javax.swing.JLabel();
        PlusSS = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        MinusSR = new javax.swing.JButton();
        TextCountSR = new javax.swing.JLabel();
        PlusSR = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        MinusCHB = new javax.swing.JButton();
        TextCountCHB = new javax.swing.JLabel();
        PlusCHB = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        MinusBR = new javax.swing.JButton();
        TextCountBR = new javax.swing.JLabel();
        PlusBR = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        MinusW = new javax.swing.JButton();
        TextCountW = new javax.swing.JLabel();
        PlusW = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        MinusBS = new javax.swing.JButton();
        TextCountBS = new javax.swing.JLabel();
        PlusBS = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        MinusBC = new javax.swing.JButton();
        TextCountBC = new javax.swing.JLabel();
        PlusBC = new javax.swing.JButton();
        ImageBC = new javax.swing.JLabel();
        ImageSC = new javax.swing.JLabel();
        ImageBS = new javax.swing.JLabel();
        ImageSS = new javax.swing.JLabel();
        ImageBR = new javax.swing.JLabel();
        ImageSR = new javax.swing.JLabel();
        ImageCHB = new javax.swing.JLabel();
        ImageW = new javax.swing.JLabel();
        SaucePanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MinusCGO = new javax.swing.JButton();
        TextCountCGO = new javax.swing.JLabel();
        PlusCGO = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        MinusPWB = new javax.swing.JButton();
        TextCountPWB = new javax.swing.JLabel();
        PlusPWB = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        MinusSA = new javax.swing.JButton();
        TextCountSA = new javax.swing.JLabel();
        PlusSA = new javax.swing.JButton();
        ImageCGO = new javax.swing.JLabel();
        ImagePWB = new javax.swing.JLabel();
        ImageSA = new javax.swing.JLabel();
        ImagePM = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        MinusPM = new javax.swing.JButton();
        TextCountPM = new javax.swing.JLabel();
        PlusPM = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        TrayButton.setText("Tray Dishes");
        TrayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrayButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Meals");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Drinks");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        SauceButton.setText("Jar Products");
        SauceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SauceButtonActionPerformed(evt);
            }
        });

        DetailsButton.setText("Order Details");
        DetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(TrayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SauceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DetailsButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TrayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SauceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.CardLayout());

        TrayPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(204, 204, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html><center>Cordon <br>bleu</br></html>");
        jPanel15.add(jLabel6);

        MinusCB.setText("-");
        MinusCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusCBActionPerformed(evt);
            }
        });
        jPanel15.add(MinusCB);

        TextCountCB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountCB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountCB.setText("0");
        jPanel15.add(TextCountCB);

        PlusCB.setText("+");
        PlusCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusCBActionPerformed(evt);
            }
        });
        jPanel15.add(PlusCB);

        ImageCB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageCB.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageCB.setMinimumSize(new java.awt.Dimension(150, 150));

        jPanel16.setBackground(new java.awt.Color(204, 204, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.setLayout(new java.awt.GridLayout(1, 0));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Carbonara");
        jPanel16.add(jLabel7);

        MinusCA.setText("-");
        MinusCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusCAActionPerformed(evt);
            }
        });
        jPanel16.add(MinusCA);

        TextCountCA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountCA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountCA.setText("0");
        jPanel16.add(TextCountCA);

        PlusCA.setText("+");
        PlusCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusCAActionPerformed(evt);
            }
        });
        jPanel16.add(PlusCA);

        ImageSSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageSSP.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageSSP.setMinimumSize(new java.awt.Dimension(150, 150));

        jPanel17.setBackground(new java.awt.Color(204, 204, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel17.setLayout(new java.awt.GridLayout(1, 0));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html><center>Sweet&Sour<br>Pork</br></html>");
        jPanel17.add(jLabel8);

        MinusSSP.setText("-");
        MinusSSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusSSPActionPerformed(evt);
            }
        });
        jPanel17.add(MinusSSP);

        TextCountSSP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountSSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountSSP.setText("0");
        jPanel17.add(TextCountSSP);

        PlusSSP.setText("+");
        PlusSSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusSSPActionPerformed(evt);
            }
        });
        jPanel17.add(PlusSSP);

        ImageCA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageCA.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageCA.setMinimumSize(new java.awt.Dimension(150, 150));

        jPanel18.setBackground(new java.awt.Color(204, 204, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel18.setLayout(new java.awt.GridLayout(1, 0));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("<html><center>Pancit<br>Canton</br></html>");
        jPanel18.add(jLabel9);

        MinusPC.setText("-");
        MinusPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusPCActionPerformed(evt);
            }
        });
        jPanel18.add(MinusPC);

        TextCountPC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountPC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountPC.setText("0");
        jPanel18.add(TextCountPC);

        PlusPC.setText("+");
        PlusPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusPCActionPerformed(evt);
            }
        });
        jPanel18.add(PlusPC);

        ImagePC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagePC.setMaximumSize(new java.awt.Dimension(150, 150));
        ImagePC.setMinimumSize(new java.awt.Dimension(150, 150));

        jPanel19.setBackground(new java.awt.Color(204, 204, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel19.setLayout(new java.awt.GridLayout(1, 0));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("<html><center>Shanghai<br>Rolls</br></html>");
        jPanel19.add(jLabel10);

        MinusSH.setText("-");
        MinusSH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusSHActionPerformed(evt);
            }
        });
        jPanel19.add(MinusSH);

        TextCountSH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountSH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountSH.setText("0");
        jPanel19.add(TextCountSH);

        PlusSH.setText("+");
        PlusSH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusSHActionPerformed(evt);
            }
        });
        jPanel19.add(PlusSH);

        ImageSH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageSH.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageSH.setMinimumSize(new java.awt.Dimension(150, 150));

        jPanel20.setBackground(new java.awt.Color(204, 204, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel20.setLayout(new java.awt.GridLayout(1, 0));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Liempo");
        jPanel20.add(jLabel11);

        MinusLP.setText("-");
        MinusLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusLPActionPerformed(evt);
            }
        });
        jPanel20.add(MinusLP);

        TextCountLP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountLP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountLP.setText("0");
        jPanel20.add(TextCountLP);

        PlusLP.setText("+");
        PlusLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusLPActionPerformed(evt);
            }
        });
        jPanel20.add(PlusLP);

        ImageLP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageLP.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageLP.setMinimumSize(new java.awt.Dimension(150, 150));

        jPanel21.setBackground(new java.awt.Color(204, 204, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel21.setLayout(new java.awt.GridLayout(1, 0));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("<html><center>Soy Garlic<br>Chicken</br></html>");
        jPanel21.add(jLabel12);

        MinusSGC.setText("-");
        MinusSGC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusSGCActionPerformed(evt);
            }
        });
        jPanel21.add(MinusSGC);

        TextCountSGC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountSGC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountSGC.setText("0");
        jPanel21.add(TextCountSGC);

        PlusSGC.setText("+");
        PlusSGC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusSGCActionPerformed(evt);
            }
        });
        jPanel21.add(PlusSGC);

        ImageSGC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageSGC.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageSGC.setMinimumSize(new java.awt.Dimension(150, 150));

        jPanel22.setBackground(new java.awt.Color(204, 204, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.setLayout(new java.awt.GridLayout(1, 0));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("<html><center>Steak &<br>Potatoes</br></html>");
        jPanel22.add(jLabel13);

        MinusSP.setText("-");
        MinusSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusSPActionPerformed(evt);
            }
        });
        jPanel22.add(MinusSP);

        TextCountSP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountSP.setText("0");
        jPanel22.add(TextCountSP);

        PlusSP.setText("+");
        PlusSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusSPActionPerformed(evt);
            }
        });
        jPanel22.add(PlusSP);

        ImageSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageSP.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageSP.setMinimumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout TrayPanelLayout = new javax.swing.GroupLayout(TrayPanel);
        TrayPanel.setLayout(TrayPanelLayout);
        TrayPanelLayout.setHorizontalGroup(
            TrayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrayPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(TrayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(TrayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(TrayPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(ImageSSP, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImageLP, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(TrayPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(ImageCB, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImageSP, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(TrayPanelLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(ImagePC, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImageSH, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
            .addGroup(TrayPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(ImageCA, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImageSGC, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        TrayPanelLayout.setVerticalGroup(
            TrayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TrayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagePC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImageSH, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(TrayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TrayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TrayPanelLayout.createSequentialGroup()
                        .addComponent(ImageSSP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(TrayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ImageLP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TrayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageCA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImageSGC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(TrayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TrayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(TrayPanelLayout.createSequentialGroup()
                        .addComponent(ImageCB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TrayPanelLayout.createSequentialGroup()
                        .addComponent(ImageSP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jPanel2.add(TrayPanel, "TrayPanel");

        MealPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel24.setBackground(new java.awt.Color(204, 204, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel24.setLayout(new java.awt.GridLayout(1, 0));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("<html><center>Breakfast <br>Meals</br></html>");
        jPanel24.add(jLabel15);

        MinusBF.setText("-");
        MinusBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusBFActionPerformed(evt);
            }
        });
        jPanel24.add(MinusBF);

        TextCountBF.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TextCountBF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountBF.setText("0");
        jPanel24.add(TextCountBF);

        PlusBF.setText("+");
        PlusBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusBFActionPerformed(evt);
            }
        });
        jPanel24.add(PlusBF);

        jPanel25.setBackground(new java.awt.Color(204, 204, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel25.setLayout(new java.awt.GridLayout(1, 0));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("<html><center>Lunch/Dinner <br>Meals</br></html>");
        jPanel25.add(jLabel16);

        MinusLD.setText("-");
        MinusLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusLDActionPerformed(evt);
            }
        });
        jPanel25.add(MinusLD);

        TextCountLD.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TextCountLD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountLD.setText("0");
        jPanel25.add(TextCountLD);

        PlusLD.setText("+");
        PlusLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusLDActionPerformed(evt);
            }
        });
        jPanel25.add(PlusLD);

        ImageLD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageLD.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageLD.setMinimumSize(new java.awt.Dimension(150, 150));

        ImageBF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageBF.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageBF.setMinimumSize(new java.awt.Dimension(150, 150));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Insert Order Here (if Any):");
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setToolTipText("");
        jTextArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextArea2.setName(""); // NOI18N
        jScrollPane2.setViewportView(jTextArea2);

        jLabel14.setText("Insert Order Here (if Any):");

        jLabel17.setText("Insert Order Here (if Any):");

        javax.swing.GroupLayout MealPanelLayout = new javax.swing.GroupLayout(MealPanel);
        MealPanel.setLayout(MealPanelLayout);
        MealPanelLayout.setHorizontalGroup(
            MealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MealPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(MealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MealPanelLayout.createSequentialGroup()
                        .addComponent(ImageLD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(MealPanelLayout.createSequentialGroup()
                        .addComponent(ImageBF, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane2))))
                .addGap(44, 44, 44))
        );
        MealPanelLayout.setVerticalGroup(
            MealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MealPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(MealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MealPanelLayout.createSequentialGroup()
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2))
                    .addComponent(ImageBF, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(MealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MealPanelLayout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ImageLD, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jPanel2.add(MealPanel, "MealPanel");

        DrinksPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel23.setBackground(new java.awt.Color(204, 204, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel23.setLayout(new java.awt.GridLayout(1, 0));

        jLabel18.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("<html><center>Coke <br>300ml</br></html>");
        jPanel23.add(jLabel18);

        MinusSC.setText("-");
        MinusSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusSCActionPerformed(evt);
            }
        });
        jPanel23.add(MinusSC);

        TextCountSC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountSC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountSC.setText("0");
        jPanel23.add(TextCountSC);

        PlusSC.setText("+");
        PlusSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusSCActionPerformed(evt);
            }
        });
        jPanel23.add(PlusSC);

        jPanel26.setBackground(new java.awt.Color(204, 204, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel26.setLayout(new java.awt.GridLayout(1, 0));

        jLabel19.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("<html><center>Sprite<br>300ml</br></html>");
        jPanel26.add(jLabel19);

        MinusSS.setText("-");
        MinusSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusSSActionPerformed(evt);
            }
        });
        jPanel26.add(MinusSS);

        TextCountSS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountSS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountSS.setText("0");
        jPanel26.add(TextCountSS);

        PlusSS.setText("+");
        PlusSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusSSActionPerformed(evt);
            }
        });
        jPanel26.add(PlusSS);

        jPanel28.setBackground(new java.awt.Color(204, 204, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel28.setLayout(new java.awt.GridLayout(1, 0));

        jLabel21.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("<html><center>Royal<br>300ml</br></html>");
        jPanel28.add(jLabel21);

        MinusSR.setText("-");
        MinusSR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusSRActionPerformed(evt);
            }
        });
        jPanel28.add(MinusSR);

        TextCountSR.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountSR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountSR.setText("0");
        jPanel28.add(TextCountSR);

        PlusSR.setText("+");
        PlusSR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusSRActionPerformed(evt);
            }
        });
        jPanel28.add(PlusSR);

        jPanel30.setBackground(new java.awt.Color(204, 204, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel30.setLayout(new java.awt.GridLayout(1, 0));

        jLabel23.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("<html><center>Coffee <br>House Brew</br></html>");
        jPanel30.add(jLabel23);

        MinusCHB.setText("-");
        MinusCHB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusCHBActionPerformed(evt);
            }
        });
        jPanel30.add(MinusCHB);

        TextCountCHB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountCHB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountCHB.setText("0");
        jPanel30.add(TextCountCHB);

        PlusCHB.setText("+");
        PlusCHB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusCHBActionPerformed(evt);
            }
        });
        jPanel30.add(PlusCHB);

        jPanel31.setBackground(new java.awt.Color(204, 204, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel31.setLayout(new java.awt.GridLayout(1, 0));

        jLabel24.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("<html><center>Royal <br>1.5L</br></html>");
        jPanel31.add(jLabel24);

        MinusBR.setText("-");
        MinusBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusBRActionPerformed(evt);
            }
        });
        jPanel31.add(MinusBR);

        TextCountBR.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountBR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountBR.setText("0");
        jPanel31.add(TextCountBR);

        PlusBR.setText("+");
        PlusBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusBRActionPerformed(evt);
            }
        });
        jPanel31.add(PlusBR);

        jPanel32.setBackground(new java.awt.Color(204, 204, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel32.setLayout(new java.awt.GridLayout(1, 0));

        jLabel25.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("<html><center>Water <br>500ml</br></html>");
        jPanel32.add(jLabel25);

        MinusW.setText("-");
        MinusW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusWActionPerformed(evt);
            }
        });
        jPanel32.add(MinusW);

        TextCountW.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountW.setText("0");
        jPanel32.add(TextCountW);

        PlusW.setText("+");
        PlusW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusWActionPerformed(evt);
            }
        });
        jPanel32.add(PlusW);

        jPanel33.setBackground(new java.awt.Color(204, 204, 255));
        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel33.setLayout(new java.awt.GridLayout(1, 0));

        jLabel26.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("<html><center>Sprite<br>1.5L</br></html>");
        jPanel33.add(jLabel26);

        MinusBS.setText("-");
        MinusBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusBSActionPerformed(evt);
            }
        });
        jPanel33.add(MinusBS);

        TextCountBS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountBS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountBS.setText("0");
        jPanel33.add(TextCountBS);

        PlusBS.setText("+");
        PlusBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusBSActionPerformed(evt);
            }
        });
        jPanel33.add(PlusBS);

        jPanel34.setBackground(new java.awt.Color(204, 204, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel34.setLayout(new java.awt.GridLayout(1, 0));

        jLabel27.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("<html><center>Coke<br>1.5L</br></html>");
        jPanel34.add(jLabel27);

        MinusBC.setText("-");
        MinusBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusBCActionPerformed(evt);
            }
        });
        jPanel34.add(MinusBC);

        TextCountBC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextCountBC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountBC.setText("0");
        jPanel34.add(TextCountBC);

        PlusBC.setText("+");
        PlusBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusBCActionPerformed(evt);
            }
        });
        jPanel34.add(PlusBC);

        ImageBC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageBC.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageBC.setMinimumSize(new java.awt.Dimension(150, 150));

        ImageSC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageSC.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageSC.setMinimumSize(new java.awt.Dimension(150, 150));

        ImageBS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageBS.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageBS.setMinimumSize(new java.awt.Dimension(150, 150));

        ImageSS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageSS.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageSS.setMinimumSize(new java.awt.Dimension(150, 150));

        ImageBR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageBR.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageBR.setMinimumSize(new java.awt.Dimension(150, 150));

        ImageSR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageSR.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageSR.setMinimumSize(new java.awt.Dimension(150, 150));

        ImageCHB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageCHB.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageCHB.setMinimumSize(new java.awt.Dimension(150, 150));

        ImageW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageW.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageW.setMinimumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout DrinksPanelLayout = new javax.swing.GroupLayout(DrinksPanel);
        DrinksPanel.setLayout(DrinksPanelLayout);
        DrinksPanelLayout.setHorizontalGroup(
            DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksPanelLayout.createSequentialGroup()
                .addGroup(DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DrinksPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DrinksPanelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(ImageSC, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DrinksPanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(ImageSS, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrinksPanelLayout.createSequentialGroup()
                        .addGroup(DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrinksPanelLayout.createSequentialGroup()
                        .addComponent(ImageBS, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrinksPanelLayout.createSequentialGroup()
                        .addComponent(ImageBC, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrinksPanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(ImageSR, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImageBR, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrinksPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(ImageW, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImageCHB, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        DrinksPanelLayout.setVerticalGroup(
            DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksPanelLayout.createSequentialGroup()
                .addGroup(DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DrinksPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ImageBC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrinksPanelLayout.createSequentialGroup()
                        .addComponent(ImageSC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ImageBS, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImageSS, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageBR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImageSR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageCHB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImageW, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DrinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel2.add(DrinksPanel, "DrinksPanel");

        SaucePanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.setMaximumSize(new java.awt.Dimension(200, 200));
        jPanel4.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel4.setName(""); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));
        jPanel10.setMaximumSize(new java.awt.Dimension(150, 150));
        jPanel10.setMinimumSize(new java.awt.Dimension(150, 150));
        jPanel10.setPreferredSize(new java.awt.Dimension(22, 22));
        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Crunchy <br>Garlic Oil</br></html>");
        jPanel10.add(jLabel1);

        MinusCGO.setText("-");
        MinusCGO.setMaximumSize(new java.awt.Dimension(7, 7));
        MinusCGO.setMinimumSize(new java.awt.Dimension(7, 7));
        MinusCGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusCGOActionPerformed(evt);
            }
        });
        jPanel10.add(MinusCGO);

        TextCountCGO.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TextCountCGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountCGO.setText("0");
        jPanel10.add(TextCountCGO);

        PlusCGO.setText("+");
        PlusCGO.setMaximumSize(new java.awt.Dimension(7, 7));
        PlusCGO.setMinimumSize(new java.awt.Dimension(7, 7));
        PlusCGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusCGOActionPerformed(evt);
            }
        });
        jPanel10.add(PlusCGO);

        jPanel4.add(jPanel10);

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel11.setPreferredSize(new java.awt.Dimension(22, 22));
        jPanel11.setLayout(new java.awt.GridLayout(1, 4));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><center>Pork<br> with Bagoong</br></html>");
        jLabel2.setToolTipText("");
        jPanel11.add(jLabel2);

        MinusPWB.setText("-");
        MinusPWB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusPWBActionPerformed(evt);
            }
        });
        jPanel11.add(MinusPWB);

        TextCountPWB.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TextCountPWB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountPWB.setText("0");
        jPanel11.add(TextCountPWB);

        PlusPWB.setText("+");
        PlusPWB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusPWBActionPerformed(evt);
            }
        });
        jPanel11.add(PlusPWB);

        jPanel8.add(jPanel11);

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>Special <br>Atchara</br></html>");
        jPanel9.add(jLabel3);

        MinusSA.setText("-");
        MinusSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusSAActionPerformed(evt);
            }
        });
        jPanel9.add(MinusSA);

        TextCountSA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TextCountSA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountSA.setText("0");
        jPanel9.add(TextCountSA);

        PlusSA.setText("+");
        PlusSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusSAActionPerformed(evt);
            }
        });
        jPanel9.add(PlusSA);

        ImageCGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageCGO.setMaximumSize(new java.awt.Dimension(150, 150));
        ImageCGO.setMinimumSize(new java.awt.Dimension(150, 150));

        ImagePWB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel14.setBackground(new java.awt.Color(204, 204, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel14.setLayout(new java.awt.GridLayout(1, 0));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html><center>Pickled <br>Mangoes</br></html>");
        jPanel14.add(jLabel5);

        MinusPM.setText("-");
        MinusPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusPMActionPerformed(evt);
            }
        });
        jPanel14.add(MinusPM);

        TextCountPM.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TextCountPM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextCountPM.setText("0");
        jPanel14.add(TextCountPM);

        PlusPM.setText("+");
        PlusPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusPMActionPerformed(evt);
            }
        });
        jPanel14.add(PlusPM);

        javax.swing.GroupLayout SaucePanelLayout = new javax.swing.GroupLayout(SaucePanel);
        SaucePanel.setLayout(SaucePanelLayout);
        SaucePanelLayout.setHorizontalGroup(
            SaucePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SaucePanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(SaucePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ImagePM, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SaucePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ImageCGO, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(ImagePWB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ImageSA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SaucePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SaucePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        SaucePanelLayout.setVerticalGroup(
            SaucePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SaucePanelLayout.createSequentialGroup()
                .addGroup(SaucePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SaucePanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                    .addGroup(SaucePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ImageCGO, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ImagePWB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(SaucePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SaucePanelLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(SaucePanelLayout.createSequentialGroup()
                        .addComponent(ImageSA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ImagePM, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
        );

        jPanel2.add(SaucePanel, "SaucePanel");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel28.setText("Address:");

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane3.setViewportView(jTextArea3);

        jLabel29.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel29.setText("Date and Time:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "November", "December" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM" }));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel30.setText("(MM/DY/TIME)");

        jLabel31.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel31.setText("Address:");

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel28)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel31)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, "card6");

        jPanel3.setBackground(new java.awt.Color(102, 255, 204));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel13.setLayout(new java.awt.GridLayout(1, 0));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Order Summary");
        jPanel13.add(jLabel4);

        jButton4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton4.setText("Place Order");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu Item", "Quantity", "Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(164, 164, 164))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4))
        );

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlusCGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusCGOActionPerformed
        // TODO add your handling code here:
        countCGO++;
        item = "Crunchy Garlic Oil";
        price = 450;
        itemTotal = countCGO * price;
        TextCountCGO.setText(" "+countCGO+" ");

        Object[] cgo = {item, countCGO, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(cgo);

        if (countCGO > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Crunchy Garlic Oil")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusCGOActionPerformed

    private void PlusSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusSAActionPerformed
        // TODO add your handling code here:
        countSA++;
        item = "Special Atchara";
        price = 450;
        itemTotal = countSA * price;
        TextCountSA.setText(" "+countSA+" ");

        Object[] sa = {item, countSA, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(sa);

        if (countSA > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Special Atchara")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusSAActionPerformed

    private void MinusCGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusCGOActionPerformed
        // TODO add your handling code here:
        countCGO--;
        TextCountCGO.setText(" "+countCGO+" ");
        
        if(countCGO<0){
            countCGO=0;
            TextCountCGO.setText(" "+countCGO+" ");
        }
    }//GEN-LAST:event_MinusCGOActionPerformed

    private void MinusSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusSAActionPerformed
        // TODO add your handling code here:
        
        countSA--;
        TextCountSA.setText(" "+countSA+" ");
        
        if(countSA<0){
            countSA=0;
            TextCountSA.setText(" "+countSA+" ");
        }
    }//GEN-LAST:event_MinusSAActionPerformed

    private void SauceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SauceButtonActionPerformed
        // TODO add your handling code here:
        
        cardLayout.show(jPanel2, "SaucePanel");
    }//GEN-LAST:event_SauceButtonActionPerformed

    private void PlusPWBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusPWBActionPerformed
        // TODO add your handling code here:
        countPWB++;  
        item = "Pork w/ Bagoong";
        price = 450;
        itemTotal = countPWB * price;
        TextCountPWB.setText(" "+countPWB+" ");

        Object[] pwb = {item, countPWB, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(pwb);

        if (countPWB > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Pork w/ Bagoong")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusPWBActionPerformed

    private void MinusPWBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusPWBActionPerformed
        // TODO add your handling code here:
        countPWB--;
        TextCountPWB.setText(" "+countPWB+" ");

        if(countPWB<0){
            countPWB=0;
            TextCountPWB.setText(" "+countPWB+" ");
        }
    }//GEN-LAST:event_MinusPWBActionPerformed

    private void MinusPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusPMActionPerformed
        // TODO add your handling code here:
        countPM--;
        TextCountPM.setText(" "+countPM+" ");

        if(countPM<0){
            countPM=0;
            TextCountPM.setText(" "+countPM+" ");
        }
    }//GEN-LAST:event_MinusPMActionPerformed

    private void PlusPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusPMActionPerformed
        // TODO add your handling code here:
        countPM++;
        item = "Pickled Mangoes";
        price = 450;
        itemTotal = countPM * price;
        TextCountPM.setText(" "+countPM+" ");

        Object[] pm = {item, countPM, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(pm);

        if (countPM > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Pickled Mangoes")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusPMActionPerformed

    private void MinusCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusCBActionPerformed
        // TODO add your handling code here:
        countCB--;
        TextCountCB.setText(" "+countCB+" ");

        if(countCB<0){
            countCB=0;
            TextCountCB.setText(" "+countCB+" ");
        }
    }//GEN-LAST:event_MinusCBActionPerformed

    private void PlusCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusCBActionPerformed
        // TODO add your handling code here:
        countCB++;
        item = "Cordon Bleu";
        price = 2998;
        itemTotal = countCB * price;
        TextCountCB.setText(" "+countCB+" ");

        Object[] cordon = {item, countCB, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(cordon);

        if (countCB > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Cordon Bleu")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusCBActionPerformed

    private void MinusCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusCAActionPerformed
        // TODO add your handling code here:
        
        countCA--;
        TextCountCA.setText(" "+countCA+" ");

        if(countCA<0){
            countCA=0;
            TextCountCA.setText(" "+countCA+" ");
        }
    }//GEN-LAST:event_MinusCAActionPerformed

    private void PlusCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusCAActionPerformed
        // TODO add your handling code here:
        countCA++;
        item = "Carbonara";
        price = 1675;
        itemTotal = countCA * price;
        TextCountCA.setText(" "+countCA+" ");

        Object[] carbonara = {item, countCA, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(carbonara);

        if (countCA > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Carbonara")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusCAActionPerformed

    private void MinusSSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusSSPActionPerformed
        // TODO add your handling code here:
        countSSP--;
        TextCountSSP.setText(" "+countSSP+" ");

        if(countSSP<0){
            countSSP=0;
            TextCountSSP.setText(" "+countSSP+" ");
        }
    }//GEN-LAST:event_MinusSSPActionPerformed

    private void PlusSSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusSSPActionPerformed
        // TODO add your handling code here:
        countSSP++;
        item = "Sweet & Sour Pork";
        price = 2700;
        itemTotal = countSSP * price;
        TextCountSSP.setText(" "+countSSP+" ");

        Object[] SSP = {item, countSSP, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(SSP);

        if (countSSP > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Sweet & Sour Pork")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
        
        
    }//GEN-LAST:event_PlusSSPActionPerformed

    private void MinusPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusPCActionPerformed
        // TODO add your handling code here:
        countPC = 0;
        TextCountPC.setText(" "+countPC+" ");
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        if(countPC<0){
            countPC=0;
            TextCountPC.setText(" "+countPC+" ");
        }
        
        if (countPC > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Pancit Canton")) {
                model.removeRow(i);
            }
            }
        }
    }//GEN-LAST:event_MinusPCActionPerformed

    private void PlusPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusPCActionPerformed
        // TODO add your handling code here:

            countPC++;
            item = "Pancit Canton";
            price = 1200;
            itemTotal = countPC * price;
            TextCountPC.setText(" "+countPC+" ");

            Object[] pancit = {item, countPC, price, itemTotal};
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(pancit);
            
            if (countPC > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Pancit Canton")) {
                model.removeRow(i);
            }
            }
            }
            totalPrice =  totalPrice + itemTotal;
        
    }//GEN-LAST:event_PlusPCActionPerformed

    private void TrayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrayButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(jPanel2, "TrayPanel");
        
    }//GEN-LAST:event_TrayButtonActionPerformed

    private void MinusSHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusSHActionPerformed
        // TODO add your handling code here:
        countSH--;
        TextCountSH.setText(" "+countSH+" ");

        if(countSH<0){
            countSH=0;
            TextCountSH.setText(" "+countSH+" ");
        }
    }//GEN-LAST:event_MinusSHActionPerformed

    private void PlusSHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusSHActionPerformed
        // TODO add your handling code here:

        countSH++;
        item = "Shanghai Rolls";
        price = 1750;
        itemTotal = countSH * price;
        TextCountSH.setText(" "+countSH+" ");

        Object[] shanghai = {item, countSH, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(shanghai);

        if (countSH > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Shanghai Rolls")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusSHActionPerformed

    private void MinusLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusLPActionPerformed
        // TODO add your handling code here:
        countLP--;
        TextCountLP.setText(" "+countLP+" ");

        if(countLP<0){
            countLP=0;
            TextCountLP.setText(" "+countLP+" ");
        }
    }//GEN-LAST:event_MinusLPActionPerformed

    private void PlusLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusLPActionPerformed
        // TODO add your handling code here:
        countLP++;
        item = "Liempo";
        price = 1800;
        itemTotal = countLP* price;
        TextCountLP.setText(" "+countLP+" ");

        Object[] liempo = {item, countLP, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(liempo);

        if (countLP > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Liempo")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusLPActionPerformed

    private void MinusSGCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusSGCActionPerformed
        // TODO add your handling code here:
        countSGC--;
        TextCountSGC.setText(" "+countSGC+" ");

        if(countSGC<0){
            countSGC=0;
            TextCountSGC.setText(" "+countSGC+" ");
        }
        
    }//GEN-LAST:event_MinusSGCActionPerformed

    private void PlusSGCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusSGCActionPerformed
        // TODO add your handling code here:
        countSGC++;
        item = "Soy Garlic Chicken";
        price = 1350;
        itemTotal = countSGC * price;
        TextCountSGC.setText(" "+countSGC+" ");

        Object[] soyg = {item, countSGC, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(soyg);

        if (countSGC > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Soy Garlic Chicken")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusSGCActionPerformed

    private void MinusSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusSPActionPerformed
        // TODO add your handling code here:
        countSP--;
        TextCountSP.setText(" "+countSP+" ");

        if(countSP<0){
            countSP=0;
            TextCountSP.setText(" "+countSP+" ");
        }
    }//GEN-LAST:event_MinusSPActionPerformed

    private void PlusSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusSPActionPerformed
        // TODO add your handling code here:
        countSP++;
        item = "Steak & Potatoes";
        price = 2840;
        itemTotal = countSP * price;
        TextCountSP.setText(" "+countSP+" ");

        Object[] steak = {item, countSP, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(steak);

        if (countSP > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Steak & Potatoes")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusSPActionPerformed

    private void MinusBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusBFActionPerformed
        // TODO add your handling code here:
        countBF--;
        TextCountBF.setText(" "+countBF+" ");

        if(countBF<0){
            countBF=0;
            TextCountBF.setText(" "+countBF+" ");
        }
    }//GEN-LAST:event_MinusBFActionPerformed

    private void PlusBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusBFActionPerformed
        // TODO add your handling code here:
        countBF++;
        item = "Breakfast Meals";
        price = 75;
        itemTotal = countBF * price;
        TextCountBF.setText(" "+countBF+" ");

        Object[] bf = {item, countBF, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(bf);

        if (countBF > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Breakfast Meals")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusBFActionPerformed

    private void MinusLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusLDActionPerformed
        // TODO add your handling code here:
        countLD--;
        TextCountLD.setText(" "+countLD+" ");

        if(countLD<0){
            countLD=0;
            TextCountLD.setText(" "+countLD+" ");
        }
    }//GEN-LAST:event_MinusLDActionPerformed

    private void PlusLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusLDActionPerformed
        // TODO add your handling code here:
        countLD++;
        item = "Lunch/Dinner Meals";
        price = 80;
        itemTotal = countLD * price;
        TextCountLD.setText(" "+countLD+" ");

        Object[] ld = {item, countLD, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(ld);

        if (countLD > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Lunch/Dinner Meals")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusLDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cardLayout.show(jPanel2, "MealPanel");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MinusSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusSCActionPerformed
        // TODO add your handling code here:
        
        countSC--;
        TextCountSC.setText(" "+countSC+" ");

        if(countSC<0){
            countSC=0;
            TextCountSC.setText(" "+countSC+" ");
        }
    }//GEN-LAST:event_MinusSCActionPerformed

    private void PlusSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusSCActionPerformed
        // TODO add your handling code here:
        countSC++;
        item = "Coke 300ml";
        price = 25;
        itemTotal = countSC * price;
        TextCountSC.setText(" "+countSC+" ");

        Object[] cokeml = {item, countSC, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(cokeml);

        if (countSC > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Coke 300ml")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusSCActionPerformed

    private void MinusSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusSSActionPerformed
        // TODO add your handling code here:
        
        countSS--;
        TextCountSS.setText(" "+countSS+" ");

        if(countSS<0){
            countSS=0;
            TextCountSS.setText(" "+countSS+" ");
        }
    }//GEN-LAST:event_MinusSSActionPerformed

    private void PlusSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusSSActionPerformed
        // TODO add your handling code here:
        countSS++;
        item = "Sprite 300ml";
        price = 25;
        itemTotal = countSS * price;
        TextCountSS.setText(" "+countSS+" ");

        Object[] spriteml = {item, countSS, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(spriteml);

        if (countSS > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Sprite 300ml")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusSSActionPerformed

    private void MinusCB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusCB3ActionPerformed
        // TODO add your handling code here:
        
        //DISREGARD
    }//GEN-LAST:event_MinusCB3ActionPerformed

    private void PlusCB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusCB3ActionPerformed
        // TODO add your handling code here:
        
        //DISREGARD
    }//GEN-LAST:event_PlusCB3ActionPerformed

    private void MinusSRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusSRActionPerformed
        // TODO add your handling code here:
        
        countSR--;
        TextCountSR.setText(" "+countSR+" ");

        if(countSR<0){
            countSR=0;
            TextCountSR.setText(" "+countSR+" ");
        }
    }//GEN-LAST:event_MinusSRActionPerformed

    private void PlusSRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusSRActionPerformed
        // TODO add your handling code here:
        countSR++;
        item = "Royal 300ml";
        price = 25;
        itemTotal = countSR * price;
        TextCountSR.setText(" "+countSR+" ");

        Object[] royalml = {item, countSR, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(royalml);

        if (countSR > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Royal 300ml")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusSRActionPerformed

    private void MinusCB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusCB5ActionPerformed
        // TODO add your handling code here:
        
        //DISREGARD
    }//GEN-LAST:event_MinusCB5ActionPerformed

    private void PlusCB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusCB5ActionPerformed
        // TODO add your handling code here:
        
        //DISREGARD
    }//GEN-LAST:event_PlusCB5ActionPerformed

    private void MinusCHBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusCHBActionPerformed
        // TODO add your handling code here:
        
        countCHB--;
        TextCountCHB.setText(" "+countCHB+" ");

        if(countCHB<0){
            countCHB=0;
            TextCountCHB.setText(" "+countCHB+" ");
        }
    }//GEN-LAST:event_MinusCHBActionPerformed

    private void PlusCHBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusCHBActionPerformed
        // TODO add your handling code here:
        countCHB++;
        item = "Coffee Home Brew";
        price = 40;
        itemTotal = countCHB * price;
        TextCountCHB.setText(" "+countCHB+" ");

        Object[] chb = {item, countCHB, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(chb);

        if (countCHB > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Coffee Home Brew")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusCHBActionPerformed

    private void MinusBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusBRActionPerformed
        // TODO add your handling code here:
        
        countBR--;
        TextCountBR.setText(" "+countBR+" ");

        if(countBR<0){
            countBR=0;
            TextCountBR.setText(" "+countBR+" ");
        }
    }//GEN-LAST:event_MinusBRActionPerformed

    private void PlusBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusBRActionPerformed
        // TODO add your handling code here:
        countBR++;
        item = "Royal 1.5L";
        price = 50;
        itemTotal = countBR * price;
        TextCountBR.setText(" "+countBR+" ");

        Object[] royall = {item, countBR, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(royall);

        if (countBR > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Royal 1.5L")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusBRActionPerformed

    private void MinusWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusWActionPerformed
        // TODO add your handling code here:
        
        countW--;
        TextCountW.setText(" "+countW+" ");

        if(countW<0){
            countW=0;
            TextCountW.setText(" "+countW+" ");
        }
    }//GEN-LAST:event_MinusWActionPerformed

    private void PlusWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusWActionPerformed
        // TODO add your handling code here:
        countW++;
        item = "Water";
        price = 20;
        itemTotal = countW * price;
        TextCountW.setText(" "+countW+" ");

        Object[] water = {item, countW, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(water);

        if (countW > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Water")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusWActionPerformed

    private void MinusBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusBSActionPerformed
        // TODO add your handling code here:
        
        countBS--;
        TextCountBS.setText(" "+countBS+" ");

        if(countBS<0){
            countBS=0;
            TextCountBS.setText(" "+countBS+" ");
        }
    }//GEN-LAST:event_MinusBSActionPerformed

    private void PlusBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusBSActionPerformed
        // TODO add your handling code here:
        countBS++;
        item = "Sprite 1.5L";
        price = 50;
        itemTotal = countBS * price;
        TextCountBS.setText(" "+countBS+" ");

        Object[] spritel = {item, countBS, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(spritel);

        if (countBS > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Sprite 1.5L")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusBSActionPerformed

    private void MinusBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusBCActionPerformed
        // TODO add your handling code here:
        
        countBC--;
        TextCountBC.setText(" "+countBC+" ");

        if(countBC<0){
            countBC=0;
            TextCountBC.setText(" "+countBC+" ");
        }
    }//GEN-LAST:event_MinusBCActionPerformed

    private void PlusBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusBCActionPerformed
        // TODO add your handling code here:
        countBC++;
        item = "Coke 1.5L";
        price = 50;
        itemTotal = countBC * price;
        TextCountBC.setText(" "+countBC+" ");

        Object[] cokel = {item, countBC, price, itemTotal};
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(cokel);

        if (countBC > 1){
            for (int i = 0; i < model.getRowCount(); i++){
                if (((String)model.getValueAt(i, 0)).equals("Coke 1.5L")) {
                model.removeRow(i);
        }
        }
        }
        totalPrice += itemTotal;
    }//GEN-LAST:event_PlusBCActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
       cardLayout.show(jPanel2, "DrinksPanel");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void DetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailsButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(jPanel2, "card6");
    }//GEN-LAST:event_DetailsButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DetailsButton;
    private javax.swing.JPanel DrinksPanel;
    private javax.swing.JLabel ImageBC;
    private javax.swing.JLabel ImageBF;
    private javax.swing.JLabel ImageBR;
    private javax.swing.JLabel ImageBS;
    private javax.swing.JLabel ImageCA;
    private javax.swing.JLabel ImageCB;
    private javax.swing.JLabel ImageCGO;
    private javax.swing.JLabel ImageCHB;
    private javax.swing.JLabel ImageLD;
    private javax.swing.JLabel ImageLP;
    private javax.swing.JLabel ImagePC;
    private javax.swing.JLabel ImagePM;
    private javax.swing.JLabel ImagePWB;
    private javax.swing.JLabel ImageSA;
    private javax.swing.JLabel ImageSC;
    private javax.swing.JLabel ImageSGC;
    private javax.swing.JLabel ImageSH;
    private javax.swing.JLabel ImageSP;
    private javax.swing.JLabel ImageSR;
    private javax.swing.JLabel ImageSS;
    private javax.swing.JLabel ImageSSP;
    private javax.swing.JLabel ImageW;
    private javax.swing.JPanel MealPanel;
    private javax.swing.JButton MinusBC;
    private javax.swing.JButton MinusBF;
    private javax.swing.JButton MinusBR;
    private javax.swing.JButton MinusBS;
    private javax.swing.JButton MinusCA;
    private javax.swing.JButton MinusCB;
    private javax.swing.JButton MinusCGO;
    private javax.swing.JButton MinusCHB;
    private javax.swing.JButton MinusLD;
    private javax.swing.JButton MinusLP;
    private javax.swing.JButton MinusPC;
    private javax.swing.JButton MinusPM;
    private javax.swing.JButton MinusPWB;
    private javax.swing.JButton MinusSA;
    private javax.swing.JButton MinusSC;
    private javax.swing.JButton MinusSGC;
    private javax.swing.JButton MinusSH;
    private javax.swing.JButton MinusSP;
    private javax.swing.JButton MinusSR;
    private javax.swing.JButton MinusSS;
    private javax.swing.JButton MinusSSP;
    private javax.swing.JButton MinusW;
    private javax.swing.JButton PlusBC;
    private javax.swing.JButton PlusBF;
    private javax.swing.JButton PlusBR;
    private javax.swing.JButton PlusBS;
    private javax.swing.JButton PlusCA;
    private javax.swing.JButton PlusCB;
    private javax.swing.JButton PlusCGO;
    private javax.swing.JButton PlusCHB;
    private javax.swing.JButton PlusLD;
    private javax.swing.JButton PlusLP;
    private javax.swing.JButton PlusPC;
    private javax.swing.JButton PlusPM;
    private javax.swing.JButton PlusPWB;
    private javax.swing.JButton PlusSA;
    private javax.swing.JButton PlusSC;
    private javax.swing.JButton PlusSGC;
    private javax.swing.JButton PlusSH;
    private javax.swing.JButton PlusSP;
    private javax.swing.JButton PlusSR;
    private javax.swing.JButton PlusSS;
    private javax.swing.JButton PlusSSP;
    private javax.swing.JButton PlusW;
    private javax.swing.JButton SauceButton;
    private javax.swing.JPanel SaucePanel;
    private javax.swing.JLabel TextCountBC;
    private javax.swing.JLabel TextCountBF;
    private javax.swing.JLabel TextCountBR;
    private javax.swing.JLabel TextCountBS;
    private javax.swing.JLabel TextCountCA;
    private javax.swing.JLabel TextCountCB;
    private javax.swing.JLabel TextCountCGO;
    private javax.swing.JLabel TextCountCHB;
    private javax.swing.JLabel TextCountLD;
    private javax.swing.JLabel TextCountLP;
    private javax.swing.JLabel TextCountPC;
    private javax.swing.JLabel TextCountPM;
    private javax.swing.JLabel TextCountPWB;
    private javax.swing.JLabel TextCountSA;
    private javax.swing.JLabel TextCountSC;
    private javax.swing.JLabel TextCountSGC;
    private javax.swing.JLabel TextCountSH;
    private javax.swing.JLabel TextCountSP;
    private javax.swing.JLabel TextCountSR;
    private javax.swing.JLabel TextCountSS;
    private javax.swing.JLabel TextCountSSP;
    private javax.swing.JLabel TextCountW;
    private javax.swing.JButton TrayButton;
    private javax.swing.JPanel TrayPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
