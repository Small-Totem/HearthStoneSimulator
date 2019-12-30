package com.zjh.hs;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class DetailInfoFragment extends Fragment {
    private static final String ARG_PARAM = "param";
    private int mParam;//用来表示当前需要展示的是哪一页
    static boolean s1_state=false;//s1的状态，用于防止都打开
    static boolean s2_state=false;
    static boolean click1=false;//判断点的哪个开关
    static boolean click2=false;

    public DetailInfoFragment() {
    }
    public static DetailInfoFragment newInstance(int param) {
        DetailInfoFragment fragment = new DetailInfoFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM, param);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam = getArguments().getInt(ARG_PARAM);
        }
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view1=inflater.inflate(R.layout.view1_open, container, false);
        final View view2=inflater.inflate(R.layout.view2_record, container, false);
        final View view3=inflater.inflate(R.layout.view3_about, container, false);
        final Switch s1 =  view1.findViewById(R.id.switch1);//重要：必须要getcontentview和控件的所属布局相同才能用这个，否则空指针
        final Switch s2 =  view1.findViewById(R.id.switch2);
        final Button b1 =  view1.findViewById(R.id.button1_1);//b1到3好像实现不了刷新的功能，原因可能是
        final Button b2 =  view1.findViewById(R.id.button1_2);//view1里的东西不能改view2的东西？
        final Button b3 =  view1.findViewById(R.id.button1_3);
        final Button b4 =  view2.findViewById(R.id.button2_3);
        final Button b5 =  view2.findViewById(R.id.refersh);//刷新按钮
        final Button b6 =  view2.findViewById(R.id.button2_1);//已获取卡牌
        final Button b7 =  view2.findViewById(R.id.button2_2);//缺失卡牌
        update(view2);

        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {//已实现对开关的响应
                if(!isChecked)s1_state=false;
                //if (!buttonView.isPressed()) return;  //防止setChecked调用时调用onCheckedChanged
                //把上面这行注释掉之后能几乎完美实现功能，但是这几行代码非常乱
                //但是懒得重构了
                if (isChecked){
                    s1_state=true;
                    click1=true;
                    if (click2)click2=false;
                    if(s2_state)  s2.setChecked(false);
                    s2_state=false;
                    if(!SaveData.GetBoolean(2,getContext())){
                        s1.setChecked(false);
                        s1_state=false;
                        unlockdialog(view1);
                    }
                }
                else{
                    s1_state=false;
                }//开关关闭时的操作
            }
        });
        s2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked)s2_state=false;
                //if (!buttonView.isPressed()) return;
                s2_state=true;
                if (isChecked){
                    click2=true;
                    if (click1)click1=false;
                    if(s1_state) s1.setChecked(false);
                    s1_state=false;
                    if(!SaveData.GetBoolean(2,getContext())){
                        s2.setChecked(false);
                        s2_state=false;
                        unlockdialog(view1);
                    }
                }
                else{
                    s2_state=false;
                }
            }
        });
        {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getcard_1();
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getcard_5();
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getcard_50();
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    reset(view2);
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    update(view2);
                }
            });//"更新" 按钮
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    look_got();
                }
            });
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    look_lost();
                }
            });
        }//让按钮绑定刷新模块
        switch (mParam){
            case 0:
                return view1;
            case 1:
                return view2;
            case 2:
                return view3;
            default:break;
        }
        return view1;
    }

    public void unlockdialog(final View v1) {
        LayoutInflater factory = LayoutInflater.from(getActivity());
        final View myView = factory.inflate(R.layout.unlock2, null);
        Dialog dialog = new AlertDialog.Builder(getActivity())//这个getactivity()很精髓,好像只能这么用
                .setTitle("请输入作弊码2")
                .setView(myView)
                .setCancelable(false)
                .setNegativeButton("取消",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Switch s1=v1.findViewById(R.id.switch1);
                        Switch s2=v1.findViewById(R.id.switch2);
                        if(click1)s1.setChecked(false);
                        if(click2)s2.setChecked(false);
                    }
                })
                .setPositiveButton("提交",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                EditText et1=myView.findViewById(R.id.editText2_1);
                                String a=et1.getText().toString();
                                Switch s1=v1.findViewById(R.id.switch1);
                                Switch s2=v1.findViewById(R.id.switch2);
                                if(a.equals("还没想好")) {
                                    Toast.makeText(getContext(),"已解锁",Toast.LENGTH_SHORT).show();
                                    SaveData.SetBoolean(true,2,getContext());
                                    if(click1)s1.setChecked(true);
                                    if(click2)s2.setChecked(true);
                                }
                                else{
                                    Toast.makeText(getContext(),"错了",Toast.LENGTH_SHORT).show();
                                    if(click1)s1.setChecked(false);
                                    if(click2)s2.setChecked(false);
                                }
                            }
                        })
                .create();
        dialog.show();
    }//v1永远是view1
    public void update(final View v2){
        TextView t_b1=v2.findViewById(R.id.boolean1);
        TextView t_b2=v2.findViewById(R.id.boolean2);
        t_b1.setText(translate(SaveData.GetBoolean(1,getContext())));
        t_b2.setText(translate(SaveData.GetBoolean(2,getContext())));

        TextView[] num={v2.findViewById(R.id.num0),v2.findViewById(R.id.num1),v2.findViewById(R.id.num2),
                v2.findViewById(R.id.num3),v2.findViewById(R.id.num4),v2.findViewById(R.id.num5),
                v2.findViewById(R.id.num6),v2.findViewById(R.id.num7),v2.findViewById(R.id.num8),
                v2.findViewById(R.id.num9),v2.findViewById(R.id.num10)};
        for(int i0=0;i0<11;i0++){
            if(i0!=2&&i0!=6&&i0!=8&&i0!=10)num[i0].setText(translate(SaveData.GetNum(i0,getContext())));
        }
        num[2].setText(translate(SaveData.GetFloat(2,getContext())));
        num[6].setText(translate(SaveData.GetFloat(6,getContext())));
        num[8].setText(translate(SaveData.GetFloat(8,getContext())));
        num[10].setText(translate(SaveData.GetFloat(10,getContext())));

        ProgressBar p1 =  v2.findViewById(R.id.progress1);
        TextView p0=v2.findViewById(R.id.progress_value1);
        p0.setText(translate(SaveData.GetProgress(getContext())));
        p1.setProgress((int)SaveData.GetProgress(getContext()));
    }//v2永远是view2
    public String translate(boolean b){
        if(b){
            return "已解锁";
        }
        return "未解锁";
    }
    public String translate(int a){ return Integer.toString(a); }
    public String translate(float a){
        StringBuilder stringBuilder=new StringBuilder(Float.toString(a));
        stringBuilder.append("%");
        return stringBuilder.toString();
    }
    public void getcard_1() {
        AlertDialog.Builder dialog1 = new AlertDialog.Builder(getActivity());
        dialog1.setTitle("抽卡结果");
        dialog1.setCancelable(true);
        dialog1.setIcon(R.drawable.hs_logo);
        ImageView hs1 = new ImageView(getActivity());
        int wtf[]=cards.get_1_card();
        hs1.setImageResource(wtf[0]);

        dialog1.setView(hs1);
        dialog1.setPositiveButton("确定", null);
        dialog1.show();
        SaveData.SetNum_add(0,1,getActivity());
        if(wtf[1]==3) SaveData.SetNum_add(1,1,getActivity());
        SaveData.SetResult_add(wtf[2],1,getActivity());
    }
    public void getcard_5() {
        MainActivity.state = 0;
        Intent intent = new Intent();
        intent.setClass(getContext(), ResultActivity.class);
        getContext().startActivity(intent);
    }//即直接跳转到ResultActivity
    public void getcard_50() {
        if(!SaveData.GetBoolean(1,getContext())) {
            LayoutInflater factory = LayoutInflater.from(getContext());
            final View myView = factory.inflate(R.layout.unlock1, null);
            Dialog dialog = new AlertDialog.Builder(getContext())
                    .setTitle("请输入作弊码1")
                    .setView(myView)
                    .setCancelable(true)
                    .setPositiveButton("提交",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    EditText et1 = myView.findViewById(R.id.editText1_1);
                                    String a = et1.getText().toString();
                                    if(a.equals("没错")) {
                                        SaveData.SetBoolean(true,1,getContext());
                                        MainActivity.state = 1;
                                        Toast.makeText(getContext(),"已解锁",Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent();
                                        intent.setClass(getContext(), ResultActivity.class);
                                        getContext().startActivity(intent);
                                    }
                                    else{
                                        Toast.makeText(getContext(),"错了",Toast.LENGTH_SHORT).show();
                                    }
                                }
                            })
                    .create();
            dialog.show();
        }
        if(SaveData.GetBoolean(1,getContext())) {//即判断作弊码1是否解锁
            MainActivity.state = 1;
            Intent intent = new Intent();
            intent.setClass(getContext(), ResultActivity.class);
            getContext().startActivity(intent);
        }
    }
    public void reset(final View view2) {
        AlertDialog.Builder dialog1 = new AlertDialog.Builder(getContext());
        dialog1.setTitle("确定？");
        dialog1.setCancelable(true);
        dialog1.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                for (int i0 = 0; i0 < 11; i0++) {
                    if(i0!=2&&i0!=6&&i0!=8&&i0!=10)SaveData.SetNum(i0, 0, getContext());
                }
                for(int i1=0;i1<250;i1++){
                    SaveData.SetResult(i1,0,getContext());
                }
                SaveData.ClearFloat(getContext());
                SaveData.SetBoolean(false, 1, getContext());
                SaveData.SetBoolean(false, 2, getContext());
                s1_state=false;
                s2_state=false;
                Toast.makeText(getContext(),"你分解了所有卡牌\n但是并没获得奥术之尘",Toast.LENGTH_LONG).show();
                update(view2);
            }
        });
        dialog1.setNegativeButton("不确定",null);
        dialog1.show();
    }
    public void look_got(){
        Intent intent = new Intent();
        intent.setClass(getContext(), GotActivity.class);
        getContext().startActivity(intent);
    }
    public void look_lost(){
        Intent intent = new Intent();
        intent.setClass(getContext(), LostActivity.class);
        getContext().startActivity(intent);
    }
}
