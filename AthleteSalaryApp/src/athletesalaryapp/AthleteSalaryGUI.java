/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package athletesalaryapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Jess
 */
public class AthleteSalaryGUI extends javax.swing.JFrame {
    
    public static String name;
    public static double salary;
    public static int lawyers,personalAssistants, agents, trainers;

    /**
     * Creates new form AthleteSalaryGUI
     */
    public AthleteSalaryGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public static boolean isValidDouble(String strNum)
    {
        if(strNum == null){
            return false;
        }
        try{
            double d = Double.parseDouble(strNum);
            } catch(NumberFormatException nfe){
                return false;
            }
        return true;
        
    }
    
    public static boolean isValidInt(String strNum)
    {
        if(strNum == null){
            return false;
        }
        try{
            int d = Integer.parseInt(strNum);
            } catch(NumberFormatException nfe){
                return false;
            }
        return true;
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Parent = new javax.swing.JPanel();
        AthleteInfo = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        StaffInfoPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Athlete Spending App");

        Parent.setLayout(new java.awt.CardLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Enter the staff info");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enter Athletes Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Enter Athletes Salary:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout AthleteInfoLayout = new javax.swing.GroupLayout(AthleteInfo);
        AthleteInfo.setLayout(AthleteInfoLayout);
        AthleteInfoLayout.setHorizontalGroup(
            AthleteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AthleteInfoLayout.createSequentialGroup()
                .addGroup(AthleteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AthleteInfoLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AthleteInfoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(AthleteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                        .addGap(98, 98, 98)
                        .addGroup(AthleteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AthleteInfoLayout.setVerticalGroup(
            AthleteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AthleteInfoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(AthleteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AthleteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(AthleteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        Parent.add(AthleteInfo, "card2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Enter Number of Lawyers:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Enter Number of Personal Assistants:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Enter Number of Agents:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Enter Number of Trainers:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Cancel/Enter Another Athlete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Calculate Spending");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StaffInfoPanelLayout = new javax.swing.GroupLayout(StaffInfoPanel);
        StaffInfoPanel.setLayout(StaffInfoPanelLayout);
        StaffInfoPanelLayout.setHorizontalGroup(
            StaffInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffInfoPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(StaffInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(StaffInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(StaffInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StaffInfoPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(StaffInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(StaffInfoPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        StaffInfoPanelLayout.setVerticalGroup(
            StaffInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffInfoPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(StaffInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(StaffInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(StaffInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(StaffInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(StaffInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        Parent.add(StaffInfoPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Parent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //cancel/add another athlete
        salary = 0.0;
        Parent.removeAll();
        Parent.add(AthleteInfo);
        Parent.repaint();
        Parent.revalidate();
        jTextField1.setText("");
        jTextField2.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //calculate your spending
        String lawyerStr = jTextField3.getText();
        String personalAssistantStr = jTextField4.getText();
        String agentStr = jTextField5.getText();
        String trainerStr = jTextField6.getText();
        
        if(lawyerStr.equalsIgnoreCase("")||
                personalAssistantStr.equalsIgnoreCase("")||
                agentStr.equalsIgnoreCase("")||
                trainerStr.equalsIgnoreCase(""))
        {
            if(lawyerStr.equalsIgnoreCase(""))
                JOptionPane.showMessageDialog(null, "ERROR: Number of Lawyers cannot be empty", "ERROR", JOptionPane.ERROR_MESSAGE);
            else if (personalAssistantStr.equalsIgnoreCase(""))
               JOptionPane.showMessageDialog(null, "ERROR: Number of Personal Assistants cannot be empty", "ERROR", JOptionPane.ERROR_MESSAGE); 
            else if(agentStr.equalsIgnoreCase(""))
                JOptionPane.showMessageDialog(null, "ERROR: Number of Agents cannot be empty", "ERROR", JOptionPane.ERROR_MESSAGE);
            else if(trainerStr.equalsIgnoreCase(""))
                JOptionPane.showMessageDialog(null, "ERROR: Number of Trainers cannot be empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if(!isValidInt(lawyerStr))
                JOptionPane.showMessageDialog(null, "ERROR: Number of lawyers must be a number", "ERROR", JOptionPane.ERROR_MESSAGE);
            else if(!isValidInt(personalAssistantStr))
                JOptionPane.showMessageDialog(null, "ERROR: Number of personal assistants must be a number", "ERROR", JOptionPane.ERROR_MESSAGE);
            else if(!isValidInt(agentStr))
                JOptionPane.showMessageDialog(null, "ERROR: Number of agents must be a number", "ERROR", JOptionPane.ERROR_MESSAGE);
            else if(!isValidInt(trainerStr))
                JOptionPane.showMessageDialog(null, "ERROR: Number of trainers must be a number", "ERROR", JOptionPane.ERROR_MESSAGE);
            else
            {
           lawyers = Integer.parseInt(lawyerStr);
           personalAssistants = Integer.parseInt(personalAssistantStr);
           agents = Integer.parseInt(agentStr);
           trainers = Integer.parseInt(trainerStr);
           
           if(lawyers <0)
                    JOptionPane.showMessageDialog(null, "ERROR: Number of lawyers cannot be negative", "ERROR", JOptionPane.ERROR_MESSAGE); 
           else if(personalAssistants <0)
                    JOptionPane.showMessageDialog(null, "ERROR: Number of personal assistants cannot be negative", "ERROR", JOptionPane.ERROR_MESSAGE);
           else if(agents <0)
                    JOptionPane.showMessageDialog(null, "ERROR: Number of agents cannot be negative", "ERROR", JOptionPane.ERROR_MESSAGE);
           else if(trainers <0)
                    JOptionPane.showMessageDialog(null, "ERROR: Number of trainers cannot be negative", "ERROR", JOptionPane.ERROR_MESSAGE);
           else
           {
              double lawyerCost = (lawyers * 0.1) * salary;
              double personalAssistantCost = (personalAssistants * 0.03) * salary;
              double agentCost = (agents * 0.07) * salary;
              double trainerCost = (trainers * 0.05) * salary;
              
              double spending = lawyerCost + personalAssistantCost + agentCost + trainerCost;
              
              double leftOver = salary - spending;
              
              String output = "";
              
              output += String.format("---- %s Spending ----\n\n", name + "'s");
              output += String.format("# of Lawyers: %d \t\tCost: $%,.2f \n", lawyers,lawyerCost);
              output += String.format("# of Personal Assistants: %d \t\tCost: $%,.2f \n", personalAssistants,personalAssistantCost);
              output += String.format("# of Agents: %d \t\tCost: $%,.2f \n", agents,agentCost);
              output += String.format("# of Trainers: %d \t\tCost: $%,.2f \n", trainers,trainerCost);
               output += "--------------------------\n";
               output += String.format("Salary: $%,.2f \n", salary);
               output += String.format("Staff Spending: $%,.2f \n", spending);
               output += "--------------------------\n";
               output += String.format("Leftover Money: $%,.2f \n", leftOver);
               
               JOptionPane.showMessageDialog(null,output,name + "'s spending", JOptionPane.INFORMATION_MESSAGE);
               
           }
            }
               
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //close button
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //enter staff info
        String nameStr = jTextField1.getText();
        String salaryStr = jTextField2.getText();
        
        if(nameStr.equalsIgnoreCase("")|| salaryStr.equalsIgnoreCase(""))
        {
            if(nameStr.equalsIgnoreCase(""))
                JOptionPane.showMessageDialog(null, "ERROR: Athlete Name cannot be empty", "ERROR", JOptionPane.ERROR_MESSAGE);
            else
               JOptionPane.showMessageDialog(null, "ERROR: Salary cannot be empty", "ERROR", JOptionPane.ERROR_MESSAGE); 
        }
        else
        {
            if(isValidDouble(salaryStr))
            {
                salary = Double.parseDouble(salaryStr);
                if(salary <0)
                    JOptionPane.showMessageDialog(null, "ERROR: Salary cannot be negative", "ERROR", JOptionPane.ERROR_MESSAGE); 
                else
                {
                    name = nameStr;
                    lawyers = 0;
                    personalAssistants = 0;
                    agents = 0;
                    trainers = 0;
                    Parent.removeAll();
                    Parent.add(StaffInfoPanel);
                    Parent.repaint();
                    Parent.revalidate();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "ERROR: Salary must be a number", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(AthleteSalaryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AthleteSalaryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AthleteSalaryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AthleteSalaryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AthleteSalaryGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AthleteInfo;
    private javax.swing.JPanel Parent;
    private javax.swing.JPanel StaffInfoPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
