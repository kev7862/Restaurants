import kev7862.github.restaurants.BuildConfig;

/**
 * Created by matite on 9/30/17.
 */
// Creating a Reference to my credentials in the gradle.properties, instructing our application to include our credentials in the BuildConfig file when it is created
public class Constants {

    public static final String YELP_CONSUMER_KEY = BuildConfig.YELP_CONSUMER_KEY;
    public static final String YELP_CONSUMER_SECRET = BuildConfig.YELP_CONSUMER_SECRET;
    public static final String YELP_TOKEN = BuildConfig.YELP_TOKEN;
    public static final String YELP_TOKEN_SECRET = BuildConfig.YELP_TOKEN_SECRET;
}
