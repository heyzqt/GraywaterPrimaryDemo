package com.heyzqt.graywaterprimarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
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
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

    private RecyclerView mRecyclerView;
    private PrimitiveAdapter mPrimitiveAdapter;

    private EntertainPrimitive mEntertainPrimitive;
    private SportPrimitive mSportPrimitive;
    private List<EntertainItem> entertainItems = new ArrayList<>();
    private List<SportItem> sportItems = new ArrayList<>();

    private final String TYPE_ENTERTAIN = "entertain";
    private final String TYPE_SPORT = "sport";

    private final int POS_ENTERTAIN = 0;
    private final int POS_SPORT = 1;

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
        entertainModule.setKey(TYPE_ENTERTAIN);
        entertainModule.setValue("娱乐新闻");
        for (int i = 0; i < 20; i++) {
            EntertainItem entertain = new EntertainItem();
            entertain.setId(i + "");
            entertain.setUrl("https://img8.ccnxs.cn/uploadfile/hbase/201901/0129/HBC5C4FABFA51855.png");
            entertain.setTitle("item " + (i + 1) + " : " + "胡海泉独自现身丽江 面带微笑任拍照");
            entertainItems.add(entertain);
        }

        ModuleName sportModule = new ModuleName();
        sportModule.setKey(TYPE_SPORT);
        sportModule.setValue("体育新闻");
        for (int i = 0; i < 20; i++) {
            SportItem sport = new SportItem();
            sport.setId(i + "");
            sport.setUrl("http://i2.chinanews.com/simg/cmshd/2019/01/28/10ac01abbdd74e9f9d9f9e0f83cc29a9.jpg");
            sport.setTitle("item " + (i + 1) + " : " + "哈登独得40分保罗复出 火箭主场103:98复仇魔术");
            sportItems.add(sport);
        }

        mEntertainPrimitive = new EntertainPrimitive(entertainModule, entertainItems);
        mSportPrimitive = new SportPrimitive(sportModule, sportItems);
    }

    private void initContentView() {
        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setItemAnimator(null);
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
    public void onClickaddNews(String type) {
        Toast.makeText(this, "add " + type + " success", Toast.LENGTH_SHORT).show();
        switch (type) {
            case TYPE_ENTERTAIN:
                addEntertainNews();
                mPrimitiveAdapter.remove(POS_ENTERTAIN);
                mPrimitiveAdapter.add(POS_ENTERTAIN, mEntertainPrimitive);
                break;
            case TYPE_SPORT:
                addSportNews();
                mPrimitiveAdapter.remove(POS_SPORT);
                mPrimitiveAdapter.add(POS_SPORT, mSportPrimitive);
                break;
        }
    }

    private void addEntertainNews() {
        if (entertainItems == null) {
            entertainItems = new ArrayList<>();
        }

        EntertainItem entertain = new EntertainItem();
        entertain.setId("" + (entertainItems.size() + 1));
        entertain.setUrl("http://n.sinaimg.cn/ent/4_img/upload/0b3147ad/107/w1024h683/20181023/M34_-hmuuiyw5724330.jpg");
        entertain.setTitle("item " + (entertainItems.size() + 1) + " : " + "福原爱现身退役发布会挥泪告别 甜美比心畅聊感慨");
        entertainItems.add(entertain);
    }

    private void addSportNews() {
        if (sportItems == null) {
            sportItems = new ArrayList<>();
        }

        SportItem sport = new SportItem();
        sport.setId("" + (sportItems.size() + 1));
        sport.setUrl("http://i2.chinanews.com/simg/cmshd/2019/01/28/10ac01abbdd74e9f9d9f9e0f83cc29a9.jpg");
        sport.setTitle("item " + (sportItems.size() + 1) + " : " + "哈登独得40分保罗复出 火箭主场103:98复仇魔术");
        sportItems.add(sport);
    }

    @Override
    public void onClickEditEntertain(EntertainItem entertain) {

    }

    @Override
    public void onClickDeleteEntertain(EntertainItem entertain) {
        boolean needRefresh = false;
        Iterator iterator = entertainItems.iterator();
        while (iterator.hasNext()) {
            EntertainItem entertainItem = (EntertainItem) iterator.next();
            if (entertainItem.getId().equals(entertain.getId())) {
                iterator.remove();
                needRefresh = true;
                break;
            }
        }

        if (needRefresh) {
            mPrimitiveAdapter.remove(POS_ENTERTAIN);
            mPrimitiveAdapter.add(POS_ENTERTAIN, mEntertainPrimitive);
        }
    }

    @Override
    public void onClickEditSport(SportItem sport) {

    }

    @Override
    public void onClickDeleteSport(SportItem sport) {
        boolean needRefresh = false;
        Iterator iterator = sportItems.iterator();
        while (iterator.hasNext()) {
            SportItem sportItem = (SportItem) iterator.next();
            if (sportItem.getId().equals(sportItem.getId())) {
                iterator.remove();
                needRefresh = true;
                break;
            }
        }

        if (needRefresh) {
            mPrimitiveAdapter.remove(POS_SPORT);
            mPrimitiveAdapter.add(POS_SPORT, mSportPrimitive);
        }
    }
}
