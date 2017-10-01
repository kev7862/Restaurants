package kev7862.github.restaurants;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import se.akerfeldt.okhttp.signpost.OkHttpOAuthConsumer;
import se.akerfeldt.okhttp.signpost.SigningInterceptor;

/**
 * Created by matite on 9/30/17.
 */


// Contains all  logic necessary for interacting with the Yelp Api.
//define a findRestaurants() method that takes two parameters: The location a user provides, and a callback that will execute when our API request receives a readable response from Yelp.

public class YelpService {

    public static void findRestaurants(String location, okhttp3.Callback callback) {

        OkHttpOAuthConsumer consumer = new OkHttpOAuthConsumer(Constants.YELP_CONSUMER_KEY, Constants.YELP_CONSUMER_SECRET);
        consumer.setTokenWithSecret(Constants.YELP_TOKEN, Constants.YELP_TOKEN_SECRET);
// OkHttpClient resposible for creating and sending our request
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new SigningInterceptor(consumer))
                .build();

        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.YELP_BASE_URL).newBuilder();
        urlBuilder.addQueryParameter(Constants.YELP_LOCATION_QUERY_PARAMETER, location);
        String url = urlBuilder.build().toString();

//creating a new Request wih the new URL
        Request request= new Request.Builder()
                .url(url)
                .build();
// Calling each request Aychronously
        Call call = client.newCall(request);
        call.enqueue(callback);
    }

    }
