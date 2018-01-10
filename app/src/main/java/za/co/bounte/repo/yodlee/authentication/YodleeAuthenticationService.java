package za.co.bounte.repo.yodlee.authentication;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import za.co.bounte.model.yodlee.authentication.LoginRequest;
import za.co.bounte.model.yodlee.authentication.LoginResponse;
import za.co.bounte.model.yodlee.authentication.user.YodleeUserDetails;
import za.co.bounte.model.yodlee.authentication.user.YodleeUserLoginRequest;

/**
 * Created by Rocky on 2018/01/09.
 */

public interface YodleeAuthenticationService {

    @POST("ysl/restserver/v1/cobrand/login")
    Call<LoginResponse> apiAuthentication(@Body LoginRequest request);

    @POST("ysl/restserver/v1/user/login")
    Call<YodleeUserDetails> userLogin(@Body YodleeUserLoginRequest request,@Header(value = "Authorization") String cobSession);
}
