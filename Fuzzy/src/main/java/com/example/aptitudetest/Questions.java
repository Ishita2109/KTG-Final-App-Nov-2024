package com.example.aptitudetest;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




import java.util.ArrayList;

public class Questions extends AppCompatActivity {

    private questionslib mQuestionsLibrary = new questionslib();
    private TextView mQuestionsView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private int mQuestionNumber = 0;


    ArrayList<Integer> mQuestionChoice = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
//        getSupportActionBar().setTitle("Aptitude Test");



        mQuestionsView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.button1);
        mButtonChoice2 = (Button) findViewById(R.id.button2);
        mButtonChoice3 = (Button) findViewById(R.id.button3);
        mButtonChoice4 = (Button) findViewById(R.id.button4);

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mQuestionChoice.add(mQuestionNumber, 1);

                updateQuestion();
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuestionChoice.add(mQuestionNumber, 2);
                updateQuestion();
            }


        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuestionChoice.add(mQuestionNumber, 3);
                updateQuestion();
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuestionChoice.add(mQuestionNumber, 4);
                updateQuestion();
            }
        });


    }

    private void updateQuestion() {
        mQuestionsView.setText(mQuestionsLibrary.getQuestions(mQuestionNumber));
        mButtonChoice1.setText(mQuestionsLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionsLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionsLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionsLibrary.getChoice4(mQuestionNumber));

        if(mQuestionNumber == 60)
        {
            mButtonChoice1.setVisibility(View.GONE);
            mButtonChoice2.setVisibility(View.GONE);
            mButtonChoice3.setVisibility(View.GONE);
            mButtonChoice4.setVisibility(View.GONE);

            final ProgressDialog TempDialog;
            CountDownTimer CDT;
            final int[] i = {5};

            TempDialog = new ProgressDialog(Questions.this);
            TempDialog.setMessage("Calculating Your Result Please wait.....");
            TempDialog.setCancelable(false);
            TempDialog.setProgress(i[0]);
            TempDialog.show();

            CDT = new CountDownTimer(2000, 1000)
            {
                public void onTick(long millisUntilFinished)
                {
                    TempDialog.setMessage("Calculating Your Result Please wait.....");
                    i[0]--;
                }

                public void onFinish()
                {
                    TempDialog.dismiss();
                    Intent intent = new Intent(Questions.this, ScoreActivity.class);
                    intent.putExtra("mQuestionChoice", mQuestionChoice);
                    startActivity(intent);
                }
            }.start();


        }

        if(mQuestionNumber < 60) {
            mQuestionNumber++;

        }
        else
        {
//            Intent intent = new Intent(Questions.this, ScoreActivity.class);
//            intent.putExtra("mQuestionChoice", mQuestionChoice);
//            startActivity(intent);
        }
    }



  /*  public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(), Home.class));

    }*/
}
