package com.abhisheksingh.ifbservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class EmployeePage extends AppCompatActivity {

    Button logout;
    RatingBar rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_page);
        logout=(Button)findViewById(R.id.logout_employee_btn);
        rb=(RatingBar)findViewById(R.id.ratingBar_employee);

        rb.setVisibility(View.INVISIBLE);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EmployeePage.this, FirstPage.class));
            }
        });
    }
}
