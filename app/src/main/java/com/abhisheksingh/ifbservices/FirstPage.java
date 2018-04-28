package com.abhisheksingh.ifbservices;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.io.*;



public class FirstPage extends AppCompatActivity {

    public static ArrayList <Employee> employees= new ArrayList<Employee>();
    static public float total=0;
    static public int num=0;
    public static File root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        Button Administrator=findViewById(R.id.administrator_login_btn);
        Button Employee=findViewById(R.id.employee_login_btn);
        Button Guest=findViewById(R.id.guest_login_btn);

        try {
            root = new File(Environment.getExternalStorageDirectory(), "IFB");
            if (!root.exists()) {
                root.mkdirs();
            }
            File file = new File(root, "Employee.txt");
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line;
            int i=0;
            while ((line = br.readLine()) != null) {
               i++;
               if(i==1) {
                   String arr[]=line.split(" ");
                   total=Integer.parseInt(arr[0]);
                   num=Integer.parseInt(arr[1]);
               }
               else
               {
                   String arr[]=line.split(" ");
                   employees.add(new Employee(arr[0],arr[1],arr[2],arr[3],arr[5],Integer.parseInt(arr[6]),Float.parseFloat(arr[7])));
               }
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }



        Administrator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(new Intent(FirstPage.this, LoginPage.class));
            }
        });
        Employee.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(new Intent(FirstPage.this, LoginPage.class));
            }
        });
        Guest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(new Intent(FirstPage.this, GuestPage.class));
            }
        });
    }
}
