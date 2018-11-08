package ws.tilda.anastasia.dagger2project.application;

import android.app.Application;

import javax.inject.Inject;

import retrofit2.Retrofit;
import ws.tilda.anastasia.dagger2project.application.di.ApplicationComponent;
import ws.tilda.anastasia.dagger2project.application.di.ApplicationModule;
import ws.tilda.anastasia.dagger2project.application.di.DaggerApplicationComponent;

public class MyApplication extends Application {

    ApplicationComponent component;

    @Inject
    Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule())
                .build();

        component.inject(this);


    }
}
