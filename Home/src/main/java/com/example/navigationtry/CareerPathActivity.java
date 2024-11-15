package com.example.navigationtry;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class CareerPathActivity extends AppCompatActivity{

    String sub1,sub2,sub3,sub4;
    CareerPathModel[] careerPathModel;
    ArrayList<CareerPathModel> data = new ArrayList<>();
    RecyclerView rVcareerPath;
    //Context context;
    //Activity activity;
    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_path);
        rVcareerPath= (RecyclerView)findViewById(R.id.RVcareerPath);
        sub1 = getIntent().getStringExtra("sub1");
        sub2 = getIntent().getStringExtra("sub2");
        sub3 = getIntent().getStringExtra("sub3");
        sub4 = getIntent().getStringExtra("sub4");
        Log.d("values",sub1+" " + sub2+" " + sub3+" " + sub4);
        int randomIndex = getRandomIndex(data.size());

        //First Subject
        if(sub1.equalsIgnoreCase("history")){

            data.add(randomIndex, new CareerPathModel("Archvist", R.drawable.achivist));
            data.add(randomIndex, new CareerPathModel("Secondary School Teacher/ Academia", R.drawable.teacher));
            data.add(randomIndex, new CareerPathModel("Journalist", R.drawable.journlist));


        }else if (sub1.equalsIgnoreCase("BUSINESS STUDIES")){
            data.add(randomIndex, new CareerPathModel("Manager", R.drawable.manager));
            data.add(randomIndex, new CareerPathModel("Consultant", R.drawable.consultant));

        } else if (sub1.equalsIgnoreCase("COMPUTER SCIENCE")){
            data.add(randomIndex, new CareerPathModel("Information system manager", R.drawable.manager));
            data.add(randomIndex, new CareerPathModel("IT consultant", R.drawable.consultant));
            data.add(randomIndex, new CareerPathModel("Database administrator", R.drawable.dba));
            data.add(randomIndex, new CareerPathModel("Multimedia programmer", R.drawable.programmer));

        } else if (sub1.equalsIgnoreCase("GEOGRAPHY")){
            data.add(randomIndex, new CareerPathModel("Cartography", R.drawable.cartography));
            data.add(randomIndex, new CareerPathModel("Urban and regional planning", R.drawable.planning));
            data.add(randomIndex, new CareerPathModel("Climate change analyst", R.drawable.analyst));


        } else if (sub1.equalsIgnoreCase("POLITICAL SCIENCE")){
            data.add(randomIndex, new CareerPathModel("Lawyer", R.drawable.lawyer));
            data.add(randomIndex, new CareerPathModel("Civil Services", R.drawable.civilization));
            data.add(randomIndex, new CareerPathModel("Marketing Research Analyst", R.drawable.analyst));

        } else if (sub1.equalsIgnoreCase("SOCIOLOGY")){
            careerPathModel = new CareerPathModel[]{
                    new CareerPathModel("Policy analyst", R.mipmap.ic_launcher) ,
                    new CareerPathModel("Rehabilitation counsellor", R.mipmap.ic_launcher),
                    new CareerPathModel("Survey researcher", R.mipmap.ic_launcher)
            };
            data.add(randomIndex, new CareerPathModel("Policy analyst", R.drawable.analyst));
            data.add(randomIndex, new CareerPathModel("Rehabilitation counsellor", R.drawable.counsellor));
            data.add(randomIndex, new CareerPathModel("Survey researcher", R.drawable.researcher));

        } else if (sub1.equalsIgnoreCase("PHYSIOLOGY")){
            data.add(randomIndex, new CareerPathModel("Psychologist", R.drawable.phychologist));
            data.add(randomIndex, new CareerPathModel("Clinical psychologist", R.drawable.clinical));
            data.add(randomIndex, new CareerPathModel("Councillor", R.drawable.counsellor));

        } else if (sub1.equalsIgnoreCase("PHYSICS")){
            data.add(randomIndex, new CareerPathModel("Astronomer", R.drawable.astronomer));
            data.add(randomIndex, new CareerPathModel("Aerospace engineer", R.drawable.aerospace));
            data.add(randomIndex, new CareerPathModel("Geophysicist", R.drawable.geophysicist));

        } else if (sub1.equalsIgnoreCase("CHEMISTRY")){
            data.add(randomIndex, new CareerPathModel("Chemical engineer", R.drawable.chemical));
            data.add(randomIndex, new CareerPathModel("Forensic scientist", R.drawable.forensics));
            data.add(randomIndex, new CareerPathModel("Pharmalogist", R.drawable.clinical));


        } else if (sub1.equalsIgnoreCase("BIOLOGY")){
            data.add(randomIndex, new CareerPathModel("Pharmaceutical/ medical product sales representative", R.drawable.clinical));
            data.add(randomIndex, new CareerPathModel("Biochemist", R.drawable.biochemist));
            data.add(randomIndex, new CareerPathModel("Health communication specialist", R.drawable.health));


        } else if (sub1.equalsIgnoreCase("MATHS")){
            data.add(randomIndex, new CareerPathModel("Auditor", R.drawable.auditor));
            data.add(randomIndex, new CareerPathModel("Financial analyst", R.drawable.analyst));
            data.add(randomIndex, new CareerPathModel("Statitician", R.drawable.statistician));

        } else if (sub1.equalsIgnoreCase("ENGLISH")){
            data.add(randomIndex, new CareerPathModel("Freelancer writer", R.drawable.writer));
            data.add(randomIndex, new CareerPathModel("Human resources manager", R.drawable.human_resource));
            data.add(randomIndex, new CareerPathModel("Public relation manager", R.drawable.manager));


        } else if (sub1.equalsIgnoreCase("ECONOMICS")){
            data.add(randomIndex, new CareerPathModel("Banking services within the public sector", R.drawable.rupee));
            data.add(randomIndex, new CareerPathModel("Private and foreign banks", R.drawable.banking));
            data.add(randomIndex, new CareerPathModel("International agencies", R.drawable.agencies));


        } else if (sub1.equalsIgnoreCase("PHYSICAL EDUCATION")){
            data.add(randomIndex, new CareerPathModel("Coaching career", R.drawable.fitness));
            data.add(randomIndex, new CareerPathModel("Health related career", R.drawable.health_career));
            data.add(randomIndex, new CareerPathModel("Sports journalism", R.drawable.journlist));

        } else if (sub1.equalsIgnoreCase("ACCOUNTS")){
            data.add(randomIndex, new CareerPathModel("Payroll clerk", R.drawable.clerk));
            data.add(randomIndex, new CareerPathModel("Accountant", R.drawable.accountant));
            data.add(randomIndex, new CareerPathModel("Budget analyst", R.drawable.analyst));


        } else if (sub1.equalsIgnoreCase("HINDI")){
            data.add(randomIndex, new CareerPathModel("Content writing", R.drawable.writer));
            data.add(randomIndex, new CareerPathModel("Voice associate", R.drawable.voice));
            data.add(randomIndex, new CareerPathModel("Interpreter", R.drawable.interpreter));

        }

//Second Subject
        if(sub2.equalsIgnoreCase("history")){

            data.add(randomIndex, new CareerPathModel("Archvist", R.drawable.achivist));
            data.add(randomIndex, new CareerPathModel("Secondary School Teacher/ Academia", R.drawable.teacher));
            data.add(randomIndex, new CareerPathModel("Journalist", R.drawable.journlist));


        }else if (sub2.equalsIgnoreCase("BUSINESS STUDIES")){
            data.add(randomIndex, new CareerPathModel("Manager", R.drawable.manager));
            data.add(randomIndex, new CareerPathModel("Consultant", R.drawable.consultant));

        } else if (sub2.equalsIgnoreCase("COMPUTER SCIENCE")){
            data.add(randomIndex, new CareerPathModel("Information system manager", R.drawable.manager));
            data.add(randomIndex, new CareerPathModel("IT consultant", R.drawable.consultant));
            data.add(randomIndex, new CareerPathModel("Database administrator", R.drawable.dba));
            data.add(randomIndex, new CareerPathModel("Multimedia programmer", R.drawable.programmer));

        } else if (sub2.equalsIgnoreCase("GEOGRAPHY")){
            data.add(randomIndex, new CareerPathModel("Cartography", R.drawable.cartography));
            data.add(randomIndex, new CareerPathModel("Urban and regional planning", R.drawable.planning));
            data.add(randomIndex, new CareerPathModel("Climate change analyst", R.drawable.analyst));


        } else if (sub2.equalsIgnoreCase("POLITICAL SCIENCE")){
            data.add(randomIndex, new CareerPathModel("Lawyer", R.drawable.lawyer));
            data.add(randomIndex, new CareerPathModel("Civil Services", R.drawable.civilization));
            data.add(randomIndex, new CareerPathModel("Marketing Research Analyst", R.drawable.analyst));

        } else if (sub2.equalsIgnoreCase("SOCIOLOGY")){
            careerPathModel = new CareerPathModel[]{
                    new CareerPathModel("Policy analyst", R.mipmap.ic_launcher) ,
                    new CareerPathModel("Rehabilitation counsellor", R.mipmap.ic_launcher),
                    new CareerPathModel("Survey researcher", R.mipmap.ic_launcher)
            };
            data.add(randomIndex, new CareerPathModel("Policy analyst", R.drawable.analyst));
            data.add(randomIndex, new CareerPathModel("Rehabilitation counsellor", R.drawable.counsellor));
            data.add(randomIndex, new CareerPathModel("Survey researcher", R.drawable.researcher));

        } else if (sub2.equalsIgnoreCase("PHYSIOLOGY")){
            data.add(randomIndex, new CareerPathModel("Psychologist", R.drawable.phychologist));
            data.add(randomIndex, new CareerPathModel("Clinical psychologist", R.drawable.clinical));
            data.add(randomIndex, new CareerPathModel("Councillor", R.drawable.counsellor));

        } else if (sub2.equalsIgnoreCase("PHYSICS")){
            data.add(randomIndex, new CareerPathModel("Astronomer", R.drawable.astronomer));
            data.add(randomIndex, new CareerPathModel("Aerospace engineer", R.drawable.aerospace));
            data.add(randomIndex, new CareerPathModel("Geophysicist", R.drawable.geophysicist));

        } else if (sub2.equalsIgnoreCase("CHEMISTRY")){
            data.add(randomIndex, new CareerPathModel("Chemical engineer", R.drawable.chemical));
            data.add(randomIndex, new CareerPathModel("Forensic scientist", R.drawable.forensics));
            data.add(randomIndex, new CareerPathModel("Pharmalogist", R.drawable.clinical));


        } else if (sub2.equalsIgnoreCase("BIOLOGY")){
            data.add(randomIndex, new CareerPathModel("Pharmaceutical/ medical product sales representative", R.drawable.clinical));
            data.add(randomIndex, new CareerPathModel("Biochemist", R.drawable.biochemist));
            data.add(randomIndex, new CareerPathModel("Health communication specialist", R.drawable.health));


        } else if (sub2.equalsIgnoreCase("MATHS")){
            data.add(randomIndex, new CareerPathModel("Auditor", R.drawable.auditor));
            data.add(randomIndex, new CareerPathModel("Financial analyst", R.drawable.analyst));
            data.add(randomIndex, new CareerPathModel("Statitician", R.drawable.statistician));

        } else if (sub2.equalsIgnoreCase("ENGLISH")){
            data.add(randomIndex, new CareerPathModel("Freelancer writer", R.drawable.writer));
            data.add(randomIndex, new CareerPathModel("Human resources manager", R.drawable.human_resource));
            data.add(randomIndex, new CareerPathModel("Public relation manager", R.drawable.manager));


        } else if (sub2.equalsIgnoreCase("ECONOMICS")){
            data.add(randomIndex, new CareerPathModel("Banking services within the public sector", R.drawable.rupee));
            data.add(randomIndex, new CareerPathModel("Private and foreign banks", R.drawable.banking));
            data.add(randomIndex, new CareerPathModel("International agencies", R.drawable.agencies));


        } else if (sub2.equalsIgnoreCase("PHYSICAL EDUCATION")){
            data.add(randomIndex, new CareerPathModel("Coaching career", R.drawable.fitness));
            data.add(randomIndex, new CareerPathModel("Health related career", R.drawable.health_career));
            data.add(randomIndex, new CareerPathModel("Sports journalism", R.drawable.journlist));



        } else if (sub2.equalsIgnoreCase("ACCOUNTS")){
            data.add(randomIndex, new CareerPathModel("Payroll clerk", R.drawable.clerk));
            data.add(randomIndex, new CareerPathModel("Accountant", R.drawable.accountant));
            data.add(randomIndex, new CareerPathModel("Budget analyst", R.drawable.analyst));


        } else if (sub2.equalsIgnoreCase("HINDI")){
            data.add(randomIndex, new CareerPathModel("Content writing", R.drawable.writer));
            data.add(randomIndex, new CareerPathModel("Voice associate", R.drawable.voice));
            data.add(randomIndex, new CareerPathModel("Interpreter", R.drawable.interpreter));

        }
//Third Subject

        if(sub3.equalsIgnoreCase("history")){

            data.add(randomIndex, new CareerPathModel("Archvist", R.drawable.achivist));
            data.add(randomIndex, new CareerPathModel("Secondary School Teacher/ Academia", R.drawable.teacher));
            data.add(randomIndex, new CareerPathModel("Journalist", R.drawable.journlist));


        }else if (sub3.equalsIgnoreCase("BUSINESS STUDIES")){
            data.add(randomIndex, new CareerPathModel("Manager", R.drawable.manager));
            data.add(randomIndex, new CareerPathModel("Consultant", R.drawable.consultant));

        } else if (sub3.equalsIgnoreCase("COMPUTER SCIENCE")){
            data.add(randomIndex, new CareerPathModel("Information system manager", R.drawable.manager));
            data.add(randomIndex, new CareerPathModel("IT consultant", R.drawable.consultant));
            data.add(randomIndex, new CareerPathModel("Database administrator", R.drawable.dba));
            data.add(randomIndex, new CareerPathModel("Multimedia programmer", R.drawable.programmer));

        } else if (sub3.equalsIgnoreCase("GEOGRAPHY")){
            data.add(randomIndex, new CareerPathModel("Cartography", R.drawable.cartography));
            data.add(randomIndex, new CareerPathModel("Urban and regional planning", R.drawable.planning));
            data.add(randomIndex, new CareerPathModel("Climate change analyst", R.drawable.analyst));


        } else if (sub3.equalsIgnoreCase("POLITICAL SCIENCE")){
            data.add(randomIndex, new CareerPathModel("Lawyer", R.drawable.lawyer));
            data.add(randomIndex, new CareerPathModel("Civil Services", R.drawable.civilization));
            data.add(randomIndex, new CareerPathModel("Marketing Research Analyst", R.drawable.analyst));

        } else if (sub3.equalsIgnoreCase("SOCIOLOGY")){
            careerPathModel = new CareerPathModel[]{
                    new CareerPathModel("Policy analyst", R.mipmap.ic_launcher) ,
                    new CareerPathModel("Rehabilitation counsellor", R.mipmap.ic_launcher),
                    new CareerPathModel("Survey researcher", R.mipmap.ic_launcher)
            };
            data.add(randomIndex, new CareerPathModel("Policy analyst", R.drawable.analyst));
            data.add(randomIndex, new CareerPathModel("Rehabilitation counsellor", R.drawable.counsellor));
            data.add(randomIndex, new CareerPathModel("Survey researcher", R.drawable.researcher));

        } else if (sub3.equalsIgnoreCase("PHYSIOLOGY")){
            data.add(randomIndex, new CareerPathModel("Psychologist", R.drawable.phychologist));
            data.add(randomIndex, new CareerPathModel("Clinical psychologist", R.drawable.clinical));
            data.add(randomIndex, new CareerPathModel("Councillor", R.drawable.counsellor));

        } else if (sub3.equalsIgnoreCase("PHYSICS")){
            data.add(randomIndex, new CareerPathModel("Astronomer", R.drawable.astronomer));
            data.add(randomIndex, new CareerPathModel("Aerospace engineer", R.drawable.aerospace));
            data.add(randomIndex, new CareerPathModel("Geophysicist", R.drawable.geophysicist));

        } else if (sub3.equalsIgnoreCase("CHEMISTRY")){
            data.add(randomIndex, new CareerPathModel("Chemical engineer", R.drawable.chemical));
            data.add(randomIndex, new CareerPathModel("Forensic scientist", R.drawable.forensics));
            data.add(randomIndex, new CareerPathModel("Pharmalogist", R.drawable.clinical));


        } else if (sub3.equalsIgnoreCase("BIOLOGY")){
            data.add(randomIndex, new CareerPathModel("Pharmaceutical/ medical product sales representative", R.drawable.clinical));
            data.add(randomIndex, new CareerPathModel("Biochemist", R.drawable.biochemist));
            data.add(randomIndex, new CareerPathModel("Health communication specialist", R.drawable.health));


        } else if (sub3.equalsIgnoreCase("MATHS")){
            data.add(randomIndex, new CareerPathModel("Auditor", R.drawable.auditor));
            data.add(randomIndex, new CareerPathModel("Financial analyst", R.drawable.analyst));
            data.add(randomIndex, new CareerPathModel("Statitician", R.drawable.statistician));

        } else if (sub3.equalsIgnoreCase("ENGLISH")){
            data.add(randomIndex, new CareerPathModel("Freelancer writer", R.drawable.writer));
            data.add(randomIndex, new CareerPathModel("Human resources manager", R.drawable.human_resource));
            data.add(randomIndex, new CareerPathModel("Public relation manager", R.drawable.manager));


        } else if (sub3.equalsIgnoreCase("ECONOMICS")){
            data.add(randomIndex, new CareerPathModel("Banking services within the public sector", R.drawable.rupee));
            data.add(randomIndex, new CareerPathModel("Private and foreign banks", R.drawable.banking));
            data.add(randomIndex, new CareerPathModel("International agencies", R.drawable.agencies));


        } else if (sub3.equalsIgnoreCase("PHYSICAL EDUCATION")){
            data.add(randomIndex, new CareerPathModel("Coaching career", R.drawable.fitness));
            data.add(randomIndex, new CareerPathModel("Health related career", R.drawable.health_career));
            data.add(randomIndex, new CareerPathModel("Sports journalism", R.drawable.journlist));



        } else if (sub3.equalsIgnoreCase("ACCOUNTS")){
            data.add(randomIndex, new CareerPathModel("Payroll clerk", R.drawable.clerk));
            data.add(randomIndex, new CareerPathModel("Accountant", R.drawable.accountant));
            data.add(randomIndex, new CareerPathModel("Budget analyst", R.drawable.analyst));


        } else if (sub3.equalsIgnoreCase("HINDI")){
            data.add(randomIndex, new CareerPathModel("Content writing", R.drawable.writer));
            data.add(randomIndex, new CareerPathModel("Voice associate", R.drawable.voice));
            data.add(randomIndex, new CareerPathModel("Interpreter", R.drawable.interpreter));

        }

        //Fourth Subject

        if(sub4.equalsIgnoreCase("history")){

            data.add(randomIndex, new CareerPathModel("Archvist", R.drawable.achivist));
            data.add(randomIndex, new CareerPathModel("Secondary School Teacher/ Academia", R.drawable.teacher));
            data.add(randomIndex, new CareerPathModel("Journalist", R.drawable.journlist));


        }else if (sub4.equalsIgnoreCase("BUSINESS STUDIES")){
            data.add(randomIndex, new CareerPathModel("Manager", R.drawable.manager));
            data.add(randomIndex, new CareerPathModel("Consultant", R.drawable.consultant));

        } else if (sub4.equalsIgnoreCase("COMPUTER SCIENCE")){
            data.add(randomIndex, new CareerPathModel("Information system manager", R.drawable.manager));
            data.add(randomIndex, new CareerPathModel("IT consultant", R.drawable.consultant));
            data.add(randomIndex, new CareerPathModel("Database administrator", R.drawable.dba));
            data.add(randomIndex, new CareerPathModel("Multimedia programmer", R.drawable.programmer));

        } else if (sub4.equalsIgnoreCase("GEOGRAPHY")){
            data.add(randomIndex, new CareerPathModel("Cartography", R.drawable.cartography));
            data.add(randomIndex, new CareerPathModel("Urban and regional planning", R.drawable.planning));
            data.add(randomIndex, new CareerPathModel("Climate change analyst", R.drawable.analyst));


        } else if (sub4.equalsIgnoreCase("POLITICAL SCIENCE")){
            data.add(randomIndex, new CareerPathModel("Lawyer", R.drawable.lawyer));
            data.add(randomIndex, new CareerPathModel("Civil Services", R.drawable.civilization));
            data.add(randomIndex, new CareerPathModel("Marketing Research Analyst", R.drawable.analyst));

        } else if (sub4.equalsIgnoreCase("SOCIOLOGY")){
            careerPathModel = new CareerPathModel[]{
                    new CareerPathModel("Policy analyst", R.mipmap.ic_launcher) ,
                    new CareerPathModel("Rehabilitation counsellor", R.mipmap.ic_launcher),
                    new CareerPathModel("Survey researcher", R.mipmap.ic_launcher)
            };
            data.add(randomIndex, new CareerPathModel("Policy analyst", R.drawable.analyst));
            data.add(randomIndex, new CareerPathModel("Rehabilitation counsellor", R.drawable.counsellor));
            data.add(randomIndex, new CareerPathModel("Survey researcher", R.drawable.researcher));

        } else if (sub4.equalsIgnoreCase("PHYSIOLOGY")){
            data.add(randomIndex, new CareerPathModel("Psychologist", R.drawable.phychologist));
            data.add(randomIndex, new CareerPathModel("Clinical psychologist", R.drawable.clinical));
            data.add(randomIndex, new CareerPathModel("Councillor", R.drawable.counsellor));

        } else if (sub4.equalsIgnoreCase("PHYSICS")){
            data.add(randomIndex, new CareerPathModel("Astronomer", R.drawable.astronomer));
            data.add(randomIndex, new CareerPathModel("Aerospace engineer", R.drawable.aerospace));
            data.add(randomIndex, new CareerPathModel("Geophysicist", R.drawable.geophysicist));

        } else if (sub4.equalsIgnoreCase("CHEMISTRY")){
            data.add(randomIndex, new CareerPathModel("Chemical engineer", R.drawable.chemical));
            data.add(randomIndex, new CareerPathModel("Forensic scientist", R.drawable.forensics));
            data.add(randomIndex, new CareerPathModel("Pharmalogist", R.drawable.clinical));


        } else if (sub4.equalsIgnoreCase("BIOLOGY")){
            data.add(randomIndex, new CareerPathModel("Pharmaceutical/ medical product sales representative", R.drawable.clinical));
            data.add(randomIndex, new CareerPathModel("Biochemist", R.drawable.biochemist));
            data.add(randomIndex, new CareerPathModel("Health communication specialist", R.drawable.health));


        } else if (sub4.equalsIgnoreCase("MATHS")){
            data.add(randomIndex, new CareerPathModel("Auditor", R.drawable.auditor));
            data.add(randomIndex, new CareerPathModel("Financial analyst", R.drawable.analyst));
            data.add(randomIndex, new CareerPathModel("Statitician", R.drawable.statistician));

        } else if (sub4.equalsIgnoreCase("ENGLISH")){
            data.add(randomIndex, new CareerPathModel("Freelancer writer", R.drawable.writer));
            data.add(randomIndex, new CareerPathModel("Human resources manager", R.drawable.human_resource));
            data.add(randomIndex, new CareerPathModel("Public relation manager", R.drawable.manager));


        } else if (sub4.equalsIgnoreCase("ECONOMICS")){
            data.add(randomIndex, new CareerPathModel("Banking services within the public sector", R.drawable.rupee));
            data.add(randomIndex, new CareerPathModel("Private and foreign banks", R.drawable.banking));
            data.add(randomIndex, new CareerPathModel("International agencies", R.drawable.agencies));


        } else if (sub4.equalsIgnoreCase("PHYSICAL EDUCATION")){
            data.add(randomIndex, new CareerPathModel("Coaching career", R.drawable.fitness));
            data.add(randomIndex, new CareerPathModel("Health related career", R.drawable.health_career));
            data.add(randomIndex, new CareerPathModel("Sports journalism", R.drawable.journlist));



        } else if (sub4.equalsIgnoreCase("ACCOUNTS")){
            data.add(randomIndex, new CareerPathModel("Payroll clerk", R.drawable.clerk));
            data.add(randomIndex, new CareerPathModel("Accountant", R.drawable.accountant));
            data.add(randomIndex, new CareerPathModel("Budget analyst", R.drawable.analyst));


        } else if (sub4.equalsIgnoreCase("HINDI")){
            data.add(randomIndex, new CareerPathModel("Content writing", R.drawable.writer));
            data.add(randomIndex, new CareerPathModel("Voice associate", R.drawable.voice));
            data.add(randomIndex, new CareerPathModel("Interpreter", R.drawable.interpreter));

        }


        CareerPathAdapter adapter = new CareerPathAdapter(data);
        rVcareerPath.setHasFixedSize(true);
        rVcareerPath.setLayoutManager(new LinearLayoutManager(this));
        //rVcareerPath.setLayoutManager(new LinearLayoutManager(activity));
        rVcareerPath.setAdapter(adapter);

    }
    //    for auto indexing while adding data to our model
    public static int getRandomIndex(int size) {
        Random random = new Random();
        return random.nextInt(size + 1); // +1 to include the end index
    }
}
