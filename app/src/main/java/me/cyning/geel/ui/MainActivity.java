package me.cyning.geel.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import me.cyning.geel.R;
import me.cyning.template.base.BaseActivity;

public class MainActivity extends BaseActivity  implements View.OnClickListener{

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = v(R.id.button);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this,SencondActivity.class));
    }

}
