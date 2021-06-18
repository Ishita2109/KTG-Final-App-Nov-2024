package com.example.career_predictor;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class Second_my_adapter extends RecyclerView.Adapter<Second_my_adapter.MyViewHolder> {

    String data1[];
    Context context;
    int images[];

    public Second_my_adapter(Context ct, String s1[], int img[]) {
        context = ct;
        data1 = s1;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_2, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myImage.setImageResource(images[position]);


    }

    @Override
    public int getItemCount() {

        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myText1;
        ImageView myImage;

       public MyViewHolder(View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.myText2);
            myImage = itemView.findViewById(R.id.myimageView2);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {

            final Intent intent;
            if (getAdapterPosition() == 0)
            {
                intent =  new Intent(context, Astronomer.class);
            }
            else if (getAdapterPosition() == 1)
            {
                intent =  new Intent(context, Aerospace.class);
            }
            else if (getAdapterPosition() == 2)
            {
                intent =  new Intent(context, Geo_Physicist.class);
            }
            else if (getAdapterPosition() == 3)
            {
                intent =  new Intent(context, Banking.class);
            }
            else if (getAdapterPosition() == 4)
            {
                intent =  new Intent(context, International_Agencies.class);
            }
            else if (getAdapterPosition() == 5)
            {
                intent =  new Intent(context, Cartographer.class);
            }
            else if (getAdapterPosition() == 6)
            {
                intent =  new Intent(context, Urban_Planning.class);
            }
            else if (getAdapterPosition() == 7)
            {
                intent =  new Intent(context, Climate_Analyst.class);
            }
            else if (getAdapterPosition() == 8)
            {
                intent =  new Intent(context, IT_Manager.class);
            }
            else if (getAdapterPosition() == 9)
            {
                intent =  new Intent(context, DB_Administrator.class);
            }
            else if (getAdapterPosition() == 10)
            {
                intent =  new Intent(context, Multimedia.class);
            }

            else
                {
                intent =  new Intent(context, Astronomer.class);
            }
            context.startActivity(intent);
        }


    }
}














