/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.thepetproject.swing.components;

/**
 *
 * @author deynklarys
 */

/**
 * name.setFont(fontBold20f);
 * labelAge.setFont(fontBold20f);
 * labelSex.setFont(fontBold14f);
 * age.setFont(fontPlain14f);
 * sex.setFont(fontPlain14f);
 */
public class PetCard extends javax.swing.JPanel {

    /**
     * Creates new form PetCard
     */
    public PetCard() {
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

        panelRound1 = new com.mycompany.thepetproject.swing.components.PanelRound();
        image = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();
        labelSex = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        sex = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(150, 230));
        setMinimumSize(new java.awt.Dimension(150, 230));
        setPreferredSize(new java.awt.Dimension(150, 230));

        panelRound1.setBackground(new java.awt.Color(248, 208, 70));
        panelRound1.setMaximumSize(new java.awt.Dimension(150, 230));
        panelRound1.setMinimumSize(new java.awt.Dimension(150, 230));
        panelRound1.setPreferredSize(new java.awt.Dimension(150, 130));

        image.setForeground(new java.awt.Color(38, 50, 56));
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/thepetproject/swing/components/dog.png"))); // NOI18N
        image.setText("image");
        image.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(38, 50, 56), 1, true));

        name.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        name.setForeground(new java.awt.Color(38, 50, 56));
        name.setText("name");

        labelAge.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelAge.setForeground(new java.awt.Color(38, 50, 56));
        labelAge.setText("Age:");

        labelSex.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSex.setForeground(new java.awt.Color(38, 50, 56));
        labelSex.setText("Sex:");

        age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        age.setForeground(new java.awt.Color(38, 50, 56));
        age.setText("age");

        sex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sex.setForeground(new java.awt.Color(38, 50, 56));
        sex.setText("sex");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelSex, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAge)
                    .addComponent(age))
                .addGap(0, 0, 0)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSex)
                    .addComponent(sex))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel image;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelSex;
    private javax.swing.JLabel name;
    private com.mycompany.thepetproject.swing.components.PanelRound panelRound1;
    private javax.swing.JLabel sex;
    // End of variables declaration//GEN-END:variables
}