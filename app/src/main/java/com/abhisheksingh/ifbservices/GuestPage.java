package com.abhisheksingh.ifbservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class GuestPage extends AppCompatActivity {

    Button rateus,contactus;
    RatingBar rb;
    float rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_page);
        rateus=(Button)findViewById(R.id.rate_us_btn);
        contactus=(Button)findViewById(R.id.contact_us_btn);
        rb=(RatingBar)findViewById(R.id.ratingBar_guest);
        rating=rb.getRating();
        rateus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GuestPage.this,"Thank You!",Toast.LENGTH_LONG).show();
            }
        });
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GuestPage.this, ContactUsPage.class));
            }
        });
    }
}
