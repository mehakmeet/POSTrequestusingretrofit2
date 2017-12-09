package startup.mehakmeet.postrequestusingretrofit2;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by MEHAKMEET on 05-12-2017.
 */

public interface ApiInterface {

    @FormUrlEncoded
    @POST("/tvchannels/")
    Call<pojo_chan> savePost(
            @Field("key") String key
    );
}
