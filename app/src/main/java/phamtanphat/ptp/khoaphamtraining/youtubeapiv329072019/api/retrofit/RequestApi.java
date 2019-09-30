package phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.api.retrofit;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface RequestApi {
//    search?part=snippet&q=android&maxResults=50&type=video&key=AIzaSyDw1xWgw-tzAEnKhPUpCPEpNXTwbs3e6hY
    @GET("search")
    Call<String> searchYotubeVideo(@Query("part") String part,
                                   @Query("q") String q,
                                   @Query("maxResults") String maxResults,
                                   @Query("type") String type,
                                   @Query("key") String key);
}
