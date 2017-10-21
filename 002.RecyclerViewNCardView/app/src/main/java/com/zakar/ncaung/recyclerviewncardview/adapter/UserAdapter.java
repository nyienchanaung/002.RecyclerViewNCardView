package com.zakar.ncaung.recyclerviewncardview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zakar.ncaung.recyclerviewncardview.R;
import com.zakar.ncaung.recyclerviewncardview.model.plain.User;

import java.util.List;

/**
 * Created by ncaung on 10/21/17.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{
    private List<User> users;

    public UserAdapter(List<User> users) {
        this.users = users;
    }

    @Override

    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.mTextView.setText(users.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{
        TextView mTextView;
        public UserViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView)itemView.findViewById(R.id.userName);
        }
    }
}
