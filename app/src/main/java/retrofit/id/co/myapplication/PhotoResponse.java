package retrofit.id.co.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PhotoResponse {
    @SerializedName("data")
    private
    List<PhotoModel> data;


    public List<PhotoModel> getData() {
        return data;
    }

    public void setData(List<PhotoModel> data) {
        this.data = data;
    }
}
