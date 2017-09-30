import javax.security.auth.callback.Callback;

import se.akerfeldt.okhttp.signpost.OkHttpOAuthConsumer;

/**
 * Created by matite on 9/30/17.
 */


// Contains all  logic necessary for interacting with the Yelp Api.
//define a findRestaurants() method that takes two parameters: The location a user provides, and a callback that will execute when our API request receives a readable response from Yelp.

public class YelpService {

    public static void findRestaurants(String location, Callback callback) {

        OkHttpOAuthConsumer consumer = new OkHttpOAuthConsumer(Constants.YELP_CONSUMER_KEY, Constants.YELP_CONSUMER_SECRET);
        consumer.setTokenWithSecret(Constants.YELP_TOKEN, Constants.YELP_TOKEN_SECRET);

    }

}
