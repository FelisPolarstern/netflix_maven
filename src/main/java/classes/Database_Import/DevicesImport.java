package classes.Database_Import;

import java.io.IOException;
import java.util.List;

public class DevicesImport {
    private List<DeviceImport> DevicesImport;


    public DevicesImport(String path) throws IOException {
        List<String> deviceslist = ImporterHelperClass.ImportHelper(path, 13);

    }
}
