package ws.tilda.anastasia.dagger2project.activity.di;

import dagger.Component;
import ws.tilda.anastasia.dagger2project.application.di.ApplicationComponent;

@Component(modules = {ActivityModule.class}, dependencies = {ApplicationComponent.class})
public interface ActivityComponent {
}
