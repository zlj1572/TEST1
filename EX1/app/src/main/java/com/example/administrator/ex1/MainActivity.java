package com.example.administrator.ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] data_name={"姓名","Zhangluojing","Jingluozhang"};
    private String[] data_class={"班级","1","2"};
    private String[] data_num={"学号","1000","1001"};
    private String[] data_sex={"性别","M","F"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data_name);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data_class);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data_num);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data_sex);
        ListView listView1 = (ListView) findViewById((R.id.list_view1));
        ListView listView2 = (ListView) findViewById((R.id.list_view2));
        ListView listView3 = (ListView) findViewById((R.id.list_view3));
        ListView listView4 = (ListView) findViewById((R.id.list_view4));
        listView1.setAdapter(adapter1);
        listView2.setAdapter(adapter2);
        listView3.setAdapter(adapter3);
        listView4.setAdapter(adapter4);
    }
}
