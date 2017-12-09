package startup.mehakmeet.postrequestusingretrofit2;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MEHAKMEET on 05-12-2017.
 */

public class pojo_chan {

    @SerializedName("key")
    String key_1;

    @SerializedName("id")
    String id_1;

    @SerializedName("channel_number")
    String chan_no;

    @SerializedName("channel_name")
    String chan_name;

    @SerializedName("channel_category")
    String chan_cat;

    public String getId_1(){

        return id_1;
    }

    public String getChan_no(){

        return chan_no;
    }
    public String getChan_name(){

        return chan_name;
    }
    public String getChan_cat(){

        return chan_cat;
    }

    public void setKey_1(String key_1) {

        this.key_1=key_1;
    }
}
