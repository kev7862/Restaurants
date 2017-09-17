package kev7862.github.restaurants;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button mfindRestaurantsButton;
    private EditText mLocationEditText;
    private TextView mtextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
        mfindRestaurantsButton = (Button) findViewById(R.id.findRestaurantButton);
        mtextView = (TextView) findViewById(R.id.textView);
       //setting-up my listview in my restaurants activity
        ListView myListView = (ListView)findViewById(R.id.myListView);
        ArrayList<String> myRestaurants = new ArrayList<>();
        myRestaurants.add("Lifeof pie");
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


        // Setting up my textView font type
        Typeface Pacifico = Typeface.createFromAsset(getAssets(), "fonts/Pacifico.ttf");
        mtextView.setTypeface(Pacifico);
        // Setting up my button font type
        Typeface cartel = Typeface.createFromAsset(getAssets(), "fonts/cartel.ttf");
        mfindRestaurantsButton.setTypeface(cartel);
        mfindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = mLocationEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, RestaurantActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);
            }
        });
    }
}

