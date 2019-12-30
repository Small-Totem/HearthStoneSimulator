package com.zjh.hs;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.widget.ListPopupWindow.MATCH_PARENT;

public class LostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView t0=findViewById(R.id.result);
        t0.setText("缺失卡牌");
        summon();
    }
    public void summon(){
        LinearLayout layoutmain;
        layoutmain=findViewById(R.id.LinearLayout_dialog1);
        LinearLayout[] layout = new LinearLayout[63*2];
        LinearLayout.LayoutParams layoutParams_linearlayout_img=new LinearLayout.LayoutParams(
                MATCH_PARENT, 355/*237*3*/);
        LinearLayout.LayoutParams layoutParams_linearlayout_text=new LinearLayout.LayoutParams(
                MATCH_PARENT, 55/*237*3*/);
        for(int i=0;i<63;i+=2) {
            layout[i]=new LinearLayout(this);
            layout[i+1]=new LinearLayout(this);
            layout[i].setId(View.generateViewId());
            layout[i+1].setId(View.generateViewId());
            layout[i].setLayoutParams(layoutParams_linearlayout_img);
            layout[i+1].setLayoutParams(layoutParams_linearlayout_text);
            layout[i].setOrientation(LinearLayout.HORIZONTAL);
            layout[i+1].setOrientation(LinearLayout.HORIZONTAL);
        }//初始化每排线性布局

        ImageView[] Img=new ImageView[250];
        ActionBar.LayoutParams layoutParams_img=new ActionBar.LayoutParams(251/*504*/,355);
        layoutParams_img.gravity= Gravity.CENTER_HORIZONTAL;

        int[] NumOfCard=new int[250];
        for(int i0=0;i0<250;i0++){
            NumOfCard[i0]=SaveData.GetResult(i0,getApplicationContext());
        }//获取已获取卡牌张数

        cards.JustGetNum=true;
        int SummonNumber=0;
        for(int i2=0;i2<250;i2++) {
            if(NumOfCard[i2]==0) {
                Img[SummonNumber] = new ImageView(this);
                Img[SummonNumber].setImageResource(cards.get_5_card(i2)[0]);
                Img[SummonNumber].setLayoutParams(layoutParams_img);
                SummonNumber++;
            }
        }//初始化图片
        cards.JustGetNum=false;

        int NumOfLinearLayout=((SummonNumber/4)+1)*2;
        for(int i=0;i<NumOfLinearLayout;i++){
            layout[i] = new LinearLayout(this);
        }

        int ing=0;
        while(ing<SummonNumber){
            layout[2*(ing/4)].addView(Img[ing]);
            ing++;
        }

        for(int i=0;i<NumOfLinearLayout;i+=2){
            layoutmain.addView(layout[i]);
            layoutmain.addView(layout[i+1]);
        }
    }
}
