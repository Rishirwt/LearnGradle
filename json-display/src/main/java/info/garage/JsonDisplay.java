package info.garage;

import com.google.gson.Gson;

public class JsonDisplay {
    public static String showJson(Object object)
    {
        Gson gson =new Gson();
        String json=gson.toJson(object);
        System.out.println(json);

        return null;
    }
}
