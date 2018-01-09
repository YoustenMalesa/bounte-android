package za.co.bounte.repo.yodlee.authentication;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import za.co.bounte.model.yodlee.authentication.LoginRequest;
import za.co.bounte.model.yodlee.authentication.LoginResponse;

/**
 * Created by Rocky on 2018/01/09.
 */

public interface YodleeAuthenticationService {

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json",
            "Cache-Control:no-cache"
    })
    @POST("ysl/restserver/v1/cobrand/login")
    Call<LoginResponse> login(@Body LoginRequest request);
}
