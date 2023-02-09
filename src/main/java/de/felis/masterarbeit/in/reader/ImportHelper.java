package de.felis.masterarbeit.in.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ImportHelper {

    static public String convertISOTimestampToTimestampFormat(String toConvert){
        Instant i = Instant.parse(toConvert);
        System.out.println(i);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone((ZoneId.of("UTC")));
        String fmt = formatter.format(i);
        System.out.println(fmt);
        return fmt;
    }

    public static List<List<String>> readCsvFile(String path) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path));
        String firstLine = lines.remove(0); //Spaltenüberschriften werden gelöscht und in der firstLine aufgefangen
        int headerLen = firstLine.split(",").length; //Anzahl der Spalten

        List<List<String>> data = new ArrayList<>();
        for (String line : lines) {
            List<String> currentLine = new ArrayList<>();
            String[] spl = line.split(",");
            for(String col : spl){
                col = col.replaceAll("^\"|\"$", "");
                currentLine.add(col);
            }
            while(currentLine.size()<headerLen){ //letzten Spalten werden nicht übertragen, daher werden hier leere Felder ausgefüllt, bis alle Spalten Inhalt haben
                currentLine.add("");
            }
            data.add(currentLine);
        }
        return data;
    }

    public static List<String> readFileOld(String path, int limit) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path));
        //HashMap<String, String> accountDetailsImportMap = new HashMap<>();
        List<String> Import = new LinkedList<>();
        lines.remove(0);
        for (String line : lines) {
            String[] spl = line.split(",", limit);
            int length = spl.length;

            for(int i = 0; i<length; i++){
                if(spl[i].equalsIgnoreCase("No") || spl[i].equalsIgnoreCase("Off")){
                    spl[i] = "false";
                }
                if(spl[i].equalsIgnoreCase("Yes") || spl[i].equalsIgnoreCase("On")){
                    spl[i] = "true";
                }
                spl[i] = spl[i].replaceAll("^\"|\"$", "");
                System.out.println(spl[i]);
                Import.add(spl[i]);
                //System.out.println(AccountDetailsImport[i]);
            }
            //accountDetailsImportMap.put(spl[0], spl[1]);

        }
        return Import;
    }

    static public String toString(String input){
        if (input.isEmpty()){
            return null;
        }
        return input;
    }
    static public Integer toInt(String input){
        if(input.isEmpty()){
            return null;
        }
        return(Integer.valueOf(input));
    }
    static public Instant toInstant(String input){
        if(input.isEmpty()){
            return null;
        }
        /*Hier Funktion einfügen die Art des Datums erkennt und entsprechend parst, so lange es excpetions wirft weiter parsen*/
        try{
            return(Instant.parse(input));
        } catch(DateTimeParseException e) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSZ");
            ZonedDateTime zonedDateTime = ZonedDateTime.parse(input, formatter);
            Instant returnVal = zonedDateTime.toInstant();
                    return returnVal;
        }
    }

    static public Boolean toBoolean(String input){
        if(input.isEmpty()){
            return null;
        }
        return Boolean.valueOf(input);
    }

    /* --- Time Formate Transformer --- */
    static public Instant convertStringToInstant(String ConvertedInstant){
        // this.customer_creation_timeStamp = Timestamp.valueOf(AccountDetailsImport[9]);
        Instant temp = Instant.parse(ConvertedInstant);
        System.out.println(temp);
        return temp;
    }

    static public LocalDateTime toLocalDateTime(String input){
        if(input.matches("\\d\\d\\d\\d-\\d\\d-\\d\\d \\d\\d:\\d\\d:\\d\\d")){
            input = input.replaceAll(" ", "T");
        }
        if (input.matches("\\d\\d\\d\\d-\\d\\d-\\d\\d \\d\\d:\\d\\d")){
            input = input.replaceAll(" ", "T");

        }
        return(LocalDateTime.parse(input));
    }
    static public LocalDate toLocalDate(String input){
        if(input.isEmpty()){
            return null;}
        /*Prüfung des Strings*/
        if (!input.matches("\\d\\d\\d\\d-\\d\\d-\\d\\d")){      //Prüfen ob der String "-" enthält, \\d ist regEx für jede Ziffer
            StringBuilder newString = new StringBuilder(input);
            if(input.matches("\\d\\d\\d\\d-\\d\\d\\d\\d")){
                newString.insert(7, "-");
            }
            else if(input.matches("\\d\\d\\d\\d\\d\\d-\\d\\d")){            //20170621
                newString.insert(4, "-");
            }

            else {
                newString.insert(4, "-");
                newString.insert(7, "-");

            }
            input = newString.toString();
        }
        return(LocalDate.parse(input));
    }
}


