package com.abhisheksingh.ifbservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AssignCallsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign_calls_page);

        Button assign_btn,logout_calls_btn,next__taskAssigned_btn,taskFinished_btn,next_taskFinished_btn;
        EditText callAssigned_text, callTally_text, ongoingCall_text, employeeAvailability_text;

        assign_btn = (Button)findViewById(R.id.assign_btn);
        logout_calls_btn = (Button)findViewById(R.id.logout_calls_btn);
        next__taskAssigned_btn = (Button)findViewById(R.id.next__taskAssigned_btn);
        taskFinished_btn = (Button)findViewById(R.id.taskFinished_btn);
        next_taskFinished_btn = (Button)findViewById(R.id.next_taskFinished_btn);

        logout_calls_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AssignCallsPage.this,FirstPage.class));
            }
        });

        assign_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        next__taskAssigned_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        taskFinished_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        next_taskFinished_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
