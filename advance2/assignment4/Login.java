package advance2.assignment4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map;

public class Login {

    private Map<Integer, String> loginMap = new

            LinkedHashMap<Integer, String>();

    public void addLogin(int customerId, String password) {
//adding the input to the map
        loginMap.put(customerId, password);

    }
}