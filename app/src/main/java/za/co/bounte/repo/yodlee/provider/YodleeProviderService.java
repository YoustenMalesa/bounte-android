package za.co.bounte.repo.yodlee.provider;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import za.co.bounte.model.yodlee.provider.Provider;

/**
 * Created by Rocky on 2018/01/10.
 */

public interface YodleeProviderService {

    @GET("ysl/restserver/v1/providers")
    Call<List<Provider>> getProviders(@Header("Authorization") String session);
}
