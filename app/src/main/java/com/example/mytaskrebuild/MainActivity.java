package com.example.mytaskrebuild;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {


    //    All Subjects List
    String[] subjects = {"Select Subject","HISTORY", "GEOGRAPHY", "POLITICAL SCIENCE", "SOCIOLOGY" ,"PHYSIOLOGY", "HINDI", "PHYSICS",
            "CHEMISTRY", "BIOLOGY", "MATHS", "ENGLISH", "ECONOMICS", "COMPUTER SCIENCE", "PHYSICAL EDUCATION", "ACCOUNTS", "BUSINESS STUDIES"};

    String sub1,sub2,sub3,sub4;
    ProgressDialog pDialog;
    Spinner spinnerCourse1,spinnerCourse2,spinnerCourse3,spinnerCourse4;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Assign variable
        setContentView(R.layout.activity_main);
        spinnerCourse1 = (Spinner) findViewById(R.id.spinner_course_1);
        spinnerCourse2 = (Spinner)findViewById(R.id.spinner_course_2);
        spinnerCourse3 = (Spinner)findViewById(R.id.spinner_course_3);
        spinnerCourse4 = (Spinner)findViewById(R.id.spinner_course_4);
        btnSubmit = (Button)findViewById(R.id.btn_Submit);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, subjects);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCourse1.setAdapter(adapter);
        spinnerCourse2.setAdapter(adapter);
        spinnerCourse3.setAdapter(adapter);
        spinnerCourse4.setAdapter(adapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sub1 = spinnerCourse1.getSelectedItem().toString();
                sub2 = spinnerCourse2.getSelectedItem().toString();
                sub3 = spinnerCourse3.getSelectedItem().toString();
                sub4 = spinnerCourse4.getSelectedItem().toString();

                Log.d("SpinnerSame--- ",  Boolean.toString(areStringsEqual(sub1,sub2,sub3,sub4)) );
                String valueSame = Boolean.toString(areStringsEqual(sub1,sub2,sub3,sub4));

                if (sub1.equalsIgnoreCase("select subject") | sub2.equalsIgnoreCase("select subject") |
                        sub3.equalsIgnoreCase("select subject") | sub4.equalsIgnoreCase("select subject") | valueSame.equalsIgnoreCase("true")){
                    Toast.makeText(MainActivity.this, "Please select different subject in each field.", Toast.LENGTH_SHORT).show();

                }
                else{
//                        will go to career path screen after 1.5 sec
                    ShowProgress();
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        spinnerCourse1.setSelection(0);
        spinnerCourse2.setSelection(0);
        spinnerCourse3.setSelection(0);
        spinnerCourse4.setSelection(0);
    }
    public static boolean areStringsEqual(String str1, String str2, String str3, String str4) {
        return str1.equals(str2) && str1.equals(str3) && str1.equals(str4);
    }
    public void ShowProgress() {

        pDialog = ProgressDialog.show(this,"Please wait", "While we are recommending best career path for you.",true);
        new Thread() {
            public void run() {
                try{
                    sleep(1500);  //1.5 Second
                    Intent myIntent = new Intent(MainActivity.this, CareerPathActivity.class);
                    myIntent.putExtra("sub1", sub1);
                    myIntent.putExtra("sub2", sub2);
                    myIntent.putExtra("sub3", sub3);
                    myIntent.putExtra("sub4", sub4);
                    MainActivity.this.startActivity(myIntent);
                } catch (Exception e) {  }
                pDialog.dismiss();
            }
        }.start();
    }
}
