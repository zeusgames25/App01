package com.example.app01.adapters;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app01.MainActivity;
import com.example.app01.R;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class NameAdapter extends  RecyclerView.Adapter<NameAdapter.NameVewHolder>{

    private List<String> data;

    public NameAdapter(List<String> data) {
        this.data = data;
    }

    @Override
    public NameVewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_name,parent,false);

        return new NameVewHolder(view);
    }

    @Override
    public void onBindViewHolder(NameVewHolder holder, int position) {
        TextView tv = holder.itemView.findViewById(R.id.tvName);
        String value = data.get(position);
        tv.setText(value);

        Button btnLlamar = holder.itemView.findViewById(R.id.btnLlamar);
        btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Tel = "983092477";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",Tel,null));

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class  NameVewHolder extends RecyclerView.ViewHolder{
        public NameVewHolder(View itemView){
            super(itemView);
        }
    }
}
