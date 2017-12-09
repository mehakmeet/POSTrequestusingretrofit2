package startup.mehakmeet.postrequestusingretrofit2;

/**
 * Created by MEHAKMEET on 09-12-2017.
 */
public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://pgolecha.me:8383/";

    public static ApiInterface getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(ApiInterface.class);
    }
}