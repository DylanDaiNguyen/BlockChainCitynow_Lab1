package transaction.wallet.common;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class ReadJSONFile {
    public String[] Read( String username) {
        String[] objects = new String[2];
        JSONParser jsonParser = new JSONParser();
        try {
            Object object = jsonParser.parse(new FileReader("E:\\"+username+".json"));
            JSONObject jsonObject = (JSONObject) object;
            String address = (String) jsonObject.get("address");
            String privatekey = (String) jsonObject.get("privatekey");
            objects[0] = address;
            objects[1] = privatekey;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return objects;
    }
}
