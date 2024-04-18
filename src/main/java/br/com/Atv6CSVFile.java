package br.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Atv6CSVFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("dados.csv");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] fields = data.split(",");
                for (String field : fields) {
                    System.out.print(field + " ");
                }
                System.out.println();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        }
    }
