/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.briantoone.fun;

import edu.samford.briantoone.stacksandqueues.ListQueue;
import edu.samford.briantoone.stacksandqueues.ListStack;
import edu.samford.briantoone.stacksandqueues.Queue;
import edu.samford.briantoone.stacksandqueues.Stack;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author kartoone
 */
public class StackQueueGUI extends javax.swing.JFrame {

    protected Stack<String> theStack = new ListStack<>();
    protected Queue<String> theQueue = new ListQueue<>();
    
    /**
     * Creates new form StackQueueGUI
     */
    public StackQueueGUI() {
        initComponents();
        jLabelData.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListStack = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListQueue = new javax.swing.JList<>();
        jTextNewItem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonPush = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonEnqueue = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonPop = new javax.swing.JButton();
        jButtonTop = new javax.swing.JButton();
        jButtonDequeue = new javax.swing.JButton();
        jButtonFront = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jScrollPane3.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListStack.setToolTipText("");
        jScrollPane1.setViewportView(jListStack);

        jScrollPane2.setViewportView(jListQueue);

        jLabel1.setText("New data item:");

        jLabel2.setText("Stack:");

        jButtonPush.setText("Push");
        jButtonPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPushActionPerformed(evt);
            }
        });

        jLabel3.setText("Queue:");

        jButtonEnqueue.setText("Enqueue");
        jButtonEnqueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnqueueActionPerformed(evt);
            }
        });

        jLabel4.setText("Retrieved data:");

        jLabelData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelData.setText("RETRIEVED DATA");

        jLabel6.setText("Stack:");

        jLabel7.setText("Queue:");

        jButtonPop.setText("Pop");
        jButtonPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPopActionPerformed(evt);
            }
        });

        jButtonTop.setText("Top");
        jButtonTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTopActionPerformed(evt);
            }
        });

        jButtonDequeue.setText("Dequeue");
        jButtonDequeue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDequeueActionPerformed(evt);
            }
        });

        jButtonFront.setText("Front");

        jLabel8.setText("TOP");

        jLabel9.setText("REAR");

        jLabel10.setText("FRONT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNewItem)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonPush)
                                            .addComponent(jButtonEnqueue))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelData)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonDequeue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonFront))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jButtonPop)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonTop)))
                                .addGap(0, 34, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextNewItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jButtonPush))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jButtonEnqueue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelData))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jButtonPop)
                                    .addComponent(jButtonTop))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jButtonDequeue)
                                    .addComponent(jButtonFront)))
                            .addComponent(jLabel8))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPushActionPerformed
        theStack.push(jTextNewItem.getText());
        jButtonPop.setEnabled(true);
        jButtonTop.setEnabled(true);
        displayStack();
        jTextNewItem.requestFocus();
        jTextNewItem.selectAll();
    }//GEN-LAST:event_jButtonPushActionPerformed

    private void jButtonEnqueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnqueueActionPerformed
        theQueue.enqueue(jTextNewItem.getText());
        jButtonDequeue.setEnabled(true);
        jButtonFront.setEnabled(true);
        displayQueue();
    }//GEN-LAST:event_jButtonEnqueueActionPerformed

    private void jButtonDequeueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDequeueActionPerformed
        // only dequeue if the queue is not empty
        if(!theQueue.isEmpty()) {
            String item = theQueue.dequeue();
            jLabelData.setText(item);
        } else {
            jLabelData.setText("THE QUEUE IS EMPTY!");
        }
        // disable the dequeue button if queue is empty
        if (theQueue.isEmpty()) {
            jButtonDequeue.setEnabled(false);
            jButtonFront.setEnabled(false);
        }
        displayQueue();
    }//GEN-LAST:event_jButtonDequeueActionPerformed

    private void jButtonPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPopActionPerformed
        // only pop if the stack is not empty
        if(!theStack.isEmpty()) {
            String item = theStack.pop();
            jLabelData.setText(item);
        } else {
            jLabelData.setText("THE STACK IS EMPTY!");
        }
        // disable the pop and top buttons if stack is empty
        if (theStack.isEmpty()) {
            jButtonPop.setEnabled(false);
            jButtonTop.setEnabled(false);
        }
        displayStack();
    }//GEN-LAST:event_jButtonPopActionPerformed

    private void jButtonTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTopActionPerformed
        // only perform top operation if the stack is not empty
        if(!theStack.isEmpty()) {
            String item = theStack.top();
            jLabelData.setText(item);
        } else {
            jLabelData.setText("THE STACK IS EMPTY!");
        }
    }//GEN-LAST:event_jButtonTopActionPerformed

    private void displayQueue() {
        // string representation of the current queue contents
        String theQueueStr = theQueue.toString();
        // chop off the square brackets
        theQueueStr = theQueueStr.substring(1,theQueueStr.length()-1);
        System.out.println(theQueueStr);
        DefaultListModel demoList = new DefaultListModel();
        demoList.addElement(theQueueStr);
        jListQueue.setModel(demoList);
    }
    
    private void displayStack() {
        // string representation of the current stack contents
        String theStackStr = theStack.toString();
        // chop off the square brackets
        theStackStr = theStackStr.substring(1,theStackStr.length()-1);
        // split the string up into individual items using a "," as the separator
        String stackitems[] = theStackStr.split(",");
        DefaultListModel demoList = new DefaultListModel();
        for (int i = stackitems.length-1; i >= 0; i--) {
            String stackitem = stackitems[i];
            demoList.addElement(stackitem);
        }
        jListStack.setModel(demoList);
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
            java.util.logging.Logger.getLogger(StackQueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StackQueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StackQueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StackQueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StackQueueGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDequeue;
    private javax.swing.JButton jButtonEnqueue;
    private javax.swing.JButton jButtonFront;
    private javax.swing.JButton jButtonPop;
    private javax.swing.JButton jButtonPush;
    private javax.swing.JButton jButtonTop;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JList<String> jListQueue;
    private javax.swing.JList<String> jListStack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextNewItem;
    // End of variables declaration//GEN-END:variables
}