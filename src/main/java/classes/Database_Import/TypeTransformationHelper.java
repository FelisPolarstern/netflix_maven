package classes.Database_Import;

import java.time.Instant;

public class TypeTransformationHelper {

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
        return(Instant.parse(input));
    }

    static public Boolean toBoolean(String input){
        if(input.isEmpty()){
            return null;
        }
        return Boolean.valueOf(input);
    }
}
