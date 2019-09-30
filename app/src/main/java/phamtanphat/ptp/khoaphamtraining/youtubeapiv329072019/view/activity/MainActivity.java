package phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import java.util.HashMap;

import phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.R;
import phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.api.retrofit.RequestApi;
import phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.api.retrofit.RetrofitInit;
import phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.model.Videoyoutube;
import phamtanphat.ptp.khoaphamtraining.youtubeapiv329072019.viewmodel.Mainviewmodel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    Mainviewmodel mainviewmodel ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        mainviewmodel = new Mainviewmodel();

        mainviewmodel.dataVideo.observe(this, new Observer<Videoyoutube>() {
            @Override
            public void onChanged(Videoyoutube videoyoutube) {
                if (videoyoutube != null){
                    Log.d("BBB",videoyoutube.getItems().size() + "");
                }
            }
        });


        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setBackgroundColor(Color.BLUE);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar,menu);
        return true;
    }
}
