/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interaction.style;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Mark
 */
public class InteractionStyles {
    
    List questions;
    List harmonyList;
    List productionList;
    List connectionList;
    List statusQuoList;
    
    int harmony;
    int production;
    int connection;
    int statusQuo;
    
    public InteractionStyles()
    {
        //Open up file
        File file = new File("questions.txt");
        questions = new ArrayList();
        
        try{
            Scanner input = new Scanner(file);
            while(input.hasNext()){
                String num = input.nextLine();
                questions.add(num);
            }
        }
        catch(FileNotFoundException e)
        {
            System.err.format("File does not exist");
        }
        
        //open up question descriptives and put into list
        File file2 = new File("harmony.txt");
        harmonyList = new ArrayList();
        File file3 = new File("production.txt");
        productionList = new ArrayList();
        File file4 = new File("connection.txt");
        connectionList = new ArrayList();
        File file5 = new File("statusQuo.txt");
        statusQuoList = new ArrayList();
        
        String [] textFiles = {"harmony.txt", "production.txt", "connection.txt", "statusQuo.txt"};
        List [] listNames = {harmonyList, productionList, connectionList, statusQuoList};
        File [] fileArray = {file2, file3, file4, file5};
        Scanner listInput;
        
        for(int i = 0; i < textFiles.length; i++)
        {
            try{
                        
                    listInput = new Scanner(fileArray[i]);

                    for(int j = 0; j < listNames.length; j++)
                    {
                        List newList = listNames[i];
                        
                        while(listInput.hasNext()){
                            
                        String next = listInput.nextLine();
                        newList.add(next);

                    }
                }
            }
            catch(FileNotFoundException e)
            {
                System.err.format("File does not exist");
            }
        }
        
    }
    
    public void run()
    {
        int descriptionCounter = 0;
        while(!questions.isEmpty())
        {     
            System.out.println("\n" + questions.get(0) + "\n");
            questions.remove(0);
            System.out.println("Harmony: " + harmonyList.get(descriptionCounter));
            System.out.println("Production: " + productionList.get(descriptionCounter));
            System.out.println("Connection: " + connectionList.get(descriptionCounter));
            System.out.println("Status Quo: " + statusQuoList.get(descriptionCounter));
            
            System.out.print("\nResponses: ");
            getInput();
            descriptionCounter++;
        }
        
        System.out.println("\nScores\n" + "Harmony: " + harmony + "\nProduction " + production
        + "\nConnection: " + connection + "\nStatus Quo " + statusQuo);
    }
    
    public void getInput()
    {
        boolean inputFlag = false;
        String input;
        Scanner userInput = new Scanner(System.in);
        
        do{
             input = userInput.nextLine();
             String inputArray[] = input.split(" ");
             
             //Check to see if all inputs are below 4
             for(int i = 0; i < inputArray.length; i++)
             {
                 if(Integer.parseInt(inputArray[i]) > 4 || Integer.parseInt(inputArray[i]) < 1)
                 {
                     inputFlag = false;
                     break;
                 }
                 
                 inputFlag = true;
             }
             
             
             if(inputFlag == false)
             {
                 System.out.println("Incorrect input, please try again.");
             }
             else
             {
                harmony += Integer.parseInt(inputArray[0]);

                production += Integer.parseInt(inputArray[1]);

                connection += Integer.parseInt(inputArray[2]);

                statusQuo += Integer.parseInt(inputArray[3]);
             }
         }while(inputFlag == false);
        
        
}
    
    
}
