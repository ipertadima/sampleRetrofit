package retrofit.id.co.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndPoint {
    @GET("/v1/city")
    Call<PhotoResponse> getPhoto();
}
