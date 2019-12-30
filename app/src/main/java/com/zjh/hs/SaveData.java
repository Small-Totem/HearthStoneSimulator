package com.zjh.hs;
import android.content.Context;
import android.content.SharedPreferences;

public class SaveData {
    //创建一个SharedPreferences    类似于创建一个数据库，库名为 info
    public static SharedPreferences share(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences("info", Context.MODE_PRIVATE);
        return sharedPreferences;
    }

    //轮子的注释：调用上面的 share(Context context) 方法 获取标识为 "name" 的数据
    //调用上面的 share(Context context) 方法 将数据存入，并标识为 "name"
    //使用 commit() 方法保存会给出反应（保存成功或失败）
    //这里使用的是 apply() 方法保存，将不会有返回值

    public static void SetNum(int Num,int num, Context context){
        SharedPreferences.Editor e = share(context).edit();
        //忘了num2 6 8 10是float 这几个弃用
        switch (Num) {
            case 0:
                e.putInt("num0",num);
                break;
            case 1:
                e.putInt("num1",num);
                break;
            case 3:
                e.putInt("num3",num);
                e.putInt("num4",num*5);
                break;
            case 5:
                e.putInt("num5",num);
                break;
            case 7:
                e.putInt("num7",num);
                break;
            case 9:
                e.putInt("num9",num);
                break;
        }
        e.apply();
        SetFloat(context);
    }//向第Num项放入值num
    public static void SetNum_add(int Num,int num, Context context){
        int temp_num=GetNum(Num,context);
        temp_num+=num;
        SetNum(Num,temp_num,context);
    }//把第Num项加上num
    public static int GetNum(int Num,Context context){//Num从0到10
        switch (Num) {
            case 0:
                return share(context).getInt("num0", 0);
            case 1:
                return share(context).getInt("num1", 0);
            case 3:
                return share(context).getInt("num3", 0);
            case 4:
                return share(context).getInt("num4", 0);
            case 5:
                return share(context).getInt("num5", 0);
            case 7:
                return share(context).getInt("num7", 0);
            case 9:
                return share(context).getInt("num9", 0);
        }
        return 0;
    }

    public static void SetFloat(Context context){
        SharedPreferences.Editor e = share(context).edit();
        float num;
        num=100*(float)GetNum(1,context)/(float)GetNum(0,context);
        if(GetNum(0,context)==0) e.putFloat("num2", 0);
        else e.putFloat("num2", num);
        num=100*(float)GetNum(5,context)/(float)GetNum(4,context);
        if(GetNum(4,context)==0) e.putFloat("num6", 0);
        else e.putFloat("num6", num);
        num=100*(float)GetNum(7,context)/(float)GetNum(3,context);
        if(GetNum(3,context)==0) e.putFloat("num8", 0);
        else e.putFloat("num8", num);
        num=100*(float)GetNum(9,context)/(float)GetNum(3,context);
        if(GetNum(3,context)==0) e.putFloat("num10", 0);
        else e.putFloat("num10", num);
        e.apply();
    }//更新float的值，附着于setnum
    public static float GetFloat(int Num,Context context){
        switch (Num) {
            case 2:
                return share(context).getFloat("num2", 0);
            case 6:
                return share(context).getFloat("num6", 0);
            case 8:
                return share(context).getFloat("num8", 0);
            case 10:
                return share(context).getFloat("num10", 0);
        }
        return 0;
    }
    public static void ClearFloat(Context context){
        SharedPreferences.Editor e = share(context).edit();
        e.putFloat("num2", 0);
        e.putFloat("num6", 0);
        e.putFloat("num8", 0);
        e.putFloat("num10", 0);
        e.apply();
    }

    public static void SetBoolean(boolean b,int num, Context context){
        SharedPreferences.Editor e = share(context).edit();
        switch (num){
            case 1:
                e.putBoolean("Boolean1",b);
                break;
            case 2:
                e.putBoolean("Boolean2",b);
                break;
        }
        e.apply();
    }
    public static boolean GetBoolean(int num,Context context){
        switch (num) {
            case 1:
                return share(context).getBoolean("Boolean1", false);
            case 2:
                return share(context).getBoolean("Boolean2", false);
        }
        return false;
    }//int num 取1,2

    public static void SetResult(int Num,int num, Context context){
        SharedPreferences.Editor e = share(context).edit();
        switch (Num) {
            case 0:
                e.putInt("result0",num);
                break;
            case 1:
                e.putInt("result1",num);
                break;
            case 2:
                e.putInt("result2",num);
                break;
            case 3:
                e.putInt("result3",num);
                break;
            case 4:
                e.putInt("result4",num);
                break;
            case 5:
                e.putInt("result5",num);
                break;
            case 6:
                e.putInt("result6",num);
                break;
            case 7:
                e.putInt("result7",num);
                break;
            case 8:
                e.putInt("result8",num);
                break;
            case 9:
                e.putInt("result9",num);
                break;
            case 10:
                e.putInt("result10",num);
                break;
            case 11:
                e.putInt("result11",num);
                break;
            case 12:
                e.putInt("result12",num);
                break;
            case 13:
                e.putInt("result13",num);
                break;
            case 14:
                e.putInt("result14",num);
                break;
            case 15:
                e.putInt("result15",num);
                break;
            case 16:
                e.putInt("result16",num);
                break;
            case 17:
                e.putInt("result17",num);
                break;
            case 18:
                e.putInt("result18",num);
                break;
            case 19:
                e.putInt("result19",num);
                break;
            case 20:
                e.putInt("result20",num);
                break;
            case 21:
                e.putInt("result21",num);
                break;
            case 22:
                e.putInt("result22",num);
                break;
            case 23:
                e.putInt("result23",num);
                break;
            case 24:
                e.putInt("result24",num);
                break;
            case 25:
                e.putInt("result25",num);
                break;
            case 26:
                e.putInt("result26",num);
                break;
            case 27:
                e.putInt("result27",num);
                break;
            case 28:
                e.putInt("result28",num);
                break;
            case 29:
                e.putInt("result29",num);
                break;
            case 30:
                e.putInt("result30",num);
                break;
            case 31:
                e.putInt("result31",num);
                break;
            case 32:
                e.putInt("result32",num);
                break;
            case 33:
                e.putInt("result33",num);
                break;
            case 34:
                e.putInt("result34",num);
                break;
            case 35:
                e.putInt("result35",num);
                break;
            case 36:
                e.putInt("result36",num);
                break;
            case 37:
                e.putInt("result37",num);
                break;
            case 38:
                e.putInt("result38",num);
                break;
            case 39:
                e.putInt("result39",num);
                break;
            case 40:
                e.putInt("result40",num);
                break;
            case 41:
                e.putInt("result41",num);
                break;
            case 42:
                e.putInt("result42",num);
                break;
            case 43:
                e.putInt("result43",num);
                break;
            case 44:
                e.putInt("result44",num);
                break;
            case 45:
                e.putInt("result45",num);
                break;
            case 46:
                e.putInt("result46",num);
                break;
            case 47:
                e.putInt("result47",num);
                break;
            case 48:
                e.putInt("result48",num);
                break;
            case 49:
                e.putInt("result49",num);
                break;
            case 50:
                e.putInt("result50",num);
                break;
            case 51:
                e.putInt("result51",num);
                break;
            case 52:
                e.putInt("result52",num);
                break;
            case 53:
                e.putInt("result53",num);
                break;
            case 54:
                e.putInt("result54",num);
                break;
            case 55:
                e.putInt("result55",num);
                break;
            case 56:
                e.putInt("result56",num);
                break;
            case 57:
                e.putInt("result57",num);
                break;
            case 58:
                e.putInt("result58",num);
                break;
            case 59:
                e.putInt("result59",num);
                break;
            case 60:
                e.putInt("result60",num);
                break;
            case 61:
                e.putInt("result61",num);
                break;
            case 62:
                e.putInt("result62",num);
                break;
            case 63:
                e.putInt("result63",num);
                break;
            case 64:
                e.putInt("result64",num);
                break;
            case 65:
                e.putInt("result65",num);
                break;
            case 66:
                e.putInt("result66",num);
                break;
            case 67:
                e.putInt("result67",num);
                break;
            case 68:
                e.putInt("result68",num);
                break;
            case 69:
                e.putInt("result69",num);
                break;
            case 70:
                e.putInt("result70",num);
                break;
            case 71:
                e.putInt("result71",num);
                break;
            case 72:
                e.putInt("result72",num);
                break;
            case 73:
                e.putInt("result73",num);
                break;
            case 74:
                e.putInt("result74",num);
                break;
            case 75:
                e.putInt("result75",num);
                break;
            case 76:
                e.putInt("result76",num);
                break;
            case 77:
                e.putInt("result77",num);
                break;
            case 78:
                e.putInt("result78",num);
                break;
            case 79:
                e.putInt("result79",num);
                break;
            case 80:
                e.putInt("result80",num);
                break;
            case 81:
                e.putInt("result81",num);
                break;
            case 82:
                e.putInt("result82",num);
                break;
            case 83:
                e.putInt("result83",num);
                break;
            case 84:
                e.putInt("result84",num);
                break;
            case 85:
                e.putInt("result85",num);
                break;
            case 86:
                e.putInt("result86",num);
                break;
            case 87:
                e.putInt("result87",num);
                break;
            case 88:
                e.putInt("result88",num);
                break;
            case 89:
                e.putInt("result89",num);
                break;
            case 90:
                e.putInt("result90",num);
                break;
            case 91:
                e.putInt("result91",num);
                break;
            case 92:
                e.putInt("result92",num);
                break;
            case 93:
                e.putInt("result93",num);
                break;
            case 94:
                e.putInt("result94",num);
                break;
            case 95:
                e.putInt("result95",num);
                break;
            case 96:
                e.putInt("result96",num);
                break;
            case 97:
                e.putInt("result97",num);
                break;
            case 98:
                e.putInt("result98",num);
                break;
            case 99:
                e.putInt("result99",num);
                break;
            case 100:
                e.putInt("result100",num);
                break;
            case 101:
                e.putInt("result101",num);
                break;
            case 102:
                e.putInt("result102",num);
                break;
            case 103:
                e.putInt("result103",num);
                break;
            case 104:
                e.putInt("result104",num);
                break;
            case 105:
                e.putInt("result105",num);
                break;
            case 106:
                e.putInt("result106",num);
                break;
            case 107:
                e.putInt("result107",num);
                break;
            case 108:
                e.putInt("result108",num);
                break;
            case 109:
                e.putInt("result109",num);
                break;
            case 110:
                e.putInt("result110",num);
                break;
            case 111:
                e.putInt("result111",num);
                break;
            case 112:
                e.putInt("result112",num);
                break;
            case 113:
                e.putInt("result113",num);
                break;
            case 114:
                e.putInt("result114",num);
                break;
            case 115:
                e.putInt("result115",num);
                break;
            case 116:
                e.putInt("result116",num);
                break;
            case 117:
                e.putInt("result117",num);
                break;
            case 118:
                e.putInt("result118",num);
                break;
            case 119:
                e.putInt("result119",num);
                break;
            case 120:
                e.putInt("result120",num);
                break;
            case 121:
                e.putInt("result121",num);
                break;
            case 122:
                e.putInt("result122",num);
                break;
            case 123:
                e.putInt("result123",num);
                break;
            case 124:
                e.putInt("result124",num);
                break;
            case 125:
                e.putInt("result125",num);
                break;
            case 126:
                e.putInt("result126",num);
                break;
            case 127:
                e.putInt("result127",num);
                break;
            case 128:
                e.putInt("result128",num);
                break;
            case 129:
                e.putInt("result129",num);
                break;
            case 130:
                e.putInt("result130",num);
                break;
            case 131:
                e.putInt("result131",num);
                break;
            case 132:
                e.putInt("result132",num);
                break;
            case 133:
                e.putInt("result133",num);
                break;
            case 134:
                e.putInt("result134",num);
                break;
            case 135:
                e.putInt("result135",num);
                break;
            case 136:
                e.putInt("result136",num);
                break;
            case 137:
                e.putInt("result137",num);
                break;
            case 138:
                e.putInt("result138",num);
                break;
            case 139:
                e.putInt("result139",num);
                break;
            case 140:
                e.putInt("result140",num);
                break;
            case 141:
                e.putInt("result141",num);
                break;
            case 142:
                e.putInt("result142",num);
                break;
            case 143:
                e.putInt("result143",num);
                break;
            case 144:
                e.putInt("result144",num);
                break;
            case 145:
                e.putInt("result145",num);
                break;
            case 146:
                e.putInt("result146",num);
                break;
            case 147:
                e.putInt("result147",num);
                break;
            case 148:
                e.putInt("result148",num);
                break;
            case 149:
                e.putInt("result149",num);
                break;
            case 150:
                e.putInt("result150",num);
                break;
            case 151:
                e.putInt("result151",num);
                break;
            case 152:
                e.putInt("result152",num);
                break;
            case 153:
                e.putInt("result153",num);
                break;
            case 154:
                e.putInt("result154",num);
                break;
            case 155:
                e.putInt("result155",num);
                break;
            case 156:
                e.putInt("result156",num);
                break;
            case 157:
                e.putInt("result157",num);
                break;
            case 158:
                e.putInt("result158",num);
                break;
            case 159:
                e.putInt("result159",num);
                break;
            case 160:
                e.putInt("result160",num);
                break;
            case 161:
                e.putInt("result161",num);
                break;
            case 162:
                e.putInt("result162",num);
                break;
            case 163:
                e.putInt("result163",num);
                break;
            case 164:
                e.putInt("result164",num);
                break;
            case 165:
                e.putInt("result165",num);
                break;
            case 166:
                e.putInt("result166",num);
                break;
            case 167:
                e.putInt("result167",num);
                break;
            case 168:
                e.putInt("result168",num);
                break;
            case 169:
                e.putInt("result169",num);
                break;
            case 170:
                e.putInt("result170",num);
                break;
            case 171:
                e.putInt("result171",num);
                break;
            case 172:
                e.putInt("result172",num);
                break;
            case 173:
                e.putInt("result173",num);
                break;
            case 174:
                e.putInt("result174",num);
                break;
            case 175:
                e.putInt("result175",num);
                break;
            case 176:
                e.putInt("result176",num);
                break;
            case 177:
                e.putInt("result177",num);
                break;
            case 178:
                e.putInt("result178",num);
                break;
            case 179:
                e.putInt("result179",num);
                break;
            case 180:
                e.putInt("result180",num);
                break;
            case 181:
                e.putInt("result181",num);
                break;
            case 182:
                e.putInt("result182",num);
                break;
            case 183:
                e.putInt("result183",num);
                break;
            case 184:
                e.putInt("result184",num);
                break;
            case 185:
                e.putInt("result185",num);
                break;
            case 186:
                e.putInt("result186",num);
                break;
            case 187:
                e.putInt("result187",num);
                break;
            case 188:
                e.putInt("result188",num);
                break;
            case 189:
                e.putInt("result189",num);
                break;
            case 190:
                e.putInt("result190",num);
                break;
            case 191:
                e.putInt("result191",num);
                break;
            case 192:
                e.putInt("result192",num);
                break;
            case 193:
                e.putInt("result193",num);
                break;
            case 194:
                e.putInt("result194",num);
                break;
            case 195:
                e.putInt("result195",num);
                break;
            case 196:
                e.putInt("result196",num);
                break;
            case 197:
                e.putInt("result197",num);
                break;
            case 198:
                e.putInt("result198",num);
                break;
            case 199:
                e.putInt("result199",num);
                break;
            case 200:
                e.putInt("result200",num);
                break;
            case 201:
                e.putInt("result201",num);
                break;
            case 202:
                e.putInt("result202",num);
                break;
            case 203:
                e.putInt("result203",num);
                break;
            case 204:
                e.putInt("result204",num);
                break;
            case 205:
                e.putInt("result205",num);
                break;
            case 206:
                e.putInt("result206",num);
                break;
            case 207:
                e.putInt("result207",num);
                break;
            case 208:
                e.putInt("result208",num);
                break;
            case 209:
                e.putInt("result209",num);
                break;
            case 210:
                e.putInt("result210",num);
                break;
            case 211:
                e.putInt("result211",num);
                break;
            case 212:
                e.putInt("result212",num);
                break;
            case 213:
                e.putInt("result213",num);
                break;
            case 214:
                e.putInt("result214",num);
                break;
            case 215:
                e.putInt("result215",num);
                break;
            case 216:
                e.putInt("result216",num);
                break;
            case 217:
                e.putInt("result217",num);
                break;
            case 218:
                e.putInt("result218",num);
                break;
            case 219:
                e.putInt("result219",num);
                break;
            case 220:
                e.putInt("result220",num);
                break;
            case 221:
                e.putInt("result221",num);
                break;
            case 222:
                e.putInt("result222",num);
                break;
            case 223:
                e.putInt("result223",num);
                break;
            case 224:
                e.putInt("result224",num);
                break;
            case 225:
                e.putInt("result225",num);
                break;
            case 226:
                e.putInt("result226",num);
                break;
            case 227:
                e.putInt("result227",num);
                break;
            case 228:
                e.putInt("result228",num);
                break;
            case 229:
                e.putInt("result229",num);
                break;
            case 230:
                e.putInt("result230",num);
                break;
            case 231:
                e.putInt("result231",num);
                break;
            case 232:
                e.putInt("result232",num);
                break;
            case 233:
                e.putInt("result233",num);
                break;
            case 234:
                e.putInt("result234",num);
                break;
            case 235:
                e.putInt("result235",num);
                break;
            case 236:
                e.putInt("result236",num);
                break;
            case 237:
                e.putInt("result237",num);
                break;
            case 238:
                e.putInt("result238",num);
                break;
            case 239:
                e.putInt("result239",num);
                break;
            case 240:
                e.putInt("result240",num);
                break;
            case 241:
                e.putInt("result241",num);
                break;
            case 242:
                e.putInt("result242",num);
                break;
            case 243:
                e.putInt("result243",num);
                break;
            case 244:
                e.putInt("result244",num);
                break;
            case 245:
                e.putInt("result245",num);
                break;
            case 246:
                e.putInt("result246",num);
                break;
            case 247:
                e.putInt("result247",num);
                break;
            case 248:
                e.putInt("result248",num);
                break;
            case 249:
                e.putInt("result249",num);
                break;
        }
        e.apply();
    }
    public static void SetResult_add(int Num,int num, Context context){
        int temp_num=GetResult(Num,context);
        temp_num+=num;
        SetResult(Num,temp_num,context);
    }
    public static int GetResult(int Num,Context context){
        switch (Num){
            case 0:
                return share(context).getInt("result0", 0);
            case 1:
                return share(context).getInt("result1", 0);
            case 2:
                return share(context).getInt("result2", 0);
            case 3:
                return share(context).getInt("result3", 0);
            case 4:
                return share(context).getInt("result4", 0);
            case 5:
                return share(context).getInt("result5", 0);
            case 6:
                return share(context).getInt("result6", 0);
            case 7:
                return share(context).getInt("result7", 0);
            case 8:
                return share(context).getInt("result8", 0);
            case 9:
                return share(context).getInt("result9", 0);
            case 10:
                return share(context).getInt("result10", 0);
            case 11:
                return share(context).getInt("result11", 0);
            case 12:
                return share(context).getInt("result12", 0);
            case 13:
                return share(context).getInt("result13", 0);
            case 14:
                return share(context).getInt("result14", 0);
            case 15:
                return share(context).getInt("result15", 0);
            case 16:
                return share(context).getInt("result16", 0);
            case 17:
                return share(context).getInt("result17", 0);
            case 18:
                return share(context).getInt("result18", 0);
            case 19:
                return share(context).getInt("result19", 0);
            case 20:
                return share(context).getInt("result20", 0);
            case 21:
                return share(context).getInt("result21", 0);
            case 22:
                return share(context).getInt("result22", 0);
            case 23:
                return share(context).getInt("result23", 0);
            case 24:
                return share(context).getInt("result24", 0);
            case 25:
                return share(context).getInt("result25", 0);
            case 26:
                return share(context).getInt("result26", 0);
            case 27:
                return share(context).getInt("result27", 0);
            case 28:
                return share(context).getInt("result28", 0);
            case 29:
                return share(context).getInt("result29", 0);
            case 30:
                return share(context).getInt("result30", 0);
            case 31:
                return share(context).getInt("result31", 0);
            case 32:
                return share(context).getInt("result32", 0);
            case 33:
                return share(context).getInt("result33", 0);
            case 34:
                return share(context).getInt("result34", 0);
            case 35:
                return share(context).getInt("result35", 0);
            case 36:
                return share(context).getInt("result36", 0);
            case 37:
                return share(context).getInt("result37", 0);
            case 38:
                return share(context).getInt("result38", 0);
            case 39:
                return share(context).getInt("result39", 0);
            case 40:
                return share(context).getInt("result40", 0);
            case 41:
                return share(context).getInt("result41", 0);
            case 42:
                return share(context).getInt("result42", 0);
            case 43:
                return share(context).getInt("result43", 0);
            case 44:
                return share(context).getInt("result44", 0);
            case 45:
                return share(context).getInt("result45", 0);
            case 46:
                return share(context).getInt("result46", 0);
            case 47:
                return share(context).getInt("result47", 0);
            case 48:
                return share(context).getInt("result48", 0);
            case 49:
                return share(context).getInt("result49", 0);
            case 50:
                return share(context).getInt("result50", 0);
            case 51:
                return share(context).getInt("result51", 0);
            case 52:
                return share(context).getInt("result52", 0);
            case 53:
                return share(context).getInt("result53", 0);
            case 54:
                return share(context).getInt("result54", 0);
            case 55:
                return share(context).getInt("result55", 0);
            case 56:
                return share(context).getInt("result56", 0);
            case 57:
                return share(context).getInt("result57", 0);
            case 58:
                return share(context).getInt("result58", 0);
            case 59:
                return share(context).getInt("result59", 0);
            case 60:
                return share(context).getInt("result60", 0);
            case 61:
                return share(context).getInt("result61", 0);
            case 62:
                return share(context).getInt("result62", 0);
            case 63:
                return share(context).getInt("result63", 0);
            case 64:
                return share(context).getInt("result64", 0);
            case 65:
                return share(context).getInt("result65", 0);
            case 66:
                return share(context).getInt("result66", 0);
            case 67:
                return share(context).getInt("result67", 0);
            case 68:
                return share(context).getInt("result68", 0);
            case 69:
                return share(context).getInt("result69", 0);
            case 70:
                return share(context).getInt("result70", 0);
            case 71:
                return share(context).getInt("result71", 0);
            case 72:
                return share(context).getInt("result72", 0);
            case 73:
                return share(context).getInt("result73", 0);
            case 74:
                return share(context).getInt("result74", 0);
            case 75:
                return share(context).getInt("result75", 0);
            case 76:
                return share(context).getInt("result76", 0);
            case 77:
                return share(context).getInt("result77", 0);
            case 78:
                return share(context).getInt("result78", 0);
            case 79:
                return share(context).getInt("result79", 0);
            case 80:
                return share(context).getInt("result80", 0);
            case 81:
                return share(context).getInt("result81", 0);
            case 82:
                return share(context).getInt("result82", 0);
            case 83:
                return share(context).getInt("result83", 0);
            case 84:
                return share(context).getInt("result84", 0);
            case 85:
                return share(context).getInt("result85", 0);
            case 86:
                return share(context).getInt("result86", 0);
            case 87:
                return share(context).getInt("result87", 0);
            case 88:
                return share(context).getInt("result88", 0);
            case 89:
                return share(context).getInt("result89", 0);
            case 90:
                return share(context).getInt("result90", 0);
            case 91:
                return share(context).getInt("result91", 0);
            case 92:
                return share(context).getInt("result92", 0);
            case 93:
                return share(context).getInt("result93", 0);
            case 94:
                return share(context).getInt("result94", 0);
            case 95:
                return share(context).getInt("result95", 0);
            case 96:
                return share(context).getInt("result96", 0);
            case 97:
                return share(context).getInt("result97", 0);
            case 98:
                return share(context).getInt("result98", 0);
            case 99:
                return share(context).getInt("result99", 0);
            case 100:
                return share(context).getInt("result100", 0);
            case 101:
                return share(context).getInt("result101", 0);
            case 102:
                return share(context).getInt("result102", 0);
            case 103:
                return share(context).getInt("result103", 0);
            case 104:
                return share(context).getInt("result104", 0);
            case 105:
                return share(context).getInt("result105", 0);
            case 106:
                return share(context).getInt("result106", 0);
            case 107:
                return share(context).getInt("result107", 0);
            case 108:
                return share(context).getInt("result108", 0);
            case 109:
                return share(context).getInt("result109", 0);
            case 110:
                return share(context).getInt("result110", 0);
            case 111:
                return share(context).getInt("result111", 0);
            case 112:
                return share(context).getInt("result112", 0);
            case 113:
                return share(context).getInt("result113", 0);
            case 114:
                return share(context).getInt("result114", 0);
            case 115:
                return share(context).getInt("result115", 0);
            case 116:
                return share(context).getInt("result116", 0);
            case 117:
                return share(context).getInt("result117", 0);
            case 118:
                return share(context).getInt("result118", 0);
            case 119:
                return share(context).getInt("result119", 0);
            case 120:
                return share(context).getInt("result120", 0);
            case 121:
                return share(context).getInt("result121", 0);
            case 122:
                return share(context).getInt("result122", 0);
            case 123:
                return share(context).getInt("result123", 0);
            case 124:
                return share(context).getInt("result124", 0);
            case 125:
                return share(context).getInt("result125", 0);
            case 126:
                return share(context).getInt("result126", 0);
            case 127:
                return share(context).getInt("result127", 0);
            case 128:
                return share(context).getInt("result128", 0);
            case 129:
                return share(context).getInt("result129", 0);
            case 130:
                return share(context).getInt("result130", 0);
            case 131:
                return share(context).getInt("result131", 0);
            case 132:
                return share(context).getInt("result132", 0);
            case 133:
                return share(context).getInt("result133", 0);
            case 134:
                return share(context).getInt("result134", 0);
            case 135:
                return share(context).getInt("result135", 0);
            case 136:
                return share(context).getInt("result136", 0);
            case 137:
                return share(context).getInt("result137", 0);
            case 138:
                return share(context).getInt("result138", 0);
            case 139:
                return share(context).getInt("result139", 0);
            case 140:
                return share(context).getInt("result140", 0);
            case 141:
                return share(context).getInt("result141", 0);
            case 142:
                return share(context).getInt("result142", 0);
            case 143:
                return share(context).getInt("result143", 0);
            case 144:
                return share(context).getInt("result144", 0);
            case 145:
                return share(context).getInt("result145", 0);
            case 146:
                return share(context).getInt("result146", 0);
            case 147:
                return share(context).getInt("result147", 0);
            case 148:
                return share(context).getInt("result148", 0);
            case 149:
                return share(context).getInt("result149", 0);
            case 150:
                return share(context).getInt("result150", 0);
            case 151:
                return share(context).getInt("result151", 0);
            case 152:
                return share(context).getInt("result152", 0);
            case 153:
                return share(context).getInt("result153", 0);
            case 154:
                return share(context).getInt("result154", 0);
            case 155:
                return share(context).getInt("result155", 0);
            case 156:
                return share(context).getInt("result156", 0);
            case 157:
                return share(context).getInt("result157", 0);
            case 158:
                return share(context).getInt("result158", 0);
            case 159:
                return share(context).getInt("result159", 0);
            case 160:
                return share(context).getInt("result160", 0);
            case 161:
                return share(context).getInt("result161", 0);
            case 162:
                return share(context).getInt("result162", 0);
            case 163:
                return share(context).getInt("result163", 0);
            case 164:
                return share(context).getInt("result164", 0);
            case 165:
                return share(context).getInt("result165", 0);
            case 166:
                return share(context).getInt("result166", 0);
            case 167:
                return share(context).getInt("result167", 0);
            case 168:
                return share(context).getInt("result168", 0);
            case 169:
                return share(context).getInt("result169", 0);
            case 170:
                return share(context).getInt("result170", 0);
            case 171:
                return share(context).getInt("result171", 0);
            case 172:
                return share(context).getInt("result172", 0);
            case 173:
                return share(context).getInt("result173", 0);
            case 174:
                return share(context).getInt("result174", 0);
            case 175:
                return share(context).getInt("result175", 0);
            case 176:
                return share(context).getInt("result176", 0);
            case 177:
                return share(context).getInt("result177", 0);
            case 178:
                return share(context).getInt("result178", 0);
            case 179:
                return share(context).getInt("result179", 0);
            case 180:
                return share(context).getInt("result180", 0);
            case 181:
                return share(context).getInt("result181", 0);
            case 182:
                return share(context).getInt("result182", 0);
            case 183:
                return share(context).getInt("result183", 0);
            case 184:
                return share(context).getInt("result184", 0);
            case 185:
                return share(context).getInt("result185", 0);
            case 186:
                return share(context).getInt("result186", 0);
            case 187:
                return share(context).getInt("result187", 0);
            case 188:
                return share(context).getInt("result188", 0);
            case 189:
                return share(context).getInt("result189", 0);
            case 190:
                return share(context).getInt("result190", 0);
            case 191:
                return share(context).getInt("result191", 0);
            case 192:
                return share(context).getInt("result192", 0);
            case 193:
                return share(context).getInt("result193", 0);
            case 194:
                return share(context).getInt("result194", 0);
            case 195:
                return share(context).getInt("result195", 0);
            case 196:
                return share(context).getInt("result196", 0);
            case 197:
                return share(context).getInt("result197", 0);
            case 198:
                return share(context).getInt("result198", 0);
            case 199:
                return share(context).getInt("result199", 0);
            case 200:
                return share(context).getInt("result200", 0);
            case 201:
                return share(context).getInt("result201", 0);
            case 202:
                return share(context).getInt("result202", 0);
            case 203:
                return share(context).getInt("result203", 0);
            case 204:
                return share(context).getInt("result204", 0);
            case 205:
                return share(context).getInt("result205", 0);
            case 206:
                return share(context).getInt("result206", 0);
            case 207:
                return share(context).getInt("result207", 0);
            case 208:
                return share(context).getInt("result208", 0);
            case 209:
                return share(context).getInt("result209", 0);
            case 210:
                return share(context).getInt("result210", 0);
            case 211:
                return share(context).getInt("result211", 0);
            case 212:
                return share(context).getInt("result212", 0);
            case 213:
                return share(context).getInt("result213", 0);
            case 214:
                return share(context).getInt("result214", 0);
            case 215:
                return share(context).getInt("result215", 0);
            case 216:
                return share(context).getInt("result216", 0);
            case 217:
                return share(context).getInt("result217", 0);
            case 218:
                return share(context).getInt("result218", 0);
            case 219:
                return share(context).getInt("result219", 0);
            case 220:
                return share(context).getInt("result220", 0);
            case 221:
                return share(context).getInt("result221", 0);
            case 222:
                return share(context).getInt("result222", 0);
            case 223:
                return share(context).getInt("result223", 0);
            case 224:
                return share(context).getInt("result224", 0);
            case 225:
                return share(context).getInt("result225", 0);
            case 226:
                return share(context).getInt("result226", 0);
            case 227:
                return share(context).getInt("result227", 0);
            case 228:
                return share(context).getInt("result228", 0);
            case 229:
                return share(context).getInt("result229", 0);
            case 230:
                return share(context).getInt("result230", 0);
            case 231:
                return share(context).getInt("result231", 0);
            case 232:
                return share(context).getInt("result232", 0);
            case 233:
                return share(context).getInt("result233", 0);
            case 234:
                return share(context).getInt("result234", 0);
            case 235:
                return share(context).getInt("result235", 0);
            case 236:
                return share(context).getInt("result236", 0);
            case 237:
                return share(context).getInt("result237", 0);
            case 238:
                return share(context).getInt("result238", 0);
            case 239:
                return share(context).getInt("result239", 0);
            case 240:
                return share(context).getInt("result240", 0);
            case 241:
                return share(context).getInt("result241", 0);
            case 242:
                return share(context).getInt("result242", 0);
            case 243:
                return share(context).getInt("result243", 0);
            case 244:
                return share(context).getInt("result244", 0);
            case 245:
                return share(context).getInt("result245", 0);
            case 246:
                return share(context).getInt("result246", 0);
            case 247:
                return share(context).getInt("result247", 0);
            case 248:
                return share(context).getInt("result248", 0);
            case 249:
                return share(context).getInt("result249", 0);
        }
        return 0;
    }

    public static float GetProgress(Context context){
        int n=0;
        for(int i=0;i<250;i++){
            if(GetResult(i,context)!=0)n++;
        }
        if(n==0)return 0;
        return (float)100*n/(float)249;
    }
}
