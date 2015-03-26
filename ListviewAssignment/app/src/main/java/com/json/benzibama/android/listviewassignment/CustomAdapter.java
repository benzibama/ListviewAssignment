package com.json.benzibama.android.listviewassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bama on 3/25/2015.
 */
public class CustomAdapter extends BaseAdapter{
    ArrayList<String> list=new ArrayList<String>();
    String newArray[];
    LayoutInflater inflator;
    Context ctx;
    public CustomAdapter(customListView mainActivity, String[] names) {
        // TODO Auto-generated constructor stub
        this.newArray=names;
        this.ctx=mainActivity;
        this.inflator=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return newArray.length;
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static class ViewHolder{
        TextView textView;
        ImageView image;
    }

    @Override
    public View getView(int arg0, View view, ViewGroup arg2) {
        // TODO Auto-generated method stub
        ViewHolder holder;
        if(view==null){
            holder=new ViewHolder();
            view=inflator.inflate(R.layout.customlview, null);
            holder.image=(ImageView)view.findViewById(R.id.image);
            holder.textView=(TextView)view.findViewById(R.id.text);

            view.setTag(holder);


        }else{
            holder=(ViewHolder)view.getTag();
        }

        holder.textView.setText(newArray[arg0]);
        holder.image.setBackgroundResource(R.drawable.telephone);
        return view;
    }



}
