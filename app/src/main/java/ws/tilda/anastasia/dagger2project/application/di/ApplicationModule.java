package ws.tilda.anastasia.dagger2project.application.di;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ws.tilda.anastasia.dagger2project.BuildConfig;

@Module
public class ApplicationModule {

    @Provides
    Retrofit retrofit(GsonConverterFactory gsonConverterFactory) {
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(gsonConverterFactory)
                .build();

    }

    @Provides
    GsonConverterFactory gsonConverterFactory() {
        return null;
    }
}
