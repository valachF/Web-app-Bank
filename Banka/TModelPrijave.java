package Banka;

import javax.swing.table.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import javax.swing.JTable;



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
public class TModelPrijave extends AbstractTableModel {

  private Vector data;
  private String[] columnNames = {"Oznaka filijale","Naziv filijale","Adresa filijale"};
  JTable jTab;

  public TModelPrijave(JTable jTab){
    this.jTab = jTab;
    data = new Vector();
  }

  public void joinData(Vector data){
    this.data = data;
    fireTableDataChanged();
  }

  public void addItem(int row, Vector item){
    if (row==-1)
      data.addElement(item);
    else
      data.add(row,item);
    fireTableDataChanged();
  }

  public void removeItem(int row){
    if ((row>=0) && (row<=data.size()-1) && (data.size()>0)){
      jTab.editingCanceled(new ChangeEvent(this));
      data.removeElementAt(row);
      fireTableDataChanged();
    }
  }

  public int getColumnCount(){
    return columnNames.length;
  }

  public void setValueAt(Object val, int row, int col){
  }

  public Object getValueAt(int row, int col){
    if (col==0)
      return (Integer)((Vector)data.get(row)).get(col);
    else if ((col<3)&&(col>=0))
    	
      return (String)((Vector)data.get(row)).get(col);
        
     else
    	
      return null;
  }

  public int getRowCount(){
    return data.size();
  }

  public String getColumnName(int col){
    return columnNames[col];
  }

  public boolean isCellEditable(int row, int col){
    return false;
  }

  public Class getColumnClass(int col){
    if (col == 1)
      return Integer.class;
    else
      return String.class;
  }

  private Vector getRow(int row){
    return (Vector)data.elementAt(row);
  }

  public void moveUp(int row){
    Vector dataRow = getRow(row);
    removeItem(row);
    addItem(row-1,dataRow);
  }

  public void moveDown(int row){
    Vector dataRow = getRow(row);
    removeItem(row);
    addItem(row+1,dataRow);
  }

  public Vector getData(){
    return data;
  }

  public void rejoinData(Vector data){
    this.data = data;
    fireTableDataChanged();
  }

  public void initColumns(){
    jTab.getColumn(columnNames[0]).setMinWidth(200);
    jTab.getColumn(columnNames[0]).setMaxWidth(200);
    jTab.getColumn(columnNames[1]).setMaxWidth(200);
    jTab.getColumn(columnNames[1]).setMinWidth(200);
    jTab.getColumn(columnNames[2]).setMinWidth(200);
    jTab.getColumn(columnNames[2]).setMaxWidth(200);
    jTab.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    jTab.setEnabled(false);
  }

}