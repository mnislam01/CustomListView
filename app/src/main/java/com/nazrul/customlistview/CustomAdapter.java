package com.nazrul.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String countryName[];
    int imgList[];
    LayoutInflater inflater; //For setting items to layout at runtime

    public CustomAdapter(Context context, String countryName[], int imgList[])
    {
        this.countryName = countryName;
        this.imgList = imgList;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return countryName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.list_item, parent, false);
        ImageView imgFlag = convertView.findViewById(R.id.imgCountry);
        TextView nameCountry = convertView.findViewById(R.id.nameCountry);

        imgFlag.setImageResource(imgList[position]);
        nameCountry.setText(countryName[position]);
        return convertView;
    }
}
