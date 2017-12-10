package startup.mehakmeet.postrequestusingretrofit2;

import com.google.gson.JsonObject;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by MEHAKMEET on 05-12-2017.
 */

public interface ApiInterface {
    @POST("something/")
    Call<JsonObject> savePost(@Body JsonObject jsonObject);
}
