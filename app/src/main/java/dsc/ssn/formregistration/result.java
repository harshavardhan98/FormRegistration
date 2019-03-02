package dsc.ssn.formregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {

    String temp;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //setting the ui elements
        tv1=findViewById(R.id.tvResult1);

        Intent i= getIntent();

        temp=i.getStringExtra("name");
        temp=temp+"\n\n"+i.getStringExtra("rollNo");
        temp=temp+"\n\n"+i.getStringExtra("year");
        temp=temp+"\n\n"+i.getStringExtra("department");
        temp=temp+"\n\n"+i.getStringExtra("os");


        tv1.setText(temp);
    }
}
