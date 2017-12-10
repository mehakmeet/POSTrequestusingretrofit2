package startup.mehakmeet.postrequestusingretrofit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    String key = "ABCDEFG";
    ApiInterface mAPIService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAPIService = ApiUtils.getAPIService();
        sendPost();
    }

    public void sendPost() {
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("key","ABCDEFG");

        Log.d("tagg","URL: "+mAPIService.savePost(jsonObject).request().url().toString());
        mAPIService.savePost(jsonObject).enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                //Log.i("tagg",call.request().url().toString());
                if(response.isSuccessful()) {
                    Log.i("RESPONSE", String.valueOf(response.body().toString()));
                }

                else
                {
                    Log.i("RESPONSE","Failed");
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {


                Log.i("RESPONSE","OnFailure...Failed");
            }
        });
    }
}