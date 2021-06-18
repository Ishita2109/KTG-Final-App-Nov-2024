package com.example.logo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.List;


public class Admin_Chat_Msg_Adapter extends RecyclerView.Adapter {
    List<Admin_Chat_Msg_Model> messageChatModelList;
    Context context;

    private static final int VIEW_TYPE_MESSAGE_SENT = 1;
    private static final int VIEW_TYPE_MESSAGE_RECEIVED = 2;


    public Admin_Chat_Msg_Adapter(List<Admin_Chat_Msg_Model> messageChatModelList, Context context) {
        this.messageChatModelList = messageChatModelList;
        this.context = context;
    }

    // Determines the appropriate ViewType according to the sender of the message.
    @Override
    public int getItemViewType(int position) {
        Admin_Chat_Msg_Model message = (Admin_Chat_Msg_Model) messageChatModelList.get(position);
        if (message.getViewType() == 0) {
            // If the current user is the sender of the message
            Log.e("getItemViewType","0");
            return VIEW_TYPE_MESSAGE_SENT;
        } else {
            // If some other user sent the message
            Log.e("getItemViewType","1");
            return VIEW_TYPE_MESSAGE_RECEIVED;
        }

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        if (viewType == VIEW_TYPE_MESSAGE_SENT) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(com.sujeet.chatappdesign.R.layout.send_layout, parent, false);
            return new SentMessageHolder(view);
        } else if (viewType == VIEW_TYPE_MESSAGE_RECEIVED) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(com.sujeet.chatappdesign.R.layout.receive_layout, parent, false);
            return new ReceivedMessageHolder(view);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Admin_Chat_Msg_Model message = messageChatModelList.get(position);
        switch (holder.getItemViewType()) {
            case VIEW_TYPE_MESSAGE_SENT:
                ((Admin_Chat_Msg_Adapter.SentMessageHolder) holder).bind(message);
                break;
            case VIEW_TYPE_MESSAGE_RECEIVED:
                ((Admin_Chat_Msg_Adapter.ReceivedMessageHolder) holder).bind(message);
        }
    }

    @Override
    public int getItemCount() {
        return messageChatModelList.size();
    }


    private class SentMessageHolder extends RecyclerView.ViewHolder{

        TextView message;
        TextView time;


        public SentMessageHolder(@NonNull View itemView) {
            super(itemView);
            message = (TextView)itemView.findViewById(com.sujeet.chatappdesign.R.id.message);
            time = (TextView)itemView.findViewById(com.sujeet.chatappdesign.R.id.time);

        }

        void bind(Admin_Chat_Msg_Model messageModel) {
            message.setText(messageModel.getText());
            time.setText(messageModel.getTime());

        }

    }

    private class ReceivedMessageHolder extends RecyclerView.ViewHolder{
        TextView message;
        TextView time;
        public ReceivedMessageHolder(@NonNull View itemView) {
            super(itemView);
            message = (TextView)itemView.findViewById(com.sujeet.chatappdesign.R.id.message);
            time = (TextView)itemView.findViewById(com.sujeet.chatappdesign.R.id.time);
        }

        void bind(Admin_Chat_Msg_Model messageModel){
            message.setText(messageModel.getText());
            time.setText(messageModel.getTime());
        }
    }




}

