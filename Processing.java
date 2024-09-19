package backEnd;

import java.io.FileNotFoundException;

import frontEnd.mainPanel;

public class Processing {
	
	private static String[][] moduleList;
	private static String[][] staffList;
	private static String[][] studentList;
	

	    public static void main(String[] args) {
	    	
	    	mainPanel panel = new mainPanel();
	    	panel.frame.setVisible(true);
	    	

	    	CSVInterface studentInterface = new CSVInterface("student");
	    	studentInterface.Extract();
	    	studentList = studentInterface.getOutput();
	    	CSVInterface staffInterface = new CSVInterface("staff");
	    	staffInterface.Extract();
	    	staffList = staffInterface.getOutput();
	    	CSVInterface moduleInterface = new CSVInterface("module");
	    	moduleInterface.Extract();
	    	moduleList = moduleInterface.getOutput();
	    }

	    
}
