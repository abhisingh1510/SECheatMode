package com.abhisheksingh.ifbservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class EmployeePage extends AppCompatActivity {

    Button logout;
    RatingBar rb;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_page);
        logout=(Button)findViewById(R.id.logout_employee_btn);
        rb=(RatingBar)findViewById(R.id.ratingBar_employee);
        name=(EditText)findViewById(R.id.employeeName_text);
        //rb.setVisibility(View.INVISIBLE);
        rb.setRating(3.5f);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EmployeePage.this, FirstPage.class));
            }
        });
    }
}
