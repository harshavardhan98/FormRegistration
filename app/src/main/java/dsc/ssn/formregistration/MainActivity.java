package dsc.ssn.formregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText edt1,edt2;
    Spinner sp1;
    RadioGroup rg1;
    RadioButton rb1;
    CheckBox cb1,cb2;

    String name,rollNo,year,department,os;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting the ui elements
        b1=findViewById(R.id.btn1);
        edt1=findViewById(R.id.et1);
        edt2=findViewById(R.id.et2);
        sp1=findViewById(R.id.sp1);
        rg1=findViewById(R.id.rg1);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        rg1=findViewById(R.id.rg1);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,result.class);

                getDetails();
                // adding information to be passed on to the next activity
                i.putExtra("name",name);
                i.putExtra("rollNo",rollNo);
                i.putExtra("year",year);
                i.putExtra("department",department);
                i.putExtra("os",os);


                startActivity(i);
            }
        });

    }




    public void getDetails(){
    // fetches the details given by the user in the form and stores in the corresponding variables


        rb1=findViewById(rg1.getCheckedRadioButtonId());


        name=edt1.getText().toString();
        rollNo=edt2.getText().toString();
        year=sp1.getSelectedItem().toString();
        os=rb1.getText().toString();

        if(cb1.isChecked())
            department="computer Science";
        if(cb2.isChecked())
            department="information technology";
    }


}
