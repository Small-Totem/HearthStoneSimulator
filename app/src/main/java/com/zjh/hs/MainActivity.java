package com.zjh.hs;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    long t0;
    static int state = 0;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private androidx.fragment.app.FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mTabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        fm = getSupportFragmentManager();

        mViewPager.setAdapter(new DetailPageAdapter(MainActivity.this, fm));
        mTabLayout.setupWithViewPager(mViewPager);

        /*DisplayMetrics dm = getResources().getDisplayMetrics();
        widthPixels=dm.widthPixels;
        widthPixels=dm.widthPixels;*/
    }

    @Override
    public void onBackPressed() {
        long t1 = System.currentTimeMillis();//获取毫秒级时间
        if (t1 - t0 > 2000) {
            Toast.makeText(this, "再点一次退出程序", Toast.LENGTH_SHORT).show();
            t0 = t1;
        } else {
            finish();
        }
    }

    static public int getstate() {
        return state;
        //0 抽1包
        //1 抽10包
    }
    public void africa(View v) {
        Toast.makeText(this,"开出保底包",Toast.LENGTH_SHORT).show();
    }
    public void europe(View v) {
        Toast.makeText(this,"开出多橙包",Toast.LENGTH_SHORT).show();
    }
}