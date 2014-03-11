/*
 * Autopsy Forensic Browser
 * 
 * Copyright 2011 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * NewCaseVisualPanel2.java
 *
 * Created on Mar 7, 2012, 11:01:48 AM
 */
package org.sleuthkit.autopsy.casemodule;

import org.openide.util.NbBundle;

/**
 *
 * @author dfickling
 */
 class NewCaseVisualPanel2 extends javax.swing.JPanel {

    /** Creates new form NewCaseVisualPanel2 */
    public NewCaseVisualPanel2() {
        initComponents();
    }
    
    /**
     * Returns the name of the this panel. This name will be shown on the left
     * panel of the "New Case" wizard panel.
     *
     * @return name  the name of this panel
     */
    @Override
    public String getName() {
        return NbBundle.getMessage(this.getClass(), "NewCaseVisualPanel2.getName.text");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caseNumberTextField = new javax.swing.JTextField();
        examinerTextField = new javax.swing.JTextField();
        caseNumberLabel = new javax.swing.JLabel();
        examinerLabel = new javax.swing.JLabel();
        optionalLabel = new javax.swing.JLabel();

        caseNumberTextField.setText(org.openide.util.NbBundle.getMessage(NewCaseVisualPanel2.class, "NewCaseVisualPanel2.caseNumberTextField.text")); // NOI18N

        examinerTextField.setText(org.openide.util.NbBundle.getMessage(NewCaseVisualPanel2.class, "NewCaseVisualPanel2.examinerTextField.text")); // NOI18N

        caseNumberLabel.setText(org.openide.util.NbBundle.getMessage(NewCaseVisualPanel2.class, "NewCaseVisualPanel2.caseNumberLabel.text")); // NOI18N

        examinerLabel.setText(org.openide.util.NbBundle.getMessage(NewCaseVisualPanel2.class, "NewCaseVisualPanel2.examinerLabel.text")); // NOI18N

        optionalLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optionalLabel.setText(org.openide.util.NbBundle.getMessage(NewCaseVisualPanel2.class, "NewCaseVisualPanel2.optionalLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionalLabel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(caseNumberLabel)
                        .addGap(25, 25, 25)
                        .addComponent(caseNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(examinerLabel)
                        .addGap(45, 45, 45)
                        .addComponent(examinerTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optionalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caseNumberLabel)
                    .addComponent(caseNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examinerLabel)
                    .addComponent(examinerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caseNumberLabel;
    private javax.swing.JTextField caseNumberTextField;
    private javax.swing.JLabel examinerLabel;
    private javax.swing.JTextField examinerTextField;
    private javax.swing.JLabel optionalLabel;
    // End of variables declaration//GEN-END:variables

    String getCaseNumber() {
        return caseNumberTextField.getText();
    }

    String getExaminer() {
        return examinerTextField.getText();
    }

    

}
