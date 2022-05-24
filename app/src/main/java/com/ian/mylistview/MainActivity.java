package com.ian.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<HashMap<String,Object>> datas;
    String TAG = MainActivity.class.getName();
    HashMap<String,Object> h;
    ListView lv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datas = new ArrayList<>();
        lv = findViewById(R.id.lv);
        h = new HashMap<>();
        h.put("name","多拉A夢");
        h.put("icon",R.drawable.dora);
        datas.add(h);
        h = new HashMap<>();
        h.put("name","海賊王");
        h.put("icon",R.drawable.lufu);
        datas.add(h);
        h = new HashMap<>();
        h.put("name","七龍珠");
        h.put("icon",R.drawable.dragon);
        datas.add(h);
        MyAdapter adapter = new MyAdapter(this,datas);
        lv.setAdapter(adapter);


    }
}