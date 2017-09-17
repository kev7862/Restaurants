package kev7862.github.restaurants;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        //setting-up my listview ArrayList in my restaurants activity
        ListView myListView = (ListView)findViewById(R.id.myListView);
        ArrayList<String> myRestaurants = new ArrayList<>();
        myRestaurants.add("Life of pie");
        myRestaurants.add("Screen Door");
        myRestaurants.add("Luc Lac");
        myRestaurants.add("Sweet Basil");
        myRestaurants.add("Slappy Cakes");
        myRestaurants.add("Equinox");
        myRestaurants.add("Miss Delta's");
        myRestaurants.add("Andina");
        myRestaurants.add("Lardo");
        myRestaurants.add("Portland City Grill");
        myRestaurants.add("Fat Head's Brewery");
        myRestaurants.add("Chipotle");
        myRestaurants.add("Subway");

        //Implementing my ArrayAdapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter <String>(this, android.R.layout.activity_list_item, myRestaurants);
        myListView.setAdapter(arrayAdapter);
    }
}
