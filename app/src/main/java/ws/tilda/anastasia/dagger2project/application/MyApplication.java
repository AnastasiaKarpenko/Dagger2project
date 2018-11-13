package ws.tilda.anastasia.dagger2project.application;

import android.app.Application;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ws.tilda.anastasia.dagger2project.BuildConfig;
import ws.tilda.anastasia.dagger2project.model.CredentialsManager;
import ws.tilda.anastasia.dagger2project.model.CredentialsObject;
import ws.tilda.anastasia.dagger2project.model.RestService;

public class MyApplication extends Application {

    Gson gson;
    GsonConverterFactory gsonConverterFactory;
    Retrofit retrofit;
    CredentialsManager credentialsManager;


    @Override
    public void onCreate() {
        super.onCreate();

        gson = new GsonBuilder().create();
        gsonConverterFactory = GsonConverterFactory.create(gson);
        retrofit = new Retrofit.Builder()
                .addConverterFactory(gsonConverterFactory)
                .baseUrl(BuildConfig.BASE_URL)
                .build();
        credentialsManager = new CredentialsManager();
        RestService restService = credentialsManager.getService(retrofit);

        Call<CredentialsObject> call = restService.getCredentials();

        call.enqueue(new Callback<CredentialsObject>() {
            @Override
            public void onResponse(Call<CredentialsObject> call, Response<CredentialsObject> response) {
                CredentialsObject credentialsObject = response.body();
                Log.d("response data", "onResponse: apiKey " + credentialsObject.getApiKey());
                Log.d("response data", "onResponse: sessionId " + credentialsObject.getSessionId());
                Log.d("response data", "onResponse: token " + credentialsObject.getToken());

            }

            @Override
            public void onFailure(Call<CredentialsObject> call, Throwable t) {

            }
        });

    }
}
