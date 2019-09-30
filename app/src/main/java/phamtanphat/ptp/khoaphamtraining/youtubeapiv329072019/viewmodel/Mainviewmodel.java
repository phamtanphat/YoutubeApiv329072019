package phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.model.Videoyoutube;
import phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.model.repository.VideoYoutubeRespo;

public class Mainviewmodel extends ViewModel {

    public Mainviewmodel() {
    }

    public MutableLiveData<Videoyoutube> dataVideo = VideoYoutubeRespo
                                    .getInstance()
                                    .getApiVideoYoutube();

}
