package com.app;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Ukavi
 * @since 2015
 * @version 1.0
 */
public class PasswordGenerator extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public PasswordGenerator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        alertDialog = new javax.swing.JDialog();
        optionsPanel = new javax.swing.JPanel();
        passwordLengthLabel = new javax.swing.JLabel();
        includeSymbolsLabel = new javax.swing.JLabel();
        includeNumbersLabel = new javax.swing.JLabel();
        includeLowercaseCharactersLabel = new javax.swing.JLabel();
        includeUppercaseCharactersLabel = new javax.swing.JLabel();
        excludeSimilarCharactersLabel = new javax.swing.JLabel();
        excludeAmbiguousCharactersLabel = new javax.swing.JLabel();
        includeSymbolsCheckbox = new javax.swing.JCheckBox();
        includeNumbersCheckbox = new javax.swing.JCheckBox();
        includeLowercaseCharactersCheckbox = new javax.swing.JCheckBox();
        includeUppercaseCharactersCheckbox = new javax.swing.JCheckBox();
        excludeSimilarCharactersCheckbox = new javax.swing.JCheckBox();
        excludeAmbiguousCharactersCheckbox = new javax.swing.JCheckBox();
        passwordLengthTextField = new javax.swing.JTextField();
        generatePasswordButton = new javax.swing.JButton();
        passwordTextAreaContainerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        passwordTextarea = new javax.swing.JEditorPane();
        authorWebUrlLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        poweredByLabel = new javax.swing.JLabel();

        alertDialog.setModal(true);
        alertDialog.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        alertDialog.setResizable(false);
        alertDialog.setType(java.awt.Window.Type.UTILITY);

        javax.swing.GroupLayout alertDialogLayout = new javax.swing.GroupLayout(alertDialog.getContentPane());
        alertDialog.getContentPane().setLayout(alertDialogLayout);
        alertDialogLayout.setHorizontalGroup(
                alertDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        alertDialogLayout.setVerticalGroup(
                alertDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("resources/Strings"); // NOI18N
        setTitle(bundle.getString("app_name")); // NOI18N
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        setIconImage(loadImageIcon("icon.png").getImage());
        setMinimumSize(new java.awt.Dimension(400, 300));
        setName("mainFrame"); // NOI18N
        setResizable(false);

        optionsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("select_options"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Oswald", 1, 18))); // NOI18N
        optionsPanel.setToolTipText(null);
        optionsPanel.setName(""); // NOI18N

        passwordLengthLabel.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        passwordLengthLabel.setText(bundle.getString("password_length")); // NOI18N
        passwordLengthLabel.setToolTipText(null);

        includeSymbolsLabel.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        includeSymbolsLabel.setText(bundle.getString("include_symbols")); // NOI18N
        includeSymbolsLabel.setToolTipText(null);

        includeNumbersLabel.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        includeNumbersLabel.setText(bundle.getString("include_numbers")); // NOI18N
        includeNumbersLabel.setToolTipText(null);

        includeLowercaseCharactersLabel.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        includeLowercaseCharactersLabel.setText(bundle.getString("include_lowercase_characters")); // NOI18N
        includeLowercaseCharactersLabel.setToolTipText(null);

        includeUppercaseCharactersLabel.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        includeUppercaseCharactersLabel.setText(bundle.getString("include_uppercase_characters")); // NOI18N
        includeUppercaseCharactersLabel.setToolTipText(null);

        excludeSimilarCharactersLabel.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        excludeSimilarCharactersLabel.setText(bundle.getString("exclude_similar_characters")); // NOI18N
        excludeSimilarCharactersLabel.setToolTipText(null);

        excludeAmbiguousCharactersLabel.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        excludeAmbiguousCharactersLabel.setText(bundle.getString("exclude_ambiguous_characters")); // NOI18N
        excludeAmbiguousCharactersLabel.setToolTipText(null);

        includeSymbolsCheckbox.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        includeSymbolsCheckbox.setSelected(true);
        includeSymbolsCheckbox.setText(bundle.getString("include_symbols_checkbox")); // NOI18N
        includeSymbolsCheckbox.setToolTipText(null);

        includeNumbersCheckbox.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        includeNumbersCheckbox.setSelected(true);
        includeNumbersCheckbox.setText(bundle.getString("include_numbers_checkbox")); // NOI18N
        includeNumbersCheckbox.setToolTipText(null);

        includeLowercaseCharactersCheckbox.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        includeLowercaseCharactersCheckbox.setSelected(true);
        includeLowercaseCharactersCheckbox.setText(bundle.getString("include_lowercase_characters_checkbox")); // NOI18N
        includeLowercaseCharactersCheckbox.setToolTipText(null);

        includeUppercaseCharactersCheckbox.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        includeUppercaseCharactersCheckbox.setSelected(true);
        includeUppercaseCharactersCheckbox.setText(bundle.getString("include_uppercase_characters_checkbox")); // NOI18N
        includeUppercaseCharactersCheckbox.setToolTipText(null);

        excludeSimilarCharactersCheckbox.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        excludeSimilarCharactersCheckbox.setSelected(true);
        excludeSimilarCharactersCheckbox.setText(bundle.getString("exclude_similar_characters_checkbox")); // NOI18N
        excludeSimilarCharactersCheckbox.setToolTipText(null);

        excludeAmbiguousCharactersCheckbox.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        excludeAmbiguousCharactersCheckbox.setText(bundle.getString("exclude_ambiguous_characters_checkbox")); // NOI18N
        excludeAmbiguousCharactersCheckbox.setToolTipText(null);

        passwordLengthTextField.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        passwordLengthTextField.setText("6");
        passwordLengthTextField.setToolTipText(null);

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
                optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(optionsPanelLayout.createSequentialGroup()
                                .addComponent(includeNumbersLabel)
                                .addContainerGap(327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(optionsPanelLayout.createSequentialGroup()
                                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(includeSymbolsLabel)
                                        .addComponent(includeLowercaseCharactersLabel)
                                        .addComponent(excludeAmbiguousCharactersLabel)
                                        .addComponent(includeUppercaseCharactersLabel)
                                        .addComponent(excludeSimilarCharactersLabel)
                                        .addComponent(passwordLengthLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(excludeAmbiguousCharactersCheckbox)
                                        .addComponent(includeSymbolsCheckbox)
                                        .addComponent(includeNumbersCheckbox)
                                        .addComponent(includeLowercaseCharactersCheckbox)
                                        .addComponent(includeUppercaseCharactersCheckbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(excludeSimilarCharactersCheckbox)
                                        .addComponent(passwordLengthTextField))
                                .addGap(26, 26, 26))
        );
        optionsPanelLayout.setVerticalGroup(
                optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(optionsPanelLayout.createSequentialGroup()
                                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(optionsPanelLayout.createSequentialGroup()
                                                .addComponent(passwordLengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(optionsPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(passwordLengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addGap(6, 6, 6)
                                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(includeSymbolsLabel)
                                        .addComponent(includeSymbolsCheckbox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(includeNumbersLabel)
                                        .addComponent(includeNumbersCheckbox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(includeLowercaseCharactersLabel)
                                        .addComponent(includeLowercaseCharactersCheckbox))
                                .addGap(9, 9, 9)
                                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(includeUppercaseCharactersLabel)
                                        .addComponent(includeUppercaseCharactersCheckbox))
                                .addGap(9, 9, 9)
                                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(excludeSimilarCharactersLabel)
                                        .addComponent(excludeSimilarCharactersCheckbox))
                                .addGap(7, 7, 7)
                                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(excludeAmbiguousCharactersLabel)
                                        .addComponent(excludeAmbiguousCharactersCheckbox)))
        );

        generatePasswordButton.setFont(new java.awt.Font("Oswald", 0, 16)); // NOI18N
        generatePasswordButton.setText(bundle.getString("generate_password")); // NOI18N
        generatePasswordButton.setToolTipText(null);
        generatePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePasswordButtonActionPerformed(evt);
            }
        });

        passwordTextAreaContainerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("password"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Oswald", 1, 18))); // NOI18N
        passwordTextAreaContainerPanel.setToolTipText(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText(null);

        passwordTextarea.setFont(new java.awt.Font("Oswald", 1, 18)); // NOI18N
        passwordTextarea.setToolTipText(null);
        jScrollPane1.setViewportView(passwordTextarea);

        javax.swing.GroupLayout passwordTextAreaContainerPanelLayout = new javax.swing.GroupLayout(passwordTextAreaContainerPanel);
        passwordTextAreaContainerPanel.setLayout(passwordTextAreaContainerPanelLayout);
        passwordTextAreaContainerPanelLayout.setHorizontalGroup(
                passwordTextAreaContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        passwordTextAreaContainerPanelLayout.setVerticalGroup(
                passwordTextAreaContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(passwordTextAreaContainerPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addContainerGap())
        );

        authorWebUrlLabel.setFont(new java.awt.Font("Oswald Regular", 0, 14)); // NOI18N
        authorWebUrlLabel.setForeground(new java.awt.Color(65, 131, 196));
        authorWebUrlLabel.setText(bundle.getString("author_name")); // NOI18N
        authorWebUrlLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authorWebUrlLabelMouseClicked(evt);
            }
        });
        authorWebUrlLabel.setVisible(false);

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("icon.png"))); // NOI18N
        logoLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        poweredByLabel.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        poweredByLabel.setText(bundle.getString("powered_by")); // NOI18N
        poweredByLabel.setVisible(false);
        logoLabel.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(optionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordTextAreaContainerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 264, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(generatePasswordButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(poweredByLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(authorWebUrlLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(logoLabel)))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(optionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(generatePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordTextAreaContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(authorWebUrlLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(poweredByLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private String buildString(String charSets, int passLength, String string) {
        Double d = Math.floor(Math.random() * charSets.length());
        Double c = Math.floor(Math.random() * passLength);
        String e = string.substring(0, c.intValue()) + charSets.substring(d.intValue(), d.intValue() + 1) + string.substring(c.intValue(), passLength);
        string = e;
        return string;
    }

    private void generatePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("resources/Strings"); // NOI18N
        String lowecase = "abcdefghjkmnpqrstuvwxyz";
        String uppercase = "ABCDEFGHJKLMNPQRSTUVWXYZ";
        String numbers = "23456789";
        String symbols = "!#$%&*+-=?@^_";

        passwordTextarea.setText(null);
        if (passwordLengthTextField.getText().isEmpty() || Integer.parseInt(passwordLengthTextField.getText()) <= 5) {
            JOptionPane.showMessageDialog(null, bundle.getString("minimum_password_value"), bundle.getString("alert_title"), JOptionPane.ERROR_MESSAGE);
            return;
        }

        int passLength = Integer.parseInt(passwordLengthTextField.getText());
        boolean Nosimilar = excludeSimilarCharactersCheckbox.isSelected();
        boolean NoAmb = excludeAmbiguousCharactersCheckbox.isSelected();
        boolean Lowercase = includeLowercaseCharactersCheckbox.isSelected();
        boolean Uppercase = includeUppercaseCharactersCheckbox.isSelected();
        boolean Numbers = includeNumbersCheckbox.isSelected();
        boolean Symbols = includeSymbolsCheckbox.isSelected();

        if (!Nosimilar) {
            lowecase += "ilo";
            uppercase += "IO";
            numbers += "01";
            symbols += "|";
        }

        String passwordString = "";
        int counter = 0;
        if (!NoAmb) {
            symbols += "{}[]()\\/'\"`~,;:.<>\\";
        }
        if (Lowercase) {
            passwordString += lowecase;
            counter++;
        }
        if (Uppercase) {
            passwordString += uppercase;
            counter++;
        }
        if (Numbers) {
            passwordString += numbers;
            counter++;
        }
        if (Symbols) {
            passwordString += symbols;
            counter++;
        }
        if (counter == 0) {
            JOptionPane.showMessageDialog(null, bundle.getString("select_character_set"), bundle.getString("alert_title"), JOptionPane.ERROR_MESSAGE);
            return;
        }
        int n = passwordString.length();
        int finalLength = passLength - counter;
        String builtPass = "";
        for (int e = 0; e < finalLength; e++) {
            Double b = Math.floor(Math.random() * n);
            builtPass += passwordString.substring(b.intValue(), b.intValue() + 1);
        }
        if (Uppercase) {
            builtPass = buildString(uppercase, finalLength, builtPass);
            finalLength++;
        }
        if (Lowercase) {
            builtPass = buildString(lowecase, finalLength, builtPass);
            finalLength++;
        }
        if (Numbers) {
            builtPass = buildString(numbers, finalLength, builtPass);
            finalLength++;
        }
        if (Symbols) {
            builtPass = buildString(symbols, finalLength, builtPass);
        }
        passwordTextarea.setText(builtPass);
    }

    private void authorWebUrlLabelMouseClicked(java.awt.event.MouseEvent evt) {
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("resources/Strings"); // NOI18N
        try {
            Desktop.getDesktop().browse(URI.create(bundle.getString("author_web_url")));
        } catch (IOException ex) {
            Logger.getLogger(PasswordGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(PasswordGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordGenerator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JDialog alertDialog;
    private javax.swing.JLabel authorWebUrlLabel;
    private javax.swing.JCheckBox excludeAmbiguousCharactersCheckbox;
    private javax.swing.JLabel excludeAmbiguousCharactersLabel;
    private javax.swing.JCheckBox excludeSimilarCharactersCheckbox;
    private javax.swing.JLabel excludeSimilarCharactersLabel;
    private javax.swing.JButton generatePasswordButton;
    private javax.swing.JCheckBox includeLowercaseCharactersCheckbox;
    private javax.swing.JLabel includeLowercaseCharactersLabel;
    private javax.swing.JCheckBox includeNumbersCheckbox;
    private javax.swing.JLabel includeNumbersLabel;
    private javax.swing.JCheckBox includeSymbolsCheckbox;
    private javax.swing.JLabel includeSymbolsLabel;
    private javax.swing.JCheckBox includeUppercaseCharactersCheckbox;
    private javax.swing.JLabel includeUppercaseCharactersLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel poweredByLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JLabel passwordLengthLabel;
    private javax.swing.JTextField passwordLengthTextField;
    private javax.swing.JPanel passwordTextAreaContainerPanel;
    private javax.swing.JEditorPane passwordTextarea;
    // End of variables declaration                   

    private static ImageIcon loadImageIcon(String path) {
        URL imgURL = PasswordGenerator.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

}
