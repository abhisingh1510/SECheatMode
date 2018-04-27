package com.abhisheksingh.ifbservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdministratorPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator_page);
        Button assignCalls=findViewById(R.id.assignCalls_btn);
        Button billing=findViewById(R.id.billing_btn);
        Button logout=findViewById(R.id.logout_btn);
        assignCalls.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(new Intent( AdministratorPage.this, AssignCallsPage.class));
            }
        });
        billing.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    int n=3;//length/no. of query
                    int id[]=new int[n];//will store id of query
                    String tech[]=new String[n];//Plumer, etc. Technician type
                    int rate[]=new int[n];
                    int st[]=new int[n];//Start time
                    int end[]=new int[n];//end time
                    int cost[]=new int[n];
                    int sum=0;
                    for(int i=0;i<n;i++){
                        id[i]=1;
                        tech[i]="Plumber";
                        rate[i]=1000;
                        st[i]=1;
                        end[i]=1000;
                        cost[i]=10000;
                        sum+=cost[i];
                    }


                    String text="Dear Sir/Ma'am\n Thank you for using IFB Services. Please find the payment details below-\n";
                    text+="Id.\t Technican\t Start \t End \t Rate \t Cost\n";
                    for(int i=0;i<n;i++)
                    {
                        text+=Integer.toString(id[0])+"\t"+tech[0]+"\t"+Integer.toString(st[i])+"\t";
                        text+=Integer.toString(end[i])+"\t"+Integer.toString(rate[i])+"\t"+Integer.toString(cost[i])+"\n";
                    }
                    text+="\n Hence, your total cost is equal to Rs"+Integer.toString(sum)+"\n\n Thanking You,\n IFB Admin.";
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("message/rfc822");
                    i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"f20160081@hyderabad.bits-pilani.ac.in"});
                    i.putExtra(Intent.EXTRA_SUBJECT, "Bill of IFB Services");
                    i.putExtra(Intent.EXTRA_TEXT   , text);

                    try
                    {
                        startActivity(Intent.createChooser(i, "Send mail..."));
                    } catch (android.content.ActivityNotFoundException ex) {
                        ex.getStackTrace();
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(new Intent( AdministratorPage.this, FirstPage.class));
            }
        });


    }
}
