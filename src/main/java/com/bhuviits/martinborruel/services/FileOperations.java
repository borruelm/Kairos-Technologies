package com.bhuviits.martinborruel.services;

import org.springframework.util.ResourceUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperations {
    private ArrayList<String> fileValues = new ArrayList<>();


    public void  fillArray(){
        File citiesFile = null;
        Scanner citiesList = null;
        try{
            //read file
            citiesFile = ResourceUtils.getFile("classpath:static/city_connection.txt");
            citiesList = new Scanner(citiesFile);
            while(citiesList.hasNext()){
                //fill array
                fileValues.add(citiesList.nextLine());
            }
        }catch (Exception e){
            System.out.println(">>>> Error while reading file " + e.getMessage());
        }finally {
            if(citiesList != null) citiesList.close();
        }
    }

    public String checkCitiesConnection (String origin, String destination){
        fillArray();

        if(fileValues.contains(origin + ", " + destination)){
            return "yes";
        }

        return "no";
    }
}
