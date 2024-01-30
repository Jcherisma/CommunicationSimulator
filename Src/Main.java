package Src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * First 3 lines:
 *      1: indicate # 0f Customers
 *      2: indicates # of Operators
 *      3: indicates # of Actions
 */
//Main
public class Main {
    private static final String Log = null;


    public static void main(String[] args) {
        
        BufferedReader reader;
        ArrayList<String> stringArr = new ArrayList<String>();
        int customerToUse;
        int operatorToUse;
        int eventsToUse;
        
        try{
            reader = new BufferedReader(new FileReader("/Users/jeffreycherisma/Desktop/Java Projects/CommunicationSimulator/Testcases/test1.txt"));
			String line = reader.readLine();
            
            int i = 1;

			while (line != null) {
				System.out.println(line);
                //input line into array
                stringArr.add(line);
				// read next line
				line = reader.readLine();
                //increment i
                i++;
			}

        } catch(IOException e) {
                e.printStackTrace();
        }

        System.out.println("The size of the array is;" + stringArr.size());

        customerToUse = getCustomerCount(stringArr);
        operatorToUse = getOperatorCount(stringArr);
        eventsToUse = getEventsCount(stringArr);

       // ArrayList<Integer> intArr = getIntegerArray(stringArr);
        
        System.out.println("Customer in use" + customerToUse);
        System.out.println("Operator in use" + operatorToUse);
        System.out.println("Events in use" + eventsToUse);


    }

/* 
    public static ArrayList<Integer> getIntegerArray(ArrayList<String> stringArray){
                 ArrayList<Integer> arr = new ArrayList<Integer>();

                for(String value : stringArray){

                    try{
                        //Convert String to Integer, and store it into integer array list.
                        arr.add(Integer.parseInt(value));
                    } catch(NumberFormatException e){
                        System.out.println("Could not parse " + e);
                    }
                }

        return arr;
    }
    */

    public static int getCustomerCount(ArrayList<String> stringArray){
        int customer;

       customer = Integer.parseInt(stringArray.get(0));
       
       return customer;
    }

    public static int getOperatorCount(ArrayList<String> stringArray){
        int operator;

        operator = Integer.parseInt(stringArray.get(1));
       
        return operator;
    }

    public static int getEventsCount(ArrayList<String> stringArray){
        int events;

        events = Integer.parseInt(stringArray.get(2));
       
        return events;
    }
}