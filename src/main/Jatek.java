/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Jatek extends javax.swing.JFrame {

    
    public Jatek() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblLeiras = new javax.swing.JLabel();
        Btn1_1 = new javax.swing.JButton();
        Btn1_2 = new javax.swing.JButton();
        Btn1_3 = new javax.swing.JButton();
        Btn1_4 = new javax.swing.JButton();
        Btn2_1 = new javax.swing.JButton();
        Btn2_2 = new javax.swing.JButton();
        Btn2_3 = new javax.swing.JButton();
        Btn2_4 = new javax.swing.JButton();
        Btn3_1 = new javax.swing.JButton();
        Btn3_2 = new javax.swing.JButton();
        Btn3_3 = new javax.swing.JButton();
        Btn3_4 = new javax.swing.JButton();
        Btn4_1 = new javax.swing.JButton();
        Btn4_2 = new javax.swing.JButton();
        Btn4_3 = new javax.swing.JButton();
        Btn4_4 = new javax.swing.JButton();
        lblKivalaszt = new javax.swing.JLabel();
        lblLepesSzam = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logikai játék");
        setResizable(false);

        lblLeiras.setText("Válaszd ki az egyik oszlop legfelső elemét!");

        Btn1_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/kek.png"))); // NOI18N
        Btn1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1_2ActionPerformed(evt);
            }
        });

        Btn1_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/piros.png"))); // NOI18N

        Btn1_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/zold.png"))); // NOI18N

        Btn2_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/zold.png"))); // NOI18N
        Btn2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2_2ActionPerformed(evt);
            }
        });

        Btn2_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/piros.png"))); // NOI18N

        Btn2_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/zold.png"))); // NOI18N

        Btn3_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/piros.png"))); // NOI18N
        Btn3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3_2ActionPerformed(evt);
            }
        });

        Btn3_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/kek.png"))); // NOI18N

        Btn3_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/kek.png"))); // NOI18N

        Btn4_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4_4ActionPerformed(evt);
            }
        });

        lblKivalaszt.setText("Kiválasztva: -");

        lblLepesSzam.setText("Lépések száma: 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn1_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn1_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn1_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Btn2_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn2_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn2_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn3_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn3_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn3_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblLeiras)
                    .addComponent(lblKivalaszt)
                    .addComponent(lblLepesSzam))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Btn1_1, Btn1_2, Btn1_3, Btn1_4, Btn2_1, Btn2_2, Btn2_3, Btn2_4, Btn3_1, Btn3_2, Btn3_3, Btn3_4, Btn4_1, Btn4_2, Btn4_3, Btn4_4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLeiras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn1_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn1_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn1_4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn3_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn3_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn3_4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn2_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn2_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn2_4)))))
                .addGap(18, 18, 18)
                .addComponent(lblKivalaszt)
                .addGap(18, 18, 18)
                .addComponent(lblLepesSzam)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Btn1_1, Btn1_2, Btn1_3, Btn1_4, Btn2_1, Btn2_2, Btn2_3, Btn2_4, Btn3_1, Btn3_2, Btn3_3, Btn3_4, Btn4_1, Btn4_2, Btn4_3, Btn4_4});

        jTabbedPane1.addTab("Játék", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Megoldás", jPanel2);

        jMenu1.setText("Program");

        jMenuItem4.setText("Új játék");
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator2);

        jMenuItem1.setText("Mentés");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Betöltés");
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Kilépés");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    JButton gomb = null;
    String aktiv = "";
    int klikk = 0;
    private void setAktivSzin(JButton button) {
        Icon icon = button.getIcon();
        if (icon instanceof ImageIcon) {
            String path = ((ImageIcon) icon).toString();
            if (path.contains("zold.png")) {
                aktiv = "z";
            } else if (path.contains("piros.png")) {
                aktiv = "p";
            } else if (path.contains("kek.png")) {
                aktiv = "k";
            } else {
                aktiv = "?";
            }
        }
    }
    private String karakterSzinne(String karakter){
        switch (karakter) {
            case "k":
                return "kék";
            case "p":
                return "piros";
            case "z":
                return "zöld";   
        }
        return "?";
    }
    private void kiirasok() {
        lblLeiras.setText("Jelöld, hogy hova rakod!");
        lblKivalaszt.setText("Kiválasztva: "+karakterSzinne(aktiv));
        lblLepesSzam.setText("Lépések száma: " + klikk);
    }  
    //gomb elnevezés: oszlop,sor
    private void Btn1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1_2ActionPerformed
        gomb = Btn1_2;
        setAktivSzin(gomb);
        kiirasok();
        klikk++; //klikk += 1  
    }//GEN-LAST:event_Btn1_2ActionPerformed

    private void Btn2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2_2ActionPerformed
        gomb = Btn2_2;
        setAktivSzin(gomb);
        kiirasok();
        klikk++; //klikk += 1  
    }//GEN-LAST:event_Btn2_2ActionPerformed

    private void Btn3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3_2ActionPerformed
        gomb = Btn3_2;
        setAktivSzin(gomb);
        kiirasok();
        klikk++; //klikk += 1  
    }//GEN-LAST:event_Btn3_2ActionPerformed

    private void Btn4_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4_4ActionPerformed
        gomb = Btn4_4;
        if (aktiv == "") {
            setAktivSzin(gomb);
        }
        System.out.println(aktiv);
        kiirasok();
        klikk++; //klikk += 1  
        if(aktiv.equals("k")){
            
            Btn4_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/kek.png")));
        }else if(aktiv.equals("z")){
            Btn4_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/zold.png")));
        }else if(aktiv.equals("p")){
            Btn4_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/piros.png")));
        }
        aktiv = "";
        gomb.setIcon(null);
    }//GEN-LAST:event_Btn4_4ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jatek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1_1;
    private javax.swing.JButton Btn1_2;
    private javax.swing.JButton Btn1_3;
    private javax.swing.JButton Btn1_4;
    private javax.swing.JButton Btn2_1;
    private javax.swing.JButton Btn2_2;
    private javax.swing.JButton Btn2_3;
    private javax.swing.JButton Btn2_4;
    private javax.swing.JButton Btn3_1;
    private javax.swing.JButton Btn3_2;
    private javax.swing.JButton Btn3_3;
    private javax.swing.JButton Btn3_4;
    private javax.swing.JButton Btn4_1;
    private javax.swing.JButton Btn4_2;
    private javax.swing.JButton Btn4_3;
    private javax.swing.JButton Btn4_4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblKivalaszt;
    private javax.swing.JLabel lblLeiras;
    private javax.swing.JLabel lblLepesSzam;
    // End of variables declaration//GEN-END:variables
}
