package com.keval_rajyaguru.Exception;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 9;
 
    public ListOfNumbers () throws NumberFormatException, IOException {
    	
    	FileReader fr = new FileReader("D:\\repo1\\inputFile.txt");
    	BufferedReader br = new BufferedReader(fr);
    	
    	
  
        list = new ArrayList<Integer>();
        String x;
        while((x=br.readLine())!= null)
        {
        	list.add(Integer.valueOf(x));
        }

    }
    
    public void writeList() {
        PrintWriter out = null;
        
        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
         
            for (int i = 0; i < list.size(); i++)
                out.println("Value at: " + i + " = " + list.get(i));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
            	  System.out.println("Closing PrintWriter");
                  out.close();
              } else {
                  System.out.println("PrintWriter not open");
              }
          }
      }
    
    public static void main(String[]args) throws NumberFormatException, IOException
    {
    	ListOfNumbers lon = new ListOfNumbers();
    	lon.writeList();
    }
  }
            