package com.ian.mylistview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.zip.Inflater;

public class MyAdapter extends BaseAdapter {
    private Context c;
    private List<HashMap<String,Object >> datas;
    private LayoutInflater inflater;

    public MyAdapter(Context c, List datas){
         this.c = c;
         this.datas = datas;
         this.inflater = LayoutInflater.from(c);

    }
    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int i) {
        return datas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = inflater.inflate(R.layout.items,viewGroup,false);
        ImageView img = v.findViewById(R.id.img);
        TextView tv = v.findViewById(R.id.tv);
        Resources res = c.getResources();
        Bitmap bm = BitmapFactory.decodeResource(res,(int )datas.get(i).get("icon"));
        img.setImageBitmap(bm);
        tv.setText((String)datas.get(i).get("name"));
        return v;
    }
}
