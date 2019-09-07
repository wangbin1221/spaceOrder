package com.example.imeeting.modules.search.model;

import java.util.List;

/**
 * description:
 * created by wangbin on 2019/6/8
 */
public class LocationResponse {

    /**
     * tuijian : null
     * xingzhengqu : [{"id":"158","city":"南京","title":"不限","type":"行政区","recommend":"0","sort":"0","content":null},{"id":"121","city":"南京","title":"玄武区","type":"行政区","recommend":"0","sort":"1","content":null},{"id":"114","city":"南京","title":"秦淮区","type":"行政区","recommend":"0","sort":"2","content":null},{"id":"120","city":"南京","title":"鼓楼区","type":"行政区","recommend":"0","sort":"3","content":null},{"id":"115","city":"南京","title":"雨花台区","type":"行政区","recommend":"0","sort":"4","content":null},{"id":"118","city":"南京","title":"建邺区","type":"行政区","recommend":"0","sort":"5","content":null},{"id":"117","city":"南京","title":"栖霞区","type":"行政区","recommend":"0","sort":"6","content":null},{"id":"113","city":"南京","title":"江宁区","type":"行政区","recommend":"0","sort":"7","content":null},{"id":"119","city":"南京","title":"浦口区","type":"行政区","recommend":"0","sort":"8","content":null},{"id":"122","city":"南京","title":"六合区","type":"行政区","recommend":"0","sort":"9","content":null},{"id":"123","city":"南京","title":"高淳区","type":"行政区","recommend":null,"sort":"10","content":null},{"id":"124","city":"南京","title":"溧水区","type":"行政区","recommend":null,"sort":"11","content":null}]
     * shangyequ : [{"id":"157","city":"南京","title":"不限","type":"商业区","recommend":"0","sort":"0","content":null},{"id":"1051","city":"南京","title":"龙眠大道","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"339","city":"南京","title":"南京南站","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"181","city":"南京","title":"中山陵","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"182","city":"南京","title":"莫愁湖","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"343","city":"南京","title":"江宁东山","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"338","city":"南京","title":"明故宫","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"347","city":"南京","title":"高淳地区","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"348","city":"南京","title":"溧水地区","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"349","city":"南京","title":"六合地区","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"350","city":"南京","title":"禄口地区","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"351","city":"南京","title":"九龙湖","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"352","city":"南京","title":"汤山度假区","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"353","city":"南京","title":"老山风景区","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"1047","city":"南京","title":"新模范马路","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"1049","city":"南京","title":"麒麟","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"340","city":"南京","title":"雨花台","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"178","city":"南京","title":"奥体中心","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"341","city":"南京","title":"鼓楼","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"342","city":"南京","title":"中央门","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"344","city":"南京","title":"下关","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"337","city":"南京","title":"河西南","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"174","city":"南京","title":"龙江","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"345","city":"南京","title":"栖霞","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"346","city":"南京","title":"银杏湖/大塘金","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"177","city":"南京","title":"玄武湖","type":"商业区","recommend":"0","sort":"1","content":null},{"id":"126","city":"南京","title":"新街口","type":"商业区","recommend":"0","sort":"12","content":null},{"id":"127","city":"南京","title":"夫子庙","type":"商业区","recommend":"0","sort":"13","content":null},{"id":"128","city":"南京","title":"湖南路","type":"商业区","recommend":"0","sort":"14","content":null},{"id":"130","city":"南京","title":"百家湖","type":"商业区","recommend":"0","sort":"16","content":null},{"id":"131","city":"南京","title":"江北新区","type":"商业区","recommend":"0","sort":"17","content":null},{"id":"132","city":"南京","title":"仙林","type":"商业区","recommend":"0","sort":"18","content":null},{"id":"171","city":"南京","title":"老门东","type":"商业区","recommend":"0","sort":"20","content":null},{"id":"1044","city":"南京","title":"集庆门地区","type":"商业区","recommend":"0","sort":"21","content":null},{"id":"1045","city":"南京","title":"新港开发区","type":"商业区","recommend":"0","sort":"22","content":null},{"id":"1046","city":"南京","title":"软件大道","type":"商业区","recommend":"0","sort":"23","content":null},{"id":"1050","city":"南京","title":"上海路","type":"商业区","recommend":"0","sort":"24","content":null}]
     * ditiexian : [{"id":"137","title":"1号线","stations":[{"content":"不限"},{"content":"迈皋桥"},{"content":"红山动物园"},{"content":"南京站"},{"content":"新模范马路"},{"content":"玄武门"},{"content":"鼓楼"},{"content":"珠江路"},{"content":"新街口"},{"content":"张府园"},{"content":"三山街"},{"content":"中华门"},{"content":"安德门"},{"content":"天隆寺"},{"content":"软件大道"},{"content":"花神庙"},{"content":"南京南站"},{"content":"双龙大道"},{"content":"河定桥"},{"content":"胜太路"},{"content":"百家湖"},{"content":"小龙湾"},{"content":"竹山路"},{"content":"天印大道"},{"content":"龙眠大道"},{"content":"南京医科大学"},{"content":"南京交院"},{"content":"中国药科大学"}]},{"id":"138","title":"2号线","stations":[{"content":"不限"},{"content":"油坊桥"},{"content":"雨润大街"},{"content":"元通"},{"content":"奥体东"},{"content":"兴隆大街"},{"content":"集庆门大街"},{"content":"云锦路"},{"content":"莫愁湖"},{"content":"汉中门"},{"content":"上海路"},{"content":"新街口"},{"content":"大行宫"},{"content":"西安门"},{"content":"明故宫"},{"content":"苜蓿园"},{"content":"下马坊"},{"content":"孝陵卫"},{"content":"钟灵街"},{"content":"马群"},{"content":"金马路"},{"content":"仙鹤门"},{"content":"学则路"},{"content":"仙林中心"},{"content":"羊山公园"},{"content":"南大仙林校区"},{"content":"经天路"}]},{"id":"139","title":"3号线","stations":[{"content":"不限"},{"content":"林场"},{"content":"星火路"},{"content":"东大成贤学院"},{"content":"泰冯路"},{"content":"天润城"},{"content":"柳州东路"},{"content":"上元门"},{"content":"五塘广场"},{"content":"小市"},{"content":"南京站"},{"content":"南京林业大学"},{"content":"鸡鸣寺"},{"content":"浮桥"},{"content":"大行宫"},{"content":"常府街"},{"content":"夫子庙"},{"content":"武定门"},{"content":"雨花门"},{"content":"卡子门"},{"content":"大明路"},{"content":"明发广场"},{"content":"南京南站"},{"content":"宏运大道"},{"content":"胜太西路"},{"content":"天元西路"},{"content":"九龙湖"},{"content":"诚信大道"},{"content":"东大九龙湖"},{"content":"秣周东路"}]},{"id":"140","title":"4号线","stations":[{"content":"不限"},{"content":"龙江"},{"content":"南艺.草场门"},{"content":"云南路"},{"content":"鼓楼"},{"content":"鸡鸣寺"},{"content":"九华山"},{"content":"岗子村"},{"content":"蒋王庙"},{"content":"王家湾"},{"content":"聚宝山"},{"content":"苏宁总部"},{"content":"金马路"},{"content":"汇通路"},{"content":"灵山"},{"content":"东流"},{"content":"孟北"},{"content":"西岗桦墅"},{"content":"仙林湖"}]},{"id":"141","title":"10号线","stations":[{"content":"不限"},{"content":"安德门"},{"content":"小行"},{"content":"中胜"},{"content":"元通"},{"content":"奥体中心"},{"content":"梦都大街"},{"content":"绿博园"},{"content":"江心洲"},{"content":"临江路"},{"content":"浦口万汇城"},{"content":"南京工业大学"},{"content":"龙华路"},{"content":"文德路"},{"content":"雨山路"}]},{"id":"143","title":"S1号线","stations":[{"content":"不限"},{"content":"南京南站"},{"content":"翠屏山"},{"content":"佛城西路"},{"content":"吉印大道"},{"content":"正方中路"},{"content":"翔宇路北"},{"content":"翔宇路南"},{"content":"空港新城江宁"}]},{"id":"293","title":"S3号线","stations":[{"content":"不限"},{"content":"高家冲"},{"content":"林山"},{"content":"桥林新城"},{"content":"石碛河"},{"content":"双垅"},{"content":"兰花塘"},{"content":"马骡圩"},{"content":"刘村"},{"content":"天保"},{"content":"高庙路"},{"content":"吴侯街"},{"content":"平良大街"},{"content":"永初路"},{"content":"油坊桥"},{"content":"贾西"},{"content":"春江路"},{"content":"铁心桥"},{"content":"景明佳园"},{"content":"南京南站"}]},{"id":"312","title":"S8号线","stations":[{"content":"不限"},{"content":"泰山新村"},{"content":"泰冯路"},{"content":"高新开发区"},{"content":"信息工程大学"},{"content":"卸甲甸"},{"content":"大厂"},{"content":"葛塘"},{"content":"长芦"},{"content":"化工园"},{"content":"六合开发区"},{"content":"龙池"},{"content":"雄州"},{"content":"凤凰山公园"},{"content":"方州广场"},{"content":"沈桥"},{"content":"八百湖"},{"content":"金牛湖"}]},{"id":"330","title":"S9号线","stations":[{"content":"不限"},{"content":"翔宇路南"},{"content":"铜山"},{"content":"石湫"},{"content":"明觉"},{"content":"团结圩"},{"content":"高淳"}]},{"id":"355","title":"S7号线","stations":[{"content":"不限"},{"content":"空港新城江宁"},{"content":"柘塘"},{"content":"空港新城溧水"},{"content":"群力"},{"content":"卧龙湖"},{"content":"中山湖"},{"content":"溧水"},{"content":"幸庄"},{"content":"无想山"}]}]
     */

    private Object tuijian;
    private List<XingzhengquBean> xingzhengqu;
    private List<ShangyequBean> shangyequ;
    private List<DitiexianBean> ditiexian;

    public Object getTuijian() {
        return tuijian;
    }

    public void setTuijian(Object tuijian) {
        this.tuijian = tuijian;
    }

    public List<XingzhengquBean> getXingzhengqu() {
        return xingzhengqu;
    }

    public void setXingzhengqu(List<XingzhengquBean> xingzhengqu) {
        this.xingzhengqu = xingzhengqu;
    }

    public List<ShangyequBean> getShangyequ() {
        return shangyequ;
    }

    public void setShangyequ(List<ShangyequBean> shangyequ) {
        this.shangyequ = shangyequ;
    }

    public List<DitiexianBean> getDitiexian() {
        return ditiexian;
    }

    public void setDitiexian(List<DitiexianBean> ditiexian) {
        this.ditiexian = ditiexian;
    }

    public static class XingzhengquBean {
        /**
         * id : 158
         * city : 南京
         * title : 不限
         * type : 行政区
         * recommend : 0
         * sort : 0
         * content : null
         */

        private String id;
        private String city;
        private String title;
        private String type;
        private String recommend;
        private String sort;
        private Object content;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getRecommend() {
            return recommend;
        }

        public void setRecommend(String recommend) {
            this.recommend = recommend;
        }

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
        }

        public Object getContent() {
            return content;
        }

        public void setContent(Object content) {
            this.content = content;
        }
    }

    public static class ShangyequBean {
        /**
         * id : 157
         * city : 南京
         * title : 不限
         * type : 商业区
         * recommend : 0
         * sort : 0
         * content : null
         */

        private String id;
        private String city;
        private String title;
        private String type;
        private String recommend;
        private String sort;
        private Object content;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getRecommend() {
            return recommend;
        }

        public void setRecommend(String recommend) {
            this.recommend = recommend;
        }

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
        }

        public Object getContent() {
            return content;
        }

        public void setContent(Object content) {
            this.content = content;
        }
    }

    public static class DitiexianBean {
        /**
         * id : 137
         * title : 1号线
         * stations : [{"content":"不限"},{"content":"迈皋桥"},{"content":"红山动物园"},{"content":"南京站"},{"content":"新模范马路"},{"content":"玄武门"},{"content":"鼓楼"},{"content":"珠江路"},{"content":"新街口"},{"content":"张府园"},{"content":"三山街"},{"content":"中华门"},{"content":"安德门"},{"content":"天隆寺"},{"content":"软件大道"},{"content":"花神庙"},{"content":"南京南站"},{"content":"双龙大道"},{"content":"河定桥"},{"content":"胜太路"},{"content":"百家湖"},{"content":"小龙湾"},{"content":"竹山路"},{"content":"天印大道"},{"content":"龙眠大道"},{"content":"南京医科大学"},{"content":"南京交院"},{"content":"中国药科大学"}]
         */

        private String id;
        private String title;
        private List<StationsBean> stations;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<StationsBean> getStations() {
            return stations;
        }

        public void setStations(List<StationsBean> stations) {
            this.stations = stations;
        }

        public static class StationsBean {
            /**
             * content : 不限
             */

            private String content;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }
    }
}
