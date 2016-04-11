package com.example.scorpio.simpleapterdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mListView = (ListView) findViewById(R.id.listview);

        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "张三1");
        map.put("icon", R.drawable.f007);
        data.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "张三2");
        map.put("icon", R.drawable.f007);
        data.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "张三3");
        map.put("icon", R.drawable.f007);
        data.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "张三4");
        map.put("icon", R.drawable.f007);
        data.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "张三5");
        map.put("icon", R.drawable.f007);
        data.add(map);


        SimpleAdapter adapter = new SimpleAdapter(
                this,//上下文
                data,//listView绑定的数据
                R.layout.listview_item,//listview的子条目的布局的id
                new String[]{"name","icon"},//data数据中的map集合里的key
                new int[] {R.id.tv_name,R.id.iv_icon});//resource 中的id

        mListView.setAdapter(adapter);

    }
}
