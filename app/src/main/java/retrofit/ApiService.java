package retrofit;

import modal.Building;
import modal.Buildings;
import modal.MapAddressModel;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by aark on 2016-10-18.
 */

public interface ApiService {

  @GET("buildings") Call<Buildings> eventsList(@Header("Authorization") String authorization);

  @GET("https://maps.googleapis.com/maps/api/geocode/json?sensor=false")
  Call<MapAddressModel> callGoogleJSMapAPI(@Query("address") String address,
      @Query("key") String key);

  @POST("buildings") Call<ResponseBody> postBuilding(
      @Header("Authorization") String apiAuthorisation, @Body Building mBulding);
}
