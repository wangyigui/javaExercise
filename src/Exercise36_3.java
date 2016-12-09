import java.awt.*;
import javax.swing.*;

import java.util.*;
import javax.swing.table.*;

public class Exercise36_3 extends javax.swing.JApplet {
  /** Creates new form Exercise36_3 */
  public Exercise36_3() {
    // Create images
    Class locator = this.getClass();

    ImageIcon imageUS = new ImageIcon(
      locator.getResource("image/person.jpg"));
    ImageIcon imageFrance =  new ImageIcon(
      locator.getResource("image/person.jpg"));
    ImageIcon imageCanada =  new ImageIcon(
      locator.getResource("image/person.jpg"));
    ImageIcon imageUK =  new ImageIcon(
      locator.getResource("image/person.jpg"));

    // Create table column names
    String[] columnNames =
      {"Name", "Birthday", "Class Status", "In-State", "Photo"};

    // Create table data
    Object[][] data = {
      {"Jeff F. Smith", new GregorianCalendar(1998, 9-1, 29).getTime(),
       "Freshman", new Boolean(false), imageUS},
      {"John F. Kay", new GregorianCalendar(1997, 9-1, 29).getTime(),
       "Freshman", new Boolean(false), imageFrance},
      {"Susan F. Johnson", new GregorianCalendar(1999, 9-1, 29).getTime(),
       "Freshman", new Boolean(true), imageCanada},
      {"Georege F. Kates", new GregorianCalendar(1999, 9-1, 29).getTime(),
       "Freshman", new Boolean(false), imageUK}
    };

    // Create table model
    MyTableModel tableModel = new MyTableModel(data, columnNames);

    initComponents();

    jTable1.setModel(tableModel);
    jTable1.setRowHeight(90);

    // Create a combo box for publishers
    JComboBox jcboClassStatus = new JComboBox();
    jcboClassStatus.addItem("Freshman");
    jcboClassStatus.addItem("Sophomore");
    jcboClassStatus.addItem("Junior");
    jcboClassStatus.addItem("Senior");
    jcboClassStatus.addItem("Graduate");

    // Set combo box as the editor for the publisher column
    TableColumn publisherColumn = jTable1.getColumn("Class Status");
    publisherColumn.setCellEditor(
      new DefaultCellEditor(jcboClassStatus));
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();

    jTable1.setRowHeight(40);
    jScrollPane1.setViewportView(jTable1);

    add(jScrollPane1, java.awt.BorderLayout.CENTER);
  }//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  // End of variables declaration//GEN-END:variables

  public static void main(String[] args) {
    Exercise36_3 applet = new Exercise36_3();
    JFrame frame = new JFrame();
    frame.setTitle("Exercise36_3");
    frame.add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(400,320);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}