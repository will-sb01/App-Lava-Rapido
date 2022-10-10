package VIEW;

import DAO.LavaRapidoDAO;
import DTO.LavaRapidoDTO;
import javax.swing.table.DefaultTableModel;

public class ClientesVIEW extends javax.swing.JFrame {

    /**
     * Creates new form ClientesVIEW
     */
    public ClientesVIEW() {
        initComponents();
        readBD();
    }

    public void readBD(){
        DefaultTableModel modelo = (DefaultTableModel) tblLvg.getModel();
        LavaRapidoDAO ldao = new LavaRapidoDAO();
        modelo.setNumRows(0);
        
        for(LavaRapidoDTO L : ldao.read()){
            modelo.addRow(new Object[]{
            L.getMarca(),
            L.getModelo(),
            L.getCor(),
            L.getCliente(),
            L.getTipo(),
            L.getValor(),
            L.getPeriodo()
        });
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLvg = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblLvg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Cor", "Cliente", "Tipo", "Valor", "Data Lavagem"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLvg.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblLvg);
        if (tblLvg.getColumnModel().getColumnCount() > 0) {
            tblLvg.getColumnModel().getColumn(0).setResizable(false);
            tblLvg.getColumnModel().getColumn(1).setResizable(false);
            tblLvg.getColumnModel().getColumn(2).setResizable(false);
            tblLvg.getColumnModel().getColumn(3).setResizable(false);
            tblLvg.getColumnModel().getColumn(4).setResizable(false);
            tblLvg.getColumnModel().getColumn(5).setResizable(false);
            tblLvg.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

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
            java.util.logging.Logger.getLogger(ClientesVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesVIEW().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLvg;
    // End of variables declaration//GEN-END:variables
}
