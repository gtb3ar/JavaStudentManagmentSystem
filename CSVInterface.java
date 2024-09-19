package backEnd;

import java.io.BufferedReader; //Library Imports
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class CSVInterface {
	
	private static String endPath = "";
	private static int count = 0;
	private static int lineCount = 0;
	private static int columnCount = 0;
	private static String[][] output;

    public CSVInterface(String passPath) { // The setup, resizes the 2d Array to accomodate for CSV size
        CSVInterface.endPath = passPath;
        Initialise();
        try {
        	FileOutputStream FoS = new FileOutputStream(passPath+".csv",true);
        	PrintWriter pw = new PrintWriter(FoS);
        	pw.println("");
        	pw.close();
        } catch (Exception FileNotFoundException) {
        	
        }
    }
    
    public static void Initialise() {
        output = new String[0][0];
    	String na;
        try {
            BufferedReader br = new BufferedReader(new FileReader(endPath));
            if ((na = br.readLine()) != null) {
                columnCount = (na.split(",")).length;
                while ((na = br.readLine()) != null) {
                    lineCount = lineCount + 1;
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error");
        }
        output = new String[lineCount+1][columnCount+1];
    }
    
    public static void appendGap(){
    	try {
    		BufferedWriter bw = new BufferedWriter(new FileWriter(endPath,true));
    		bw.append(",");
    		bw.flush();
    		bw.close();
    		lineCount = lineCount +1;
    		Initialise();
    	} catch (Exception e) {
    		
    	}
    }
    
    public static void newRecord(){
    	try {
    		BufferedWriter bw = new BufferedWriter(new FileWriter(endPath,true));
    		bw.append("\n");
    		bw.flush();
    		bw.close();
    		lineCount = lineCount +1;
    		Initialise();
    	} catch (Exception e) {
    		
    	}
    }
    
    public static void appendItem(String text){
    	try {
    		BufferedWriter bw = new BufferedWriter(new FileWriter(endPath,true));
    		bw.append(text);
    		bw.flush();
    		bw.close();
    		lineCount = lineCount +1;
    		Initialise();
    	} catch (Exception e) {
    		
    	}
    }
    
    public void Extract(){ // Recursive reading a CSV file
        String line =""; 
        count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(endPath));

            while ((line = br.readLine()) != null) {
                output[count] = line.split(",");
                count = count + 1;
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public void printContent(){ // Content --> Console
        for (int record = 0; record <= lineCount; record++) {
            System.out.println(Arrays.toString(output[record]));
        }
	
}

    public String[][] getOutput() {
		return output;
    }
}