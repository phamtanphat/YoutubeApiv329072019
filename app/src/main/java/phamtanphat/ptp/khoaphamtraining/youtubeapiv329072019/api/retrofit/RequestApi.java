package phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.api.retrofit;

import phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.model.Demo1;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestApi {

    @GET("demo1.json")
    Call<Demo1> apidemo1();
}
