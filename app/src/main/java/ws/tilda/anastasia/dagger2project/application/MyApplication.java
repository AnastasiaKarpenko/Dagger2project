package ws.tilda.anastasia.dagger2project.application;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ws.tilda.anastasia.dagger2project.BuildConfig;
import ws.tilda.anastasia.dagger2project.model.CredentialsManager;
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

    }
}
