/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author holohoi
 */
public class handleCSV {

    public static String getTemplate() {
        File directory = new File("template");
        directory.mkdir();

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());

        String outputFilePath = "template\\" + timeStamp + ".csv";
        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = Files.newBufferedWriter(Paths.get(outputFilePath));
            try (CSVPrinter csvPrinter = CSVFormat.EXCEL.withHeader("Student id", "Full name")
                    .print(bufferedWriter)) {
//            csvPrinter.printRecord("18120433", "Nguyễn Văn Lâm");
            }
        } catch (IOException ex) {
            Logger.getLogger(handleCSV.class.getName()).log(Level.SEVERE, null, ex);
            return "Can't not generate template!";
        }

//        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        return (System.getProperty("user.dir") + "\\" + outputFilePath);

    }

    public static List<String> readImportCSV(String outputFilePath) {
        try {
            CSVParser csvParser = CSVParser.parse(Paths.get(outputFilePath), StandardCharsets.ISO_8859_1, CSVFormat.DEFAULT);
            List<CSVRecord> x = csvParser.getRecords();
            List<String> studentIDs = new ArrayList<String>();
            for (CSVRecord record : x) {
                studentIDs.add(record.get(0));
            }
            studentIDs.remove(0);
            return studentIDs;
        } catch (IOException ex) {
            Logger.getLogger(handleCSV.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static void main(String[] args) throws IOException {
        String x = getTemplate();
        System.out.println("file path: " + x);
//        String outputFilePath = "template/csvFile.csv";
//
//        List<String> temp = readImportCSV(outputFilePath);
//        System.out.println("");
    }
}
