package com.example.logo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.sujeet.chatappdesign.MessageChatAdapter;
import com.sujeet.chatappdesign.MessageChatModel;

import java.util.ArrayList;
import java.util.List;



public class AdminChat extends AppCompatActivity
{
    List<MessageChatModel> messageChatModelList =  new ArrayList<>();
    RecyclerView recyclerView;
    MessageChatAdapter adapter ;

    EditText messageET;
    ImageView sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_chat);


        messageET = (EditText)findViewById(com.sujeet.chatappdesign.R.id.messageET);
        sendBtn = (ImageView) findViewById(com.sujeet.chatappdesign.R.id.sendBtn);

        recyclerView = (RecyclerView)findViewById(com.sujeet.chatappdesign.R.id.recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(manager);

        MessageChatModel model1 = new MessageChatModel(
                "Hello ",
                "02:30 PM",
                1
        );
        MessageChatModel model2 = new MessageChatModel(
                "Good afternoon ",
                "02:00 PM",
                0
        );
        MessageChatModel model3 = new MessageChatModel(
                "I want to ask something?",
                "02:10 PM",
                1
        );
        MessageChatModel model4 = new MessageChatModel(
                "Yes, please tell me how can i help you?",
                "02:12 PM",
                0
        );
        MessageChatModel model5 = new MessageChatModel(
                "Nah, I dunno. Play soccer.. or learn more coding perhaps?",
                "02:13 PM",
                1
        );



        messageChatModelList.add(model1);





//        MessageChatModel model4 = new MessageChatModel(
//                "Thankyou for your query. We will get back to you!",
//                "10:00 PM",
//                1
//        );


        //     messageChatModelList.add(model1);
//        messageChatModelList.add(model2);
//        messageChatModelList.add(model3);
//       messageChatModelList.add(model4);
//        messageChatModelList.add(model1);
//        messageChatModelList.add(model2);
//        messageChatModelList.add(model3);
        //      messageChatModelList.add(model4);
//        messageChatModelList.add(model1);
//        messageChatModelList.add(model2);
//        messageChatModelList.add(model3);
//        messageChatModelList.add(model4);

        recyclerView.smoothScrollToPosition(messageChatModelList.size());
        adapter = new MessageChatAdapter(messageChatModelList, this);
        recyclerView.setAdapter(adapter);


        sendBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String msg = messageET.getText().toString();

                MessageChatModel model = new MessageChatModel
                (
                        msg,
                        "02:30 PM",
                        0
                );
                messageChatModelList.add(model);
                recyclerView.smoothScrollToPosition(messageChatModelList.size());
                adapter.notifyDataSetChanged();
                messageET.setText("");


            }
        });

    }



}