package ws.tilda.anastasia.dagger2project.model;

import retrofit2.Retrofit;

public class CredentialsManager {

    public RestService getService(Retrofit retrofit) {
        return retrofit.create(RestService.class);
    }

}
