package la.xiong.tv.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import la.xiong.tv.bean.LinkObject;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class HomeModel {

    public static final int TYPE_AD = 0;
    public static final int TYPE_CLASSIFY = 1;
    public static final int TYPE_RECOMMEND = 2;
    public static final int TYPE_LIVE = 3;

    @SerializedName("app-index")
    private List<AppindexBean> appindex;
    @SerializedName("app-classification")
    private List<AppclassificationBean> appclassification;
    @SerializedName("app-recommendation")
    private List<ApprecommendationBean> apprecommendation;
    @SerializedName("app-lol")
    private List<ApplolBean> applol;
    @SerializedName("app-beauty")
    private List<AppbeautyBean> appbeauty;
    @SerializedName("app-heartstone")
    private List<AppheartstoneBean> appheartstone;
    @SerializedName("app-huwai")
    private List<ApphuwaiBean> apphuwai;
    @SerializedName("app-overwatch")
    private List<AppoverwatchBean> appoverwatch;
    @SerializedName("app-blizzard")
    private List<AppblizzardBean> appblizzard;
    @SerializedName("app-qqfeiche")
    private List<AppqqfeicheBean> appqqfeiche;
    @SerializedName("app-mobilegame")
    private List<AppmobilegameBean> appmobilegame;
    @SerializedName("app-wangzhe")
    private List<AppwangzheBean> appwangzhe;
    @SerializedName("app-dota2")
    private List<Appdota2Bean> appdota2;
    @SerializedName("app-tvgame")
    private List<ApptvgameBean> apptvgame;
    @SerializedName("app-webgame")
    private List<AppwebgameBean> appwebgame;
    @SerializedName("app-dnf")
    private List<AppdnfBean> appdnf;
    @SerializedName("app-minecraft")
    private List<AppminecraftBean> appminecraft;
    private List<ListBean> list;

    public List<AppindexBean> getAppindex() {
        return appindex;
    }

    public void setAppindex(List<AppindexBean> appindex) {
        this.appindex = appindex;
    }

    public List<AppclassificationBean> getAppclassification() {
        return appclassification;
    }

    public void setAppclassification(List<AppclassificationBean> appclassification) {
        this.appclassification = appclassification;
    }

    public List<ApprecommendationBean> getApprecommendation() {
        return apprecommendation;
    }

    public void setApprecommendation(List<ApprecommendationBean> apprecommendation) {
        this.apprecommendation = apprecommendation;
    }

    public List<ApplolBean> getApplol() {
        return applol;
    }

    public void setApplol(List<ApplolBean> applol) {
        this.applol = applol;
    }

    public List<AppbeautyBean> getAppbeauty() {
        return appbeauty;
    }

    public void setAppbeauty(List<AppbeautyBean> appbeauty) {
        this.appbeauty = appbeauty;
    }

    public List<AppheartstoneBean> getAppheartstone() {
        return appheartstone;
    }

    public void setAppheartstone(List<AppheartstoneBean> appheartstone) {
        this.appheartstone = appheartstone;
    }

    public List<ApphuwaiBean> getApphuwai() {
        return apphuwai;
    }

    public void setApphuwai(List<ApphuwaiBean> apphuwai) {
        this.apphuwai = apphuwai;
    }

    public List<AppoverwatchBean> getAppoverwatch() {
        return appoverwatch;
    }

    public void setAppoverwatch(List<AppoverwatchBean> appoverwatch) {
        this.appoverwatch = appoverwatch;
    }

    public List<AppblizzardBean> getAppblizzard() {
        return appblizzard;
    }

    public void setAppblizzard(List<AppblizzardBean> appblizzard) {
        this.appblizzard = appblizzard;
    }

    public List<AppqqfeicheBean> getAppqqfeiche() {
        return appqqfeiche;
    }

    public void setAppqqfeiche(List<AppqqfeicheBean> appqqfeiche) {
        this.appqqfeiche = appqqfeiche;
    }

    public List<AppmobilegameBean> getAppmobilegame() {
        return appmobilegame;
    }

    public void setAppmobilegame(List<AppmobilegameBean> appmobilegame) {
        this.appmobilegame = appmobilegame;
    }

    public List<AppwangzheBean> getAppwangzhe() {
        return appwangzhe;
    }

    public void setAppwangzhe(List<AppwangzheBean> appwangzhe) {
        this.appwangzhe = appwangzhe;
    }

    public List<Appdota2Bean> getAppdota2() {
        return appdota2;
    }

    public void setAppdota2(List<Appdota2Bean> appdota2) {
        this.appdota2 = appdota2;
    }

    public List<ApptvgameBean> getApptvgame() {
        return apptvgame;
    }

    public void setApptvgame(List<ApptvgameBean> apptvgame) {
        this.apptvgame = apptvgame;
    }

    public List<AppwebgameBean> getAppwebgame() {
        return appwebgame;
    }

    public void setAppwebgame(List<AppwebgameBean> appwebgame) {
        this.appwebgame = appwebgame;
    }

    public List<AppdnfBean> getAppdnf() {
        return appdnf;
    }

    public void setAppdnf(List<AppdnfBean> appdnf) {
        this.appdnf = appdnf;
    }

    public List<AppminecraftBean> getAppminecraft() {
        return appminecraft;
    }

    public void setAppminecraft(List<AppminecraftBean> appminecraft) {
        this.appminecraft = appminecraft;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class AppindexBean {

        private LinkObject link_object;


        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }
    }

    public static class AppclassificationBean {
        /**
         * id : 404
         * title : 全民星秀
         * thumb : http://image.quanmin.tv/31debb10a798038323cb91eee5882eedjpg
         * link :
         * create_at : 2016-03-12 14:05:25
         * status : 1
         * fk : null
         * subtitle : 全民星秀
         * ext : {"classification":"beauty"}
         * slot_id : 106
         * priority : 2
         */

        private int id;
        private String title;
        private String thumb;
        private String link;
        private String create_at;
        private int status;
        private Object fk;
        private String subtitle;
        private ExtBean ext;
        private int slot_id;
        private int priority;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getCreate_at() {
            return create_at;
        }

        public void setCreate_at(String create_at) {
            this.create_at = create_at;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public Object getFk() {
            return fk;
        }

        public void setFk(Object fk) {
            this.fk = fk;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public ExtBean getExt() {
            return ext;
        }

        public void setExt(ExtBean ext) {
            this.ext = ext;
        }

        public int getSlot_id() {
            return slot_id;
        }

        public void setSlot_id(int slot_id) {
            this.slot_id = slot_id;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public static class ExtBean {
            /**
             * classification : beauty
             */

            private String classification;

            public String getClassification() {
                return classification;
            }

            public void setClassification(String classification) {
                this.classification = classification;
            }
        }
    }

    public static class ApprecommendationBean {
        /**
         * id : 1261
         * title : 萌脸主播跑酷
         * thumb :
         * link :
         * create_at : 2016-07-12 17:33:14
         * status : 1
         * fk : 3192601
         * subtitle :
         * content :
         * ext : null
         * slot_id : 104
         * priority : 0
         * link_object : {"no":"3192601","nick":"HT陈庆辉","avatar":"http://a.img.shouyintv.cn/w5VW101-normal","follow":"7656","uid":"3192601","play_at":"2017-02-15 16:17:53","screen":0,"views":"0","intro":"","videoQuality":"","thumb":"http://snap.quanmin.tv/3192601-1487152443-943.jpg?imageView2/2/w/390/","stream":"http://flv.quanmin.tv/live/3192601.flv","position":"外太空","announcement":"","id":"96119","video":"http://thumb.quanmin.tv/3192601.mp4?t=1487152200","slug":"","category_id":"38","cover":"3192601-1487152443-943.jpg","status":"2","recommend_image":"","weight":"0","start_time":"1487147738.96","check":"1","priv":"0","category_name":"街头文化","title":"跑酷","source":"ws","last_play_at":"","landscape":"1","view":"2681","love_cover":"http://image.quanmin.tv/love/bc0076015be2df2b94fc23619f979fedjpg","categoryId":"38","hidden":false,"play_status":true}
         */

        private int id;
        private String title;
        private String thumb;
        private String link;
        private String create_at;
        private int status;
        private String fk;
        private String subtitle;
        private String content;
        private Object ext;
        private int slot_id;
        private int priority;
        private LinkObject link_object;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getCreate_at() {
            return create_at;
        }

        public void setCreate_at(String create_at) {
            this.create_at = create_at;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getFk() {
            return fk;
        }

        public void setFk(String fk) {
            this.fk = fk;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public Object getExt() {
            return ext;
        }

        public void setExt(Object ext) {
            this.ext = ext;
        }

        public int getSlot_id() {
            return slot_id;
        }

        public void setSlot_id(int slot_id) {
            this.slot_id = slot_id;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }

    }

    public static class ApplolBean {
        /**
         * link_object : {"no":"666","nick":"解说小漠","avatar":"http://image.quanmin.tv/avatar/bd6033825a6541e5e0a26af5d8f0d560png?imageView2/2/w/300/","follow":"1208982","uid":"666","play_at":"2017-02-15 16:27:18","screen":0,"views":"0","intro":"【小漠新浪微博】weibo.com/ixmxiaomo \n【小漠腾讯微博】t.qq.com/lol-xiaomo \n\n【小漠娃娃店】wawa.ixm.tv/\n【小漠零食店】lolxiaochi.taobao.com\n【小漠男装店】xiezi.ixm.tv/\n【小漠男装店】lolhaoyifu.taobao.com/\n【小漠外设店】lolxiaomo.taobao.com/..","videoQuality":"234","thumb":"http://snap.quanmin.tv/666-1487152443-489.jpg?imageView2/2/w/390/","stream":"http://flv.quanmin.tv/live/666_L3.flv","position":"","announcement":"关注微博ixm解说小漠直播有预告","id":"100996","video":"http://thumb.quanmin.tv/666.mp4?t=1487152200","slug":"xiaomo","category_id":"1","cover":"666-1487152443-489.jpg","status":"2","recommend_image":"http://image.quanmin.tv/de73e608930d71bce9ba5793dd577b05jpg","weight":"0","start_time":"1487147238.486","check":"1","priv":"0","category_name":"英雄联盟","title":"小漠的王者之路今天开始！","source":"ws","last_play_at":"","landscape":"1","view":"1326741","app_shuffling_image":"http://image.quanmin.tv/4b58ee79b9c3d20d9572d17386ed3e4djpg","categoryId":"1","hidden":false,"play_status":true}
         */

        private LinkObject link_object;

        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }

    }

    public static class AppbeautyBean {
        /**
         * link_object : {"no":"2857912","nick":"冯立淼","avatar":"http://a.img.shouyintv.cn/uv2Z101-normal","follow":"24390","id":"38756","uid":"2857912","title":"不真希在来的路上了，我好激动","category_id":"4","slug":"leemio","intro":"","announcement":"","cover":"2857912-1487152443-394.jpg","play_at":"2017-02-15 17:38:44","last_play_at":"","view":"68219","views":"0","status":"2","priv":"0","landscape":"1","position":"外太空","weight":"0","check":"1","recommend_image":"http://bj.bcebos.com/mas-service/148497705843472ac86c5820a973be03f04b47e901668","videoQuality":"234","category_name":"全民星秀","screen":0,"start_time":"1487152171.448","source":"ws","thumb":"http://snap.quanmin.tv/2857912-1487152443-394.jpg?imageView2/2/w/390/","video":"http://thumb.quanmin.tv/2857912.mp4?t=1487152200","stream":"http://flv.quanmin.tv/live/2857912_L3.flv","app_shuffling_image":"http://bj.bcebos.com/mas-service/1484977047393d6298c91d1417d42596e0aa4cd8e9884","happy_image":"http://bj.bcebos.com/mas-service/1484977039539d6298c91d1417d42596e0aa4cd8e9884","categoryId":"4","hidden":false,"play_status":true}
         */

        private LinkObject link_object;

        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }


    }

    public static class AppheartstoneBean {
        /**
         * link_object : {"no":"2820986","nick":"全民丶不二","avatar":"http://image.quanmin.tv/avatar/0da06df7f7d48a32733aa9817b1d5f54gif?imageView2/2/w/300/","follow":"324210","id":"101156","uid":"2820986","title":"竞技场：5埋葬作死牧","category_id":"3","slug":"","intro":"竞技场","announcement":"每天下午2点到7点群号155714599","cover":"2820986-1487152494-110.jpg","play_at":"2017-02-15 14:37:24","last_play_at":"","view":"175720","views":"0","status":"2","priv":"0","landscape":"1","position":"","weight":"0","check":"1","recommend_image":"http://image.quanmin.tv/ab4f192a16a460e73349e438b98cb09cjpg","videoQuality":"234","category_name":"炉石传说","screen":0,"start_time":"1487140644.278","source":"ws","thumb":"http://snap.quanmin.tv/2820986-1487152494-110.jpg?imageView2/2/w/390/","video":"http://thumb.quanmin.tv/2820986.mp4?t=1487152200","stream":"http://flv.quanmin.tv/live/2820986_L3.flv","app_shuffling_image":"http://image.quanmin.tv/bc24fb3ccd647d93cbc48eac4ec6097cjpg","categoryId":"3","hidden":false,"play_status":true}
         */

        private LinkObject link_object;

        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }

    }

    public static class ApphuwaiBean {
        /**
         * link_object : {"no":"2639525","nick":"疯狂的行者","avatar":"http://a.img.shouyintv.cn/WYFY101-normal","follow":"248189","id":"97441","uid":"2639525","title":"疯狂的村庄第13天，继续搭房子","category_id":"13","slug":"","intro":"","announcement":"","cover":"2639525-1487152443-571.jpg","play_at":"2017-02-15 17:36:10","last_play_at":"","view":"75222","views":"0","status":"2","priv":"0","landscape":"1","position":"外太空","weight":"0","check":"1","recommend_image":"http://image.quanmin.tv/c5fa9f14499afa8042d5011c5900f390jpg","videoQuality":"234","category_name":"全民户外","screen":0,"start_time":"1487151372.406","source":"ws","thumb":"http://snap.quanmin.tv/2639525-1487152443-571.jpg?imageView2/2/w/390/","video":"http://thumb.quanmin.tv/2639525.mp4?t=1487152200","stream":"http://flv.quanmin.tv/live/2639525_L3.flv","app_shuffling_image":"http://image.quanmin.tv/7f42d593e733eb3447b34132cded15e4jpg","love_cover":"http://image.quanmin.tv/love/c9ea81fd3e9792bd675e8919a03b2a37jpg","categoryId":"13","hidden":false,"play_status":true}
         */

        private LinkObject link_object;

        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }

    }

    public static class AppoverwatchBean {
        /**
         * link_object : {"no":"3755931","nick":"马豌豆儿","avatar":"http://image.quanmin.tv/avatar/4f89e9f169dcd3707bd089f01bb9e387jpg?imageView2/2/w/300/","follow":"32700","id":"96327","uid":"3755931","title":"豌豆：请。。。。。给我一缸狗粮！！！","category_id":"15","slug":"moss","intro":"","announcement":"不出状况5点开播 190949700群","cover":"3755931-1487152494-916.jpg","play_at":"2017-02-15 15:50:04","last_play_at":"","view":"31991","views":"0","status":"2","priv":"0","landscape":"1","position":"","weight":"0","check":"1","recommend_image":"http://image.quanmin.tv/e308869f9956f7f81d91de506e281bafjpg","videoQuality":"","category_name":"守望先锋","screen":0,"start_time":"1487145004.149","source":"ws","thumb":"http://snap.quanmin.tv/3755931-1487152494-916.jpg?imageView2/2/w/390/","video":"http://thumb.quanmin.tv/3755931.mp4?t=1487152200","stream":"http://flv.quanmin.tv/live/3755931_L3.flv","app_shuffling_image":"http://image.quanmin.tv/ccb1a79b474df261d833c3bee0d0fc8bjpg","categoryId":"15","hidden":false,"play_status":true}
         */

        private LinkObject link_object;

        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }

    }

    public static class AppblizzardBean {
        /**
         * link_object : {"no":"4719251","nick":"西呱的睡神","avatar":"http://image.quanmin.tv/avatar/47695f6694e6c938cf4757eba61c7684?imageView2/2/w/300/","follow":"53793","uid":"4719251","play_at":"2017-02-15 17:27:33","screen":0,"views":"0","intro":"【魔兽世界】 十区部落冰霜之刃 恶魔猎手\r\n出售4核心层DH，订制DH插件。低保大米门票，\r\n战网ID： 温存丶洋#5149 & 小西呱呱的睡神#5660。","videoQuality":"34","thumb":"http://snap.quanmin.tv/4719251-1487152443-936.jpg?imageView2/2/w/390/","stream":"http://flv.quanmin.tv/live/4719251_L3.flv","position":"","announcement":"DH插件需要的详谈，另出售4核心橙DH。","id":"55661","video":"http://thumb.quanmin.tv/4719251.mp4?t=1487152200","slug":"shuishen","category_id":"8","cover":"4719251-1487152443-936.jpg","status":"2","recommend_image":"http://image.quanmin.tv/e8c524524500ef8b3ac9f576746bf436jpg","weight":"0","start_time":"1487150853.834","check":"1","priv":"0","category_name":"暴雪经典","title":"【魔兽世界】lalalala","source":"ws","last_play_at":"","landscape":"1","view":"15866","app_shuffling_image":"http://image.quanmin.tv/adf3ebdac86dded08fef5db092e894a5jpg","categoryId":"8","hidden":false,"play_status":true}
         */

        private LinkObject link_object;

        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }

    }


    public static class AppqqfeicheBean {
        /**
         * link_object : {"no":"5475428","nick":"全民TV小子哥","avatar":"http://image.quanmin.tv/avatar/7fff6c99789fc7355514494c8b57c37d?imageView2/2/w/300/","follow":"20895","id":"96361","uid":"5475428","title":"上直播的老板滴滴滴我，下单就跑！","category_id":"30","slug":"","intro":"","announcement":"","cover":"5475428-1487152494-219.jpg","play_at":"2017-02-15 16:47:29","last_play_at":"","view":"14755","views":"0","status":"2","priv":"0","landscape":"1","position":"外太空","weight":"0","check":"1","recommend_image":"","videoQuality":"","category_name":"QQ飞车","screen":0,"start_time":"1487148449.584","source":"ws","thumb":"http://snap.quanmin.tv/5475428-1487152494-219.jpg?imageView2/2/w/390/","video":"http://thumb.quanmin.tv/5475428.mp4?t=1487152200","stream":"http://flv.quanmin.tv/live/5475428.flv","categoryId":"30","hidden":false,"play_status":true}
         */

        private LinkObject link_object;

        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }

    }

    public static class AppmobilegameBean {
        /**
         * link_object : {"no":"5813140","nick":"tc猫咪","avatar":"http://q.qlogo.cn/qqapp/101333140/5CB1491C39621CD86C582F5CC86C6A3B/100","follow":"7624","uid":"5813140","play_at":"2017-02-15 13:49:49","screen":0,"views":"0","intro":"直播时间 ：每月1-24日 （周一休息）晚6：00-10：00直播\n\n1群号75794001  、2群号485611086 欢迎加入。","videoQuality":"","thumb":"http://snap.quanmin.tv/5813140-1487152462-348.jpg?imageView2/2/w/390/","stream":"http://flv.quanmin.tv/live/5813140.flv","position":"","announcement":"群号485611086","id":"96939","slug":"ttfc","video":"http://thumb.quanmin.tv/5813140.mp4?t=1487152200","category_id":"14","cover":"5813140-1487152462-348.jpg","status":"2","recommend_image":"","weight":"0","start_time":"1487137789.286","check":"1","priv":"0","category_name":"手游专区","title":"今晚有事，，先不播啦 sorry","source":"ws","last_play_at":"","landscape":"1","view":"11497","categoryId":"14","hidden":false,"play_status":true}
         */

        private LinkObject link_object;

        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }

    }

    public static class AppwangzheBean {
        /**
         * link_object : {"no":"3722","nick":"Zn幽魂","avatar":"http://image.quanmin.tv/avatar/68561c8dd6b2e695db4414c0ae2aaf4fpng?imageView2/2/w/300/","follow":"109272","id":"101006","uid":"3722","title":"Zn幽魂 老司机带大家开凌晨","category_id":"17","slug":"","intro":"","announcement":"Zn幽魂直播粉丝群 470087694","cover":"3722-1487152493-109.jpg","play_at":"2017-02-15 13:13:13","last_play_at":"","view":"34449","views":"0","status":"2","priv":"0","landscape":"1","position":"","weight":"0","check":"1","recommend_image":"","videoQuality":"","category_name":"王者荣耀","screen":0,"start_time":"1487135592.963","source":"ws","thumb":"http://snap.quanmin.tv/3722-1487152493-109.jpg?imageView2/2/w/390/","video":"http://thumb.quanmin.tv/3722.mp4?t=1487152200","stream":"http://flv.quanmin.tv/live/3722.flv","love_cover":"http://image.quanmin.tv/love/649d8aaa300c272f823ea0147ec78691jpg","categoryId":"17","hidden":false,"play_status":true}
         */

        private LinkObject link_object;

        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }

    }

    public static class Appdota2Bean {
        /**
         * link_object : {"no":"1381800","nick":"cQ_Jay","avatar":"http://image.quanmin.tv/avatar/96b6a5b571fc5dec93e1d9e25e510886gif?imageView2/2/w/300/","follow":"1992","id":"100567","uid":"1381800","title":"中路一绝。 cQ.Jay","category_id":"2","slug":"cqjay","intro":"主播只是单纯的1个帅哥而已。","announcement":"","cover":"1381800-1487152443-404.jpg","play_at":"2017-02-15 04:58:55","last_play_at":"","view":"10455","views":"0","status":"2","priv":"0","landscape":"1","position":"","weight":"0","check":"1","recommend_image":"","videoQuality":"","category_name":"DOTA2","screen":0,"thumb":"http://snap.quanmin.tv/1381800-1487152443-404.jpg?imageView2/2/w/390/","video":"http://thumb.quanmin.tv/1381800.mp4?t=1487152200","start_time":"1487105935.44","source":"ws","stream":"http://flv.quanmin.tv/live/1381800.flv","categoryId":"2","hidden":false,"play_status":true}
         */

        private LinkObject link_object;

        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }

    }

    public static class ApptvgameBean {
        /**
         * link_object : {"no":"911","nick":"徐老师LIVE","avatar":"http://image.quanmin.tv/avatar/269782ed0cd2344143bab25fa9b22749?imageView2/2/w/300/","follow":"266505","id":"101000","uid":"911","title":"徐老师：先玩会儿<模拟人生4>","category_id":"5","slug":"xulaoshi","intro":"","announcement":"直播时间：周一到周四，5:00开播","cover":"911-1487152443-23.jpg","play_at":"2017-02-15 16:59:55","last_play_at":"","view":"528318","views":"0","status":"2","priv":"0","landscape":"1","position":"外太空","weight":"0","check":"1","recommend_image":"http://bj.bcebos.com/mas-service/14842218149607506e1bd2fba946e4e9077903c97d699","videoQuality":"234","category_name":"单机主机","screen":0,"start_time":"1487149195.847","source":"ws","thumb":"http://snap.quanmin.tv/911-1487152443-23.jpg?imageView2/2/w/390/","video":"http://thumb.quanmin.tv/911.mp4?t=1487152200","stream":"http://flv.quanmin.tv/live/911_L3.flv","app_shuffling_image":"http://bj.bcebos.com/mas-service/1484129348109fdcb02a99f10b0a5aa714ee4a11c968c","categoryId":"5","hidden":false,"play_status":true}
         */

        private LinkObject link_object;

        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }
    }

    public static class AppwebgameBean {
        /**
         * link_object : {"no":"14138958","nick":"18","avatar":"","follow":"1013","id":"247825","uid":"1839055730","title":"冒险岛新区，送FFN武器，想玩的一起来","category_id":"11","slug":"","intro":"","announcement":"","cover":"1839055730-1487152443-462.jpg","play_at":"2017-02-15 13:25:37","last_play_at":"","view":"7681","views":"0","status":"2","priv":"0","landscape":"1","position":"外太空","weight":"0","check":"1","videoQuality":"","category_name":"网游竞技","start_time":"1487144092.118","source":"ws","stream":"http://flv.quanmin.tv/live/1839055730.flv","thumb":"http://snap.quanmin.tv/1839055730-1487152443-462.jpg?imageView2/2/w/390/","video":"http://thumb.quanmin.tv/1839055730.mp4?t=1487152200","screen":0,"categoryId":"11","hidden":false,"play_status":true}
         */

        private LinkObject link_object;

        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }

    }

    public static class AppdnfBean {
        /**
         * link_object : {"no":"13731339","nick":"小苏妲","avatar":"http://a.img.shouyintv.cn/vRab101-normal","follow":"446","id":"244254","uid":"1767503654","title":"小苏妲：这么可爱一定是男孩子","category_id":"10","slug":"xiaosuda","intro":"","announcement":"主播直播通知群：201600566","cover":"1767503654-1487152443-915.jpg","play_at":"2017-02-15 16:21:22","last_play_at":"","view":"22448","views":"0","status":"2","priv":"0","landscape":"1","position":"外太空","weight":"0","check":"1","videoQuality":"","category_name":"DNF","start_time":"1487147210.636","source":"ws","stream":"http://flv.quanmin.tv/live/1767503654.flv","thumb":"http://snap.quanmin.tv/1767503654-1487152443-915.jpg?imageView2/2/w/390/","video":"http://thumb.quanmin.tv/1767503654.mp4?t=1487152200","screen":0,"categoryId":"10","hidden":false,"play_status":true}
         */

        private LinkObject link_object;

        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }

    }

    public static class AppminecraftBean {
        /**
         * link_object : {"no":"14061857","nick":"创世神建筑","avatar":"http://a.img.shouyintv.cn/CQVZ101-normal","follow":"82","id":"245864","uid":"1761318696","title":"我的世界 - 优秀短片视频大集合！","category_id":"12","slug":"","intro":"","announcement":"","cover":"1761318696-1487152494-670.jpg","play_at":"2017-02-13 13:28:34","last_play_at":"","view":"493","views":"0","status":"2","priv":"0","landscape":"1","position":"外太空","weight":"0","check":"1","videoQuality":"","category_name":"我的世界","start_time":"1486963714.406","source":"ws","stream":"http://flv.quanmin.tv/live/1761318696.flv","thumb":"http://snap.quanmin.tv/1761318696-1487152494-670.jpg?imageView2/2/w/390/","video":"http://thumb.quanmin.tv/1761318696.mp4?t=1487152200","screen":0,"categoryId":"12","hidden":false,"play_status":true}
         */

        private LinkObject link_object;

        public LinkObject getLink_object() {
            return link_object;
        }

        public void setLink_object(LinkObject link_object) {
            this.link_object = link_object;
        }

    }

    public static class ListBean implements Serializable, MultiItemEntity {
        /**
         * slug : app-index
         * name : 首页轮播
         * category_slug :
         */

        public static final int TYPE_AD = 0;
        public static final int TYPE_CLASSIFY = 1;
        public static final int TYPE_LIVE = 2;
        public static final int TYPE_RECOMMEND = 3;

        private String slug;
        private String name;
        private String category_slug;

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory_slug() {
            return category_slug;
        }

        public void setCategory_slug(String category_slug) {
            this.category_slug = category_slug;
        }

        @Override
        public int getItemType() {
            return itemType;
        }

        public int itemType;
    }
}
