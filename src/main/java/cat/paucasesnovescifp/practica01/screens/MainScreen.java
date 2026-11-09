package cat.paucasesnovescifp.practica01.screens;

import cat.paucasesnovescifp.practica01.controllers.LloguerController;
import cat.paucasesnovescifp.practica01.utils.LocaleUtil;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class MainScreen extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainScreen.class.getName());
    private DefaultTableModel tableModel;
    
    public MainScreen() {
        initComponents();
        updateLocalization();
    }
    
    public void updateLocalization() {
        jMenuAdd.setText(LocaleUtil.getLocalizedString("add_menu_label"));
        tableModel = new DefaultTableModel(
            LloguerController.instance.toTableData(),
            new String[] {
                LocaleUtil.getLocalizedString("user_label"),
                LocaleUtil.getLocalizedString("game_label"),
                LocaleUtil.getLocalizedString("platform_label"),
                LocaleUtil.getLocalizedString("initial_date_label"),
                LocaleUtil.getLocalizedString("expected_date_label"),
                LocaleUtil.getLocalizedString("state_label")
            }
        ) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        
        jTable.setModel(tableModel);
        jTable.getColumnModel().getColumn(5).setCellRenderer(new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value,
                                            boolean isSelected, boolean hasFocus,
                                            int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                
                if(column == 5) {
                    component.setBackground(value.toString().equals("Retornat") ? Color.green : Color.red);
                }
                
                return component;
            }
        });
        //renderer.setBackground(Color.red);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuAdd = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Usuari", "Joc", "Plataforma", "Data d'inici", "Data prevista", "Estat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(jTable);

        jMenuAdd.setText("Add");
        jMenuAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuAddMousePressed(evt);
            }
        });
        jMenuBar.add(jMenuAdd);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAddMousePressed
        new LloguerRegisterScreen(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuAddMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new MainScreen().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAdd;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
