package kev7862.github.restaurants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;

public class RestaurantActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        private void getRestaurants(String location) {
            final kev7862.github.restaurants.YelpService yelpService = new YelpService();
            yelpService.findRestaurants(location, new Callback() {

                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

            });
        }



        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
//        mLocationEditText.setText("Here are all the restaurants near: " + location);
    }
}

