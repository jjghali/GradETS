package geniets.android.util;

/**
 * Created by jjghali on 6/21/16.
 */
public interface ServerAuthenticate {
    public String userSignUp(final String name, final String email, final String pass, String authType) throws Exception;

    public String userSignIn(final String user, final String pass, String authType) throws Exception;
}
