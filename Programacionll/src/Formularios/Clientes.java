/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author J Cardoza
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CboDePARTAMENTOS = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtCodigo = new rojeru_san.RSMTextFull();
        txtNombre = new rojeru_san.RSMTextFull();
        txtCaserioColonia1 = new rojeru_san.RSMTextFull();
        txtTelefono1 = new rojeru_san.RSMTextFull();
        txtDireccion1 = new rojeru_san.RSMTextFull();
        txtMunicipio1 = new rojeru_san.RSMTextFull();
        txtCodigoPostal1 = new rojeru_san.RSMTextFull();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(44, 189, 165));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 742, 838, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel2.setText("Dirección");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel4.setText("Código");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel5.setText("Caserio/Colonia");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel6.setText("Departamento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 409, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel8.setText("Municipio");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 190, -1, -1));

        CboDePARTAMENTOS.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        CboDePARTAMENTOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chalatenango", "San Salvador", "La Paz" }));
        jPanel1.add(CboDePARTAMENTOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 340, 28));

        jLabel10.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel10.setText("Código Postal");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 258, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel11.setText("Telefóno");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre Cliente", "Ciudad", "Telefóno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 700, 360));

        jPanel4.setBackground(new java.awt.Color(44, 189, 165));

        jLabel12.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Clientes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtCodigo.setPlaceholder("Escribe Codigo...");
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, 40));

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtNombre.setPlaceholder("Escribe Nombre...");
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 340, -1));

        txtCaserioColonia1.setForeground(new java.awt.Color(0, 0, 0));
        txtCaserioColonia1.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtCaserioColonia1.setPlaceholder("Escribe Caserio/Colonia...");
        jPanel1.add(txtCaserioColonia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 340, 40));

        txtTelefono1.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono1.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtTelefono1.setPlaceholder("Escribe Telefono...");
        jPanel1.add(txtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 350, 40));

        txtDireccion1.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion1.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtDireccion1.setPlaceholder("Escribe Direccion...");
        jPanel1.add(txtDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 270, 40));

        txtMunicipio1.setForeground(new java.awt.Color(0, 0, 0));
        txtMunicipio1.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtMunicipio1.setPlaceholder("Escribe Municipio...");
        jPanel1.add(txtMunicipio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 270, 40));

        txtCodigoPostal1.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigoPostal1.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        txtCodigoPostal1.setPlaceholder("Escribe Postal...");
        jPanel1.add(txtCodigoPostal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 730));

        jPanel3.setBackground(new java.awt.Color(44, 189, 165));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboDePARTAMENTOS;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private rojeru_san.RSMTextFull txtCaserioColonia1;
    private rojeru_san.RSMTextFull txtCodigo;
    private rojeru_san.RSMTextFull txtCodigoPostal1;
    private rojeru_san.RSMTextFull txtDireccion1;
    private rojeru_san.RSMTextFull txtMunicipio1;
    private rojeru_san.RSMTextFull txtNombre;
    private rojeru_san.RSMTextFull txtTelefono1;
    // End of variables declaration//GEN-END:variables
}
