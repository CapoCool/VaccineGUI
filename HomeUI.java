/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.jfree.ui.RefineryUtilities; 

//package Final; //IDE

import java.awt.CardLayout;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Ben
 */
public class HomeUI extends javax.swing.JFrame {
    private ArrayList<VaccineRecord> vaccineRecord = new ArrayList<VaccineRecord>();
    /**
     * Creates new form HomeUI
     */
    public HomeUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        about_button = new javax.swing.JButton();
        load_data_button = new javax.swing.JButton();
        add_data_button = new javax.swing.JButton();
        save_data_button = new javax.swing.JButton();
        visualize_data_button = new javax.swing.JButton();
        main_panel = new javax.swing.JPanel();
        load_data_panel = new javax.swing.JPanel();
        path_to_file_label = new javax.swing.JLabel();
        path_to_file_field = new javax.swing.JTextField();
        file_path_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        vaccineTable = new javax.swing.JTable();
        save_data_panel = new javax.swing.JPanel();
        save_data_label = new javax.swing.JLabel();
        visualize_data_panel = new javax.swing.JPanel();
        vis_data_label = new javax.swing.JLabel();
        add_data_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        vaccineLocation = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        vaccineType = new javax.swing.JTextField();
        save_add = new javax.swing.JButton();
        about_panel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        about_button.setText("About");
        about_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_buttonActionPerformed(evt);
            }
        });

        load_data_button.setText("Load Data");
        load_data_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_data_buttonActionPerformed(evt);
            }
        });

        add_data_button.setText("Add Data");
        add_data_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_data_buttonActionPerformed(evt);
            }
        });

        save_data_button.setText("Save Data");
        save_data_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_data_buttonActionPerformed(evt);
            }
        });

        visualize_data_button.setText("Visualize Data");
        visualize_data_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualize_data_buttonActionPerformed(evt);
            }
        });

        main_panel.setLayout(new java.awt.CardLayout());

        path_to_file_label.setText("Path to file:");

        path_to_file_field.setText("");
        path_to_file_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                path_to_file_fieldActionPerformed(evt);
            }
        });

        file_path_button.setText("Load Data");
        file_path_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_path_buttonActionPerformed(evt);
            }
        });

        vaccineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID", "Last Name", "First Name", "Vaccine Type", "Vaccination Date", "Vaccine Location"
            }
        ));
        jScrollPane2.setViewportView(vaccineTable);

        javax.swing.GroupLayout load_data_panelLayout = new javax.swing.GroupLayout(load_data_panel);
        load_data_panel.setLayout(load_data_panelLayout);
        load_data_panelLayout.setHorizontalGroup(
            load_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(load_data_panelLayout.createSequentialGroup()
                .addGroup(load_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(load_data_panelLayout.createSequentialGroup()
                        .addComponent(path_to_file_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(path_to_file_field, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(file_path_button)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(load_data_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)))
                .addContainerGap())
        );
        load_data_panelLayout.setVerticalGroup(
            load_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(load_data_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(load_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(path_to_file_label)
                    .addComponent(path_to_file_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(file_path_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_panel.add(load_data_panel, "load_data_card");

        save_data_label.setText("save data");

        javax.swing.GroupLayout save_data_panelLayout = new javax.swing.GroupLayout(save_data_panel);
        save_data_panel.setLayout(save_data_panelLayout);
        save_data_panelLayout.setHorizontalGroup(
            save_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_data_panelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(save_data_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        save_data_panelLayout.setVerticalGroup(
            save_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_data_panelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(save_data_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_panel.add(save_data_panel, "save_data_card");
        
        //vis_data_label.setText("Visualize Data:");

        javax.swing.GroupLayout visualize_data_panelLayout = new javax.swing.GroupLayout(visualize_data_panel);
        visualize_data_panel.setLayout(visualize_data_panelLayout);
        visualize_data_panelLayout.setHorizontalGroup(
            visualize_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(visualize_data_panelLayout.createSequentialGroup()
                .addGap(100, 100, 100)//100 100 100
                .addComponent(vis_data_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        visualize_data_panelLayout.setVerticalGroup(
            visualize_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visualize_data_panelLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(vis_data_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        

        main_panel.add(visualize_data_panel, "visualize_data_card");

        add_data_panel.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Date:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Last Name: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("First Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Vaccine Type:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Vaccination Location:");

        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        save_add.setText("Save");
        save_add.setActionCommand("");
        save_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout add_data_panelLayout = new javax.swing.GroupLayout(add_data_panel);
        add_data_panel.setLayout(add_data_panelLayout);
        add_data_panelLayout.setHorizontalGroup(
            add_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_data_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(add_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(add_data_panelLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(add_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(lastName, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(firstName, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(date)
                            .addComponent(vaccineType, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_data_panelLayout.createSequentialGroup()
                        .addGroup(add_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(save_add)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vaccineLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        add_data_panelLayout.setVerticalGroup(
            add_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_data_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(date))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(firstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(vaccineType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(vaccineLocation))
                .addGap(18, 18, 18)
                .addComponent(save_add)
                .addGap(237, 237, 237))
        );

        main_panel.add(add_data_panel, "add_data_card");

        jLabel12.setText("Ben Chaussee");
        jLabel11.setText("Harika Bhogaraju");
        jLabel10.setText("Christian Walterson");
        jLabel9.setText("Dillan Poorman");

        jLabel8.setText("Team #39");

        javax.swing.GroupLayout about_panelLayout = new javax.swing.GroupLayout(about_panel);
        about_panel.setLayout(about_panelLayout);
        about_panelLayout.setHorizontalGroup(
            about_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(about_panelLayout.createSequentialGroup()
                .addGroup(about_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(0, 448, Short.MAX_VALUE))
        );
        about_panelLayout.setVerticalGroup(
            about_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(about_panelLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addComponent(jLabel10)
                .addComponent(jLabel11)
                .addComponent(jLabel12)
                .addContainerGap(429, Short.MAX_VALUE))
        );

        main_panel.add(about_panel, "about_panel_card");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(about_button)
                    .addComponent(visualize_data_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_data_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_data_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(load_data_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(about_button)
                        .addGap(32, 32, 32)
                        .addComponent(load_data_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_data_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save_data_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(visualize_data_button)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void about_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_buttonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)main_panel.getLayout();
        card.show(main_panel, "about_panel_card");
    }//GEN-LAST:event_about_buttonActionPerformed

    private void load_data_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_data_buttonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)main_panel.getLayout();
        card.show(main_panel, "load_data_card");
    }//GEN-LAST:event_load_data_buttonActionPerformed
    public void addToTable(){
        DefaultTableModel model = (DefaultTableModel) vaccineTable.getModel();
        VaccineRecord temp = vaccineRecord.get(vaccineRecord.size() - 1);
        
        Object[] data = {temp.getID(), temp.getLastName(), temp.getFirstName(),temp.getVaccineType(), temp.getVaccinationDate(), temp.getVaccinationLocation()};
        
        model.addRow(data);
    }
    private void add_data_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_data_buttonActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(main_panel.getLayout());
        cl.show(main_panel, "add_data_card");
    }//GEN-LAST:event_add_data_buttonActionPerformed

    private void save_data_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_data_buttonActionPerformed
        // TODO add your handling code here:
           String filepath = JOptionPane.showInputDialog(null, "Enter filepath:", null);
        try{
            FileWriter csvWriter = new FileWriter(filepath);
            csvWriter.append("ID");csvWriter.append(",");
            csvWriter.append("LastName");csvWriter.append(",");
            csvWriter.append("FirstName");csvWriter.append(",");
            csvWriter.append("VaccineType");csvWriter.append(",");
            csvWriter.append("VaccineDate");csvWriter.append(",");
            csvWriter.append("VaccineLocation");csvWriter.append(",");
            csvWriter.append("\n");
            System.out.println("Building");
            
            for(VaccineRecord record : vaccineRecord){
                csvWriter.append(String.valueOf(record.getID()));csvWriter.append(",");
                csvWriter.append(record.getLastName());csvWriter.append(",");
                csvWriter.append(record.getFirstName());csvWriter.append(",");
                csvWriter.append(record.getVaccineType());csvWriter.append(",");
                csvWriter.append(record.getVaccinationDate());csvWriter.append(",");
                csvWriter.append(record.getVaccinationLocation());csvWriter.append(",");
                csvWriter.append("\n");
                
            }
            
            csvWriter.flush();
            csvWriter.close();
        }
        catch(IOException s){
            
            //for debugging
           
            JOptionPane.showMessageDialog(null, "Filepath doesn't exist", "Error 404:", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_save_data_buttonActionPerformed
    
    
    public void print(){
        for(VaccineRecord record : vaccineRecord){
            System.out.println(record.getID());
            System.out.println(record.getLastName());
            System.out.println(record.getFirstName());
            System.out.println(record.getVaccineType());
            System.out.println(record.getVaccinationDate());
            System.out.println(record.getVaccinationLocation());
            
        }
    }
    public boolean checkID(int id){
        for(int i = 0; i < vaccineRecord.size(); i++){
            if(id == vaccineRecord.get(i).getID()){
                return true;
            }
        }
        
        return false;
    }
    private void visualize_data_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualize_data_buttonActionPerformed
        // TODO add your handling code here:
    	ArrayList inputData = new ArrayList<Integer>();
        ArrayList<String> stringData = new ArrayList<String>();
       
        ArrayList<String> locData = new ArrayList<String>();
        ArrayList inputLocData = new ArrayList<Integer>();
         
        Hashtable table1 = new Hashtable();
        Hashtable table2 = new Hashtable();
        System.out.println("VISUALIZE DATA CALLED");

        int count;
        int locCount = 0;
        for(VaccineRecord v : vaccineRecord){
            count = 0;
            locCount = 0;
            for(VaccineRecord v2: vaccineRecord){
                if(v.getVaccineType().equalsIgnoreCase(v2.getVaccineType())){
                   count++;
                   table1.put(v.getVaccineType(), count);
                }
                if(v.getVaccinationLocation().equalsIgnoreCase(v2.getVaccinationLocation())) {
                	locCount++;
                	table2.put(v.getVaccinationLocation(),locCount);
                }
            }
        }
        
        Iterator<String> itr = table1.keySet().iterator();
        Iterator<Integer> itr2 = table1.values().iterator();
        
        //int i = 0;
        
        
   	      while(itr2.hasNext()){
            stringData.add(itr.next());
            inputData.add(itr2.next());
            //i++;
         }
   	   BarChart chart1 = new BarChart("Vaccine Statistics", "","Type of Vaccine","Number of Vaccines",inputData,stringData);
   	   System.out.print(chart1.inputData);
   	   chart1.pack();
   	   //chart1.removeLegend();
	   RefineryUtilities.centerFrameOnScreen(chart1);        
	   chart1.setVisible( true ); 
	   
	   itr = table2.keySet().iterator();
       itr2 = table2.values().iterator();
       
       //int i = 0;
       
       
  	      while(itr2.hasNext()){
           locData.add(itr.next());
           inputLocData.add(itr2.next());
           //i++;
        }
	   BarChart chart2 = new BarChart("Vaccine Location Statistics", "","Location of Vaccine","Number of Vaccines",inputLocData,locData);
   	   //System.out.println(chart2.inputLocData);
   	   chart2.pack();        
	   RefineryUtilities.centerFrameOnScreen(chart2);        
	   chart2.setVisible( true ); 
        /*
         * 
        javax.swing.GroupLayout visualize_data_panelLayout = new javax.swing.GroupLayout(visualize_data_panel);
        visualize_data_panel.setLayout(visualize_data_panelLayout);
        visualize_data_panelLayout.setHorizontalGroup(
            visualize_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visualize_data_panelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(chart)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        visualize_data_panelLayout.setVerticalGroup(
            visualize_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visualize_data_panelLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                
                .addComponent(chart)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        */

        main_panel.add(visualize_data_panel, "visualize_data_card");
        
        CardLayout cl = (CardLayout)(main_panel.getLayout());
        cl.show(main_panel, "visualize_data_card");
        
    }//GEN-LAST:event_visualize_data_buttonActionPerformed

    private void file_path_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_path_buttonActionPerformed
        // TODO add your handling code here:
    	String file_path = path_to_file_field.getText();
    	if(!file_path.endsWith(".csv")) {
    		JOptionPane.showMessageDialog(null, "Not a valid file", "Error:", JOptionPane.ERROR_MESSAGE);
    		return;
    	}
  
        try {
            Scanner sc = new Scanner(new File(file_path));
           
            sc.useDelimiter("\n");
            sc.useDelimiter(",");
            
            int count = 1;
            while(sc.hasNextLine()){
                
                VaccineRecord tempRec = new VaccineRecord();
                String line = sc.nextLine();
                String[] fields = line.split(",");
                if(count > 1){
                    Boolean exists = false;
                    for(int i = 0; i < 6; i++){
                        if(checkID(Integer.parseInt(fields[0]))){
                            exists = true;
                            break;
                        }                   
                    }
                    if(!exists){
                        tempRec.setID(Integer.parseInt(fields[0]));
                        tempRec.setLastName(fields[1]);
                        tempRec.setFirstName(fields[2]);
                        tempRec.setVaccineType(fields[3]);
                        tempRec.setVaccinationDate(fields[4]);
                        tempRec.setVaccinationLocation(fields[5]);
                        vaccineRecord.add(tempRec);
                        DefaultTableModel model = (DefaultTableModel) vaccineTable.getModel();
                        model.addRow(fields);
                    }
                }
                count++;
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HomeUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_file_path_buttonActionPerformed

    private void path_to_file_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_path_to_file_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_path_to_file_fieldActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void save_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_addActionPerformed
                // TODO add your handling code here:
        VaccineRecord temp = new VaccineRecord();
        //CardLayout cl = (CardLayout)(main_panel.getLayout());
        //cl.show(main_panel, "save_data_card");
        if(date.getText().isEmpty() || id.getText().isEmpty() || lastName.getText().isEmpty() 
           || firstName.getText().isEmpty() || vaccineType.getText().isEmpty() || vaccineLocation.getText().isEmpty()){
            String error = "Stuff not found!";
            
            JOptionPane.showMessageDialog(null, error, "Error 404:", JOptionPane.ERROR_MESSAGE);
        }
        else{
            temp.setVaccinationDate(date.getText());
            try{
                temp.setID(Integer.parseInt(id.getText()));
                if(checkID(temp.getID()) == true){
                    JOptionPane.showMessageDialog(null, "Entry Already Exists!", "Error:", JOptionPane.ERROR_MESSAGE);
                    date.setText("");
                    id.setText("");
                    lastName.setText("");
                    firstName.setText("");
                    vaccineType.setText("");
                    vaccineLocation.setText("");
                }
                else{
                    temp.setLastName(lastName.getText());
                    temp.setFirstName(firstName.getText());
                    temp.setVaccineType(vaccineType.getText());
                    temp.setVaccinationLocation(vaccineLocation.getText());
                    vaccineRecord.add(temp);
                    addToTable();
                    date.setText("");
                    id.setText("");
                    lastName.setText("");
                    firstName.setText("");
                    vaccineType.setText("");
                    vaccineLocation.setText("");
                }
            }    
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Number not found!", "Error 404:", JOptionPane.ERROR_MESSAGE);
                date.setText("");
                id.setText("");
                lastName.setText("");
                firstName.setText("");
                vaccineType.setText("");
                vaccineLocation.setText("");
            }
            
        }
    }//GEN-LAST:event_save_addActionPerformed

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
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeUI().setVisible(true);
            }
        });
    }
    private BarGraph bargraph = new BarGraph();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about_button;
    private javax.swing.JPanel about_panel;
    private javax.swing.JButton add_data_button;
    private javax.swing.JPanel add_data_panel;
    private javax.swing.JTextField date;
    private javax.swing.JButton file_path_button;
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastName;
    private javax.swing.JButton load_data_button;
    private javax.swing.JPanel load_data_panel;
    private javax.swing.JPanel main_panel;
    private javax.swing.JTextField path_to_file_field;
    private javax.swing.JLabel path_to_file_label;
    private javax.swing.JButton save_add;
    private javax.swing.JButton save_data_button;
    private javax.swing.JLabel save_data_label;
    private javax.swing.JPanel save_data_panel;
    private javax.swing.JTextField vaccineLocation;
    private javax.swing.JTable vaccineTable;
    private javax.swing.JTextField vaccineType;
    private javax.swing.JLabel vis_data_label;
    private javax.swing.JButton visualize_data_button;
    private javax.swing.JPanel visualize_data_panel;
    // End of variables declaration//GEN-END:variables
}
