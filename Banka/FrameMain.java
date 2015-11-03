package Banka;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameMain extends JFrame {
  private JPanel contentPane;
  private JLabel statusBar = new JLabel();
  private BorderLayout borderLayout1 = new BorderLayout();
  private JLabel jLabel1 = new JLabel();
  private JPanel jPanel1 = new JPanel();
  private GridBagLayout gridBagLayout1 = new GridBagLayout();
  private JButton bNovaBanka = new JButton();
  private JButton bBrisanjeBanke = new JButton();
  private JButton bIzlaz = new JButton();
  private JButton bPregled = new JButton();

  /**Construct the frame*/
  public FrameMain() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  /**Component initialization*/
  private void jbInit() throws Exception  {
    //setIconImage(Toolkit.getDefaultToolkit().createImage(FrameMain.class.getResource("[Your Icon]")));
    contentPane = (JPanel) this.getContentPane();
    contentPane.setLayout(borderLayout1);
    this.setSize(new Dimension(400, 300));
    this.setTitle("Banka");
    statusBar.setFont(new java.awt.Font("Dialog", 0, 14));
    statusBar.setBorder(BorderFactory.createEtchedBorder());
    statusBar.setText(" ");
    contentPane.setBorder(BorderFactory.createEtchedBorder());
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 14));
    jLabel1.setBorder(BorderFactory.createEtchedBorder());
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
    jLabel1.setText("Banka");
    jPanel1.setBorder(BorderFactory.createEtchedBorder());
    jPanel1.setLayout(gridBagLayout1);
    bNovaBanka.setPreferredSize(new Dimension(140, 27));
    bNovaBanka.setText("Nova banka");
    bNovaBanka.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        bNovaPrijava_actionPerformed(e);
      }
    });
    bBrisanjeBanke.setPreferredSize(new Dimension(140, 27));
    bBrisanjeBanke.setText("Brisanje banke");
    bBrisanjeBanke.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        bBrisanjePrijave_actionPerformed(e);
      }
    });
    bIzlaz.setPreferredSize(new Dimension(140, 27));
    bIzlaz.setText("Izlaz");
    bIzlaz.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        bIzlaz_actionPerformed(e);
      }
    });
    bPregled.setPreferredSize(new Dimension(140, 27));
    bPregled.setText("Pregled banaka");
    bPregled.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        bPregled_actionPerformed(e);
      }
    });
    contentPane.add(statusBar, BorderLayout.SOUTH);
    contentPane.add(jLabel1, BorderLayout.NORTH);
    contentPane.add(jPanel1, BorderLayout.CENTER);
    jPanel1.add(bNovaBanka,    new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 10, 0), 0, 0));
    jPanel1.add(bBrisanjeBanke,    new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 10, 0), 0, 0));
    jPanel1.add(bIzlaz,   new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 10, 0), 0, 0));
    jPanel1.add(bPregled,   new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 10, 0), 0, 0));
  }
  /**Overridden so we can exit when window is closed*/
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      System.exit(0);
    }
  }

  void bIzlaz_actionPerformed(ActionEvent e) {
    System.exit(0);
  }

  void bNovaPrijava_actionPerformed(ActionEvent e) {
    DialogPrijava dPri = new DialogPrijava(this,"Unos nove banke",true);
    dPri.show();
  }

  void bBrisanjePrijave_actionPerformed(ActionEvent e) {
    DialogBrisanje dBri = new DialogBrisanje(this,"Brisanje banke",true);
    dBri.show();
  }

  void bPregled_actionPerformed(ActionEvent e) {
    DialogPregled dPr = new DialogPregled(this,"Pregled banaka",true);
    dPr.show();
  }
}