package ws.tilda.anastasia.dagger2project.application.di;

import dagger.Component;
import retrofit2.Retrofit;

@ApplicationScope
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    Retrofit getRetrofit();
}
