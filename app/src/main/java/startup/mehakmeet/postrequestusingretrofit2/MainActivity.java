package startup.mehakmeet.postrequestusingretrofit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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
        sendPost(key);
    }

    public void sendPost(String key) {
        mAPIService.savePost(key).enqueue(new Callback<pojo_chan>() {
            @Override
            public void onResponse(Call<pojo_chan> call, Response<pojo_chan> response) {

                if(response.isSuccessful()) {
                    Log.i("RESPONSE",response.body().toString());
                }

                else
                {
                    Log.i("RESPONSE","Failed");
                }
            }

            @Override
            public void onFailure(Call<pojo_chan> call, Throwable t) {


                Log.i("RESPONSE","OnFailure...Failed");
            }
        });
    }
}