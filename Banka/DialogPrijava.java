package Banka;

import java.awt.*;

import javax.swing.*;

import Banka.DBF;

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
 * Title: Banka-zadatak baze 2
 * 
 * @author 
 * @version 1.0
 */

public class DialogPrijava extends JDialog {
	private JPanel panel1 = new JPanel();

	private BorderLayout borderLayout1 = new BorderLayout();

	private JPanel jPanel1 = new JPanel();

	private JPanel jPanel2 = new JPanel();

	private JPanel jPanel3 = new JPanel();

	private JLabel jLabel1 = new JLabel();

	private GridBagLayout gridBagLayout1 = new GridBagLayout();

	private JButton bOdustani = new JButton();

	private JButton bPotvrdi = new JButton();

	GridBagLayout gridBagLayout2 = new GridBagLayout();

	private JLabel jLabel2 = new JLabel();

	private JLabel jLabel5 = new JLabel();

	private JLabel jLabel6 = new JLabel();

	private JTextField txtNazivBanke = new JTextField();

	private JTextField txtAdresaBanke = new JTextField();

	private JTextField txtOznakaF = new JTextField();

	private JTextField txtNazivF = new JTextField();

	private JTextField txtAdresaF = new JTextField();
	private JTextField jToznakaBanke;
	private JTextField jTadresaBanke;
	private JTextField jTnazivBanke;
	private JLabel NazivBanke;
	private JLabel AdresaBanke;

	private JLabel jLabel7 = new JLabel();

	private JLabel jLabel8 = new JLabel();
	private JLabel jLadresaF;
	private JLabel JLnazivF;
	private JLabel jLoznakaF;

	private JLabel jLabel9 = new JLabel();

	private JLabel jLabel10 = new JLabel();

	private Vector depozit = null;
	
private Vector oznakaBan=null;
	public DialogPrijava(Frame frame, String title, boolean modal) {
		super(frame, title, modal);
		try {
			jbInit();
			pack();
			this.setSize(363, 377);
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			Dimension dialogSize = this.getSize();
			if (dialogSize.height > dialogSize.height) {
				dialogSize.height = screenSize.height;
			}
			if (dialogSize.width > screenSize.width) {
				dialogSize.width = screenSize.width;
			}
			this.setLocation((screenSize.width - dialogSize.width) / 2,
					(screenSize.height - dialogSize.height) / 2);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public DialogPrijava() {
		this(null, "", false);
	}

	void jbInit() throws Exception {
		panel1.setLayout(borderLayout1);
		panel1.setBorder(BorderFactory.createEtchedBorder());
		jPanel1.setBorder(BorderFactory.createEtchedBorder());
		jLabel1.setFont(new java.awt.Font("Dialog", 1, 14));
		jLabel1.setText("Unos nove banke sa filijalom");
		jPanel2.setBorder(BorderFactory.createEtchedBorder());
		jPanel2.setLayout(gridBagLayout2);
		jPanel3.setBorder(BorderFactory.createEtchedBorder());
		jPanel3.setLayout(gridBagLayout1);
		bOdustani.setPreferredSize(new java.awt.Dimension(80, 27));
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
		txtNazivBanke.setPreferredSize(new Dimension(250, 21));
		txtAdresaBanke.setPreferredSize(new Dimension(250, 21));
		txtOznakaF.setPreferredSize(new Dimension(250, 21));
		txtNazivF.setPreferredSize(new Dimension(250, 21));
		txtAdresaF.setPreferredSize(new Dimension(250, 21));
		getContentPane().add(panel1);
		panel1.setPreferredSize(new java.awt.Dimension(340, 317));
		panel1.add(jPanel1, BorderLayout.NORTH);
		jPanel1.add(jLabel1, null);
		panel1.add(jPanel2, BorderLayout.CENTER);
		jPanel2.setPreferredSize(new java.awt.Dimension(336, 137));
		jPanel2.add(jLabel2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(
						10, 0, 2, 0), 0, 0));

		jPanel2.add(jLabel5, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(2,
						0, 2, 0), 0, 0));
		jPanel2.add(jLabel6, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(2,
						0, 2, 0), 0, 0));
		panel1.add(jPanel3, BorderLayout.SOUTH);
		 panel1.add(jPanel2, BorderLayout.CENTER);
		 gridBagLayout2.rowHeights = new int[] {24, 24, 24};
		 gridBagLayout2.rowWeights = new double[] {0.0, 0.0, 0.0};
		 gridBagLayout2.columnWeights = new double[] {0.1, 0.1, 0.1, 0.1};
		 gridBagLayout2.columnWidths = new int[] {7, 7, 7, 7};
		    jPanel2.add(jLabel2,  new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
		            ,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(10, 0, 2, 0), 0, 0));
		    jPanel2.add(txtOznakaF, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(10, 10, 2, 0), 0, 0));
		    jPanel2.add(jLabel5,  new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0
		            ,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(2, 0, 2, 0), 0, 0));
		    jPanel2.add(jLabel6,  new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0
		            ,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(2, 0, 2, 0), 0, 0));
			{
				AdresaBanke = new JLabel();
				jPanel2.add(AdresaBanke, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				AdresaBanke.setText("Adresa banke");
			}
			{
				NazivBanke = new JLabel();
				jPanel2.add(NazivBanke, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				NazivBanke.setText("Naziv banke");
			}
			{
				jTnazivBanke = new JTextField();
				jPanel2.add(jTnazivBanke, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				jTnazivBanke.setPreferredSize(new java.awt.Dimension(250, 21));
			}
			{
				jTadresaBanke = new JTextField();
				jPanel2.add(jTadresaBanke, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				jTadresaBanke.setPreferredSize(new java.awt.Dimension(250, 21));
			}
			{
				jToznakaBanke = new JTextField();
				jPanel2.add(jToznakaBanke, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				jToznakaBanke.setPreferredSize(new java.awt.Dimension(250, 21));
			}
		    panel1.add(jPanel3,  BorderLayout.SOUTH);
		    jPanel3.add(bOdustani,     new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0
		            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 30, 0, 0), 0, 0));
		    jPanel3.add(bPotvrdi,    new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
		            ,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(5, 0, 5, 30), 0, 0));
		    jPanel2.add(txtNazivF, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 10, 2, 0), 0, 0));
			{
				jLoznakaF = new JLabel();
				jPanel2.add(jLoznakaF, new GridBagConstraints(
					0,
					3,
					1,
					1,
					0.0,
					0.0,
					GridBagConstraints.CENTER,
					GridBagConstraints.NONE,
					new Insets(0, 0, 0, 0),
					0,
					0));
				jLoznakaF.setText("Oznaka flilijale");
			}
			{
				JLnazivF = new JLabel();
				jPanel2.add(JLnazivF, new GridBagConstraints(
					0,
					4,
					1,
					1,
					0.0,
					0.0,
					GridBagConstraints.CENTER,
					GridBagConstraints.NONE,
					new Insets(0, 0, 0, 0),
					0,
					0));
				JLnazivF.setText("Naziv filijale");
			}
			{
				jLadresaF = new JLabel();
				jPanel2.add(jLadresaF, new GridBagConstraints(
					0,
					5,
					1,
					1,
					0.0,
					0.0,
					GridBagConstraints.CENTER,
					GridBagConstraints.NONE,
					new Insets(0, 0, 0, 0),
					0,
					0));
				jLadresaF.setText("Adresa filijale");
			}
		    jPanel2.add(txtAdresaF, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 10, 2, 0), 0, 0));
		    jPanel2.add(jLabel7,   new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0
		            ,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(2, 10, 2, 0), 0, 0));
		     jPanel2.add(jLabel8,  new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0
		            ,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(2, 0, 2, 0), 0, 0));
		    jPanel2.add(jLabel9,     new GridBagConstraints(0, 7, 1, 1, 0.0, 0.0
		            ,GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(2, 0, 2, 0), 0, 0));
		    
		init();
	}

	void init() {
     
	}

	void bOdustani_actionPerformed(ActionEvent e) {
		dispose();
	}

	void bPotvrdi_actionPerformed(ActionEvent e) {
		
				if (txtOznakaF.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Morate uneti oznaku filijale!");
					
					return;
				}
				if (txtNazivF.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Morate uneti naziv filijale!");
					
					return;
				}
				if (txtAdresaF.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Morate uneti adresu filijale!");
					
					return;
				}
				
				int oznF=Integer.parseInt(txtOznakaF.getText());
				
				int oznakaB=Integer.parseInt(jToznakaBanke.getText());
				String res = DBF.insertBanka(
						oznakaB,
							jTnazivBanke.getText(), jTadresaBanke.getText(),
						oznF, 
						txtNazivF.getText(), txtAdresaF.getText() 
					);
				if (res != null) {
					JOptionPane.showMessageDialog(null, res);
				} else {
					JOptionPane.showMessageDialog(null,
							"Banka i filijala su uspesno unete!");
					dispose();
				}
			}
		}
	

