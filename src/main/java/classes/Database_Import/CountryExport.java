package classes.Database_Import;

public class CountryExport {
    private Integer country_ID = null;
    private String country_Code;
    private String description;

    public CountryExport(String country_Code){
        this.country_Code = country_Code;

        
    }

    public int getCountry_ID (){
        return this.country_ID;
    }
    public String getCountry_Code(){
        return this.country_Code;
    }
    public String getDescription(){
        return this.description;
    }

}

