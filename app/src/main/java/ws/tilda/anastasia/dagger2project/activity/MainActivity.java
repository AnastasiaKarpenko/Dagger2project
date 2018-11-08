package ws.tilda.anastasia.dagger2project.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ws.tilda.anastasia.dagger2project.R;
import ws.tilda.anastasia.dagger2project.activity.di.ActivityComponent;
import ws.tilda.anastasia.dagger2project.activity.di.ActivityModule;
import ws.tilda.anastasia.dagger2project.activity.di.DaggerActivityComponent;

public class MainActivity extends AppCompatActivity {
    ActivityComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule())
                .build();
    }
}
