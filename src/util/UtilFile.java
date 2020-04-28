package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletContext;

public class UtilFile {
   public static List<String> readFile(ServletContext context, String filename) 
   {
      List<String> contents = new ArrayList<String>();
      try 
      {
         /*InputStream is = context.getResourceAsStream(filename);
         if (is != null) 
         {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            String text;
            
            while ((text = reader.readLine()) != null) 
            {
               contents.add(text);
            }
         }*/
    	 File file = new File(filename);
    	 Scanner scan = new Scanner(file);
    	 if (filename != null && filename != "")
    	 {
    		 /*while (scan.hasNextLine())
    		 {
    			 while (scan.hasNext())
    			 {
    				 contents.add(scan.next());
    			 }
    		 }*/
    		 while(scan.hasNext())
    		 {
    			 contents.add(scan.next());
    		 }
    	 }
      } 
      catch (Exception e) 
      {
         e.printStackTrace();
      }
      return contents;
   }

   public static List<String> readFile(String filePath) 
   {
      List<String> contents = new ArrayList<String>();
      File file = new File(filePath);
      Scanner scanner = null;
      try 
      {
         scanner = new Scanner(file);
        
         while (scanner.hasNextLine()) 
         {
            String line = scanner.nextLine();
            contents.add(line);
         }
      } 
      catch (FileNotFoundException e) 
      {
         e.printStackTrace();
      } 
      finally 
      {
         if (scanner != null)
            scanner.close();
      }
      return contents;
   }
}