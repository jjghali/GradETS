package geniets.android.util;

/**
 * Created by jjghali on 6/21/16.
 */
public class AccountGeneral {
    public static final String ACCOUNT_TYPE = "geniets.android";

    /**
     * Account name
     */
    public static final String ACCOUNT_NAME = "GeniETS";

    /**
     * Auth token types
     */
    public static final String AUTHTOKEN_TYPE_READ_ONLY = "Read only";
    public static final String AUTHTOKEN_TYPE_READ_ONLY_LABEL = "Read only access to an Udinic account";

    public static final String AUTHTOKEN_TYPE_FULL_ACCESS = "Full access";
    public static final String AUTHTOKEN_TYPE_FULL_ACCESS_LABEL = "Full access to an Udinic account";

    public static final ServerAuthenticate sServerAuthenticate = new SignetsAuthenticate();
}