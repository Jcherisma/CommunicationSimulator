package Src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * First 3 lines:
 *      1: indicate # 0f Customers
 *      2: indicates # of Operators
 *      3: indicates # of Actions
 */
//Main
public class Main {
    public static void main(String[] args) {
        
        BufferedReader reader;
        
        try{
            reader = new BufferedReader(new FileReader("/Users/jeffreycherisma/Desktop/Java Projects/CommunicationSimulator/Testcases/test1.txt"));
			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}

        } catch(IOException e) {
                e.printStackTrace();
        }

    }
}