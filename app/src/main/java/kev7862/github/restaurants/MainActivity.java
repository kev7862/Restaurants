package kev7862.github.restaurants;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        Typeface Pacifico = Typeface.createFromAsset(getAssets(), "fonts/Pacifico.ttf");
        mtextView.setTypeface(Pacifico);
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

