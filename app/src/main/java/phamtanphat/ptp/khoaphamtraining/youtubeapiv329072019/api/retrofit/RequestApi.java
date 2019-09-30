package phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.api.retrofit;

import phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.model.Videoyoutube;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RequestApi {
//    search?part=snippet&q=android&maxResults=50&type=video&key=AIzaSyDw1xWgw-tzAEnKhPUpCPEpNXTwbs3e6hY
    @GET("search")
    Call<Videoyoutube> searchYotubeVideo(@Query("part") String part,
                                         @Query("q") String q,
                                         @Query("maxResults") String maxResults,
                                         @Query("type") String type,
                                         @Query("key") String key);
//    ctrl + alt + o : auto clear import
}
