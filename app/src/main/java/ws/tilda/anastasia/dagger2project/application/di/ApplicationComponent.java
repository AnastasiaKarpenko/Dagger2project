package ws.tilda.anastasia.dagger2project.application.di;

import dagger.Component;
import ws.tilda.anastasia.dagger2project.application.MyApplication;

@ApplicationScope
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MyApplication application);
}
