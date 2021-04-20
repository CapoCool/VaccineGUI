import java.util.ArrayList;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 

public class BarChart extends ApplicationFrame {
	ArrayList inputData = new ArrayList<Integer>();
    ArrayList<String> stringData = new ArrayList<String>();
    
    public BarChart(String applicationTitle,String chartTitle,String xAxis, String yAxis, ArrayList inputData, ArrayList stringData){
      super(applicationTitle);    
      JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,           
         xAxis,            
         yAxis,            
         createDataset(inputData,stringData),          
         PlotOrientation.VERTICAL,           
         true, true, false);
      //JFrame jf = new JFrame();   
      ChartPanel chartPanel = new ChartPanel(barChart);        
      chartPanel.setPreferredSize(new java.awt.Dimension(560,367));        
      setContentPane(chartPanel); 
      //jf.add(chartPanel);
   }
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {

        ArrayList<T> newList = new ArrayList<T>();

        for (T element : list) {

            if (!newList.contains(element)) {
  
                newList.add(element);
            }
        }
  
        // return the new list
        return newList;
    }
   private CategoryDataset createDataset(ArrayList iData, ArrayList sData){
      this.inputData = iData;
	  this.stringData = removeDuplicates(sData);
      
      final DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset();  
      
      System.out.println(this.inputData);
      System.out.println(this.stringData);
      
      for(int i = 0;i<inputData.size();i++){
    	  dataset.addValue((Integer)this.inputData.get(i),"",(String)stringData.get(i));
      }
      
      return dataset; 
   }

}