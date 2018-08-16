package retrofit.id.co.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EndPoint service = RetrofitClientInstance.getRetrofitInstance().create(EndPoint.class);
        Call<PhotoResponse> call = service.getPhoto();
        call.enqueue(new Callback<PhotoResponse>() {
            @Override
            public void onResponse(Call<PhotoResponse> call, Response<PhotoResponse> response) {
                getData(response.body().getData());
            }

            @Override
            public void onFailure(Call<PhotoResponse> call, Throwable t) {

            }
        });
    }

    private void getData(List<PhotoModel> data) {
        Toast.makeText(MainActivity.this, String.valueOf(data.size()), Toast.LENGTH_SHORT).show();
    }
}
