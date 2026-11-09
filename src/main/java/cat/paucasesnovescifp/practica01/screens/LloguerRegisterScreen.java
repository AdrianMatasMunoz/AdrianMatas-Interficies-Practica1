package cat.paucasesnovescifp.practica01.screens;

import cat.paucasesnovescifp.practica01.controllers.LloguerController;
import cat.paucasesnovescifp.practica01.exceptions.EmptyNameException;
import cat.paucasesnovescifp.practica01.exceptions.WrongFormatException;
import cat.paucasesnovescifp.practica01.models.Lloguer;
import cat.paucasesnovescifp.practica01.models.Usuari;
import cat.paucasesnovescifp.practica01.models.Videojoc;
import cat.paucasesnovescifp.practica01.utils.LocaleUtil;
import cat.paucasesnovescifp.practica01.utils.Platform;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.regex.Pattern;

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
        jLabelDays = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jComboBoxGamePlatform = new javax.swing.JComboBox<>();
        jSliderDays = new javax.swing.JSlider();
        jLabelDaysDisplay = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelUserName.setText("User Name:");

        jLabelUserContact.setText("User Contact:");

        jLabelGameName.setText("Game Name:");

        jLabelGamePlatform.setText("Platform:");

        jLabelDays.setText("Days:");

        jButtonAdd.setText("Add");
        jButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonAddMousePressed(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Add a rent");
        jLabelTitle.setToolTipText("");
        jLabelTitle.setAlignmentX(0.5F);
        jLabelTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jComboBoxGamePlatform.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PC", "PS5", "SWITCH2", "XBOX" }));

        jSliderDays.setMajorTickSpacing(1);
        jSliderDays.setMaximum(30);
        jSliderDays.setMinimum(1);
        jSliderDays.setValue(5);
        jSliderDays.addChangeListener(this::jSliderDaysStateChanged);
        jSliderDays.addPropertyChangeListener(this::jSliderDaysPropertyChange);

        jLabelDaysDisplay.setText("5");

        jLabelError.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 122, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelTitle)
                                .addGap(133, 133, 133))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelDays)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSliderDays, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(jComboBoxGamePlatform, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonAdd)
                                        .addGap(61, 61, 61)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDaysDisplay)
                                .addGap(66, 66, 66))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelError)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                    .addComponent(jLabelGamePlatform)
                    .addComponent(jComboBoxGamePlatform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDays)
                    .addComponent(jSliderDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDaysDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabelError)
                .addGap(5, 5, 5)
                .addComponent(jButtonAdd)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMousePressed
        boolean nameValid =
            jTextFieldUserName.getText().length() > 0 &&
            Pattern.matches("^([A-Z][A-Za-z]*)( [A-Z][A-Za-z]*)?( [A-Z][A-Za-z]*)?$", jTextFieldUserName.getText());
        boolean emailValid =
            jTextFieldUserContact.getText().length() > 0 &&
            Pattern.matches("^\\w+@\\w+\\.\\w+$", jTextFieldUserContact.getText());
        boolean gameNameValid = jTextFieldGameName.getText().length() > 0;
        
        if(!nameValid) {
            jLabelError.setText("Error: "+LocaleUtil.getLocalizedString("add_rent_name_error"));
        } else if(!emailValid) {
            jLabelError.setText("Error: "+LocaleUtil.getLocalizedString("add_rent_contact_error"));
        } else if(!gameNameValid) {
            jLabelError.setText("Error: "+LocaleUtil.getLocalizedString("add_rent_game_name_error"));
        } else {        
            jLabelError.setText("");

            try {
                LloguerController.instance.lloguers.add(
                    new Lloguer(
                            new Usuari(jTextFieldUserName.getText(), jTextFieldUserContact.getText()),
                            new Videojoc(jTextFieldGameName.getText(), "GameCompany", 5, List.of(Platform.PC, Platform.PS5, Platform.SWITCH2, Platform.XBOX)),
                            Platform.valueOf(jComboBoxGamePlatform.getSelectedItem().toString()),
                            LocalDate.now(),
                            LocalDate.now().plusDays(jSliderDays.getValue())
                    )
                );
            } catch(EmptyNameException | WrongFormatException ex) {
                ex.printStackTrace();
            }
            LloguerController.instance.update();
            mainScreen.updateLocalization();
            
            this.dispose();
        }
    }//GEN-LAST:event_jButtonAddMousePressed

    private void jSliderDaysPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSliderDaysPropertyChange
        
    }//GEN-LAST:event_jSliderDaysPropertyChange

    private void jSliderDaysStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderDaysStateChanged
        jLabelDaysDisplay.setText(String.valueOf(jSliderDays.getValue()));
    }//GEN-LAST:event_jSliderDaysStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JComboBox<String> jComboBoxGamePlatform;
    private javax.swing.JLabel jLabelDays;
    private javax.swing.JLabel jLabelDaysDisplay;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelGameName;
    private javax.swing.JLabel jLabelGamePlatform;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUserContact;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JSlider jSliderDays;
    private javax.swing.JTextField jTextFieldGameName;
    private javax.swing.JTextField jTextFieldUserContact;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
