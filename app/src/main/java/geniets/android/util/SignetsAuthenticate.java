package geniets.android.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.Serializable;

/**
 * Code inspiré de https://github.com/ApplETS/ETSMobile-Android2/blob/8ba49999b6de0e9178297747276212f9ed0d0c39/app/src/main/java/ca/etsmtl/applets/etsmobile/util/ETSMobileAuthenticator.java
 */
public class SignetsAuthenticate implements ServerAuthenticate {
    @Override
    public String userSignUp(String name, String email, String pass, String authType) throws Exception {
        return null;
    }

    @Override
    public String userSignIn(String username, String pass, String authType) throws Exception {
        String url = "https://api.parse.com/1/users";

        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(url);

        httpPost.addHeader("Content-Type", "application/json");
        httpPost.addHeader("cache-control", "no-cache");

        String user = "{\"username\":\"" + username + "\",\"password\":\"" + pass + "\",\"phone\":\"415-392-0202\"}";
        HttpEntity entity = new StringEntity(user);
        httpPost.setEntity(entity);

        String authtoken = null;
        try {
            HttpResponse response = httpClient.execute(httpPost);
            String responseString = EntityUtils.toString(response.getEntity());

            if (response.getStatusLine().getStatusCode() == 200) {
//                ParseComError error = new Gson().fromJson(responseString, ParseComError.class);


//            User createdUser = new Gson().fromJson(responseString, User.class);

                authtoken = response.getHeaders("Set-Cookie").toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return authtoken;
    }

    private class ParseComError implements Serializable {
        int code;
        String error;
    }
}
