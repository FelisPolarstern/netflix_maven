package classes.Database_Import;
import java.util.HashMap;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class CountryCodeMap {
    private HashMap<String, String> countryShortcodes = new HashMap<String, String>();


    public CountryCodeMap(HashMap<String, String> map){
        this.countryShortcodes = map;
    }

    public static CountryCodeMap loadShortCodesFromFile() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("Country_Shortcodes.csv"));
        HashMap<String, String> countryShortCodes = new HashMap<>();
        for (String line : lines) {
            String[] spl = line.split(";");
            countryShortCodes.put(spl[0], spl[1]);
            System.out.println(countryShortCodes);
        }
        return new CountryCodeMap(countryShortCodes);
    }
}
