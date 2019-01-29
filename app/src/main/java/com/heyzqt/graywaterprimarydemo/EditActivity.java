package com.heyzqt.graywaterprimarydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.heyzqt.graywaterprimarydemo.bean.EntertainItem;
import com.heyzqt.graywaterprimarydemo.bean.SportItem;

/**
 * Created by heyzqt on 2019/1/29.
 */

public class EditActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEditText;
    private Button mButton;

    private String type;
    private EntertainItem entertainItem;
    private SportItem sportItem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        mEditText = findViewById(R.id.edit);
        mButton = findViewById(R.id.save);
        mButton.setOnClickListener(this);

        type = getIntent().getStringExtra("type");
        if (MainActivity.TYPE_ENTERTAIN.equals(type)) {
            entertainItem = (EntertainItem) getIntent().getSerializableExtra("obj");
            mEditText.setText(entertainItem.getTitle());
        } else {
            sportItem = (SportItem) getIntent().getSerializableExtra("obj");
            mEditText.setText(sportItem.getTitle());
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save:
                Intent intent = new Intent();
                intent.putExtra("type", type);
                if (MainActivity.TYPE_ENTERTAIN.equals(type)) {
                    entertainItem.setTitle(mEditText.getText().toString().trim());
                    intent.putExtra("obj", entertainItem);
                } else {
                    sportItem.setTitle(mEditText.getText().toString().trim());
                    intent.putExtra("obj", sportItem);
                }
                setResult(100, intent);
                finish();
                break;
        }
    }
}
