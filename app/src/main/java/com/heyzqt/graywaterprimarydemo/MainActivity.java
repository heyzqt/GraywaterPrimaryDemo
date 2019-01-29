package com.heyzqt.graywaterprimarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.heyzqt.graywaterprimarydemo.bean.EntertainItem;
import com.heyzqt.graywaterprimarydemo.bean.ModuleName;
import com.heyzqt.graywaterprimarydemo.bean.SportItem;
import com.heyzqt.graywaterprimarydemo.listener.OnItemClickListener;
import com.heyzqt.graywaterprimarydemo.model.EntertainPrimitive;
import com.heyzqt.graywaterprimarydemo.model.SportPrimitive;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

    private RecyclerView mRecyclerView;
    private PrimitiveAdapter mPrimitiveAdapter;

    private EntertainPrimitive mEntertainPrimitive;
    private SportPrimitive mSportPrimitive;
    private List<EntertainItem> entertainItems = new ArrayList<>();
    private List<SportItem> sportItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initContentView();
        updateRecyclerView();
    }

    private void initData() {
        ModuleName entertainModule = new ModuleName();
        entertainModule.setKey("entertain");
        entertainModule.setValue("娱乐新闻");
        for (int i = 0; i < 20; i++) {
            EntertainItem entertain = new EntertainItem();
            entertain.setUrl("http://n.sinaimg.cn/ent/4_img/upload/0b3147ad/107/w1024h683/20181023/M34_-hmuuiyw5724330.jpg");
            entertain.setTitle("item " + (i + 1) + " : " + "福原爱现身退役发布会挥泪告别 甜美比心畅聊感慨");
            entertainItems.add(entertain);
        }

        ModuleName sportModule = new ModuleName();
        sportModule.setKey("sport");
        sportModule.setValue("体育新闻");
        for (int i = 0; i < 20; i++) {
            SportItem sport = new SportItem();
            sport.setUrl("http://i2.chinanews.com/simg/cmshd/2019/01/28/10ac01abbdd74e9f9d9f9e0f83cc29a9.jpg");
            sport.setTitle("item " + (i + 1) + " : " + "哈登独得40分保罗复出 火箭主场103:98复仇魔术");
            sportItems.add(sport);
        }

        mEntertainPrimitive = new EntertainPrimitive(entertainModule, entertainItems);
        mSportPrimitive = new SportPrimitive(sportModule, sportItems);
    }

    private void initContentView() {
        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mPrimitiveAdapter = new PrimitiveAdapter(this);
        mRecyclerView.setAdapter(mPrimitiveAdapter);
    }

    private void updateRecyclerView() {
        mPrimitiveAdapter.add(mEntertainPrimitive);
        mPrimitiveAdapter.add(mSportPrimitive);
        mPrimitiveAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClickItem(String name) {
        Toast.makeText(this, "这条item的内容是：" + name, Toast.LENGTH_SHORT).show();
    }
}
