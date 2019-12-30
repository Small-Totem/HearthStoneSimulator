package com.zjh.hs;
import java.nio.FloatBuffer;
import java.util.Random;

class Card{
    String cnName;
    String name;
    int cost;
    int golden;
    String rarity;
    int imgUrl;
    String type;
    String race;
    String fullImgUrl;
}

public class cards {
    static int min = 0;//0到249闭区间
    static int max = 250;
    static int num_1 = 1;//1到100闭区间 (好像有问题
    static int num_101 = 101;
    static int[] c=new int[16];
    static boolean JustGetNum=false;
    static public int[] get_5_card(int CardNum) {
        //int[0-4]返回R.drawable.xxx
        //int[5]是抽卡评价，0=非洲，2=1橙,3=多橙
        //int[6-10]是卡牌稀有度 6对应0以此类推；稀有度:0==普通，1==稀有，2==史诗，3==传说
        //int[11-15]是卡牌编号
        int i = 0;
        Card[] a = new Card[250];
        while (i < 250) {
            a[i] = new Card();
            i++;
        }//对象实例化

        {
        a[0].cnName = "自然平衡";
        a[0].name = "233-naturalize";
        a[0].cost = 1;
        a[0].golden = 0;
        a[0].rarity = "common";
        a[0].imgUrl = R.drawable.hearthstone_159ae73ee62782e805c7ddec0526b6691ae8a108bb697d1c8701b58ce92f0de1;
        a[0].type = "spell";
        a[0].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/159ae73ee62782e805c7ddec0526b6691ae8a108bb697d1c8701b58ce92f0de1.png";

        a[1].cnName = "野蛮之击";
        a[1].name = "481-savagery";
        a[1].cost = 1;
        a[1].golden = 0;
        a[1].rarity = "rare";
        a[1].imgUrl = R.drawable.hearthstone_48b063d8296df5bf05a660a3fd591731c4f92dac07a7a9f53347f4ed15bdc111;
        a[1].type = "spell";
        a[1].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/48b063d8296df5bf05a660a3fd591731c4f92dac07a7a9f53347f4ed15bdc111.png";

        a[2].cnName = "野性之力";
        a[2].name = "503-power-of-the-wild";
        a[2].cost = 2;
        a[2].golden = 0;
        a[2].rarity = "common";
        a[2].imgUrl = R.drawable.hearthstone_27cc137e04db8e15ee361caa338c64c88cc229596f5f41a92574875066a43910;
        a[2].type = "spell";
        a[2].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/27cc137e04db8e15ee361caa338c64c88cc229596f5f41a92574875066a43910.png";

        a[3].cnName = "愤怒";
        a[3].name = "836-wrath";
        a[3].cost = 2;
        a[3].golden = 0;
        a[3].rarity = "common";
        a[3].imgUrl = R.drawable.hearthstone_9f45d75aebb87e520b7ea0365604f32ce6b9cfc760e58348ed01438f3b2696ea;
        a[3].type = "spell";
        a[3].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/9f45d75aebb87e520b7ea0365604f32ce6b9cfc760e58348ed01438f3b2696ea.png";

        a[4].cnName = "自然印记";
        a[4].name = "151-mark-of-nature";
        a[4].cost = 3;
        a[4].golden = 0;
        a[4].rarity = "common";
        a[4].imgUrl = R.drawable.hearthstone_7b2b15a582dfef83ab1ac4b3e12635fc011d17e54f91244fef9a7d662699a50f;
        a[4].type = "spell";
        a[4].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/7b2b15a582dfef83ab1ac4b3e12635fc011d17e54f91244fef9a7d662699a50f.png";

        a[5].cnName = "丛林之魂";
        a[5].name = "381-soul-of-the-forest";
        a[5].cost = 4;
        a[5].golden = 0;
        a[5].rarity = "common";
        a[5].imgUrl = R.drawable.hearthstone_36acdb26201867fa599d4ffab28ca0e5e30b3a478aa4324c75dedf34f83d0a64;
        a[5].type = "spell";
        a[5].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/36acdb26201867fa599d4ffab28ca0e5e30b3a478aa4324c75dedf34f83d0a64.png";

        a[6].cnName = "撕咬";
        a[6].name = "577-bite";
        a[6].cost = 4;
        a[6].golden = 0;
        a[6].rarity = "rare";
        a[6].imgUrl = R.drawable.hearthstone_79e300009b871400d0c6ded2ca4a76bb92cab237c8e21ec3350b6a4a74fe098d;
        a[6].type = "spell";
        a[6].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/79e300009b871400d0c6ded2ca4a76bb92cab237c8e21ec3350b6a4a74fe098d.png";

        a[7].cnName = "丛林守护者";
        a[7].name = "601-keeper-of-the-grove";
        a[7].cost = 4;
        a[7].golden = 0;
        a[7].rarity = "rare";
        a[7].imgUrl = R.drawable.hearthstone_99eb551763c1f28be8b71c3e6e04587743d8af511f0d50067db04c43fed669e2;
        a[7].type = "minion";
        a[7].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/99eb551763c1f28be8b71c3e6e04587743d8af511f0d50067db04c43fed669e2.png";

        a[8].cnName = "星辰坠落";
        a[8].name = "86-starfall";
        a[8].cost = 5;
        a[8].golden = 0;
        a[8].rarity = "rare";
        a[8].imgUrl = R.drawable.hearthstone_03bf1ceb413ecc7b5d160daa60d6507d94a17cae74fbdb94dde3ec90975da9c7;
        a[8].type = "spell";
        a[8].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/03bf1ceb413ecc7b5d160daa60d6507d94a17cae74fbdb94dde3ec90975da9c7.png";

        a[9].cnName = "自然之力";
        a[9].name = "493-force-of-nature";
        a[9].cost = 5;
        a[9].golden = 0;
        a[9].rarity = "epic";
        a[9].imgUrl = R.drawable.hearthstone_6843e44b5e7e0bed20c309e81e89a361d8e4632cbe0ff4ad879fdd10f9105c34;
        a[9].type = "spell";
        a[9].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/6843e44b5e7e0bed20c309e81e89a361d8e4632cbe0ff4ad879fdd10f9105c34.png";

        a[10].cnName = "利爪德鲁伊";
        a[10].name = "692-druid-of-the-claw";
        a[10].cost = 5;
        a[10].golden = 0;
        a[10].rarity = "common";
        a[10].imgUrl = R.drawable.hearthstone_c193dfbcc8be2e00e0756bfa5e66713a35c2b2582cf996cd92fe844120714469;
        a[10].type = "minion";
        a[10].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/c193dfbcc8be2e00e0756bfa5e66713a35c2b2582cf996cd92fe844120714469.png";

        a[11].cnName = "滋养";
        a[11].name = "95-nourish";
        a[11].cost = 6;
        a[11].golden = 0;
        a[11].rarity = "rare";
        a[11].imgUrl = R.drawable.hearthstone_0b8caee59c568495b1bb9a5dfa6600e86e896657c2b4e0e881fd1278eb82f11b;
        a[11].type = "spell";
        a[11].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/0b8caee59c568495b1bb9a5dfa6600e86e896657c2b4e0e881fd1278eb82f11b.png";

        a[12].cnName = "知识古树";
        a[12].name = "920-ancient-of-lore";
        a[12].cost = 7;
        a[12].golden = 0;
        a[12].rarity = "epic";
        a[12].imgUrl = R.drawable.hearthstone_0f9165f91803c44133cea3769b8104237a60c80f26a5b6fffc5b97ecc847fa1b;
        a[12].type = "minion";
        a[12].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/0f9165f91803c44133cea3769b8104237a60c80f26a5b6fffc5b97ecc847fa1b.png";

        a[13].cnName = "战争古树";
        a[13].name = "1035-ancient-of-war";
        a[13].cost = 7;
        a[13].golden = 0;
        a[13].rarity = "epic";
        a[13].imgUrl = R.drawable.hearthstone_3afcc7110541243d05fc1dc0753e4a51228024c7f224949410a89e36d85fb6a8;
        a[13].type = "minion";
        a[13].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/3afcc7110541243d05fc1dc0753e4a51228024c7f224949410a89e36d85fb6a8.png";

        a[14].cnName = "塞纳留斯";
        a[14].name = "36-cenarius";
        a[14].cost = 9;
        a[14].golden = 0;
        a[14].rarity = "legendary";
        a[14].imgUrl = R.drawable.hearthstone_e3c9ed5e19e7831429aab2e56ffaf0a802b4c57452982b7487a1d616753b8c59;
        a[14].type = "minion";
        a[14].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/e3c9ed5e19e7831429aab2e56ffaf0a802b4c57452982b7487a1d616753b8c59.png";

        a[15].cnName = "狂野怒火";
        a[15].name = "903-bestial-wrath";
        a[15].cost = 1;
        a[15].golden = 0;
        a[15].rarity = "epic";
        a[15].imgUrl = R.drawable.hearthstone_7b1aad3a145a40064fd46b3c91da9de04dda3842e6c3ebaa14fbc5540bd3c92b;
        a[15].type = "spell";
        a[15].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/7b1aad3a145a40064fd46b3c91da9de04dda3842e6c3ebaa14fbc5540bd3c92b.png";

        a[16].cnName = "毒蛇陷阱";
        a[16].name = "455-snake-trap";
        a[16].cost = 2;
        a[16].golden = 0;
        a[16].rarity = "epic";
        a[16].imgUrl = R.drawable.hearthstone_e2eb50ebc17b07acad70287ec837036c900e52685077e19367e2291d51ce96d8;
        a[16].type = "spell";
        a[16].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/e2eb50ebc17b07acad70287ec837036c900e52685077e19367e2291d51ce96d8.png";

        a[17].cnName = "冰冻陷阱";
        a[17].name = "519-freezing-trap";
        a[17].cost = 2;
        a[17].golden = 0;
        a[17].rarity = "common";
        a[17].imgUrl = R.drawable.hearthstone_e1096763744c869e68cacf9f7b2959af545c24d2196ee5fc3db8d4fcc3805f03;
        a[17].type = "spell";
        a[17].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/e1096763744c869e68cacf9f7b2959af545c24d2196ee5fc3db8d4fcc3805f03.png";

        a[18].cnName = "爆炸陷阱";
        a[18].name = "585-explosive-trap";
        a[18].cost = 2;
        a[18].golden = 0;
        a[18].rarity = "common";
        a[18].imgUrl = R.drawable.hearthstone_b059ecadc6b356af2752143d15a4e362d6c3487aba7da641847e6a410a3274d6;
        a[18].type = "spell";
        a[18].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/b059ecadc6b356af2752143d15a4e362d6c3487aba7da641847e6a410a3274d6.png";

        a[19].cnName = "狙击";
        a[19].name = "814-snipe";
        a[19].cost = 2;
        a[19].golden = 0;
        a[19].rarity = "common";
        a[19].imgUrl = R.drawable.hearthstone_3cee34e2ec250f1b7d469c991528a90b6ad26e483f9f38f53feb72f14e740dd1;
        a[19].type = "spell";
        a[19].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/3cee34e2ec250f1b7d469c991528a90b6ad26e483f9f38f53feb72f14e740dd1.png";

        a[20].cnName = "照明弹";
        a[20].name = "896-flare";
        a[20].cost = 2;
        a[20].golden = 0;
        a[20].rarity = "rare";
        a[20].imgUrl = R.drawable.hearthstone_b25785d6331cf9c967f2b74560c1d0be4af63c2f33767d174d10ff51a7b490ca;
        a[20].type = "spell";
        a[20].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/b25785d6331cf9c967f2b74560c1d0be4af63c2f33767d174d10ff51a7b490ca.png";

        a[21].cnName = "误导";
        a[21].name = "1091-misdirection";
        a[21].cost = 2;
        a[21].golden = 0;
        a[21].rarity = "rare";
        a[21].imgUrl = R.drawable.hearthstone_c29fcc2171798d3ce878da8bb2a3ee644fa70058f51c36c1cc2ebf3d67ee279d;
        a[21].type = "spell";
        a[21].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/c29fcc2171798d3ce878da8bb2a3ee644fa70058f51c36c1cc2ebf3d67ee279d.png";

        a[22].cnName = "食腐土狼";
        a[22].name = "1281-scavenging-hyena";
        a[22].cost = 2;
        a[22].golden = 0;
        a[22].rarity = "common";
        a[22].imgUrl = R.drawable.hearthstone_291d27cad00630ea4172030ea0275574a1b7e5211d9f268f8017d05c7ced1e79;
        a[22].type = "minion";
        a[22].race = "beast";
        a[22].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/291d27cad00630ea4172030ea0275574a1b7e5211d9f268f8017d05c7ced1e79.png";

        a[23].cnName = "致命射击";
        a[23].name = "1093-deadly-shot";
        a[23].cost = 3;
        a[23].golden = 0;
        a[23].rarity = "common";
        a[23].imgUrl = R.drawable.hearthstone_4a92f975e42c6aeece69a673eeb0789c84cdf756b4f1e40f4decaca021841736;
        a[23].type = "spell";
        a[23].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/4a92f975e42c6aeece69a673eeb0789c84cdf756b4f1e40f4decaca021841736.png";

        a[24].cnName = "关门放狗";
        a[24].name = "1243-unleash-the-hounds";
        a[24].cost = 3;
        a[24].golden = 0;
        a[24].rarity = "common";
        a[24].imgUrl = R.drawable.hearthstone_6a0c8e25bb6e7705bce17d0c8f75ffcec173f9db95b12708480952536b99447d;
        a[24].type = "spell";
        a[24].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/6a0c8e25bb6e7705bce17d0c8f75ffcec173f9db95b12708480952536b99447d.png";

        a[25].cnName = "鹰角弓";
        a[25].name = "1662-eaglehorn-bow";
        a[25].cost = 3;
        a[25].golden = 0;
        a[25].rarity = "rare";
        a[25].imgUrl = R.drawable.hearthstone_07a3d8bead97c4894b619665ddaa6ccc31533b879408645eeefe19f723cd685a;
        a[25].type = "weapon";
        a[25].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/07a3d8bead97c4894b619665ddaa6ccc31533b879408645eeefe19f723cd685a.png";

        a[26].cnName = "爆炸射击";
        a[26].name = "394-explosive-shot";
        a[26].cost = 5;
        a[26].golden = 0;
        a[26].rarity = "rare";
        a[26].imgUrl = R.drawable.hearthstone_a592b2a6dabdfb6f01c99e782557c9ae2ec48ffbf2e3e450a1d58779ee0fe9a0;
        a[26].type = "spell";
        a[26].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/a592b2a6dabdfb6f01c99e782557c9ae2ec48ffbf2e3e450a1d58779ee0fe9a0.png";

        a[27].cnName = "长鬃草原狮";
        a[27].name = "1261-savannah-highmane";
        a[27].cost = 6;
        a[27].golden = 0;
        a[27].rarity = "rare";
        a[27].imgUrl = R.drawable.hearthstone_b311f24f7578c37e4769b53cf66ae88daebc24fd596e3a75d69fd75032a2e0c7;
        a[27].type = "minion";
        a[27].race = "beast";
        a[27].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/b311f24f7578c37e4769b53cf66ae88daebc24fd596e3a75d69fd75032a2e0c7.png";

        a[28].cnName = "角斗士的长弓";
        a[28].name = "311-gladiators-longbow";
        a[28].cost = 7;
        a[28].golden = 0;
        a[28].rarity = "epic";
        a[28].imgUrl = R.drawable.hearthstone_e637ae5f44be37337fa18c5fc3bf906d71bb78f76f17ff250f1085e75beb2d47;
        a[28].type = "weapon";
        a[28].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/e637ae5f44be37337fa18c5fc3bf906d71bb78f76f17ff250f1085e75beb2d47.png";

        a[29].cnName = "暴龙王克鲁什";
        a[29].name = "1144-king-krush";
        a[29].cost = 9;
        a[29].golden = 0;
        a[29].rarity = "legendary";
        a[29].imgUrl = R.drawable.hearthstone_76775ae908a8d3e7dc49c9d47f7e2df7b0d8ef87205bc425ebd92fc0cce14456;
        a[29].type = "minion";
        a[29].race = "beast";
        a[29].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/76775ae908a8d3e7dc49c9d47f7e2df7b0d8ef87205bc425ebd92fc0cce14456.png";

        a[30].cnName = "冰枪术";
        a[30].name = "172-ice-lance";
        a[30].cost = 1;
        a[30].golden = 0;
        a[30].rarity = "common";
        a[30].imgUrl = R.drawable.hearthstone_fb0623e8cf0505678c0cb64eadfa8a918d603e6a28f544967512eec72dfa200c;
        a[30].type = "spell";
        a[30].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/fb0623e8cf0505678c0cb64eadfa8a918d603e6a28f544967512eec72dfa200c.png";

        a[31].cnName = "法力浮龙";
        a[31].name = "405-mana-wyrm";
        a[31].cost = 2;
        a[31].golden = 0;
        a[31].rarity = "common";
        a[31].imgUrl = R.drawable.hearthstone_2cc280a08945f70206a13a3507356a9c01d5d973c928c08a4e1377831157654f;
        a[31].type = "minion";
        a[31].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/2cc280a08945f70206a13a3507356a9c01d5d973c928c08a4e1377831157654f.png";

        a[32].cnName = "巫师学徒";
        a[32].name = "614-sorcerers-apprentice";
        a[32].cost = 2;
        a[32].golden = 0;
        a[32].rarity = "common";
        a[32].imgUrl = R.drawable.hearthstone_418ac4967b9f1ff4c78d7100517b33f33f4febcc6200dcef222632554bfb8809;
        a[32].type = "minion";
        a[32].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/418ac4967b9f1ff4c78d7100517b33f33f4febcc6200dcef222632554bfb8809.png";

        a[33].cnName = "法术反制";
        a[33].name = "113-counterspell";
        a[33].cost = 3;
        a[33].golden = 0;
        a[33].rarity = "rare";
        a[33].imgUrl = R.drawable.hearthstone_5d47e511239c0173d251bfdbbbc6b126ce46fdb41c806ab0e03a5bfbbdeda63c;
        a[33].type = "spell";
        a[33].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/5d47e511239c0173d251bfdbbbc6b126ce46fdb41c806ab0e03a5bfbbdeda63c.png";

        a[34].cnName = "寒冰屏障";
        a[34].name = "192-ice-block";
        a[34].cost = 3;
        a[34].golden = 0;
        a[34].rarity = "epic";
        a[34].imgUrl = R.drawable.hearthstone_581ef7900ace56494d7b909166905786eaa2af9fecac64c9ba41f996f13e82c9;
        a[34].type = "spell";
        a[34].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/581ef7900ace56494d7b909166905786eaa2af9fecac64c9ba41f996f13e82c9.png";

        a[35].cnName = "镜像实体";
        a[35].name = "195-mirror-entity";
        a[35].cost = 3;
        a[35].golden = 0;
        a[35].rarity = "common";
        a[35].imgUrl = R.drawable.hearthstone_0c7317a823fdef737ff88f7af47d605fcbd9e3a6dff477ed5e013731e9cff42b;
        a[35].type = "spell";
        a[35].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/0c7317a823fdef737ff88f7af47d605fcbd9e3a6dff477ed5e013731e9cff42b.png";

        a[36].cnName = "蒸发";
        a[36].name = "286-vaporize";
        a[36].cost = 3;
        a[36].golden = 0;
        a[36].rarity = "rare";
        a[36].imgUrl = R.drawable.hearthstone_ba1dd4e619d21a7d650363d29c75ff88455975e856518b9d38c9c873b01e9f02;
        a[36].type = "spell";
        a[36].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/ba1dd4e619d21a7d650363d29c75ff88455975e856518b9d38c9c873b01e9f02.png";

        a[37].cnName = "扰咒术";
        a[37].name = "366-spellbender";
        a[37].cost = 3;
        a[37].golden = 0;
        a[37].rarity = "epic";
        a[37].imgUrl = R.drawable.hearthstone_61af1e76947d61175c7e2f0b33427c7966be119a5873340d6de9172f1e427b1c;
        a[37].type = "spell";
        a[37].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/61af1e76947d61175c7e2f0b33427c7966be119a5873340d6de9172f1e427b1c.png";

        a[38].cnName = "寒冰护体";
        a[38].name = "621-ice-barrier";
        a[38].cost = 3;
        a[38].golden = 0;
        a[38].rarity = "common";
        a[38].imgUrl = R.drawable.hearthstone_2471fceeb9bea0c984ba7ed8008270ae579c39694a11660ecc9ac6db92d5b346;
        a[38].type = "spell";
        a[38].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/2471fceeb9bea0c984ba7ed8008270ae579c39694a11660ecc9ac6db92d5b346.png";

        a[39].cnName = "肯瑞托法师";
        a[39].name = "748-kirin-tor-mage";
        a[39].cost = 3;
        a[39].golden = 0;
        a[39].rarity = "rare";
        a[39].imgUrl = R.drawable.hearthstone_625bf9d962e2d0116846bf1e218a6a2b549d49e01db6b5f7e1cb59c951314518;
        a[39].type = "minion";
        a[39].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/625bf9d962e2d0116846bf1e218a6a2b549d49e01db6b5f7e1cb59c951314518.png";

        a[40].cnName = "冰锥术";
        a[40].name = "430-cone-of-cold";
        a[40].cost = 4;
        a[40].golden = 0;
        a[40].rarity = "common";
        a[40].imgUrl = R.drawable.hearthstone_51321c6d0cccb717e487330ba68ed48c4ce1519c30972d75d34718c1ab932aca;
        a[40].type = "spell";
        a[40].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/51321c6d0cccb717e487330ba68ed48c4ce1519c30972d75d34718c1ab932aca.png";

        a[41].cnName = "虚灵奥术师";
        a[41].name = "1737-ethereal-arcanist";
        a[41].cost = 4;
        a[41].golden = 0;
        a[41].rarity = "rare";
        a[41].imgUrl = R.drawable.hearthstone_a45b3ad1cb785462506c54f922a4b64cd0abb98edaad78e44c37bda505d3c493;
        a[41].type = "minion";
        a[41].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/a45b3ad1cb785462506c54f922a4b64cd0abb98edaad78e44c37bda505d3c493.png";

        a[42].cnName = "暴风雪";
        a[42].name = "457-blizzard";
        a[42].cost = 6;
        a[42].golden = 0;
        a[42].rarity = "rare";
        a[42].imgUrl = R.drawable.hearthstone_e8b8dcd4eb81d669ac2e03ac3769b6adff01b93ea7b3335b97452610330db8cc;
        a[42].type = "spell";
        a[42].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/e8b8dcd4eb81d669ac2e03ac3769b6adff01b93ea7b3335b97452610330db8cc.png";

        a[43].cnName = "大法师安东尼达斯";
        a[43].name = "1080-archmage-antonidas";
        a[43].cost = 7;
        a[43].golden = 0;
        a[43].rarity = "legendary";
        a[43].imgUrl = R.drawable.hearthstone_791c2b97467755639dd9144206eb6a2db14b4561ede5d5012b43c4602c7c8e5d;
        a[43].type = "minion";
        a[43].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/791c2b97467755639dd9144206eb6a2db14b4561ede5d5012b43c4602c7c8e5d.png";

        a[44].cnName = "炎爆术";
        a[44].name = "1087-pyroblast";
        a[44].cost = 10;
        a[44].golden = 0;
        a[44].rarity = "epic";
        a[44].imgUrl = R.drawable.hearthstone_3a1565feed7f6e2ca542adf9531cee8fd1030bac5e8857ecd063e82c6aac2c74;
        a[44].type = "spell";
        a[44].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/3a1565feed7f6e2ca542adf9531cee8fd1030bac5e8857ecd063e82c6aac2c74.png";

        a[45].cnName = "小精灵";
        a[45].name = "179-wisp";
        a[45].cost = 0;
        a[45].golden = 0;
        a[45].rarity = "common";
        a[45].imgUrl = R.drawable.hearthstone_a5cdb3f3a26a6ada1f73cae383159c9a1a8f51505ccf22d227ec6befb13220f3;
        a[45].type = "minion";
        a[45].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/a5cdb3f3a26a6ada1f73cae383159c9a1a8f51505ccf22d227ec6befb13220f3.png";

        a[46].cnName = "奥秘守护者";
        a[46].name = "158-secretkeeper";
        a[46].cost = 1;
        a[46].golden = 0;
        a[46].rarity = "rare";
        a[46].imgUrl = R.drawable.hearthstone_c9474dca502b2d584de53219c497bedf6c333a0908f5c55a808246bb0bab8370;
        a[46].type = "minion";
        a[46].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/c9474dca502b2d584de53219c497bedf6c333a0908f5c55a808246bb0bab8370.png";

        a[47].cnName = "叫嚣的中士";
        a[47].name = "242-abusive-sergeant";
        a[47].cost = 1;
        a[47].golden = 0;
        a[47].rarity = "common";
        a[47].imgUrl = R.drawable.hearthstone_19323e64f22056e40256bc7c197d947f56ef25f254e858324ee026784249093b;
        a[47].type = "minion";
        a[47].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/19323e64f22056e40256bc7c197d947f56ef25f254e858324ee026784249093b.png";

        a[48].cnName = "鱼人杀手蟹";
        a[48].name = "443-hungry-crab";
        a[48].cost = 1;
        a[48].golden = 0;
        a[48].rarity = "epic";
        a[48].imgUrl = R.drawable.hearthstone_b25638118e9b6e051a38a0669fa316121eeb5c50f3411d5f3af12984aaefc944;
        a[48].type = "minion";
        a[48].race = "beast";
        a[48].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/b25638118e9b6e051a38a0669fa316121eeb5c50f3411d5f3af12984aaefc944.png";

        a[49].cnName = "鱼人招潮者";
        a[49].name = "475-murloc-tidecaller";
        a[49].cost = 1;
        a[49].golden = 0;
        a[49].rarity = "rare";
        a[49].imgUrl = R.drawable.hearthstone_beb1504df7e7411f870ec96362737608de6a8ee3b6e53da2504e456164afd99f;
        a[49].type = "minion";
        a[49].race = "murloc";
        a[49].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/beb1504df7e7411f870ec96362737608de6a8ee3b6e53da2504e456164afd99f.png";

        a[50].cnName = "幼龙鹰";
        a[50].name = "641-young-dragonhawk";
        a[50].cost = 1;
        a[50].golden = 0;
        a[50].rarity = "common";
        a[50].imgUrl = R.drawable.hearthstone_43cb67352c301c0a61d7c496fe0cf9ee021abd8b2625935ce93d82f8b7359fdc;
        a[50].type = "minion";
        a[50].race = "beast";
        a[50].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/43cb67352c301c0a61d7c496fe0cf9ee021abd8b2625935ce93d82f8b7359fdc.png";

        a[51].cnName = "麻风侏儒";
        a[51].name = "658-leper-gnome";
        a[51].cost = 1;
        a[51].golden = 0;
        a[51].rarity = "common";
        a[51].imgUrl = R.drawable.hearthstone_da227015a2afb477b5161b37dc4111d8a18dbc5582e3c7b2211a872d7928b0cb;
        a[51].type = "minion";
        a[51].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/da227015a2afb477b5161b37dc4111d8a18dbc5582e3c7b2211a872d7928b0cb.png";

        a[52].cnName = "南海船工";
        a[52].name = "724-southsea-deckhand";
        a[52].cost = 1;
        a[52].golden = 0;
        a[52].rarity = "common";
        a[52].imgUrl = R.drawable.hearthstone_790d911ec096ecaafd8cf35f939882c4318e64462aacaa887be2c5778d6d6e69;
        a[52].type = "minion";
        a[52].race = "pirate";
        a[52].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/790d911ec096ecaafd8cf35f939882c4318e64462aacaa887be2c5778d6d6e69.png";

        a[53].cnName = "银色侍从";
        a[53].name = "757-argent-squire";
        a[53].cost = 1;
        a[53].golden = 0;
        a[53].rarity = "common";
        a[53].imgUrl = R.drawable.hearthstone_c29a4e797ee5ebc6aa6e556c0c2cbca5c9d3de46e80964a9543c5f0e94e366a3;
        a[53].type = "minion";
        a[53].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/c29a4e797ee5ebc6aa6e556c0c2cbca5c9d3de46e80964a9543c5f0e94e366a3.png";

        a[54].cnName = "持盾卫士";
        a[54].name = "866-shieldbearer";
        a[54].cost = 1;
        a[54].golden = 0;
        a[54].rarity = "common";
        a[54].imgUrl = R.drawable.hearthstone_9fc67474da6a7a976bae68d8b4bc31a3c1143cf5546975adc6eabede7bf316b0;
        a[54].type = "minion";
        a[54].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/9fc67474da6a7a976bae68d8b4bc31a3c1143cf5546975adc6eabede7bf316b0.png";

        a[55].cnName = "狼人渗透者";
        a[55].name = "994-worgen-infiltrator";
        a[55].cost = 1;
        a[55].golden = 0;
        a[55].rarity = "common";
        a[55].imgUrl = R.drawable.hearthstone_b93fd52a2816da518b0c24ff4312f80bcba3d36e1b3f73d0f79d2c07a1134bc2;
        a[55].type = "minion";
        a[55].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/b93fd52a2816da518b0c24ff4312f80bcba3d36e1b3f73d0f79d2c07a1134bc2.png";

        a[56].cnName = "血帆海盗";
        a[56].name = "997-bloodsail-corsair";
        a[56].cost = 1;
        a[56].golden = 0;
        a[56].rarity = "rare";
        a[56].imgUrl = R.drawable.hearthstone_fc13ab632db9859cbc2ba64228e06ed577717f36c2ff17773b84ce9fc95dc9ae;
        a[56].type = "minion";
        a[56].race = "pirate";
        a[56].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/fc13ab632db9859cbc2ba64228e06ed577717f36c2ff17773b84ce9fc95dc9ae.png";

        a[57].cnName = "年轻的女祭司";
        a[57].name = "1634-young-priestess";
        a[57].cost = 1;
        a[57].golden = 0;
        a[57].rarity = "rare";
        a[57].imgUrl = R.drawable.hearthstone_7c4978bec97746517d760577408b62a559fe8f8b324726d6ebc3901814099c84;
        a[57].type = "minion";
        a[57].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/7c4978bec97746517d760577408b62a559fe8f8b324726d6ebc3901814099c84.png";

        a[58].cnName = "圣光护卫者";
        a[58].name = "1655-lightwarden";
        a[58].cost = 1;
        a[58].golden = 0;
        a[58].rarity = "rare";
        a[58].imgUrl = R.drawable.hearthstone_968d7bbf47d38e21f4ab9d88078efc80dc9cb51ab2e522cddb939fb6e959b768;
        a[58].type = "minion";
        a[58].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/968d7bbf47d38e21f4ab9d88078efc80dc9cb51ab2e522cddb939fb6e959b768.png";

        a[59].cnName = "愤怒的小鸡";
        a[59].name = "1688-angry-chicken";
        a[59].cost = 1;
        a[59].golden = 0;
        a[59].rarity = "rare";
        a[59].imgUrl = R.drawable.hearthstone_a90746d0ba2a7874469220c3251ae9aa70a4b49c49baca6cae0708914a2c77b4;
        a[59].type = "minion";
        a[59].race = "beast";
        a[59].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/a90746d0ba2a7874469220c3251ae9aa70a4b49c49baca6cae0708914a2c77b4.png";

        a[60].cnName = "魔瘾者";
        a[60].name = "12-mana-addict";
        a[60].cost = 2;
        a[60].golden = 0;
        a[60].rarity = "rare";
        a[60].imgUrl = R.drawable.hearthstone_a0b453f33316f9fe673f0aeff4447000b4eb2ca606de7a547b44ea8795e22136;
        a[60].type = "minion";
        a[60].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/a0b453f33316f9fe673f0aeff4447000b4eb2ca606de7a547b44ea8795e22136.png";

        a[61].cnName = "小个子召唤师";
        a[61].name = "37-pint-sized-summoner";
        a[61].cost = 2;
        a[61].golden = 0;
        a[61].rarity = "rare";
        a[61].imgUrl = R.drawable.hearthstone_d06fa371f1b2c7fc910cbd5b1c1cbc3a0b1d1cb727ccaff11ce4548689d14af3;
        a[61].type = "minion";
        a[61].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/d06fa371f1b2c7fc910cbd5b1c1cbc3a0b1d1cb727ccaff11ce4548689d14af3.png";

        a[62].cnName = "末日预言者";
        a[62].name = "138-doomsayer";
        a[62].cost = 2;
        a[62].golden = 0;
        a[62].rarity = "epic";
        a[62].imgUrl = R.drawable.hearthstone_c329ec5d6d3b9c6482b7bb0ad2a51e6c8e70485db1dfd0af5129a0bd452371cc;
        a[62].type = "minion";
        a[62].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/c329ec5d6d3b9c6482b7bb0ad2a51e6c8e70485db1dfd0af5129a0bd452371cc.png";

        a[63].cnName = "战利品贮藏者";
        a[63].name = "251-loot-hoarder";
        a[63].cost = 2;
        a[63].golden = 0;
        a[63].rarity = "common";
        a[63].imgUrl = R.drawable.hearthstone_8e5e6873f4d0a129135d94b7c85b6e107b63a0d9056760a030a8009e1a5b8ab0;
        a[63].type = "minion";
        a[63].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/8e5e6873f4d0a129135d94b7c85b6e107b63a0d9056760a030a8009e1a5b8ab0.png";

        a[64].cnName = "铸剑师";
        a[64].name = "351-master-swordsmith";
        a[64].cost = 2;
        a[64].golden = 0;
        a[64].rarity = "rare";
        a[64].imgUrl = R.drawable.hearthstone_6d46a431752e10ab13bb9d71291a3724e11f464a8cc11f5d8d554f2af1b7cd74;
        a[64].type = "minion";
        a[64].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/6d46a431752e10ab13bb9d71291a3724e11f464a8cc11f5d8d554f2af1b7cd74.png";

        a[65].cnName = "年轻的酒仙";
        a[65].name = "415-youthful-brewmaster";
        a[65].cost = 2;
        a[65].golden = 0;
        a[65].rarity = "common";
        a[65].imgUrl = R.drawable.hearthstone_08b17b8caf13a213dbd807d4c87d137f17b06dee47b5d85c26abdef35aa501db;
        a[65].type = "minion";
        a[65].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/08b17b8caf13a213dbd807d4c87d137f17b06dee47b5d85c26abdef35aa501db.png";

        a[66].cnName = "船长的鹦鹉";
        a[66].name = "530-captains-parrot";
        a[66].cost = 2;
        a[66].golden = 0;
        a[66].rarity = "epic";
        a[66].imgUrl = R.drawable.hearthstone_63472afffa5394ceff70ce95fa5339f4e95ac76cdde9abb8e6a1ce1d43debba5;
        a[66].type = "minion";
        a[66].race = "beast";
        a[66].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/63472afffa5394ceff70ce95fa5339f4e95ac76cdde9abb8e6a1ce1d43debba5.png";

        a[67].cnName = "上古看守者";
        a[67].name = "605-ancient-watcher";
        a[67].cost = 2;
        a[67].golden = 0;
        a[67].rarity = "rare";
        a[67].imgUrl = R.drawable.hearthstone_81b3f3779c711e38fa9caada2942884e86d84f3d52fa2285e99445bcf5f775f2;
        a[67].type = "minion";
        a[67].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/81b3f3779c711e38fa9caada2942884e86d84f3d52fa2285e99445bcf5f775f2.png";

        a[68].cnName = "精灵龙";
        a[68].name = "609-faerie-dragon";
        a[68].cost = 2;
        a[68].golden = 0;
        a[68].rarity = "common";
        a[68].imgUrl = R.drawable.hearthstone_aca3923df7ae503a24d697e853e91411994eff12b33fd476571646e3127541cd;
        a[68].type = "minion";
        a[68].race = "dragon";
        a[68].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/aca3923df7ae503a24d697e853e91411994eff12b33fd476571646e3127541cd.png";

        a[69].cnName = "法力怨魂";
        a[69].name = "715-mana-wraith";
        a[69].cost = 2;
        a[69].golden = 0;
        a[69].rarity = "rare";
        a[69].imgUrl = R.drawable.hearthstone_26988cc5be5521edd568fa07d3c1696bda1bda8089f2c3d61fa852f88323d942;
        a[69].type = "minion";
        a[69].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/26988cc5be5521edd568fa07d3c1696bda1bda8089f2c3d61fa852f88323d942.png";

        a[70].cnName = "血法师萨尔诺斯";
        a[70].name = "749-bloodmage-thalnos";
        a[70].cost = 2;
        a[70].golden = 0;
        a[70].rarity = "legendary";
        a[70].imgUrl = R.drawable.hearthstone_12a6a1bc7a79563cc227680a6e1291da05f97617abc58074815fa92d6af3eb66;
        a[70].type = "minion";
        a[70].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/12a6a1bc7a79563cc227680a6e1291da05f97617abc58074815fa92d6af3eb66.png";

        a[71].cnName = "疯狂投弹者";
        a[71].name = "762-mad-bomber";
        a[71].cost = 2;
        a[71].golden = 0;
        a[71].rarity = "common";
        a[71].imgUrl = R.drawable.hearthstone_6fb67c342764ff9aa9fa574e2b843470ef4550c2bff663995e6da09c9ab457d3;
        a[71].type = "minion";
        a[71].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/6fb67c342764ff9aa9fa574e2b843470ef4550c2bff663995e6da09c9ab457d3.png";

        a[72].cnName = "阿曼尼狂战士";
        a[72].name = "790-amani-berserker";
        a[72].cost = 2;
        a[72].golden = 0;
        a[72].rarity = "common";
        a[72].imgUrl = R.drawable.hearthstone_4b420ae21019b2ecea1c3b5405705c65bd0a55f5abe19bee2f2345ca9bc85efa;
        a[72].type = "minion";
        a[72].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/4b420ae21019b2ecea1c3b5405705c65bd0a55f5abe19bee2f2345ca9bc85efa.png";

        a[73].cnName = "疯狂的炼金师";
        a[73].name = "801-crazed-alchemist";
        a[73].cost = 2;
        a[73].golden = 0;
        a[73].rarity = "rare";
        a[73].imgUrl = R.drawable.hearthstone_1d12bea1573dcf022fecbcbff23b424fec0f20a7b10b0a0643dac8f4c8b20c2b;
        a[73].type = "minion";
        a[73].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/1d12bea1573dcf022fecbcbff23b424fec0f20a7b10b0a0643dac8f4c8b20c2b.png";

        a[74].cnName = "米尔豪斯·法力风暴";
        a[74].name = "855-millhouse-manastorm";
        a[74].cost = 2;
        a[74].golden = 0;
        a[74].rarity = "legendary";
        a[74].imgUrl = R.drawable.hearthstone_189220940fc52dad7ce8e544e040776921cf6fee7ded125f759e0460dd7fc679;
        a[74].type = "minion";
        a[74].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/189220940fc52dad7ce8e544e040776921cf6fee7ded125f759e0460dd7fc679.png";

        a[75].cnName = "日怒保卫者";
        a[75].name = "891-sunfury-protector";
        a[75].cost = 2;
        a[75].golden = 0;
        a[75].rarity = "rare";
        a[75].imgUrl = R.drawable.hearthstone_d158d5734e1d4d762702c1d734137d0b08b17c6c632d541494c61747f21bdad4;
        a[75].type = "minion";
        a[75].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/d158d5734e1d4d762702c1d734137d0b08b17c6c632d541494c61747f21bdad4.png";

        a[76].cnName = "恐狼前锋";
        a[76].name = "985-dire-wolf-alpha";
        a[76].cost = 2;
        a[76].golden = 0;
        a[76].rarity = "common";
        a[76].imgUrl = R.drawable.hearthstone_218f87f8a2303e8e7416968a101016f2d25e3562d2b53be5913f05fb81f98870;
        a[76].type = "minion";
        a[76].race = "beast";
        a[76].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/218f87f8a2303e8e7416968a101016f2d25e3562d2b53be5913f05fb81f98870.png";

        a[77].cnName = "血帆袭击者";
        a[77].name = "999-bloodsail-raider";
        a[77].cost = 2;
        a[77].golden = 0;
        a[77].rarity = "common";
        a[77].imgUrl = R.drawable.hearthstone_544ff6a038531f150491f0f5ec224aa562c9896bf5ec917c1eea7bc500408c95;
        a[77].type = "minion";
        a[77].race = "pirate";
        a[77].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/544ff6a038531f150491f0f5ec224aa562c9896bf5ec917c1eea7bc500408c95.png";

        a[78].cnName = "狂野炎术师";
        a[78].name = "1014-wild-pyromancer";
        a[78].cost = 2;
        a[78].golden = 0;
        a[78].rarity = "rare";
        a[78].imgUrl = R.drawable.hearthstone_e7ba57283bdfb664b6a5237f56978a39d130df39e55799f6056ccbe5be027ab3;
        a[78].type = "minion";
        a[78].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/e7ba57283bdfb664b6a5237f56978a39d130df39e55799f6056ccbe5be027ab3.png";

        a[79].cnName = "飞刀杂耍者";
        a[79].name = "1073-knife-juggler";
        a[79].cost = 2;
        a[79].golden = 0;
        a[79].rarity = "rare";
        a[79].imgUrl = R.drawable.hearthstone_547b4a74dd2b6e674c1f06f26a474bddaf34d74087bb5e375f2a12baefa28dda;
        a[79].type = "minion";
        a[79].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/547b4a74dd2b6e674c1f06f26a474bddaf34d74087bb5e375f2a12baefa28dda.png";

        a[80].cnName = "游学者周卓";
        a[80].name = "1135-lorewalker-cho";
        a[80].cost = 2;
        a[80].golden = 0;
        a[80].rarity = "legendary";
        a[80].imgUrl = R.drawable.hearthstone_0ce3c861561fb9a783f7f23650f4c4abbb2c2388190f875d2281760964a8ab45;
        a[80].type = "minion";
        a[80].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/0ce3c861561fb9a783f7f23650f4c4abbb2c2388190f875d2281760964a8ab45.png";

        a[81].cnName = "纳特·帕格";
        a[81].name = "1147-nat-pagle";
        a[81].cost = 2;
        a[81].golden = 0;
        a[81].rarity = "legendary";
        a[81].imgUrl = R.drawable.hearthstone_dd72a3fd38a4711193d81900471690b8ace66e6fc5359a74cc6e80a456d67ff2;
        a[81].type = "minion";
        a[81].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/dd72a3fd38a4711193d81900471690b8ace66e6fc5359a74cc6e80a456d67ff2.png";

        a[82].cnName = "牛头人战士";
        a[82].name = "45-tauren-warrior";
        a[82].cost = 3;
        a[82].golden = 0;
        a[82].rarity = "common";
        a[82].imgUrl = R.drawable.hearthstone_e19321e0345c40b4a78ef780a3fb81e500a5f304fc04e55578c5053d2a046d6a;
        a[82].type = "minion";
        a[82].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/e19321e0345c40b4a78ef780a3fb81e500a5f304fc04e55578c5053d2a046d6a.png";

        a[83].cnName = "铁喙猫头鹰";
        a[83].name = "290-ironbeak-owl";
        a[83].cost = 3;
        a[83].golden = 0;
        a[83].rarity = "common";
        a[83].imgUrl = R.drawable.hearthstone_20df8de74590955435fcba1f2b6aa499bb6c57fbcf084cd26ad781489f0a08ea;
        a[83].type = "minion";
        a[83].race = "beast";
        a[83].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/20df8de74590955435fcba1f2b6aa499bb6c57fbcf084cd26ad781489f0a08ea.png";

        a[84].cnName = "腐肉食尸鬼";
        a[84].name = "397-flesheating-ghoul";
        a[84].cost = 3;
        a[84].golden = 0;
        a[84].rarity = "common";
        a[84].imgUrl = R.drawable.hearthstone_c3a2d5b642d7f7d0b4f9c6bca1e149a3ee58e54fe8129d9ea7053f9ce323cd86;
        a[84].type = "minion";
        a[84].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/c3a2d5b642d7f7d0b4f9c6bca1e149a3ee58e54fe8129d9ea7053f9ce323cd86.png";

        a[85].cnName = "寒光先知";
        a[85].name = "453-coldlight-seer";
        a[85].cost = 3;
        a[85].golden = 0;
        a[85].rarity = "rare";
        a[85].imgUrl = R.drawable.hearthstone_d295968f463ae24d0cb6e50614e74b801f9c57f0f3c667d74fec0c98266dbb31;
        a[85].type = "minion";
        a[85].race = "murloc";
        a[85].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/d295968f463ae24d0cb6e50614e74b801f9c57f0f3c667d74fec0c98266dbb31.png";

        a[86].cnName = "奥术傀儡";
        a[86].name = "466-arcane-golem";
        a[86].cost = 3;
        a[86].golden = 0;
        a[86].rarity = "rare";
        a[86].imgUrl = R.drawable.hearthstone_7e4b3f016490c6df70075fa314fa6a20abfe61dca468d502d69381081211695c;
        a[86].type = "minion";
        a[86].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/7e4b3f016490c6df70075fa314fa6a20abfe61dca468d502d69381081211695c.png";

        a[87].cnName = "工匠大师欧沃斯巴克";
        a[87].name = "570-tinkmaster-overspark";
        a[87].cost = 3;
        a[87].golden = 0;
        a[87].rarity = "legendary";
        a[87].imgUrl = R.drawable.hearthstone_30e9f5a629feed7345b2f2e68757df4c43cb7877172519ece21c98a748cfc111;
        a[87].type = "minion";
        a[87].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/30e9f5a629feed7345b2f2e68757df4c43cb7877172519ece21c98a748cfc111.png";

        a[88].cnName = "血色十字军战士";
        a[88].name = "642-scarlet-crusader";
        a[88].cost = 3;
        a[88].golden = 0;
        a[88].rarity = "common";
        a[88].imgUrl = R.drawable.hearthstone_379984fc4393fb6058f8cc8562aae96029399a39268d532dad3d4faadd3bf95c;
        a[88].type = "minion";
        a[88].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/379984fc4393fb6058f8cc8562aae96029399a39268d532dad3d4faadd3bf95c.png";

        a[89].cnName = "南海船长";
        a[89].name = "680-southsea-captain";
        a[89].cost = 3;
        a[89].golden = 0;
        a[89].rarity = "epic";
        a[89].imgUrl = R.drawable.hearthstone_febfabd1394671e71b071ea66848551daf28db04a0514e3aae9ffef996ab2400;
        a[89].type = "minion";
        a[89].race = "pirate";
        a[89].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/febfabd1394671e71b071ea66848551daf28db04a0514e3aae9ffef996ab2400.png";

        a[90].cnName = "精神控制技师";
        a[90].name = "734-mind-control-tech";
        a[90].cost = 3;
        a[90].golden = 0;
        a[90].rarity = "rare";
        a[90].imgUrl = R.drawable.hearthstone_089b719035eb14bd0ebe3b9f6dbcb6224147a67f2cd741506ac10f97bf2a9802;
        a[90].type = "minion";
        a[90].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/089b719035eb14bd0ebe3b9f6dbcb6224147a67f2cd741506ac10f97bf2a9802.png";

        a[91].cnName = "血骑士";
        a[91].name = "755-blood-knight";
        a[91].cost = 3;
        a[91].golden = 0;
        a[91].rarity = "epic";
        a[91].imgUrl = R.drawable.hearthstone_fe30c0288278a0a0deca7a6aa1019f6b51c69f70f4d248daaf5737b136e76136;
        a[91].type = "minion";
        a[91].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/fe30c0288278a0a0deca7a6aa1019f6b51c69f70f4d248daaf5737b136e76136.png";

        a[92].cnName = "萨尔玛先知";
        a[92].name = "765-thrallmar-farseer";
        a[92].cost = 3;
        a[92].golden = 0;
        a[92].rarity = "common";
        a[92].imgUrl = R.drawable.hearthstone_ce32f2eaafb3f964168f65820eb958879368e1934c8caf73ccedf7c008aa9732;
        a[92].type = "minion";
        a[92].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/ce32f2eaafb3f964168f65820eb958879368e1934c8caf73ccedf7c008aa9732.png";

        a[93].cnName = "麦田傀儡";
        a[93].name = "778-harvest-golem";
        a[93].cost = 3;
        a[93].golden = 0;
        a[93].rarity = "common";
        a[93].imgUrl = R.drawable.hearthstone_fb10b1c5a02a7759c914d5c20348d8880c28b38d6afc998dc02a1b77825be1c1;
        a[93].type = "minion";
        a[93].race = "mech";
        a[93].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/fb10b1c5a02a7759c914d5c20348d8880c28b38d6afc998dc02a1b77825be1c1.png";

        a[94].cnName = "任务达人";
        a[94].name = "791-questing-adventurer";
        a[94].cost = 3;
        a[94].golden = 0;
        a[94].rarity = "rare";
        a[94].imgUrl = R.drawable.hearthstone_813f37fa20f97549c66dd37ef59096e336395fc2350cffb7ff7064d209dc50ee;
        a[94].type = "minion";
        a[94].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/813f37fa20f97549c66dd37ef59096e336395fc2350cffb7ff7064d209dc50ee.png";

        a[95].cnName = "丛林猎豹";
        a[95].name = "921-jungle-panther";
        a[95].cost = 3;
        a[95].golden = 0;
        a[95].rarity = "common";
        a[95].imgUrl = R.drawable.hearthstone_eb86a9a02aa3f7e963c8386c1de68e038764ddf4517cfeb7395ff5fffb14ec0e;
        a[95].type = "minion";
        a[95].race = "beast";
        a[95].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/eb86a9a02aa3f7e963c8386c1de68e038764ddf4517cfeb7395ff5fffb14ec0e.png";

        a[96].cnName = "小鬼召唤师";
        a[96].name = "926-imp-master";
        a[96].cost = 3;
        a[96].golden = 0;
        a[96].rarity = "rare";
        a[96].imgUrl = R.drawable.hearthstone_d37e4e9b40ee37cbd5d9a41d79f071b92294127eb68fd26a6bb1b56a58783e6d;
        a[96].type = "minion";
        a[96].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/d37e4e9b40ee37cbd5d9a41d79f071b92294127eb68fd26a6bb1b56a58783e6d.png";

        a[97].cnName = "攻城车";
        a[97].name = "979-demolisher";
        a[97].cost = 3;
        a[97].golden = 0;
        a[97].rarity = "rare";
        a[97].imgUrl = R.drawable.hearthstone_23ee9c3630210f4510fa74b733e30681d19c1a46b20cb587dba02f29c5d37a2a;
        a[97].type = "minion";
        a[97].race = "mech";
        a[97].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/23ee9c3630210f4510fa74b733e30681d19c1a46b20cb587dba02f29c5d37a2a.png";

        a[98].cnName = "寒光智者";
        a[98].name = "1016-coldlight-oracle";
        a[98].cost = 3;
        a[98].golden = 0;
        a[98].rarity = "rare";
        a[98].imgUrl = R.drawable.hearthstone_65522be2df87fb95f5625f7ec321b111510490ca8984da9981c1be39a94e71b8;
        a[98].type = "minion";
        a[98].race = "murloc";
        a[98].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/65522be2df87fb95f5625f7ec321b111510490ca8984da9981c1be39a94e71b8.png";

        a[99].cnName = "鱼人领军";
        a[99].name = "1063-murloc-warleader";
        a[99].cost = 3;
        a[99].golden = 0;
        a[99].rarity = "epic";
        a[99].imgUrl = R.drawable.hearthstone_f33dccc8a8214cb892e90766db7d0206d554b4dd4edb316d8308c291bd03f3ee;
        a[99].type = "minion";
        a[99].race = "murloc";
        a[99].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/f33dccc8a8214cb892e90766db7d0206d554b4dd4edb316d8308c291bd03f3ee.png";

        a[100].cnName = "帝王眼镜蛇";
        a[100].name = "1098-emperor-cobra";
        a[100].cost = 3;
        a[100].golden = 0;
        a[100].rarity = "rare";
        a[100].imgUrl = R.drawable.hearthstone_255abe2b48456de586085765acbb8ac1cbeddf9d04af1ec7b11d05c15fb7303b;
        a[100].type = "minion";
        a[100].race = "beast";
        a[100].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/255abe2b48456de586085765acbb8ac1cbeddf9d04af1ec7b11d05c15fb7303b.png";

        a[101].cnName = "负伤剑圣";
        a[101].name = "1109-injured-blademaster";
        a[101].cost = 3;
        a[101].golden = 0;
        a[101].rarity = "rare";
        a[101].imgUrl = R.drawable.hearthstone_9415e923d01182f52899d50e78a6971efbd829b4ca64a07494d918af44651edd;
        a[101].type = "minion";
        a[101].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/9415e923d01182f52899d50e78a6971efbd829b4ca64a07494d918af44651edd.png";

        a[102].cnName = "暴怒的狼人";
        a[102].name = "1155-raging-worgen";
        a[102].cost = 3;
        a[102].golden = 0;
        a[102].rarity = "common";
        a[102].imgUrl = R.drawable.hearthstone_f6a3eebc3ad3d952c0f15893f9cc70897163bfe9c14ced263aec603169bc0ced;
        a[102].type = "minion";
        a[102].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/f6a3eebc3ad3d952c0f15893f9cc70897163bfe9c14ced263aec603169bc0ced.png";

        a[103].cnName = "大地之环先知";
        a[103].name = "1651-earthen-ring-farseer";
        a[103].cost = 3;
        a[103].golden = 0;
        a[103].rarity = "common";
        a[103].imgUrl = R.drawable.hearthstone_62a129fa0eb50c851783813263b957664262f8b729da8fbb313282d184f881f6;
        a[103].type = "minion";
        a[103].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/62a129fa0eb50c851783813263b957664262f8b729da8fbb313282d184f881f6.png";

        a[104].cnName = "报警机器人";
        a[104].name = "1658-alarm-o-bot";
        a[104].cost = 3;
        a[104].golden = 0;
        a[104].rarity = "rare";
        a[104].imgUrl = R.drawable.hearthstone_a6c418ef7caa082cf7833138a23dd3063b0e81c1217ec081bf1ae8e648bdcb2d;
        a[104].type = "minion";
        a[104].race = "mech";
        a[104].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/a6c418ef7caa082cf7833138a23dd3063b0e81c1217ec081bf1ae8e648bdcb2d.png";

        a[105].cnName = "苦痛侍僧";
        a[105].name = "1659-acolyte-of-pain";
        a[105].cost = 3;
        a[105].golden = 0;
        a[105].rarity = "common";
        a[105].imgUrl = R.drawable.hearthstone_f931e97df8b6679fcdeb9a6a5cd714d269980042b0d489b2aefd251a09a44b98;
        a[105].type = "minion";
        a[105].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/f931e97df8b6679fcdeb9a6a5cd714d269980042b0d489b2aefd251a09a44b98.png";

        a[106].cnName = "穆克拉";
        a[106].name = "1693-king-mukla";
        a[106].cost = 3;
        a[106].golden = 0;
        a[106].rarity = "legendary";
        a[106].imgUrl = R.drawable.hearthstone_746e55bbe87770df63eedef4b4eda150099304d622c0e47a83fa59c55d880fe6;
        a[106].type = "minion";
        a[106].race = "beast";
        a[106].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/746e55bbe87770df63eedef4b4eda150099304d622c0e47a83fa59c55d880fe6.png";

        a[107].cnName = "银月城卫兵";
        a[107].name = "34-silvermoon-guardian";
        a[107].cost = 4;
        a[107].golden = 0;
        a[107].rarity = "common";
        a[107].imgUrl = R.drawable.hearthstone_842f51d4b70ec7a75a67aeeaec0fc62644873106266d8b0824e1cfbcee05c7e9;
        a[107].type = "minion";
        a[107].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/842f51d4b70ec7a75a67aeeaec0fc62644873106266d8b0824e1cfbcee05c7e9.png";

        a[108].cnName = "年迈的酒仙";
        a[108].name = "186-ancient-brewmaster";
        a[108].cost = 4;
        a[108].golden = 0;
        a[108].rarity = "common";
        a[108].imgUrl = R.drawable.hearthstone_0ae7c90397062dbe4af7d617edd65254a0ad62695bb605b3b0528fee4cef392e;
        a[108].type = "minion";
        a[108].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/0ae7c90397062dbe4af7d617edd65254a0ad62695bb605b3b0528fee4cef392e.png";

        a[109].cnName = "黑铁矮人";
        a[109].name = "348-dark-iron-dwarf";
        a[109].cost = 4;
        a[109].golden = 0;
        a[109].rarity = "common";
        a[109].imgUrl = R.drawable.hearthstone_f1f0777471ac55cd6ead414c2cae468f811d0aac6e80e15bc9a021c6154cba8a;
        a[109].type = "minion";
        a[109].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/f1f0777471ac55cd6ead414c2cae468f811d0aac6e80e15bc9a021c6154cba8a.png";

        a[110].cnName = "魔古山守望者";
        a[110].name = "700-mogushan-warden";
        a[110].cost = 4;
        a[110].golden = 0;
        a[110].rarity = "common";
        a[110].imgUrl = R.drawable.hearthstone_fde7cea4f91924a231ccf09f29d7684d24beddf81c23b8a1a3b9a8d5f4846e5a;
        a[110].type = "minion";
        a[110].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/fde7cea4f91924a231ccf09f29d7684d24beddf81c23b8a1a3b9a8d5f4846e5a.png";

        a[111].cnName = "老瞎眼";
        a[111].name = "736-old-murk-eye";
        a[111].cost = 4;
        a[111].golden = 0;
        a[111].rarity = "legendary";
        a[111].imgUrl = R.drawable.hearthstone_f230d08d09fd3dcceac460259bb5b311ab86d3ce836e619ea6c31552ecbe1bf8;
        a[111].type = "minion";
        a[111].race = "murloc";
        a[111].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/f230d08d09fd3dcceac460259bb5b311ab86d3ce836e619ea6c31552ecbe1bf8.png";

        a[112].cnName = "破法者";
        a[112].name = "754-spellbreaker";
        a[112].cost = 4;
        a[112].golden = 0;
        a[112].rarity = "common";
        a[112].imgUrl = R.drawable.hearthstone_afc8bcdd727090e3eace186a77c21479d1ffb08e24fe21fca01afa13e60d029f;
        a[112].type = "minion";
        a[112].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/afc8bcdd727090e3eace186a77c21479d1ffb08e24fe21fca01afa13e60d029f.png";

        a[113].cnName = "阿古斯防御者";
        a[113].name = "763-defender-of-argus";
        a[113].cost = 4;
        a[113].golden = 0;
        a[113].rarity = "rare";
        a[113].imgUrl = R.drawable.hearthstone_d7e8d7f78c1ca48335288ea4a533b95e0a4e0c08b065a999088f1437434b621a;
        a[113].type = "minion";
        a[113].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/d7e8d7f78c1ca48335288ea4a533b95e0a4e0c08b065a999088f1437434b621a.png";

        a[114].cnName = "诅咒教派领袖";
        a[114].name = "811-cult-master";
        a[114].cost = 4;
        a[114].golden = 0;
        a[114].rarity = "common";
        a[114].imgUrl = R.drawable.hearthstone_679a120853d4ff489cfb09e36a2737895569d1e8a1b66bab7f4d0f7ecb9f9550;
        a[114].type = "minion";
        a[114].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/679a120853d4ff489cfb09e36a2737895569d1e8a1b66bab7f4d0f7ecb9f9550.png";

        a[115].cnName = "恐怖海盗";
        a[115].name = "878-dread-corsair";
        a[115].cost = 4;
        a[115].golden = 0;
        a[115].rarity = "common";
        a[115].imgUrl = R.drawable.hearthstone_b8643616e495aaf78f6d655dbb9ec78e10ad17e4d15d849ef11bb58c18f4bca8;
        a[115].type = "minion";
        a[115].race = "pirate";
        a[115].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/b8643616e495aaf78f6d655dbb9ec78e10ad17e4d15d849ef11bb58c18f4bca8.png";

        a[116].cnName = "年迈的法师";
        a[116].name = "915-ancient-mage";
        a[116].cost = 4;
        a[116].golden = 0;
        a[116].rarity = "rare";
        a[116].imgUrl = R.drawable.hearthstone_73896155fd971850161ce280d7eb627ac93c563b5e3dcfccb386c48ffe841e48;
        a[116].type = "minion";
        a[116].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/73896155fd971850161ce280d7eb627ac93c563b5e3dcfccb386c48ffe841e48.png";

        a[117].cnName = "紫罗兰教师";
        a[117].name = "1029-violet-teacher";
        a[117].cost = 4;
        a[117].golden = 0;
        a[117].rarity = "rare";
        a[117].imgUrl = R.drawable.hearthstone_89d67b7119f7d8d59cfb320a27091727610c843f6d7c69df6bd361fbea381ecb;
        a[117].type = "minion";
        a[117].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/89d67b7119f7d8d59cfb320a27091727610c843f6d7c69df6bd361fbea381ecb.png";

        a[118].cnName = "暮光幼龙";
        a[118].name = "1037-twilight-drake";
        a[118].cost = 4;
        a[118].golden = 0;
        a[118].rarity = "rare";
        a[118].imgUrl = R.drawable.hearthstone_692740402b83ac5b29b09f66b60aee33baa172e6ca49558551cdf092e1974529;
        a[118].type = "minion";
        a[118].race = "dragon";
        a[118].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/692740402b83ac5b29b09f66b60aee33baa172e6ca49558551cdf092e1974529.png";

        a[119].cnName = "恶毒铁匠";
        a[119].name = "61-spiteful-smith";
        a[119].cost = 5;
        a[119].golden = 0;
        a[119].rarity = "common";
        a[119].imgUrl = R.drawable.hearthstone_0b02404f95c47a3048f4d169e4dec2691c34bcbeaa30d4d675f21ecda4abcec3;
        a[119].type = "minion";
        a[119].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/0b02404f95c47a3048f4d169e4dec2691c34bcbeaa30d4d675f21ecda4abcec3.png";

        a[120].cnName = "荆棘谷猛虎";
        a[120].name = "68-stranglethorn-tiger";
        a[120].cost = 5;
        a[120].golden = 0;
        a[120].rarity = "common";
        a[120].imgUrl = R.drawable.hearthstone_a5047f4522e9da2ced0d997f8de86efcdc5f01885e3b787f79d882518c020c11;
        a[120].type = "minion";
        a[120].race = "beast";
        a[120].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/a5047f4522e9da2ced0d997f8de86efcdc5f01885e3b787f79d882518c020c11.png";

        a[121].cnName = "白银之手骑士";
        a[121].name = "69-silver-hand-knight";
        a[121].cost = 5;
        a[121].golden = 0;
        a[121].rarity = "common";
        a[121].imgUrl = R.drawable.hearthstone_74a4afcf422532ac31cb87d3a7c6ef432e21f6dce1f330dfd99e2d06a5bdeaa7;
        a[121].type = "minion";
        a[121].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/74a4afcf422532ac31cb87d3a7c6ef432e21f6dce1f330dfd99e2d06a5bdeaa7.png";

        a[122].cnName = "憎恶";
        a[122].name = "440-abomination";
        a[122].cost = 5;
        a[122].golden = 0;
        a[122].rarity = "rare";
        a[122].imgUrl = R.drawable.hearthstone_d52d37c2794216ea3f5a4321d1a53079d276aa734e8c58713a2fd52a2a8c3f05;
        a[122].type = "minion";
        a[122].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/d52d37c2794216ea3f5a4321d1a53079d276aa734e8c58713a2fd52a2a8c3f05.png";

        a[123].cnName = "绿皮船长";
        a[123].name = "456-captain-greenskin";
        a[123].cost = 5;
        a[123].golden = 0;
        a[123].rarity = "legendary";
        a[123].imgUrl = R.drawable.hearthstone_1110855f3ad74b7db96392b22a243bfdb9426dbd98855ed083c1bd4ee81953ba;
        a[123].type = "minion";
        a[123].race = "pirate";
        a[123].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/1110855f3ad74b7db96392b22a243bfdb9426dbd98855ed083c1bd4ee81953ba.png";

        a[124].cnName = "无面操纵者";
        a[124].name = "531-faceless-manipulator";
        a[124].cost = 5;
        a[124].golden = 0;
        a[124].rarity = "epic";
        a[124].imgUrl = R.drawable.hearthstone_349b495665a8deadd313025494fe82f9148db0d6da07ac3761c8beb2e6c64eed;
        a[124].type = "minion";
        a[124].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/349b495665a8deadd313025494fe82f9148db0d6da07ac3761c8beb2e6c64eed.png";

        a[125].cnName = "火车王里诺艾";
        a[125].name = "559-leeroy-jenkins";
        a[125].cost = 5;
        a[125].golden = 0;
        a[125].rarity = "legendary";
        a[125].imgUrl = R.drawable.hearthstone_0fb361b371c85e92b7e05c5394caec7e68de3102168dfd5655f2616f62b46f2f;
        a[125].type = "minion";
        a[125].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/0fb361b371c85e92b7e05c5394caec7e68de3102168dfd5655f2616f62b46f2f.png";

        a[126].cnName = "沼泽爬行者";
        a[126].name = "602-fen-creeper";
        a[126].cost = 5;
        a[126].golden = 0;
        a[126].rarity = "common";
        a[126].imgUrl = R.drawable.hearthstone_7eb213133a4656ef2c25f55bd19212c4ba9bd736b5ac0af32448751be691e97d;
        a[126].type = "minion";
        a[126].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/7eb213133a4656ef2c25f55bd19212c4ba9bd736b5ac0af32448751be691e97d.png";

        a[127].cnName = "碧蓝幼龙";
        a[127].name = "825-azure-drake";
        a[127].cost = 5;
        a[127].golden = 0;
        a[127].rarity = "rare";
        a[127].imgUrl = R.drawable.hearthstone_25bc568a288e6e7df194fd182f6ca78162f491760a11a08b71b0343cef86ed65;
        a[127].type = "minion";
        a[127].race = "dragon";
        a[127].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/25bc568a288e6e7df194fd182f6ca78162f491760a11a08b71b0343cef86ed65.png";

        a[128].cnName = "哈里森·琼斯";
        a[128].name = "912-harrison-jones";
        a[128].cost = 5;
        a[128].golden = 0;
        a[128].rarity = "legendary";
        a[128].imgUrl = R.drawable.hearthstone_9cce60f358ca65be3c2fff30825d27895eceff117b5580da811a72158a22f390;
        a[128].type = "minion";
        a[128].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/9cce60f358ca65be3c2fff30825d27895eceff117b5580da811a72158a22f390.png";

        a[129].cnName = "风险投资公司雇佣兵";
        a[129].name = "1122-venture-co-mercenary";
        a[129].cost = 5;
        a[129].golden = 0;
        a[129].rarity = "common";
        a[129].imgUrl = R.drawable.hearthstone_81ed6054dc2bc738f564f870e633946bf32899a77e671721716e7fbf78bc74d2;
        a[129].type = "minion";
        a[129].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/81ed6054dc2bc738f564f870e633946bf32899a77e671721716e7fbf78bc74d2.png";

        a[130].cnName = "狂奔科多兽";
        a[130].name = "1371-stampeding-kodo";
        a[130].cost = 5;
        a[130].golden = 0;
        a[130].rarity = "rare";
        a[130].imgUrl = R.drawable.hearthstone_559c798d3ed214debf21c60402bbcbdf1469428a59470ae709c8d2bb2ce9764e;
        a[130].type = "minion";
        a[130].race = "beast";
        a[130].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/559c798d3ed214debf21c60402bbcbdf1469428a59470ae709c8d2bb2ce9764e.png";

        a[131].cnName = "王牌猎人";
        a[131].name = "1657-big-game-hunter";
        a[131].cost = 5;
        a[131].golden = 0;
        a[131].rarity = "epic";
        a[131].imgUrl = R.drawable.hearthstone_0b9d89de6ccefa98d6057bdc4b10505ee5d76c5605bca3e260d57b51bdb9219a;
        a[131].type = "minion";
        a[131].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/0b9d89de6ccefa98d6057bdc4b10505ee5d76c5605bca3e260d57b51bdb9219a.png";

        a[132].cnName = "银色指挥官";
        a[132].name = "281-argent-commander";
        a[132].cost = 6;
        a[132].golden = 0;
        a[132].rarity = "rare";
        a[132].imgUrl = R.drawable.hearthstone_240a07761a7373b932efd507a7d5dfdb8b7715d5699adb0f4fed1801e7202d93;
        a[132].type = "minion";
        a[132].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/240a07761a7373b932efd507a7d5dfdb8b7715d5699adb0f4fed1801e7202d93.png";

        a[133].cnName = "凯恩·血蹄";
        a[133].name = "420-cairne-bloodhoof";
        a[133].cost = 6;
        a[133].golden = 0;
        a[133].rarity = "legendary";
        a[133].imgUrl = R.drawable.hearthstone_96d5dd47138e15d6444eef8380c77f31df3ff5f3d627749cae2eecf09a1676c7;
        a[133].type = "minion";
        a[133].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/96d5dd47138e15d6444eef8380c77f31df3ff5f3d627749cae2eecf09a1676c7.png";

        a[134].cnName = "艾露恩的女祭司";
        a[134].name = "424-priestess-of-elune";
        a[134].cost = 6;
        a[134].golden = 0;
        a[134].rarity = "common";
        a[134].imgUrl = R.drawable.hearthstone_d8107e66d636a32280d0ab55cac00866b371faeffd1b74ea11546ce229c07072;
        a[134].type = "minion";
        a[134].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/d8107e66d636a32280d0ab55cac00866b371faeffd1b74ea11546ce229c07072.png";

        a[135].cnName = "冰霜元素";
        a[135].name = "512-frost-elemental";
        a[135].cost = 6;
        a[135].golden = 0;
        a[135].rarity = "common";
        a[135].imgUrl = R.drawable.hearthstone_0e6fde2e7123e5d039ba93c49812562be2c42fe890dbf2cffacc16d0442ed96f;
        a[135].type = "minion";
        a[135].race = "elemental";
        a[135].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/0e6fde2e7123e5d039ba93c49812562be2c42fe890dbf2cffacc16d0442ed96f.png";

        a[136].cnName = "伊利丹·怒风";
        a[136].name = "556-illidan-stormrage";
        a[136].cost = 6;
        a[136].golden = 0;
        a[136].rarity = "legendary";
        a[136].imgUrl = R.drawable.hearthstone_6c3ebd44586a5729c3c9a5200b1f9f50dcf545e6942b18e043eb9ca6e65d2208;
        a[136].type = "minion";
        a[136].race = "demon";
        a[136].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/6c3ebd44586a5729c3c9a5200b1f9f50dcf545e6942b18e043eb9ca6e65d2208.png";

        a[137].cnName = "风怒鹰身人";
        a[137].name = "567-windfury-harpy";
        a[137].cost = 6;
        a[137].golden = 0;
        a[137].rarity = "common";
        a[137].imgUrl = R.drawable.hearthstone_9f00dfba44008d4ade67c2fbf0812c9717e5dceba95ea5f1e4a8a0c60fc65c3e;
        a[137].type = "minion";
        a[137].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/9f00dfba44008d4ade67c2fbf0812c9717e5dceba95ea5f1e4a8a0c60fc65c3e.png";

        a[138].cnName = "霍格";
        a[138].name = "640-hogger";
        a[138].cost = 6;
        a[138].golden = 0;
        a[138].rarity = "legendary";
        a[138].imgUrl = R.drawable.hearthstone_2e262afb2db17c32d236cfeaa0fd74dee65f97aba57804ee827cf5f5ddaa59c9;
        a[138].type = "minion";
        a[138].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/2e262afb2db17c32d236cfeaa0fd74dee65f97aba57804ee827cf5f5ddaa59c9.png";

        a[139].cnName = "烈日行者";
        a[139].name = "759-sunwalker";
        a[139].cost = 6;
        a[139].golden = 0;
        a[139].rarity = "rare";
        a[139].imgUrl = R.drawable.hearthstone_e41fabb3149c7e4c1831f97604b8d778ea582fc00cb647c378a3ec17c673ec76;
        a[139].type = "minion";
        a[139].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/e41fabb3149c7e4c1831f97604b8d778ea582fc00cb647c378a3ec17c673ec76.png";

        a[140].cnName = "格尔宾·梅卡托克";
        a[140].name = "858-gelbin-mekkatorque";
        a[140].cost = 6;
        a[140].golden = 0;
        a[140].rarity = "legendary";
        a[140].imgUrl = R.drawable.hearthstone_8a4f6fcd51154c367edd9a63250c4b274bb4d907f0ded1bd215a619ea203dc9e;
        a[140].type = "minion";
        a[140].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/8a4f6fcd51154c367edd9a63250c4b274bb4d907f0ded1bd215a619ea203dc9e.png";

        a[141].cnName = "加基森拍卖师";
        a[141].name = "932-gadgetzan-auctioneer";
        a[141].cost = 6;
        a[141].golden = 0;
        a[141].rarity = "rare";
        a[141].imgUrl = R.drawable.hearthstone_d3c400795c7d22f9c0386683bad16485a5c9f8a14a9882a5f6feab3f3370fa26;
        a[141].type = "minion";
        a[141].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/d3c400795c7d22f9c0386683bad16485a5c9f8a14a9882a5f6feab3f3370fa26.png";

        a[142].cnName = "比斯巨兽";
        a[142].name = "962-the-beast";
        a[142].cost = 6;
        a[142].golden = 0;
        a[142].rarity = "legendary";
        a[142].imgUrl = R.drawable.hearthstone_41237c5fe649562056717a7012ed551dfc0bd64687b63291683e348e4665ef90;
        a[142].type = "minion";
        a[142].race = "beast";
        a[142].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/41237c5fe649562056717a7012ed551dfc0bd64687b63291683e348e4665ef90.png";

        a[143].cnName = "黑骑士";
        a[143].name = "1656-the-black-knight";
        a[143].cost = 6;
        a[143].golden = 0;
        a[143].rarity = "legendary";
        a[143].imgUrl = R.drawable.hearthstone_8a9f4ca7e3ad74a3abd4ea75d5b4b2bed8525c64a785e24fc554aafc53239485;
        a[143].type = "minion";
        a[143].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/8a9f4ca7e3ad74a3abd4ea75d5b4b2bed8525c64a785e24fc554aafc53239485.png";

        a[144].cnName = "希尔瓦娜斯·风行者";
        a[144].name = "1721-sylvanas-windrunner";
        a[144].cost = 6;
        a[144].golden = 0;
        a[144].rarity = "legendary";
        a[144].imgUrl = R.drawable.hearthstone_40d230116908f5ff0d6a54408967d27abbddfddf7ae0acf954af896ae1e0c2c6;
        a[144].type = "minion";
        a[144].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/40d230116908f5ff0d6a54408967d27abbddfddf7ae0acf954af896ae1e0c2c6.png";

        a[145].cnName = "拉文霍德刺客";
        a[145].name = "134-ravenholdt-assassin";
        a[145].cost = 7;
        a[145].golden = 0;
        a[145].rarity = "rare";
        a[145].imgUrl = R.drawable.hearthstone_6ca3aa4d021c1531cb964d4ea39dd3649f6e8d6d07d53f81ae97acd8c3bce978;
        a[145].type = "minion";
        a[145].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/6ca3aa4d021c1531cb964d4ea39dd3649f6e8d6d07d53f81ae97acd8c3bce978.png";

        a[146].cnName = "迦顿男爵";
        a[146].name = "336-baron-geddon";
        a[146].cost = 7;
        a[146].golden = 0;
        a[146].rarity = "legendary";
        a[146].imgUrl = R.drawable.hearthstone_4d9211f16210cc25c36af7da3c1879d7c1113dfa2526a2c2b18fc0386797694c;
        a[146].type = "minion";
        a[146].race = "elemental";
        a[146].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/4d9211f16210cc25c36af7da3c1879d7c1113dfa2526a2c2b18fc0386797694c.png";

        a[147].cnName = "炎魔之王拉格纳罗斯";
        a[147].name = "374-ragnaros-the-firelord";
        a[147].cost = 8;
        a[147].golden = 0;
        a[147].rarity = "legendary";
        a[147].imgUrl = R.drawable.hearthstone_d7672bd79862d958f95376c02cbe1835db7a481ef7cd2f20a8fa29459e446919;
        a[147].type = "minion";
        a[147].race = "elemental";
        a[147].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/d7672bd79862d958f95376c02cbe1835db7a481ef7cd2f20a8fa29459e446919.png";

        a[148].cnName = "格鲁尔";
        a[148].name = "526-gruul";
        a[148].cost = 8;
        a[148].golden = 0;
        a[148].rarity = "legendary";
        a[148].imgUrl = R.drawable.hearthstone_a0a8125c750401da473945d84d020a6e4584bf7da6e83a2dac7a3759f227ab44;
        a[148].type = "minion";
        a[148].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/a0a8125c750401da473945d84d020a6e4584bf7da6e83a2dac7a3759f227ab44.png";

        a[149].cnName = "奥妮克希亚";
        a[149].name = "363-onyxia";
        a[149].cost = 9;
        a[149].golden = 0;
        a[149].rarity = "legendary";
        a[149].imgUrl = R.drawable.hearthstone_db598e9e90c09bc1a28c159e8c526c94ffb3423e7bb6e1206782d637fe5ad12f;
        a[149].type = "minion";
        a[149].race = "dragon";
        a[149].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/db598e9e90c09bc1a28c159e8c526c94ffb3423e7bb6e1206782d637fe5ad12f.png";

        a[150].cnName = "诺兹多姆";
        a[150].name = "411-nozdormu";
        a[150].cost = 9;
        a[150].golden = 0;
        a[150].rarity = "legendary";
        a[150].imgUrl = R.drawable.hearthstone_23ce761bf76c8034a197f082f031cf6862c2a5da06a1dcd64213cdf15c1b2625;
        a[150].type = "minion";
        a[150].race = "dragon";
        a[150].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/23ce761bf76c8034a197f082f031cf6862c2a5da06a1dcd64213cdf15c1b2625.png";

        a[151].cnName = "玛里苟斯";
        a[151].name = "436-malygos";
        a[151].cost = 9;
        a[151].golden = 0;
        a[151].rarity = "legendary";
        a[151].imgUrl = R.drawable.hearthstone_bca7d2c1fb9ee0266960c4b51ca8b575fb1eab39489715c371521e1e1373a225;
        a[151].type = "minion";
        a[151].race = "dragon";
        a[151].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/bca7d2c1fb9ee0266960c4b51ca8b575fb1eab39489715c371521e1e1373a225.png";

        a[152].cnName = "阿莱克丝塔萨";
        a[152].name = "581-alexstrasza";
        a[152].cost = 9;
        a[152].golden = 0;
        a[152].rarity = "legendary";
        a[152].imgUrl = R.drawable.hearthstone_9110bc705430411718a9e0c51375268d43179666b4d7835f57238a3f7f717363;
        a[152].type = "minion";
        a[152].race = "dragon";
        a[152].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/9110bc705430411718a9e0c51375268d43179666b4d7835f57238a3f7f717363.png";

        a[153].cnName = "伊瑟拉";
        a[153].name = "1186-ysera";
        a[153].cost = 9;
        a[153].golden = 0;
        a[153].rarity = "legendary";
        a[153].imgUrl = R.drawable.hearthstone_4c55ab5928e3b4ff12aefbde7e2cf949ed4ca69a4afa2c59e7e8e10564e03f29;
        a[153].type = "minion";
        a[153].race = "dragon";
        a[153].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/4c55ab5928e3b4ff12aefbde7e2cf949ed4ca69a4afa2c59e7e8e10564e03f29.png";

        a[154].cnName = "海巨人";
        a[154].name = "211-sea-giant";
        a[154].cost = 10;
        a[154].golden = 0;
        a[154].rarity = "epic";
        a[154].imgUrl = R.drawable.hearthstone_bbe59b7d8acbf12f1823c9751b6b4f8ae147d7aaf07348963a48b5a4d7b49f55;
        a[154].type = "minion";
        a[154].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/bbe59b7d8acbf12f1823c9751b6b4f8ae147d7aaf07348963a48b5a4d7b49f55.png";

        a[155].cnName = "死亡之翼";
        a[155].name = "834-deathwing";
        a[155].cost = 10;
        a[155].golden = 0;
        a[155].rarity = "legendary";
        a[155].imgUrl = R.drawable.hearthstone_5ea3554e0faf74da78fae03cb64fc936fe967c1aeb58cd010f79e70738f19e9d;
        a[155].type = "minion";
        a[155].race = "dragon";
        a[155].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/5ea3554e0faf74da78fae03cb64fc936fe967c1aeb58cd010f79e70738f19e9d.png";

        a[156].cnName = "山岭巨人";
        a[156].name = "993-mountain-giant";
        a[156].cost = 12;
        a[156].golden = 0;
        a[156].rarity = "epic";
        a[156].imgUrl = R.drawable.hearthstone_8990619f811341233b1f371b7d7f2bfdcb9d767158a76f696109d808e24e3559;
        a[156].type = "minion";
        a[156].race = "elemental";
        a[156].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/8990619f811341233b1f371b7d7f2bfdcb9d767158a76f696109d808e24e3559.png";

        a[157].cnName = "熔核巨人";
        a[157].name = "1372-molten-giant";
        a[157].cost = 20;
        a[157].golden = 0;
        a[157].rarity = "epic";
        a[157].imgUrl = R.drawable.hearthstone_0c172730d66f45d334e4aa6a69065dbc1ad481383a181eeb7b9b25e691d47f4d;
        a[157].type = "minion";
        a[157].race = "elemental";
        a[157].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/0c172730d66f45d334e4aa6a69065dbc1ad481383a181eeb7b9b25e691d47f4d.png";

        a[158].cnName = "救赎";
        a[158].name = "140-redemption";
        a[158].cost = 1;
        a[158].golden = 0;
        a[158].rarity = "common";
        a[158].imgUrl = R.drawable.hearthstone_752f94ab06a971f88fb02fbb2fb5fc344f21c01bfd5bad687769d54ed8de15b2;
        a[158].type = "spell";
        a[158].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/752f94ab06a971f88fb02fbb2fb5fc344f21c01bfd5bad687769d54ed8de15b2.png";

        a[159].cnName = "忏悔";
        a[159].name = "232-repentance";
        a[159].cost = 1;
        a[159].golden = 0;
        a[159].rarity = "common";
        a[159].imgUrl = R.drawable.hearthstone_ff39ecedd849f6eca5f1f4cdfcbe944c2830356167839c5d6383c6a5fd83057f;
        a[159].type = "spell";
        a[159].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/ff39ecedd849f6eca5f1f4cdfcbe944c2830356167839c5d6383c6a5fd83057f.png";

        a[160].cnName = "以眼还眼";
        a[160].name = "462-eye-for-an-eye";
        a[160].cost = 1;
        a[160].golden = 0;
        a[160].rarity = "common";
        a[160].imgUrl = R.drawable.hearthstone_3ab48910d39bce84894aa171ad678a613053f51e62448f3cd6f5472508b503dd;
        a[160].type = "spell";
        a[160].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/3ab48910d39bce84894aa171ad678a613053f51e62448f3cd6f5472508b503dd.png";

        a[161].cnName = "崇高牺牲";
        a[161].name = "584-noble-sacrifice";
        a[161].cost = 1;
        a[161].golden = 0;
        a[161].rarity = "common";
        a[161].imgUrl = R.drawable.hearthstone_4ef86cc33be2a10c90a02bd95c0668d4e9c4952e2ef2f711f0a3cca9f5329c10;
        a[161].type = "spell";
        a[161].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/4ef86cc33be2a10c90a02bd95c0668d4e9c4952e2ef2f711f0a3cca9f5329c10.png";

        a[162].cnName = "智慧祝福";
        a[162].name = "1373-blessing-of-wisdom";
        a[162].cost = 1;
        a[162].golden = 0;
        a[162].rarity = "common";
        a[162].imgUrl = R.drawable.hearthstone_9035eda28113807cb283b27e036fcdf87610c357aae40954fe6a67473b4e1a6d;
        a[162].type = "spell";
        a[162].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/9035eda28113807cb283b27e036fcdf87610c357aae40954fe6a67473b4e1a6d.png";

        a[163].cnName = "银色保卫者";
        a[163].name = "1022-argent-protector";
        a[163].cost = 2;
        a[163].golden = 0;
        a[163].rarity = "common";
        a[163].imgUrl = R.drawable.hearthstone_2baa162983eccbaf545bd1b6b3a70b3841fac31e4ec7ee138b39672f7015e9d0;
        a[163].type = "minion";
        a[163].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/2baa162983eccbaf545bd1b6b3a70b3841fac31e4ec7ee138b39672f7015e9d0.png";

        a[164].cnName = "公正之剑";
        a[164].name = "643-sword-of-justice";
        a[164].cost = 3;
        a[164].golden = 0;
        a[164].rarity = "epic";
        a[164].imgUrl = R.drawable.hearthstone_150d843f33a5eea0ebab54bcd3bf1b486ff84a953f8aa7557fb7396e36492691;
        a[164].type = "weapon";
        a[164].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/150d843f33a5eea0ebab54bcd3bf1b486ff84a953f8aa7557fb7396e36492691.png";

        a[165].cnName = "神恩术";
        a[165].name = "679-divine-favor";
        a[165].cost = 3;
        a[165].golden = 0;
        a[165].rarity = "rare";
        a[165].imgUrl = R.drawable.hearthstone_c204d09312d116d329b60a0c6e970774eb8f224527cd6cc3b54fbc8fde86e41d;
        a[165].type = "spell";
        a[165].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/c204d09312d116d329b60a0c6e970774eb8f224527cd6cc3b54fbc8fde86e41d.png";

        a[166].cnName = "奥尔多卫士";
        a[166].name = "1167-aldor-peacekeeper";
        a[166].cost = 3;
        a[166].golden = 0;
        a[166].rarity = "rare";
        a[166].imgUrl = R.drawable.hearthstone_8129a58a35f741db19e04a835fdad327057040ebc0be94554e17ee4b790cf29e;
        a[166].type = "minion";
        a[166].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/8129a58a35f741db19e04a835fdad327057040ebc0be94554e17ee4b790cf29e.png";

        a[167].cnName = "生而平等";
        a[167].name = "756-equality";
        a[167].cost = 4;
        a[167].golden = 0;
        a[167].rarity = "rare";
        a[167].imgUrl = R.drawable.hearthstone_606bc4be7b157b6e8c2a00e7f79283f6e9ffcb913994dacd3e23e1facaed076b;
        a[167].type = "spell";
        a[167].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/606bc4be7b157b6e8c2a00e7f79283f6e9ffcb913994dacd3e23e1facaed076b.png";

        a[168].cnName = "神圣愤怒";
        a[168].name = "435-holy-wrath";
        a[168].cost = 5;
        a[168].golden = 0;
        a[168].rarity = "rare";
        a[168].imgUrl = R.drawable.hearthstone_70982d3392f33955dac992bafee9d1ddc91d5d9c6b62ccdc9a07698ab69d1105;
        a[168].type = "spell";
        a[168].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/70982d3392f33955dac992bafee9d1ddc91d5d9c6b62ccdc9a07698ab69d1105.png";

        a[169].cnName = "受祝福的勇士";
        a[169].name = "1522-blessed-champion";
        a[169].cost = 5;
        a[169].golden = 0;
        a[169].rarity = "rare";
        a[169].imgUrl = R.drawable.hearthstone_1be86086baee4e876090c90242601af90c94003c052f0187faca9692d2859422;
        a[169].type = "spell";
        a[169].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/1be86086baee4e876090c90242601af90c94003c052f0187faca9692d2859422.png";

        a[170].cnName = "复仇之怒";
        a[170].name = "1174-avenging-wrath";
        a[170].cost = 6;
        a[170].golden = 0;
        a[170].rarity = "epic";
        a[170].imgUrl = R.drawable.hearthstone_dcc9f2e502a3f862f661e4cac39eaed5df11a852ced2f9e34074c517b9ad26f8;
        a[170].type = "spell";
        a[170].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/dcc9f2e502a3f862f661e4cac39eaed5df11a852ced2f9e34074c517b9ad26f8.png";

        a[171].cnName = "圣疗术";
        a[171].name = "594-lay-on-hands";
        a[171].cost = 8;
        a[171].golden = 0;
        a[171].rarity = "epic";
        a[171].imgUrl = R.drawable.hearthstone_369962436dce00c52fbb719ff4b642548dcd02bb2f9a7040ca541cf5732dad73;
        a[171].type = "spell";
        a[171].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/369962436dce00c52fbb719ff4b642548dcd02bb2f9a7040ca541cf5732dad73.png";

        a[172].cnName = "提里奥·弗丁";
        a[172].name = "890-tirion-fordring";
        a[172].cost = 8;
        a[172].golden = 0;
        a[172].rarity = "legendary";
        a[172].imgUrl = R.drawable.hearthstone_c1130a36a6941b5cf5306e2573a0fc37ee922228d61eb1c0ddcf05f608ab466e;
        a[172].type = "minion";
        a[172].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/c1130a36a6941b5cf5306e2573a0fc37ee922228d61eb1c0ddcf05f608ab466e.png";

        a[173].cnName = "沉默";
        a[173].name = "1189-silence";
        a[173].cost = 0;
        a[173].golden = 0;
        a[173].rarity = "common";
        a[173].imgUrl = R.drawable.hearthstone_3a273e5bf5d66cdd27fb7212bf04a76bd1d20be63d57e2d505d8803aab134561;
        a[173].type = "spell";
        a[173].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/3a273e5bf5d66cdd27fb7212bf04a76bd1d20be63d57e2d505d8803aab134561.png";

        a[174].cnName = "治疗之环";
        a[174].name = "1362-circle-of-healing";
        a[174].cost = 0;
        a[174].golden = 0;
        a[174].rarity = "common";
        a[174].imgUrl = R.drawable.hearthstone_e7fa89d115c58933a2521d2f38143746365e0050acdb11a4d7180cbe579dc862;
        a[174].type = "spell";
        a[174].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/e7fa89d115c58933a2521d2f38143746365e0050acdb11a4d7180cbe579dc862.png";

        a[175].cnName = "心灵之火";
        a[175].name = "376-inner-fire";
        a[175].cost = 1;
        a[175].golden = 0;
        a[175].rarity = "common";
        a[175].imgUrl = R.drawable.hearthstone_f463f68363d66870041522ef11e5ee1016a8c4fb45c1dc32f76f5133e4e98cb0;
        a[175].type = "spell";
        a[175].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/f463f68363d66870041522ef11e5ee1016a8c4fb45c1dc32f76f5133e4e98cb0.png";

        a[176].cnName = "心灵震爆";
        a[176].name = "545-mind-blast";
        a[176].cost = 2;
        a[176].golden = 0;
        a[176].rarity = "common";
        a[176].imgUrl = R.drawable.hearthstone_fe349dcb53eb91ddbf77d00b2ac0f0cf22d8292ef5191e45369bc430679357f9;
        a[176].type = "spell";
        a[176].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/fe349dcb53eb91ddbf77d00b2ac0f0cf22d8292ef5191e45369bc430679357f9.png";

        a[177].cnName = "光明之泉";
        a[177].name = "797-lightwell";
        a[177].cost = 2;
        a[177].golden = 0;
        a[177].rarity = "rare";
        a[177].imgUrl = R.drawable.hearthstone_86cab3265c476d0092063166c966c6d9ee13aed4618bc9e07b97ad72fa5c74b0;
        a[177].type = "minion";
        a[177].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/86cab3265c476d0092063166c966c6d9ee13aed4618bc9e07b97ad72fa5c74b0.png";

        a[178].cnName = "思维窃取";
        a[178].name = "30-thoughtsteal";
        a[178].cost = 3;
        a[178].golden = 0;
        a[178].rarity = "common";
        a[178].imgUrl = R.drawable.hearthstone_68b9b7866f2336ff080af92aa0c9f72316bddb2c49e93ac561cd68ab7df4e420;
        a[178].type = "spell";
        a[178].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/68b9b7866f2336ff080af92aa0c9f72316bddb2c49e93ac561cd68ab7df4e420.png";

        a[179].cnName = "暗影形态";
        a[179].name = "1368-shadowform";
        a[179].cost = 3;
        a[179].golden = 0;
        a[179].rarity = "epic";
        a[179].imgUrl = R.drawable.hearthstone_b8c003c6a92149a4de9b3cdd7341c9fd7be82873c614e977be69fc05dec5121e;
        a[179].type = "spell";
        a[179].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/b8c003c6a92149a4de9b3cdd7341c9fd7be82873c614e977be69fc05dec5121e.png";

        a[180].cnName = "控心术";
        a[180].name = "145-mindgames";
        a[180].cost = 4;
        a[180].golden = 0;
        a[180].rarity = "epic";
        a[180].imgUrl = R.drawable.hearthstone_d24efe093fd65519cc3bd445a97b9a3ff80b31b25c5e17c2435fb88ae6bd6352;
        a[180].type = "spell";
        a[180].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/d24efe093fd65519cc3bd445a97b9a3ff80b31b25c5e17c2435fb88ae6bd6352.png";

        a[181].cnName = "暗影狂乱";
        a[181].name = "220-shadow-madness";
        a[181].cost = 4;
        a[181].golden = 0;
        a[181].rarity = "rare";
        a[181].imgUrl = R.drawable.hearthstone_b70731b4d17e4ff4bed532d73b7863e19540869b8bb88c71627333c54d5216e6;
        a[181].type = "spell";
        a[181].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/b70731b4d17e4ff4bed532d73b7863e19540869b8bb88c71627333c54d5216e6.png";

        a[182].cnName = "奥金尼灵魂祭司";
        a[182].name = "237-auchenai-soulpriest";
        a[182].cost = 4;
        a[182].golden = 0;
        a[182].rarity = "rare";
        a[182].imgUrl = R.drawable.hearthstone_fc9bb6d24daea346501de3c3734250660fffc48a385fa9d8450fa801922a6fec;
        a[182].type = "minion";
        a[182].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/fc9bb6d24daea346501de3c3734250660fffc48a385fa9d8450fa801922a6fec.png";

        a[183].cnName = "光耀之子";
        a[183].name = "886-lightspawn";
        a[183].cost = 4;
        a[183].golden = 0;
        a[183].rarity = "common";
        a[183].imgUrl = R.drawable.hearthstone_8326c528e757e4bace2f190ce42a01161ef257959fa1135ae8e8b6bdbcdc3431;
        a[183].type = "minion";
        a[183].race = "elemental";
        a[183].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/8326c528e757e4bace2f190ce42a01161ef257959fa1135ae8e8b6bdbcdc3431.png";

        a[184].cnName = "群体驱散";
        a[184].name = "1366-mass-dispel";
        a[184].cost = 4;
        a[184].golden = 0;
        a[184].rarity = "rare";
        a[184].imgUrl = R.drawable.hearthstone_eb40ef3f0b1d1d85de8ee852e1f489c4db7473eef8836184c0de63c92ec4739b;
        a[184].type = "spell";
        a[184].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/eb40ef3f0b1d1d85de8ee852e1f489c4db7473eef8836184c0de63c92ec4739b.png";

        a[185].cnName = "秘教暗影祭司";
        a[185].name = "272-cabal-shadow-priest";
        a[185].cost = 6;
        a[185].golden = 0;
        a[185].rarity = "epic";
        a[185].imgUrl = R.drawable.hearthstone_895377402d51a16e210a65f115f8b976da82770a9a4e2ccef2d53f8410ffb918;
        a[185].type = "minion";
        a[185].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/895377402d51a16e210a65f115f8b976da82770a9a4e2ccef2d53f8410ffb918.png";

        a[186].cnName = "圣殿执行者";
        a[186].name = "1364-temple-enforcer";
        a[186].cost = 6;
        a[186].golden = 0;
        a[186].rarity = "common";
        a[186].imgUrl = R.drawable.hearthstone_abc79f6d91fc4369ee8a71d6e268d898eb2b5430a52a3f3ad2e27036ad2fe7de;
        a[186].type = "minion";
        a[186].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/abc79f6d91fc4369ee8a71d6e268d898eb2b5430a52a3f3ad2e27036ad2fe7de.png";

        a[187].cnName = "神圣之火";
        a[187].name = "1365-holy-fire";
        a[187].cost = 6;
        a[187].golden = 0;
        a[187].rarity = "rare";
        a[187].imgUrl = R.drawable.hearthstone_823edaff7a9205f485eb70ba8261fe9e3b033189c46ef2f28b2e85fcb759cdbd;
        a[187].type = "spell";
        a[187].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/823edaff7a9205f485eb70ba8261fe9e3b033189c46ef2f28b2e85fcb759cdbd.png";

        a[188].cnName = "先知维伦";
        a[188].name = "9-prophet-velen";
        a[188].cost = 7;
        a[188].golden = 0;
        a[188].rarity = "legendary";
        a[188].imgUrl = R.drawable.hearthstone_0ec23ba8f0bc62758428a3bac1f991befe49157ed4e65b8e983abcfc8baa9619;
        a[188].type = "minion";
        a[188].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/0ec23ba8f0bc62758428a3bac1f991befe49157ed4e65b8e983abcfc8baa9619.png";

        a[189].cnName = "暗影步";
        a[189].name = "365-shadowstep";
        a[189].cost = 0;
        a[189].golden = 0;
        a[189].rarity = "common";
        a[189].imgUrl = R.drawable.hearthstone_b03b040e726595149fb469f7752bceec21aa1267659c89d31bf044ce8774501d;
        a[189].type = "spell";
        a[189].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/b03b040e726595149fb469f7752bceec21aa1267659c89d31bf044ce8774501d.png";

        a[190].cnName = "伺机待发";
        a[190].name = "1158-preparation";
        a[190].cost = 0;
        a[190].golden = 0;
        a[190].rarity = "epic";
        a[190].imgUrl = R.drawable.hearthstone_516e8c69706cce54733daf0a960f71b8ee7b52af03e406649c436953987d3a7c;
        a[190].type = "spell";
        a[190].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/516e8c69706cce54733daf0a960f71b8ee7b52af03e406649c436953987d3a7c.png";

        a[191].cnName = "隐藏";
        a[191].name = "990-conceal";
        a[191].cost = 1;
        a[191].golden = 0;
        a[191].rarity = "common";
        a[191].imgUrl = R.drawable.hearthstone_7046a11acdd49fb3abecb9302f21070bdfea5009127cda9169caf2b49cbf118a;
        a[191].type = "spell";
        a[191].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/7046a11acdd49fb3abecb9302f21070bdfea5009127cda9169caf2b49cbf118a.png";

        a[192].cnName = "迪菲亚头目";
        a[192].name = "201-defias-ringleader";
        a[192].cost = 2;
        a[192].golden = 0;
        a[192].rarity = "common";
        a[192].imgUrl = R.drawable.hearthstone_684ffaebb08ca60be1c3781b21e5a0c84dcc8ad27cacab39b8d60111b1fd7e1f;
        a[192].type = "minion";
        a[192].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/684ffaebb08ca60be1c3781b21e5a0c84dcc8ad27cacab39b8d60111b1fd7e1f.png";

        a[193].cnName = "冷血";
        a[193].name = "268-cold-blood";
        a[193].cost = 2;
        a[193].golden = 0;
        a[193].rarity = "common";
        a[193].imgUrl = R.drawable.hearthstone_2df9f7455408a5e9da4a6b330d35578e6494b76471fd5237452956944ae5769e;
        a[193].type = "spell";
        a[193].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/2df9f7455408a5e9da4a6b330d35578e6494b76471fd5237452956944ae5769e.png";

        a[194].cnName = "背叛";
        a[194].name = "282-betrayal";
        a[194].cost = 2;
        a[194].golden = 0;
        a[194].rarity = "common";
        a[194].imgUrl = R.drawable.hearthstone_98d3365dcb1516ad5d8ef6ecd3e1a3738dd79954e2f68aa7b1d7558a2ebd30d5;
        a[194].type = "spell";
        a[194].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/98d3365dcb1516ad5d8ef6ecd3e1a3738dd79954e2f68aa7b1d7558a2ebd30d5.png";

        a[195].cnName = "刺骨";
        a[195].name = "904-eviscerate";
        a[195].cost = 2;
        a[195].golden = 0;
        a[195].rarity = "common";
        a[195].imgUrl = R.drawable.hearthstone_ac9b41c7223a006c21fa95e3cfb05a73e83ed79fca59b3bc8db0a6e89e35e294;
        a[195].type = "spell";
        a[195].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/ac9b41c7223a006c21fa95e3cfb05a73e83ed79fca59b3bc8db0a6e89e35e294.png";

        a[196].cnName = "耐心的刺客";
        a[196].name = "1133-patient-assassin";
        a[196].cost = 2;
        a[196].golden = 0;
        a[196].rarity = "epic";
        a[196].imgUrl = R.drawable.hearthstone_2c95fe02f35d70befc661fb9ccb4c1e3146f47fea602bde42061bbd504f3ab75;
        a[196].type = "minion";
        a[196].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/2c95fe02f35d70befc661fb9ccb4c1e3146f47fea602bde42061bbd504f3ab75.png";

        a[197].cnName = "艾德温·范克里夫";
        a[197].name = "306-edwin-vancleef";
        a[197].cost = 3;
        a[197].golden = 0;
        a[197].rarity = "legendary";
        a[197].imgUrl = R.drawable.hearthstone_80a3478340f901165c72c3fd53cefac22fe6392b105b24c7ebdc97f310e1deda;
        a[197].type = "minion";
        a[197].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/80a3478340f901165c72c3fd53cefac22fe6392b105b24c7ebdc97f310e1deda.png";

        a[198].cnName = "毁灭之刃";
        a[198].name = "391-perditions-blade";
        a[198].cost = 3;
        a[198].golden = 0;
        a[198].rarity = "rare";
        a[198].imgUrl = R.drawable.hearthstone_8f29d5997c14917c4e2d6032ccb64ec86150ab27bf02153a3c5a85dd4e2052d7;
        a[198].type = "weapon";
        a[198].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/8f29d5997c14917c4e2d6032ccb64ec86150ab27bf02153a3c5a85dd4e2052d7.png";

        a[199].cnName = "裂颅之击";
        a[199].name = "708-headcrack";
        a[199].cost = 3;
        a[199].golden = 0;
        a[199].rarity = "rare";
        a[199].imgUrl = R.drawable.hearthstone_e34e39ec091f0755ccc09cd7c110358363932a4160dade627b93135bc1b442d3;
        a[199].type = "spell";
        a[199].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/e34e39ec091f0755ccc09cd7c110358363932a4160dade627b93135bc1b442d3.png";

        a[200].cnName = "军情七处特工";
        a[200].name = "1117-si-agent";
        a[200].cost = 3;
        a[200].golden = 0;
        a[200].rarity = "rare";
        a[200].imgUrl = R.drawable.hearthstone_2a59b2a4340fb3079b03e353c4e87f7bceaf21fa8bc0ce69a273acb3b09e70d9;
        a[200].type = "minion";
        a[200].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/2a59b2a4340fb3079b03e353c4e87f7bceaf21fa8bc0ce69a273acb3b09e70d9.png";

        a[201].cnName = "伪装大师";
        a[201].name = "887-master-of-disguise";
        a[201].cost = 4;
        a[201].golden = 0;
        a[201].rarity = "rare";
        a[201].imgUrl = R.drawable.hearthstone_22ef22f7d76c1b3398e28103df89f2a61a906e1747a02dae305a42603a9b5389;
        a[201].type = "minion";
        a[201].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/22ef22f7d76c1b3398e28103df89f2a61a906e1747a02dae305a42603a9b5389.png";

        a[202].cnName = "剑刃乱舞";
        a[202].name = "1064-blade-flurry";
        a[202].cost = 4;
        a[202].golden = 0;
        a[202].rarity = "rare";
        a[202].imgUrl = R.drawable.hearthstone_da95ee3ca5b9f4978d5631385f0f5a8251ecfeaba68642adc59f47b95a09c9ea;
        a[202].type = "spell";
        a[202].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/da95ee3ca5b9f4978d5631385f0f5a8251ecfeaba68642adc59f47b95a09c9ea.png";

        a[203].cnName = "消失";
        a[203].name = "196-vanish";
        a[203].cost = 6;
        a[203].golden = 0;
        a[203].rarity = "common";
        a[203].imgUrl = R.drawable.hearthstone_5d1a9ad21326915970a50a2038f6bcd620bcd642633cf81863cbbfefe4d30bd7;
        a[203].type = "spell";
        a[203].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/5d1a9ad21326915970a50a2038f6bcd620bcd642633cf81863cbbfefe4d30bd7.png";

        a[204].cnName = "劫持者";
        a[204].name = "287-kidnapper";
        a[204].cost = 6;
        a[204].golden = 0;
        a[204].rarity = "epic";
        a[204].imgUrl = R.drawable.hearthstone_541d05b2f447059450273885cfa48a503144f52102d7dddc471066ead8795d60;
        a[204].type = "minion";
        a[204].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/541d05b2f447059450273885cfa48a503144f52102d7dddc471066ead8795d60.png";

        a[205].cnName = "叉状闪电";
        a[205].name = "299-forked-lightning";
        a[205].cost = 1;
        a[205].golden = 0;
        a[205].rarity = "common";
        a[205].imgUrl = R.drawable.hearthstone_3746c2afb4ed6c80290da0aef6caf405e58ab7fcae525134b8c5d745646c9863;
        a[205].type = "spell";
        a[205].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/3746c2afb4ed6c80290da0aef6caf405e58ab7fcae525134b8c5d745646c9863.png";

        a[206].cnName = "闪电箭";
        a[206].name = "505-lightning-bolt";
        a[206].cost = 1;
        a[206].golden = 0;
        a[206].rarity = "common";
        a[206].imgUrl = R.drawable.hearthstone_ea311eb9349d020c62b189efb471184a762680bea0de25d0cd783dd20e4cb5c2;
        a[206].type = "spell";
        a[206].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/ea311eb9349d020c62b189efb471184a762680bea0de25d0cd783dd20e4cb5c2.png";

        a[207].cnName = "尘魔";
        a[207].name = "618-dust-devil";
        a[207].cost = 1;
        a[207].golden = 0;
        a[207].rarity = "common";
        a[207].imgUrl = R.drawable.hearthstone_1733516d0217956ec28ee718e9d26c14cba1f64aa55f4751929548a6102f7d4b;
        a[207].type = "minion";
        a[207].race = "elemental";
        a[207].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/1733516d0217956ec28ee718e9d26c14cba1f64aa55f4751929548a6102f7d4b.png";

        a[208].cnName = "大地震击";
        a[208].name = "767-earth-shock";
        a[208].cost = 1;
        a[208].golden = 0;
        a[208].rarity = "common";
        a[208].imgUrl = R.drawable.hearthstone_5d901d96f8ef51217425be49fc78cb6cc1acf1b74e9eb65772bf5cffd1b7c888;
        a[208].type = "spell";
        a[208].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/5d901d96f8ef51217425be49fc78cb6cc1acf1b74e9eb65772bf5cffd1b7c888.png";

        a[209].cnName = "先祖之魂";
        a[209].name = "404-ancestral-spirit";
        a[209].cost = 2;
        a[209].golden = 0;
        a[209].rarity = "rare";
        a[209].imgUrl = R.drawable.hearthstone_355356dd58b76263b1ab477f23b1379fbb846231256c7401a53cd76c49165c28;
        a[209].type = "spell";
        a[209].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/355356dd58b76263b1ab477f23b1379fbb846231256c7401a53cd76c49165c28.png";

        a[210].cnName = "雷铸战斧";
        a[210].name = "960-stormforged-axe";
        a[210].cost = 2;
        a[210].golden = 0;
        a[210].rarity = "common";
        a[210].imgUrl = R.drawable.hearthstone_58e33a4623b88ece3aee9879dcd56897c221d8e8ac014247032279f7754e2c87;
        a[210].type = "weapon";
        a[210].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/58e33a4623b88ece3aee9879dcd56897c221d8e8ac014247032279f7754e2c87.png";

        a[211].cnName = "野性狼魂";
        a[211].name = "238-feral-spirit";
        a[211].cost = 3;
        a[211].golden = 0;
        a[211].rarity = "rare";
        a[211].imgUrl = R.drawable.hearthstone_4e5de5e2d579e27c1cd606461aa058976f96794ec8b130f63f02f1aeed98692c;
        a[211].type = "spell";
        a[211].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/4e5de5e2d579e27c1cd606461aa058976f96794ec8b130f63f02f1aeed98692c.png";

        a[212].cnName = "法力之潮图腾";
        a[212].name = "513-mana-tide-totem";
        a[212].cost = 3;
        a[212].golden = 0;
        a[212].rarity = "rare";
        a[212].imgUrl = R.drawable.hearthstone_ecef0c94e1bb68b7de3a226d29e82aef2512784185d2362945a68af9f79cf25f;
        a[212].type = "minion";
        a[212].race = "totem";
        a[212].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/ecef0c94e1bb68b7de3a226d29e82aef2512784185d2362945a68af9f79cf25f.png";

        a[213].cnName = "闪电风暴";
        a[213].name = "629-lightning-storm";
        a[213].cost = 3;
        a[213].golden = 0;
        a[213].rarity = "rare";
        a[213].imgUrl = R.drawable.hearthstone_4cf5cb100f20e534540309352824192e1cd787c31fcd470f64a462e4645fd462;
        a[213].type = "spell";
        a[213].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/4cf5cb100f20e534540309352824192e1cd787c31fcd470f64a462e4645fd462.png";

        a[214].cnName = "无羁元素";
        a[214].name = "774-unbound-elemental";
        a[214].cost = 3;
        a[214].golden = 0;
        a[214].rarity = "common";
        a[214].imgUrl = R.drawable.hearthstone_14b1790d2ac3498cf893b5cad6f91875dfc191999e5a10eb6030531cef3832e2;
        a[214].type = "minion";
        a[214].race = "elemental";
        a[214].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/14b1790d2ac3498cf893b5cad6f91875dfc191999e5a10eb6030531cef3832e2.png";

        a[215].cnName = "视界术";
        a[215].name = "818-far-sight";
        a[215].cost = 3;
        a[215].golden = 0;
        a[215].rarity = "epic";
        a[215].imgUrl = R.drawable.hearthstone_b6d6e61de4feb85664fc42f49d765fa119248582d30a1635fa3ddad869ff1037;
        a[215].type = "spell";
        a[215].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/b6d6e61de4feb85664fc42f49d765fa119248582d30a1635fa3ddad869ff1037.png";

        a[216].cnName = "熔岩爆裂";
        a[216].name = "864-lava-burst";
        a[216].cost = 3;
        a[216].golden = 0;
        a[216].rarity = "rare";
        a[216].imgUrl = R.drawable.hearthstone_b05f32d9f83587296cbce36d71617d660737253c8ada72239e1871c914a01ad5;
        a[216].type = "spell";
        a[216].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/b05f32d9f83587296cbce36d71617d660737253c8ada72239e1871c914a01ad5.png";

        a[217].cnName = "毁灭之锤";
        a[217].name = "352-doomhammer";
        a[217].cost = 5;
        a[217].golden = 0;
        a[217].rarity = "epic";
        a[217].imgUrl = R.drawable.hearthstone_2827add7fe33fe993447d6438e5681c7b06a63a6d647758197a12a020831c15b;
        a[217].type = "weapon";
        a[217].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/2827add7fe33fe993447d6438e5681c7b06a63a6d647758197a12a020831c15b.png";

        a[218].cnName = "土元素";
        a[218].name = "1141-earth-elemental";
        a[218].cost = 5;
        a[218].golden = 0;
        a[218].rarity = "epic";
        a[218].imgUrl = R.drawable.hearthstone_f27209d50fa2edc65fc246e0f2446666153e492bdd59e46698a810c179499752;
        a[218].type = "minion";
        a[218].race = "elemental";
        a[218].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/f27209d50fa2edc65fc246e0f2446666153e492bdd59e46698a810c179499752.png";

        a[219].cnName = "风领主奥拉基尔";
        a[219].name = "32-alakir-the-windlord";
        a[219].cost = 8;
        a[219].golden = 0;
        a[219].rarity = "legendary";
        a[219].imgUrl = R.drawable.hearthstone_0f325416e67f21880e448474c0228645f6af66198ec7569ec3643d1faa032fcc;
        a[219].type = "minion";
        a[219].race = "elemental";
        a[219].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/0f325416e67f21880e448474c0228645f6af66198ec7569ec3643d1faa032fcc.png";

        a[220].cnName = "鲜血小鬼";
        a[220].name = "469-blood-imp";
        a[220].cost = 1;
        a[220].golden = 0;
        a[220].rarity = "common";
        a[220].imgUrl = R.drawable.hearthstone_7d0d675962e261f8c7b6a69aabc5fdfd5d7ac760e10e299efe97b08d4a028fd3;
        a[220].type = "minion";
        a[220].race = "demon";
        a[220].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/7d0d675962e261f8c7b6a69aabc5fdfd5d7ac760e10e299efe97b08d4a028fd3.png";

        a[221].cnName = "力量的代价";
        a[221].name = "846-power-overwhelming";
        a[221].cost = 1;
        a[221].golden = 0;
        a[221].rarity = "common";
        a[221].imgUrl = R.drawable.hearthstone_9060c9afd146e7d79a3dde672ac5d3184a4345c57cc85b5a518f7308f27d8d9c;
        a[221].type = "spell";
        a[221].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/9060c9afd146e7d79a3dde672ac5d3184a4345c57cc85b5a518f7308f27d8d9c.png";

        a[222].cnName = "烈焰小鬼";
        a[222].name = "1090-flame-imp";
        a[222].cost = 1;
        a[222].golden = 0;
        a[222].rarity = "common";
        a[222].imgUrl = R.drawable.hearthstone_fb8cd1ec8aad9acda58ada975e156f1278838ddd0f346d9e53e6341ed0d55171;
        a[222].type = "minion";
        a[222].race = "demon";
        a[222].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/fb8cd1ec8aad9acda58ada975e156f1278838ddd0f346d9e53e6341ed0d55171.png";

        a[223].cnName = "恶魔之火";
        a[223].name = "1142-demonfire";
        a[223].cost = 2;
        a[223].golden = 0;
        a[223].rarity = "common";
        a[223].imgUrl = R.drawable.hearthstone_445984858e02c1f8e874f2286446a7859e9cfa34a3b44c8f3e34002b02f389ed;
        a[223].type = "spell";
        a[223].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/445984858e02c1f8e874f2286446a7859e9cfa34a3b44c8f3e34002b02f389ed.png";

        a[224].cnName = "恶魔卫士";
        a[224].name = "517-felguard";
        a[224].cost = 3;
        a[224].golden = 0;
        a[224].rarity = "rare";
        a[224].imgUrl = R.drawable.hearthstone_eebe1e497883c7bbb447d7bfff877cbe60e748feef7cd4975a80da4d2d29b845;
        a[224].type = "minion";
        a[224].race = "demon";
        a[224].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/eebe1e497883c7bbb447d7bfff877cbe60e748feef7cd4975a80da4d2d29b845.png";

        a[225].cnName = "感知恶魔";
        a[225].name = "860-sense-demons";
        a[225].cost = 3;
        a[225].golden = 0;
        a[225].rarity = "common";
        a[225].imgUrl = R.drawable.hearthstone_d93f7553467e7fa83cf7242817257528f150081ff548eb802ef370ee6707b139;
        a[225].type = "spell";
        a[225].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/d93f7553467e7fa83cf7242817257528f150081ff548eb802ef370ee6707b139.png";

        a[226].cnName = "虚空恐魔";
        a[226].name = "1221-void-terror";
        a[226].cost = 3;
        a[226].golden = 0;
        a[226].rarity = "rare";
        a[226].imgUrl = R.drawable.hearthstone_ee4153eda7f2af9ad4f1954feabd3529e48b610aca0d76169714dbede8f45ecb;
        a[226].type = "minion";
        a[226].race = "demon";
        a[226].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/ee4153eda7f2af9ad4f1954feabd3529e48b610aca0d76169714dbede8f45ecb.png";

        a[227].cnName = "暗影烈焰";
        a[227].name = "147-shadowflame";
        a[227].cost = 4;
        a[227].golden = 0;
        a[227].rarity = "rare";
        a[227].imgUrl = R.drawable.hearthstone_8b93c77cbf8744315005395eeb758481af9d8803b5371f066c5f33056b426f26;
        a[227].type = "spell";
        a[227].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/8b93c77cbf8744315005395eeb758481af9d8803b5371f066c5f33056b426f26.png";

        a[228].cnName = "深渊领主";
        a[228].name = "783-pit-lord";
        a[228].cost = 4;
        a[228].golden = 0;
        a[228].rarity = "epic";
        a[228].imgUrl = R.drawable.hearthstone_142f368435b3136477a05a95552050174430251067bdaeddc616c0d471d9562f;
        a[228].type = "minion";
        a[228].race = "demon";
        a[228].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/142f368435b3136477a05a95552050174430251067bdaeddc616c0d471d9562f.png";

        a[229].cnName = "召唤传送门";
        a[229].name = "969-summoning-portal";
        a[229].cost = 4;
        a[229].golden = 0;
        a[229].rarity = "common";
        a[229].imgUrl = R.drawable.hearthstone_bc65a574216963225cf098fa1d0516eecae70a2d8a62bd021a1ffed9ad7bd203;
        a[229].type = "minion";
        a[229].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/bc65a574216963225cf098fa1d0516eecae70a2d8a62bd021a1ffed9ad7bd203.png";

        a[230].cnName = "末日灾祸";
        a[230].name = "23-bane-of-doom";
        a[230].cost = 5;
        a[230].golden = 0;
        a[230].rarity = "epic";
        a[230].imgUrl = R.drawable.hearthstone_53cdbe6101a9b0a9cb32d08e567c05402ed4576e7d2fd9b5646aeebc0e7f095e;
        a[230].type = "spell";
        a[230].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/53cdbe6101a9b0a9cb32d08e567c05402ed4576e7d2fd9b5646aeebc0e7f095e.png";

        a[231].cnName = "末日守卫";
        a[231].name = "631-doomguard";
        a[231].cost = 5;
        a[231].golden = 0;
        a[231].rarity = "rare";
        a[231].imgUrl = R.drawable.hearthstone_57a600e3ad75204d82498cc06ed5cf2f6df1c619fb9162f0f07b3f8e491081bd;
        a[231].type = "minion";
        a[231].race = "demon";
        a[231].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/57a600e3ad75204d82498cc06ed5cf2f6df1c619fb9162f0f07b3f8e491081bd.png";

        a[232].cnName = "灵魂虹吸";
        a[232].name = "1100-siphon-soul";
        a[232].cost = 6;
        a[232].golden = 0;
        a[232].rarity = "rare";
        a[232].imgUrl = R.drawable.hearthstone_55cea8ac59169e67aaa58b55fc7c73640e5f4cce07a7ee7f61407231b3f27a9c;
        a[232].type = "spell";
        a[232].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/55cea8ac59169e67aaa58b55fc7c73640e5f4cce07a7ee7f61407231b3f27a9c.png";

        a[233].cnName = "扭曲虚空";
        a[233].name = "859-twisting-nether";
        a[233].cost = 8;
        a[233].golden = 0;
        a[233].rarity = "epic";
        a[233].imgUrl = R.drawable.hearthstone_43fa8d20c80a94d5fb6d58a825d8362d3d52052657760a05cfecfb5f4517cd9c;
        a[233].type = "spell";
        a[233].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/43fa8d20c80a94d5fb6d58a825d8362d3d52052657760a05cfecfb5f4517cd9c.png";

        a[234].cnName = "加拉克苏斯大王";
        a[234].name = "777-lord-jaraxxus";
        a[234].cost = 9;
        a[234].golden = 0;
        a[234].rarity = "legendary";
        a[234].imgUrl = R.drawable.hearthstone_c7b8ebe350a1cb1358ffe2df6def124d4eef436347111e0860c5dca1d3d897ab;
        a[234].type = "minion";
        a[234].race = "demon";
        a[234].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/c7b8ebe350a1cb1358ffe2df6def124d4eef436347111e0860c5dca1d3d897ab.png";

        a[235].cnName = "怒火中烧";
        a[235].name = "22-inner-rage";
        a[235].cost = 0;
        a[235].golden = 0;
        a[235].rarity = "common";
        a[235].imgUrl = R.drawable.hearthstone_684dcbeba45f7622ecaf3b3335e6cd47abbfb300ecef4375a06917d4c2616937;
        a[235].type = "spell";
        a[235].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/684dcbeba45f7622ecaf3b3335e6cd47abbfb300ecef4375a06917d4c2616937.png";

        a[236].cnName = "升级";
        a[236].name = "511-upgrade";
        a[236].cost = 1;
        a[236].golden = 0;
        a[236].rarity = "rare";
        a[236].imgUrl = R.drawable.hearthstone_a8a2785b00cbcf45b0e9fc5585097bc826cead546e498a5352b7a2763ee7d65d;
        a[236].type = "spell";
        a[236].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/a8a2785b00cbcf45b0e9fc5585097bc826cead546e498a5352b7a2763ee7d65d.png";

        a[237].cnName = "盾牌猛击";
        a[237].name = "546-shield-slam";
        a[237].cost = 1;
        a[237].golden = 0;
        a[237].rarity = "epic";
        a[237].imgUrl = R.drawable.hearthstone_9826ee665e4f9b1395e868ab023402feac35c7999b7d2a7c8581815ab254bb01;
        a[237].type = "spell";
        a[237].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/9826ee665e4f9b1395e868ab023402feac35c7999b7d2a7c8581815ab254bb01.png";

        a[238].cnName = "严酷的监工";
        a[238].name = "285-cruel-taskmaster";
        a[238].cost = 2;
        a[238].golden = 0;
        a[238].rarity = "common";
        a[238].imgUrl = R.drawable.hearthstone_ae0e6e2b95917c461baf3655c9a1c79e0d857d79104c3cb5db99b1026144c80b;
        a[238].type = "minion";
        a[238].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/ae0e6e2b95917c461baf3655c9a1c79e0d857d79104c3cb5db99b1026144c80b.png";

        a[239].cnName = "战斗怒火";
        a[239].name = "400-battle-rage";
        a[239].cost = 2;
        a[239].golden = 0;
        a[239].rarity = "common";
        a[239].imgUrl = R.drawable.hearthstone_895c18926ee8b14559a6e6bb5e229c7e142887f19348c57e43ca267a26b22cd9;
        a[239].type = "spell";
        a[239].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/895c18926ee8b14559a6e6bb5e229c7e142887f19348c57e43ca267a26b22cd9.png";

        a[240].cnName = "铸甲师";
        a[240].name = "596-armorsmith";
        a[240].cost = 2;
        a[240].golden = 0;
        a[240].rarity = "rare";
        a[240].imgUrl = R.drawable.hearthstone_6a7016960dd151522e4ae493d704b7640dd55527ef78feece2cb4c93b865f75d;
        a[240].type = "minion";
        a[240].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/6a7016960dd151522e4ae493d704b7640dd55527ef78feece2cb4c93b865f75d.png";

        a[241].cnName = "命令怒吼";
        a[241].name = "1026-commanding-shout";
        a[241].cost = 2;
        a[241].golden = 0;
        a[241].rarity = "rare";
        a[241].imgUrl = R.drawable.hearthstone_febad58057106386494d73ec9ff73102b7a9d23c80b397498db8fea3bedf04e7;
        a[241].type = "spell";
        a[241].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/febad58057106386494d73ec9ff73102b7a9d23c80b397498db8fea3bedf04e7.png";

        a[242].cnName = "猛击";
        a[242].name = "1074-slam";
        a[242].cost = 2;
        a[242].golden = 0;
        a[242].rarity = "common";
        a[242].imgUrl = R.drawable.hearthstone_8e2be769246847e5c6a0a9e153a7d89f7b3f568566a4dbc4df9fa860b0f66a7a;
        a[242].type = "spell";
        a[242].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/8e2be769246847e5c6a0a9e153a7d89f7b3f568566a4dbc4df9fa860b0f66a7a.png";

        a[243].cnName = "狂暴";
        a[243].name = "1108-rampage";
        a[243].cost = 2;
        a[243].golden = 0;
        a[243].rarity = "common";
        a[243].imgUrl = R.drawable.hearthstone_933b9a5f406c60fc908576e45b2bcf18d8f3712c827d5ddf3d4392ab557702fb;
        a[243].type = "spell";
        a[243].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/933b9a5f406c60fc908576e45b2bcf18d8f3712c827d5ddf3d4392ab557702fb.png";

        a[244].cnName = "暴乱狂战士";
        a[244].name = "654-frothing-berserker";
        a[244].cost = 3;
        a[244].golden = 0;
        a[244].rarity = "rare";
        a[244].imgUrl = R.drawable.hearthstone_fc9e7415142358413d9cb349a021d360c364f21c19c0baabffbfafa6fec6d3d9;
        a[244].type = "minion";
        a[244].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/fc9e7415142358413d9cb349a021d360c364f21c19c0baabffbfafa6fec6d3d9.png";

        a[245].cnName = "阿拉希武器匠";
        a[245].name = "538-arathi-weaponsmith";
        a[245].cost = 4;
        a[245].golden = 0;
        a[245].rarity = "common";
        a[245].imgUrl = R.drawable.hearthstone_8d4f0aaa386f5911fbed409d405dd9f37e2096b19491e150de1564037f20c7fa;
        a[245].type = "minion";
        a[245].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/8d4f0aaa386f5911fbed409d405dd9f37e2096b19491e150de1564037f20c7fa.png";

        a[246].cnName = "致死打击";
        a[246].name = "804-mortal-strike";
        a[246].cost = 4;
        a[246].golden = 0;
        a[246].rarity = "rare";
        a[246].imgUrl = R.drawable.hearthstone_3bfb2d25808a5b7fca158b1e860a711069fd6484c005a0ff693304ed562f3f3f;
        a[246].type = "spell";
        a[246].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/3bfb2d25808a5b7fca158b1e860a711069fd6484c005a0ff693304ed562f3f3f.png";

        a[247].cnName = "绝命乱斗";
        a[247].name = "75-brawl";
        a[247].cost = 5;
        a[247].golden = 0;
        a[247].rarity = "epic";
        a[247].imgUrl = R.drawable.hearthstone_caec0dbf6d97da943413adac647787cbdf8fb2fec2909361fac36cad2b119eb4;
        a[247].type = "spell";
        a[247].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/caec0dbf6d97da943413adac647787cbdf8fb2fec2909361fac36cad2b119eb4.png";

        a[248].cnName = "血吼";
        a[248].name = "810-gorehowl";
        a[248].cost = 7;
        a[248].golden = 0;
        a[248].rarity = "epic";
        a[248].imgUrl = R.drawable.hearthstone_9a870c21ba62ffa943bcca925c3330a0a88260801f98b942226679ba885bc53c;
        a[248].type = "weapon";
        a[248].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/9a870c21ba62ffa943bcca925c3330a0a88260801f98b942226679ba885bc53c.png";

        a[249].cnName = "格罗玛什·地狱咆哮";
        a[249].name = "338-grommash-hellscream";
        a[249].cost = 8;
        a[249].golden = 0;
        a[249].rarity = "legendary";
        a[249].imgUrl = R.drawable.hearthstone_c70b64915380e809b13b21a47cf04d156d2ab9600eb2707d14ecd0d3b69c4004;
        a[249].type = "minion";
        a[249].fullImgUrl = "https://hearthstone.nosdn.127.net/hearthstone/c70b64915380e809b13b21a47cf04d156d2ab9600eb2707d14ecd0d3b69c4004.png";//数据库
    }//数据库
        if(JustGetNum){
            int[] t=new int[1];
            t[0]=a[CardNum].imgUrl;
            return t;
        }
        if(!DetailInfoFragment.s1_state&&!DetailInfoFragment.s2_state){
            int temp, n = 0, number1 = 0, number2 = 0;//number1用于判断是不是全白,number2判断多橙
            Random random = new Random();
            while (n < 5) {
                temp = random.nextInt(num_101) % (num_101 - num_1 + 1) + num_1;//生成的是闭区间1到100
                if (temp == 1) {
                    int num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    while (a[num].rarity != "legendary") {
                        num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    }
                    c[n] = a[num].imgUrl;
                    c[n + 11] = num;
                    number2++;
                } else if (temp >= 2 && temp <= 5) {
                    int num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    while (a[num].rarity != "epic") {
                        num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    }
                    c[n] = a[num].imgUrl;
                    c[n + 11] = num;
                } else if (temp >= 6 && temp <= 25) {
                    int num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    while (a[num].rarity != "rare") {
                        num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    }
                    c[n] = a[num].imgUrl;
                    c[n + 11] = num;
                } else {
                    int num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    while (a[num].rarity != "common") {
                        num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    }
                    c[n] = a[num].imgUrl;
                    c[n + 11] = num;
                    number1++;
                }//生成卡牌稀有度
                c[n + 6] = getrarity(temp);
                n++;
            }
            c[5] = 1;
            if (number1 == 5) {
                c[5] = 0;
                int num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                while (a[num].rarity != "rare") {
                    num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                }
                int temp2=random.nextInt(5) % 5;
                c[temp2] = a[num].imgUrl;
                c[temp2 + 11] = num;
            }//判断非洲 保证有蓝卡
            else if (number2 == 1) {
                c[5] = 2;
            }//判断小欧
            else if (number2 > 1) {
                c[5] = 3;
            }//判断大欧
        }//正常抽卡
        else if(DetailInfoFragment.s1_state){
            int temp, n = 0, number2 = 0;//number1用于判断是不是全白,number2判断多橙
            Random random = new Random();
            while (n < 5) {
                temp = random.nextInt(num_101) % (num_101 - num_1 + 1) + num_1;//生成的是闭区间1到100
                if (temp == 1) {
                    int num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    while (a[num].rarity != "legendary") {
                        num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    }
                    c[n] = a[num].imgUrl;
                    c[n + 11] = num;
                } else if (temp >= 2 && temp <= 5) {
                    int num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    while (a[num].rarity != "epic") {
                        num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    }
                    c[n] = a[num].imgUrl;
                    c[n + 11] = num;
                } else if (temp >= 6 && temp <= 25) {
                    int num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    while (a[num].rarity != "rare") {
                        num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    }
                    c[n] = a[num].imgUrl;
                    c[n + 11] = num;
                } else {
                    int num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    while (a[num].rarity != "common") {
                        num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                    }
                    c[n] = a[num].imgUrl;
                    c[n + 11] = num;
                }//生成卡牌稀有度
                c[n + 6] = getrarity(temp);
                n++;
            }
            {
                int num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                while (a[num].rarity != "legendary") {
                    num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                }
                int temp2=random.nextInt(5) % 5;//生成替换位置//这里莫名其妙的 本来应该是random.nextInt(4) % 5但是实测要5%5才对
                c[temp2 + 6] =3;
                c[temp2] = a[num].imgUrl;
                c[temp2 + 11] = num;
            }//替换一张卡为橙
            for(int i2=0;i2<5;i2++){
                if (c[i2+6]==3)number2++;
            }//检查最终欧洲值
            if (number2 == 1) {
                c[5] = 2;
            }//判断小欧
            else if (number2 > 1) {
                c[5] = 3;
            }//判断大欧
        }//必出橙
        else if(DetailInfoFragment.s2_state){
            int  n = 0;
            Random random = new Random();
            while (n < 5) {
                int num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                while (a[num].rarity != "legendary") {
                    num = random.nextInt(max) % (max - min + 1) + min;//获取随机数
                }
                c[n] = a[num].imgUrl;
                c[n + 11] = num;
                n++;
            }
            c[5]=3; c[6]=3; c[7]=3; c[8]=3; c[9]=3; c[10]=3;
        }//仅出橙
        return c;
    }
    static public int[] get_1_card(){
        boolean t1=DetailInfoFragment.s1_state;//为了让作弊2不影响单抽
        boolean t2=DetailInfoFragment.s2_state;
        DetailInfoFragment.s1_state=false;
        DetailInfoFragment.s2_state=false;
        int a[] = get_5_card(0);
        int[] b=new int[3];
        b[0]=a[0];
        b[1]=a[6];
        b[2]=a[11];
        DetailInfoFragment.s1_state=t1;
        DetailInfoFragment.s2_state=t2;
        return b;
    }
    static private int getrarity(int temp){
        if (temp == 1){ return 3;}
        else if (temp >= 2 && temp <= 5) {return 2;}
        else if (temp >= 6 && temp <= 25) {return 1;}
        else return 0;
    }
}