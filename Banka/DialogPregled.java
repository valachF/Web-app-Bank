package Banka;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
/**
 * Title:        Banka-zadatak baze 2
 * Description:
 * Copyright:    Copyright (c) 2008
 * Company:    
 * @author Fedor Valah
 * @version 1.0
 */

public class DialogPregled extends JDialog {
  private JPanel panel1 = new JPanel();
  private BorderLayout borderLayout1 = new BorderLayout();
  private JPanel jPanel1 = new JPanel();
  private JPanel jPanel2 = new JPanel();
  private JScrollPane jScrollPane1 = new JScrollPane();
  private JLabel jLabel4;
  private JLabel jLadresaBanke;
  private JLabel jLnazivBanke;
  private JLabel jLabel3;
  private JLabel jLabel1;
  private BorderLayout borderLayout2 = new BorderLayout();
  private GridBagLayout gridBagLayout1 = new GridBagLayout();
  private JLabel jLabel2 = new JLabel();
  private JTextField txtOznakaBanke = new JTextField();
  private JButton bPronadji = new JButton();
  private JButton bIzlaz = new JButton();
  private JTable tabBanke = new JTable();

  public DialogPregled(Frame frame, String title, boolean modal) {
    super(frame, title, modal);
    try {
      jbInit();
      pack();
      setSize(600,572);
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      Dimension dialogSize = this.getSize();
      setLocation((screenSize.width - dialogSize.width) / 2, (screenSize.height - dialogSize.height) / 2);
      }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  public DialogPregled() {
    this(null, "", false);
  }
  void jbInit() throws Exception {
    panel1.setLayout(borderLayout1);
    jPanel1.setBorder(BorderFactory.createEtchedBorder());
    jPanel1.setPreferredSize(new Dimension(14, 100));
    jPanel1.setLayout(borderLayout2);
    jPanel2.setBorder(BorderFactory.createEtchedBorder());
    jPanel2.setPreferredSize(new Dimension(10, 40));
    jPanel2.setLayout(gridBagLayout1);
    jLabel2.setText("Oznaka banke:");
    bPronadji.setPreferredSize(new java.awt.Dimension(80, 27));
    bPronadji.setText("Pronadji ");
    bPronadji.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        bPronadji_actionPerformed(e);
      }
    });
    bIzlaz.setPreferredSize(new Dimension(80, 27));
    bIzlaz.setText("Izlaz");
    bIzlaz.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        bIzlaz_actionPerformed(e);
      }
    });
    txtOznakaBanke.setPreferredSize(new Dimension(120, 21));
    getContentPane().add(panel1);
    panel1.add(jPanel1, BorderLayout.NORTH);
	{
		jLabel1 = new JLabel();
		jPanel1.add(jLabel1, BorderLayout.CENTER);
		jLabel1.setText("PREGLED FILIJALA BANKE");
		jLabel1.setFont(new java.awt.Font("Times New Roman",1,18));
		jLabel1.setPreferredSize(new java.awt.Dimension(588, 96));
		jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setVerticalAlignment(SwingConstants.TOP);
		{
			jLabel3 = new JLabel();
			jLabel1.add(jLabel3);
			jLabel3.setText("NAZIV:");
			jLabel3.setBounds(7, 49, 42, 28);
			jLabel3.setFont(new java.awt.Font("Times New Roman",1,12));
		}
		{
			jLabel4 = new JLabel();
			jLabel1.add(jLabel4);
			jLabel4.setText("ADRESA:");
			jLabel4.setBounds(280, 49, 63, 28);
			jLabel4.setFont(new java.awt.Font("Times New Roman",1,12));
		}
		{
			jLnazivBanke = new JLabel();
			jLabel1.add(jLnazivBanke);
			jLnazivBanke.setBounds(56, 49, 203, 28);
		}
		{
			jLadresaBanke = new JLabel();
			jLabel1.add(jLadresaBanke);
			jLadresaBanke.setBounds(336, 49, 238, 28);
		}
	}
    panel1.add(jPanel2, BorderLayout.SOUTH);
    jPanel2.add(jLabel2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
    jPanel2.add(txtOznakaBanke,  new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 10, 0, 0), 0, 0));
    jPanel2.add(bPronadji, new GridBagConstraints(5, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 10, 0, 0), 0, 0));
    jPanel2.add(bIzlaz, new GridBagConstraints(5, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 200, 0, 0), 0, 0));
    panel1.add(jScrollPane1,  BorderLayout.CENTER);
    jScrollPane1.getViewport().add(tabBanke, null);
    TModelPrijave tMP = new TModelPrijave(tabBanke);
    tabBanke.setModel(tMP);
    ((TModelPrijave)tabBanke.getModel()).initColumns();
  }

  void bIzlaz_actionPerformed(ActionEvent e) {
    dispose();
  }

  void bPronadji_actionPerformed(ActionEvent e) {
    if(txtOznakaBanke.getText().equals("")){
      JOptionPane.showMessageDialog(null,"Oznaka banke mora biti uneta");
      txtOznakaBanke.grabFocus();
    }
    else{
      Vector filijale = DBF.getFilijale(txtOznakaBanke.getText());
      if(!filijale.isEmpty()){
    	 
        ((TModelPrijave)tabBanke.getModel()).rejoinData(filijale);
        
        
        String adresa=DBF.getadresaB(txtOznakaBanke.getText());
        jLadresaBanke.setText(adresa);
        
        jLnazivBanke.setText(DBF.getnazivB(txtOznakaBanke.getText()));  
        
      }
      else{
        JOptionPane.showMessageDialog(null,"Nije pronadjena ni jedna filijala");
      }
    }
  }
}