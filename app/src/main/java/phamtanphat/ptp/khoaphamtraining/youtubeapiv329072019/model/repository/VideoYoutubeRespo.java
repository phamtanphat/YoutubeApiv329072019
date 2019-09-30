package phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.model.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.api.retrofit.RequestApi;
import phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.api.retrofit.RetrofitInit;
import phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.model.Videoyoutube;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VideoYoutubeRespo {

    private static VideoYoutubeRespo videorespo = null;
    private RequestApi requestApi;
    private VideoYoutubeRespo(){
        requestApi = RetrofitInit.initApi();
    }
    public static VideoYoutubeRespo getInstance(){
        if (videorespo == null){
            videorespo = new VideoYoutubeRespo();
        }
        return videorespo;
    }

    public MutableLiveData<Videoyoutube> getApiVideoYoutube(){
        Call<Videoyoutube> callbackvideo = RetrofitInit
                .initApi()
                .searchYotubeVideo(
                        "snippet",
                        "android",
                        "50",
                        "video",
                        "AIzaSyDw1xWgw-tzAEnKhPUpCPEpNXTwbs3e6hY"
                );
        callbackvideo.enqueue(new Callback<Videoyoutube>() {
            @Override
            public void onResponse(Call<Videoyoutube> call, Response<Videoyoutube> response) {
                Videoyoutube videoyoutube = response.body();
                Log.d("BBB",videoyoutube.getItems().get(0).getId().getVideoId());
            }

            @Override
            public void onFailure(Call<Videoyoutube> call, Throwable t) {

            }
        });
    }

}
