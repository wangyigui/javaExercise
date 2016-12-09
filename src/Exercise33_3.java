import java.awt.*;
import javax.swing.*;

public class Exercise33_3 extends javax.swing.JApplet {
  /** Creates new form Exercise33_3 */
  public Exercise33_3() {
    initComponents();
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jtfHGap = new javax.swing.JTextField();
    jtfVGap = new javax.swing.JTextField();
    jpComponents = new javax.swing.JPanel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();

    jPanel1.setLayout(new java.awt.BorderLayout(5, 0));

    jPanel1.setBorder(new javax.swing.border.TitledBorder("BorderLayout Properties"));
    jPanel2.setLayout(new java.awt.GridLayout(2, 0));

    jLabel1.setText("HGap");
    jPanel2.add(jLabel1);

    jLabel2.setText("VGap");
    jPanel2.add(jLabel2);

    jPanel1.add(jPanel2, java.awt.BorderLayout.WEST);

    jPanel3.setLayout(new java.awt.GridLayout(2, 0));

    jtfHGap.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jtfHGapActionPerformed(evt);
      }
    });

    jPanel3.add(jtfHGap);

    jtfVGap.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jtfVGapActionPerformed(evt);
      }
    });

    jPanel3.add(jtfVGap);

    jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

    add(jPanel1, java.awt.BorderLayout.SOUTH);

    jpComponents.setLayout(new java.awt.BorderLayout());

    jpComponents.setBorder(new javax.swing.border.TitledBorder("Container of BorderLayout"));
    jButton1.setText("Center");
    jpComponents.add(jButton1, java.awt.BorderLayout.CENTER);

    jButton2.setText("North");
    jpComponents.add(jButton2, java.awt.BorderLayout.NORTH);

    jButton3.setText("South");
    jpComponents.add(jButton3, java.awt.BorderLayout.SOUTH);

    jButton4.setText("West");
    jpComponents.add(jButton4, java.awt.BorderLayout.WEST);

    jButton5.setText("East");
    jpComponents.add(jButton5, java.awt.BorderLayout.EAST);

    add(jpComponents, java.awt.BorderLayout.CENTER);

  }//GEN-END:initComponents

  private void jtfVGapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfVGapActionPerformed
    int vgap = new Integer(jtfVGap.getText()).intValue();
    BorderLayout borderLayout = (BorderLayout)jpComponents.getLayout();
    borderLayout.setVgap(vgap);
    jpComponents.revalidate();
  }//GEN-LAST:event_jtfVGapActionPerformed

  private void jtfHGapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfHGapActionPerformed
    int hgap = new Integer(jtfHGap.getText()).intValue();
    BorderLayout borderLayout = (BorderLayout)jpComponents.getLayout();
    borderLayout.setHgap(hgap);
    jpComponents.revalidate();
  }//GEN-LAST:event_jtfHGapActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel jpComponents;
  private javax.swing.JTextField jtfVGap;
  private javax.swing.JButton jButton5;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JButton jButton4;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JButton jButton3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton1;
  private javax.swing.JTextField jtfHGap;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel1;
  // End of variables declaration//GEN-END:variables

  public static void main(String[] args) {
    Exercise33_3 applet = new Exercise33_3();
    JFrame frame = new JFrame();
    //EXIT_ON_CLOSE == 3
    frame.setTitle("Exercise33_3");
    frame.add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(400,320);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}