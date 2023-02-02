package classes.Database_Import;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class ImporterHelperClass {

    public static List<String> ImportHelper(String path, int limit) throws IOException {
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
}
