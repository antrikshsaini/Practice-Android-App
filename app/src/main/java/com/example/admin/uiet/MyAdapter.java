package com.example.admin.uiet;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Antriksh on 21-12-2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    List<DataModel> list;
    LayoutInflater in;
    MyAdapter(Context c,List<DataModel> mylist){
        in=   LayoutInflater.from(c);
        list=mylist;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v=in.inflate(R.layout.mylayout,null);
        MyHolder hold = new MyHolder(v);


        return hold;
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyHolder holder, int position) {

        DataModel data = list.get(position);
            holder.image.setImageResource(data.getImageid());
            holder.title.setText(data.getTitle());
            holder.desc.setText(data.getDesc());


    }

    @Override
    public int getItemCount() {


        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title;
        TextView desc;

        public MyHolder(View itemView) {
            super(itemView);

            image=  (ImageView)  itemView.findViewById(R.id.myimage);
            title= (TextView)  itemView.findViewById(R.id.mytitle);
            desc=  (TextView) itemView.findViewById(R.id.mydesc);


        }
    }
}
