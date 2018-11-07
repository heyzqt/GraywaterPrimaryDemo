package com.heyzqt.graywaterprimarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.heyzqt.graywaterprimarydemo.listener.OnItemClickListener;
import com.heyzqt.graywaterprimarydemo.model.EntertainPrimitive;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

    private RecyclerView mRecyclerView;
    private PrimitiveAdapter mPrimitiveAdapter;

    private EntertainPrimitive mEntertainPrimitive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initContentView();
        updateRecyclerView();
    }

    private void initData() {
        List<String> urls = new ArrayList<>();
        List<String> titles = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            urls.add("http://n.sinaimg.cn/ent/4_img/upload/0b3147ad/107/w1024h683/20181023/M34_-hmuuiyw5724330.jpg");
            titles.add("item " + (i + 1) + " : " + "福原爱现身退役发布会挥泪告别 甜美比心畅聊感慨");
        }

        mEntertainPrimitive = new EntertainPrimitive(urls, titles);
    }

    private void initContentView() {
        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mPrimitiveAdapter = new PrimitiveAdapter(this);
        mRecyclerView.setAdapter(mPrimitiveAdapter);
    }

    private void updateRecyclerView() {
        mPrimitiveAdapter.add(mEntertainPrimitive);
        mPrimitiveAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClickItem(String name) {
        Toast.makeText(this, "这条item的内容是：" + name, Toast.LENGTH_SHORT).show();
    }
}
