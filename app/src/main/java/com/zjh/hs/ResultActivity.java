package com.zjh.hs;
import androidx.appcompat.app.AppCompatActivity;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static com.zjh.hs.cards.get_5_card;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        if(MainActivity.getstate()==0){
            printtaost(summon1package());
        }//抽1包
        else if(MainActivity.getstate()==1){
            int a,aa=0;
            for(int i3=0;i3<10;i3++) {
                addheader(i3);
                a = summon1package();
                if(aa < a) {
                    aa = a;
                }//判断最佳结果
            }
            printtaost(aa);
        }//抽10包
    }
    public int summon1package(){
        int[] wtf=get_5_card(0);
        LinearLayout layoutmain;
        layoutmain=findViewById(R.id.LinearLayout_dialog1);
        LinearLayout[] layout = new LinearLayout[3];
        LinearLayout.LayoutParams layoutParams_linearlayout=new LinearLayout.LayoutParams(
                MATCH_PARENT, 237*3);
        for(int i=0;i<3;i++) {
            layout[i]=new LinearLayout(this);
            layout[i].setId(View.generateViewId());
            layout[i].setLayoutParams(layoutParams_linearlayout);
            layout[i].setOrientation(LinearLayout.HORIZONTAL);
        }//初始化每排线性布局

        ImageView[] img=new ImageView[5];
        ActionBar.LayoutParams layoutParams_img=new ActionBar.LayoutParams(504,MATCH_PARENT);
        layoutParams_img.gravity= Gravity.CENTER_HORIZONTAL;
        for(int i2=0;i2<5;i2++) {
            img[i2]=new ImageView(this);
            img[i2].setImageResource(wtf[i2]);
            img[i2].setLayoutParams(layoutParams_img);
        }//初始化图片

        layout[0].addView(img[0]); layout[0].addView(img[1]);
        layout[1].addView(img[2]); layout[1].addView(img[3]);
        layout[2].addView(img[4]);
        layoutmain.addView(layout[0]); layoutmain.addView(layout[1]); layoutmain.addView(layout[2]);

        SaveData.SetNum_add(3,1,getApplicationContext());
        for(int i=0;i<5;i++){
            if(wtf[i+6]==3) SaveData.SetNum_add(5,1,getApplicationContext());
        }
        if (wtf[5]==3) SaveData.SetNum_add(7,1,getApplicationContext());
        else if (wtf[5]==0) SaveData.SetNum_add(9,1,getApplicationContext());
        for(int i0=11;i0<16;i0++)SaveData.SetResult_add(wtf[i0],1,getApplicationContext());
        return wtf[5];
    }
    public void addheader(int id){
        LinearLayout layoutmain=(LinearLayout) findViewById(R.id.LinearLayout_dialog1);

        LinearLayout layout0;
        LinearLayout.LayoutParams layoutParams_linearlayout0=new LinearLayout.LayoutParams(
                MATCH_PARENT, 150);
        { layout0=new LinearLayout(this);
            layout0.setId(View.generateViewId());
            layout0.setLayoutParams(layoutParams_linearlayout0);
            layout0.setOrientation(LinearLayout.HORIZONTAL);}//初始化头线性布局

        ActionBar.LayoutParams layoutParams_img0=new ActionBar.LayoutParams(100,100);
        layoutParams_img0.gravity= Gravity.CENTER_HORIZONTAL;
        ImageView img0;
        {img0=new ImageView(this);
            img0.setImageResource(R.drawable.packge);
            img0.setLayoutParams(layoutParams_img0);}//初始化卡包图片

        ActionBar.LayoutParams layoutParams_text0=new ActionBar.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,100);
        layoutParams_img0.gravity= Gravity.CENTER_HORIZONTAL;
        TextView pakage_num = new TextView(this);
        String[] p = new String[10];
        pakage_num.setGravity(Gravity.CENTER);
        pakage_num.setTextSize(20);
        p[0] = "第一包:";p[1] = "第二包:";p[2] = "第三包:";p[3] = "第四包:";p[4] = "第五包:";p[5] = "第六包:";p[6] = "第七包:";p[7] = "第八包:";p[8] = "第九包:";p[9] = "第十包:";
        pakage_num.setLayoutParams(layoutParams_text0);
        //初始化textview

        layout0.addView(img0);layout0.addView(pakage_num);

        pakage_num.setText(p[id]);
        layoutmain.addView(layout0);
    }
    public void printtaost(int a){
        if(a==0){
            Toast.makeText(this,"你好非洲人！(这张蓝卡是保底的)",Toast.LENGTH_SHORT).show();
        }//toast
        else if(a==2){
            Toast.makeText(this,"出橙了！",Toast.LENGTH_SHORT).show();
        }
        else if(a==3){
            Toast.makeText(this,"去死吧万恶的欧洲人",Toast.LENGTH_LONG).show();
        }
    }
}
