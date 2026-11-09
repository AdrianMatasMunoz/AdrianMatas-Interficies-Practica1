package cat.paucasesnovescifp.practica01.screens;

import cat.paucasesnovescifp.practica01.utils.LocaleUtil;

public class LloguerRegisterScreen extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LloguerRegisterScreen.class.getName());
    
    public MainScreen mainScreen;

    public LloguerRegisterScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        mainScreen = (MainScreen) parent;
        initComponents();
        updateLocalization();
    }
    
    private void updateLocalization() {
        jLabelTitle.setText(LocaleUtil.getLocalizedString("add_rent_title"));
        jLabelUserName.setText(LocaleUtil.getLocalizedString("add_rent_user_name_label"));
        jLabelUserContact.setText(LocaleUtil.getLocalizedString("add_rent_user_contact_label"));
        jLabelGameName.setText(LocaleUtil.getLocalizedString("add_rent_game_name_label"));
        jLabelGamePlatform.setText(LocaleUtil.getLocalizedString("add_rent_game_platform_label"));
        jLabelDays.setText(LocaleUtil.getLocalizedString("add_rent_days_label"));
        jButtonAdd.setText(LocaleUtil.getLocalizedString("add_rent_add_button"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldUserName = new javax.swing.JTextField();
        jLabelUserName = new javax.swing.JLabel();
        jLabelUserContact = new javax.swing.JLabel();
        jTextFieldUserContact = new javax.swing.JTextField();
        jLabelGameName = new javax.swing.JLabel();
        jTextFieldGameName = new javax.swing.JTextField();
        jLabelGamePlatform = new javax.swing.JLabel();
        jTextFieldGamePlatform = new javax.swing.JTextField();
        jLabelDays = new javax.swing.JLabel();
        jTextFieldDays = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelUserName.setText("User Name:");

        jLabelUserContact.setText("User Contact:");

        jLabelGameName.setText("Game Name:");

        jLabelGamePlatform.setText("Platform:");

        jLabelDays.setText("Days:");

        jButtonAdd.setText("Add");
        jButtonAdd.setEnabled(false);

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Add a rent");
        jLabelTitle.setToolTipText("");
        jLabelTitle.setAlignmentX(0.5F);
        jLabelTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelUserContact)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldUserContact, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelUserName)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelGameName)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldGameName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelGamePlatform)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldGamePlatform, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDays)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDays, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAdd)
                                .addGap(61, 61, 61)))
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addGap(133, 133, 133))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelTitle)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUserContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUserContact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGameName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGameName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGamePlatform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGamePlatform))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDays))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButtonAdd)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JLabel jLabelDays;
    private javax.swing.JLabel jLabelGameName;
    private javax.swing.JLabel jLabelGamePlatform;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUserContact;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JTextField jTextFieldDays;
    private javax.swing.JTextField jTextFieldGameName;
    private javax.swing.JTextField jTextFieldGamePlatform;
    private javax.swing.JTextField jTextFieldUserContact;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
