package Banka;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 * Title:        
 * Description:
 * Copyright:    Copyright (c) 2008
 * Company:      
 * @author 
 * @version 1.0
 */

public class DialogBrisanje extends JDialog {
  private JPanel panel1 = new JPanel();
  private BorderLayout borderLayout1 = new BorderLayout();
  private JPanel jPanel1 = new JPanel();
  private JPanel jPanel2 = new JPanel();
  private JPanel jPanel3 = new JPanel();
  private JLabel jLabel1 = new JLabel();
  private GridBagLayout gridBagLayout1 = new GridBagLayout();
  private JButton bOdustani = new JButton();
  private JButton bPotvrdi = new JButton();
  private GridBagLayout gridBagLayout2 = new GridBagLayout();
  private JLabel jLabel2 = new JLabel();
  private JTextField txtOznakaBanke = new JTextField();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JLabel jLabel6 = new JLabel();
  private JTextField txtNazivBanke = new JTextField();
  private JTextField txtAdresaBanke = new JTextField();
 
 

  private Vector depozit = null;
  

  public DialogBrisanje(Frame frame, String title, boolean modal) {
    super(frame, title, modal);
    try {
      jbInit();
      pack();
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      Dimension dialogSize = this.getSize();
      if (dialogSize.height > dialogSize.height) {
        dialogSize.height = screenSize.height;
      }
      if (dialogSize.width > screenSize.width) {
        dialogSize.width = screenSize.width;
      }
      this.setLocation((screenSize.width - dialogSize.width) / 2, (screenSize.height - dialogSize.height) / 2);
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  public DialogBrisanje() {
    this(null, "", false);
  }
  void jbInit() throws Exception {
    panel1.setLayout(borderLayout1);
    panel1.setBorder(BorderFactory.createEtchedBorder());
    jPanel1.setBorder(BorderFactory.createEtchedBorder());
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 14));
    jLabel1.setText("Brisanje postojece banke");
    jPanel2.setBorder(BorderFactory.createEtchedBorder());
    jPanel2.setLayout(gridBagLayout2);
    jPanel3.setBorder(BorderFactory.createEtchedBorder());
    jPanel3.setLayout(gridBagLayout1);
    bOdustani.setPreferredSize(new Dimension(80, 27));
    bOdustani.setMargin(new Insets(0, 0, 0, 0));
    bOdustani.setText("Odustani");
    bOdustani.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        bOdustani_actionPerformed(e);
      }
    });
    bPotvrdi.setPreferredSize(new Dimension(80, 27));
    bPotvrdi.setText("Potvrdi");
    bPotvrdi.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        bPotvrdi_actionPerformed(e);
      }
    });
    jLabel2.setText("Oznaka banke:");
    txtOznakaBanke.setPreferredSize(new Dimension(80, 21));
    jLabel3.setText("Naziv:");
    jLabel4.setText("Adresa:");
    txtNazivBanke.setPreferredSize(new Dimension(250, 21));
    txtAdresaBanke.setPreferredSize(new Dimension(250, 21));
 
 
    getContentPane().add(panel1);
    panel1.add(jPanel1, BorderLayout.NORTH);
    jPanel1.add(jLabel1, null);
    panel1.add(jPanel2, BorderLayout.CENTER);
    jPanel2.add(jLabel2,   new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(10, 10, 2, 0), 0, 0));
    jPanel2.add(txtOznakaBanke,  new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(10, 10, 2, 0), 0, 0));
    jPanel2.add(jLabel3,  new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0
            ,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(2, 0, 2, 0), 0, 0));
    jPanel2.add(jLabel4,  new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0
            ,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(2, 0, 2, 0), 0, 0));
    jPanel2.add(jLabel5,  new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0
            ,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(2, 0, 2, 0), 0, 0));
    jPanel2.add(jLabel6,   new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0
            ,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(2, 0, 10, 0), 0, 0));
    panel1.add(jPanel3,  BorderLayout.SOUTH);
    jPanel3.add(bOdustani,     new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 30, 0, 0), 0, 0));
    jPanel3.add(bPotvrdi,    new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 0, 5, 30), 0, 0));
    jPanel2.add(txtNazivBanke,   new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 10, 2, 10), 0, 0));
    jPanel2.add(txtAdresaBanke,  new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 10, 2, 0), 0, 0));
   
    init();
  }

  void init(){
    depozit = DBF.getDepozit();
   }
   
  void bOdustani_actionPerformed(ActionEvent e) {
    dispose();
  }

  void bPotvrdi_actionPerformed(ActionEvent e) {
    if(txtOznakaBanke.getText().equals("")){
      JOptionPane.showMessageDialog(null,"Morate uneti oznaku banke!");
      txtOznakaBanke.grabFocus();
      return;}
    if(txtNazivBanke.getText().equals("")){
       JOptionPane.showMessageDialog(null,"Morate uneti naziv banke!");
       txtNazivBanke.grabFocus();
       return;}
    if(txtAdresaBanke.getText().equals("")){
       JOptionPane.showMessageDialog(null,"Morate uneti adresu banke!");
       txtAdresaBanke.grabFocus();
       return;
    }
    
    String res = DBF.deleteBanka(txtOznakaBanke.getText(),
    		txtNazivBanke.getText(),
    		txtAdresaBanke.getText()
    	  		
);
    if(res!=null){
      JOptionPane.showMessageDialog(null,res);
    }
    else{
      JOptionPane.showMessageDialog(null,"Banka je uspešno obrisana! Takodje su obrisane i sve filijale koje su pripadale ovoj banci!");
    }
    dispose();
  }
}//}}