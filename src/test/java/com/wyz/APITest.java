package com.wyz;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;


public class APITest {
    public static void main(String[] args) throws IOException, JSONException {
        // 请求示例 url 默认请求参数已经URL编码处理
//        String key = "t13700273257";
//        String secret = "32577b95";
//        String kyckey = "t8049088306";  // 假设 kyckey 和 kycsecret 存在，此处为示例值，请使用您的 kyckey 和 kycsecret
//        String kycsecret = "8306c88e";
//        String url = "https://api-gw.onebound.cn/taobao/item_search/?key="+kyckey+"&secret="+kycsecret+"&q=女装&start_price=0&end_price=0&page=1&cat=0&discount_only=&sort=&page_size=&seller_info=&nick=&ppath=&imgid=&filter=";
//        JSONObject json = getRequestFromUrl(url);


//        String kyckey = "t8049088306";
//        String kycsecret = "8306c88e";
//        String keyword = "魔方";
//        String url = "https://api-gw.onebound.cn/jd/item_search/?key="+kyckey+"&secret="+kycsecret+"&q="+keyword+"&start_price=0&end_price=0&page=1&cat=0&discount_only=&sort=&seller_info=no&nick=&seller_info=&nick=&ppath=&imgid=&filter=";
//        JSONObject json = getRequestFromUrl(url);
        //JSONObject json = "{\"reason\":\"ok\",\"secache_date\":\"2024-12-26 20:34:23\",\"server_time\":\"Beijing/2024-12-26 20:34:23\",\"server_memory\":\"1.05MB\",\"cache\":0,\"call_args\":{\"q\":\"围巾\",\"cat\":\"0\",\"end_price\":\"0\",\"start_price\":\"0\",\"page\":\"1\"},\"translate_time\":0,\"language\":{\"default_lang\":\"cn\",\"current_lang\":\"cn\"},\"error\":\"\",\"execution_time\":\"1.596\",\"translate_status\":\"\",\"api_type\":\"taobao\",\"last_id\":\"3873465358\",\"secache\":\"675e5f871003a1bf826532808993cf15\",\"api_info\":\"today:8 max:110 all[9=8+1+0];expires:2024-12-29\",\"error_code\":\"0000\",\"client_ip\":\"39.174.145.36\",\"items\":{\"item\":[{\"detail_url\":\"https://item.taobao.com/item.htm?id=760287557316\",\"price\":\"29.99\",\"num_iid\":\"760287557316\",\"orginal_price\":\"29.99\",\"title\":\"保暖大耳狗甜美软妹围脖M\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01VB02o81XuGNPkFsUv_!!2206927662983.jpg\",\"seller_nick\":\"进店\",\"promotion_price\":\"29.99\",\"sales\":100,\"seller_id\":\"2206927662983\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=837455435787\",\"price\":\"88.50\",\"num_iid\":\"837455435787\",\"orginal_price\":\"88.50\",\"title\":\"精选澳洲wool纯羊毛格纹围巾英伦经典男女通用情侣款冬季保暖围脖\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01VoculQ1mQEjRgaKul_!!2206588314948-2-C2M.png\",\"seller_nick\":\"官方国货甄选\",\"promotion_price\":\"88.50\",\"sales\":100000,\"seller_id\":\"2206588314948\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=834836684965\",\"price\":\"44.00\",\"num_iid\":\"834836684965\",\"orginal_price\":\"44.00\",\"title\":\"李宁骑行围脖套男士秋冬季护颈\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01WS6w0M1KvYajx4VVR_!!4611686018427382826-0-item_pic.jpg\",\"seller_nick\":null,\"promotion_price\":\"44.00\",\"sales\":1000,\"seller_id\":\"893021226\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=852701518182\",\"price\":\"8.70\",\"num_iid\":\"852701518182\",\"orginal_price\":\"8.70\",\"title\":\"冬季围脖男女通用加绒加厚脖套户外骑行面罩百搭针织护颈套头围巾\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01FqtD5s2LY22GGAiGx_!!3937219703-0-C2M.jpg\",\"seller_nick\":\"天天特卖工厂\",\"promotion_price\":\"8.70\",\"sales\":10000,\"seller_id\":\"3937219703\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=853033517106\",\"price\":\"79.00\",\"num_iid\":\"853033517106\",\"orginal_price\":\"79.00\",\"title\":\"真蔚冬季新款韩版保暖围巾初恋蓝\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01iCmqt11yegcywP4Ye_!!4611686018427386748-0-item_pic.jpg\",\"seller_nick\":\"真蔚旗舰店\",\"promotion_price\":\"79.00\",\"sales\":1000,\"seller_id\":\"4099316604\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=836549185011\",\"price\":\"88.50\",\"num_iid\":\"836549185011\",\"orginal_price\":\"88.50\",\"title\":\"冬季格子韩版女100%羊毛围巾\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01OnHdaU1h1tcDwsuBN_!!2206584264218-0-C2M.jpg\",\"seller_nick\":\"好货严选工厂\",\"promotion_price\":\"88.50\",\"sales\":100000,\"seller_id\":\"2206584264218\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=835169404540\",\"price\":\"73.50\",\"num_iid\":\"835169404540\",\"orginal_price\":\"73.50\",\"title\":\"英国100%羊毛格子围巾女冬季学生百搭男保暖情侣围脖生日礼物冬日\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN017esdrJ1h1tbiATkwO_!!2206584264218-0-C2M.jpg\",\"seller_nick\":\"好货严选工厂\",\"promotion_price\":\"73.50\",\"sales\":100000,\"seller_id\":\"2206584264218\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=741990949689\",\"price\":\"199.00\",\"num_iid\":\"741990949689\",\"orginal_price\":\"199.00\",\"title\":\"尖货！100%澳洲wool纯羊毛围巾女冬季高级感2024新款围脖生日礼物\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01FIFDmD1hHvLyziaTx_!!0-item_pic.jpg\",\"seller_nick\":\"时岚旗舰店\",\"promotion_price\":\"199.00\",\"sales\":10000,\"seller_id\":\"2206533274253\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=740463295406\",\"price\":\"79.00\",\"num_iid\":\"740463295406\",\"orginal_price\":\"79.00\",\"title\":\"围巾披肩一体加大加宽\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01QXiHSA1yegV8cGLdh_!!0-item_pic.jpg\",\"seller_nick\":\"真蔚旗舰店\",\"promotion_price\":\"79.00\",\"sales\":10000,\"seller_id\":\"4099316604\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=840601682763\",\"price\":\"25.20\",\"num_iid\":\"840601682763\",\"orginal_price\":\"25.20\",\"title\":\"秋冬季围脖女士围巾骑车挂耳面罩\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN019SCAET2LY22oOdTi4_!!3937219703-0-C2M.jpg\",\"seller_nick\":\"天天特卖工厂\",\"promotion_price\":\"25.20\",\"sales\":100000,\"seller_id\":\"3937219703\"}],\"pagecount\":\"200\",\"item_weight_update\":0,\"real_total_results\":\"800000\",\"page\":\"1\",\"data_from\":\"cdy\",\"total_results\":\"800000\",\"page_size\":10},\"request_id\":\"gw-4.676d4d4dac500\",\"secache_time\":1735216463}\n";
        String originJson = "{\"reason\":\"ok\",\"secache_date\":\"2024-12-26 20:34:23\",\"server_time\":\"Beijing/2024-12-26 20:34:23\",\"server_memory\":\"1.05MB\",\"cache\":0,\"call_args\":{\"q\":\"围巾\",\"cat\":\"0\",\"end_price\":\"0\",\"start_price\":\"0\",\"page\":\"1\"},\"translate_time\":0,\"language\":{\"default_lang\":\"cn\",\"current_lang\":\"cn\"},\"error\":\"\",\"execution_time\":\"1.596\",\"translate_status\":\"\",\"api_type\":\"taobao\",\"last_id\":\"3873465358\",\"secache\":\"675e5f871003a1bf826532808993cf15\",\"api_info\":\"today:8 max:110 all[9=8+1+0];expires:2024-12-29\",\"error_code\":\"0000\",\"client_ip\":\"39.174.145.36\",\"items\":{\"item\":[{\"detail_url\":\"https://item.taobao.com/item.htm?id=760287557316\",\"price\":\"29.99\",\"num_iid\":\"760287557316\",\"orginal_price\":\"29.99\",\"title\":\"保暖大耳狗甜美软妹围脖M\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01VB02o81XuGNPkFsUv_!!2206927662983.jpg\",\"seller_nick\":\"进店\",\"promotion_price\":\"29.99\",\"sales\":100,\"seller_id\":\"2206927662983\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=837455435787\",\"price\":\"88.50\",\"num_iid\":\"837455435787\",\"orginal_price\":\"88.50\",\"title\":\"精选澳洲wool纯羊毛格纹围巾英伦经典男女通用情侣款冬季保暖围脖\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01VoculQ1mQEjRgaKul_!!2206588314948-2-C2M.png\",\"seller_nick\":\"官方国货甄选\",\"promotion_price\":\"88.50\",\"sales\":100000,\"seller_id\":\"2206588314948\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=834836684965\",\"price\":\"44.00\",\"num_iid\":\"834836684965\",\"orginal_price\":\"44.00\",\"title\":\"李宁骑行围脖套男士秋冬季护颈\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01WS6w0M1KvYajx4VVR_!!4611686018427382826-0-item_pic.jpg\",\"seller_nick\":null,\"promotion_price\":\"44.00\",\"sales\":1000,\"seller_id\":\"893021226\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=852701518182\",\"price\":\"8.70\",\"num_iid\":\"852701518182\",\"orginal_price\":\"8.70\",\"title\":\"冬季围脖男女通用加绒加厚脖套户外骑行面罩百搭针织护颈套头围巾\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01FqtD5s2LY22GGAiGx_!!3937219703-0-C2M.jpg\",\"seller_nick\":\"天天特卖工厂\",\"promotion_price\":\"8.70\",\"sales\":10000,\"seller_id\":\"3937219703\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=853033517106\",\"price\":\"79.00\",\"num_iid\":\"853033517106\",\"orginal_price\":\"79.00\",\"title\":\"真蔚冬季新款韩版保暖围巾初恋蓝\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01iCmqt11yegcywP4Ye_!!4611686018427386748-0-item_pic.jpg\",\"seller_nick\":\"真蔚旗舰店\",\"promotion_price\":\"79.00\",\"sales\":1000,\"seller_id\":\"4099316604\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=836549185011\",\"price\":\"88.50\",\"num_iid\":\"836549185011\",\"orginal_price\":\"88.50\",\"title\":\"冬季格子韩版女100%羊毛围巾\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01OnHdaU1h1tcDwsuBN_!!2206584264218-0-C2M.jpg\",\"seller_nick\":\"好货严选工厂\",\"promotion_price\":\"88.50\",\"sales\":100000,\"seller_id\":\"2206584264218\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=835169404540\",\"price\":\"73.50\",\"num_iid\":\"835169404540\",\"orginal_price\":\"73.50\",\"title\":\"英国100%羊毛格子围巾女冬季学生百搭男保暖情侣围脖生日礼物冬日\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN017esdrJ1h1tbiATkwO_!!2206584264218-0-C2M.jpg\",\"seller_nick\":\"好货严选工厂\",\"promotion_price\":\"73.50\",\"sales\":100000,\"seller_id\":\"2206584264218\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=741990949689\",\"price\":\"199.00\",\"num_iid\":\"741990949689\",\"orginal_price\":\"199.00\",\"title\":\"尖货！100%澳洲wool纯羊毛围巾女冬季高级感2024新款围脖生日礼物\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01FIFDmD1hHvLyziaTx_!!0-item_pic.jpg\",\"seller_nick\":\"时岚旗舰店\",\"promotion_price\":\"199.00\",\"sales\":10000,\"seller_id\":\"2206533274253\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=740463295406\",\"price\":\"79.00\",\"num_iid\":\"740463295406\",\"orginal_price\":\"79.00\",\"title\":\"围巾披肩一体加大加宽\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01QXiHSA1yegV8cGLdh_!!0-item_pic.jpg\",\"seller_nick\":\"真蔚旗舰店\",\"promotion_price\":\"79.00\",\"sales\":10000,\"seller_id\":\"4099316604\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=840601682763\",\"price\":\"25.20\",\"num_iid\":\"840601682763\",\"orginal_price\":\"25.20\",\"title\":\"秋冬季围脖女士围巾骑车挂耳面罩\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN019SCAET2LY22oOdTi4_!!3937219703-0-C2M.jpg\",\"seller_nick\":\"天天特卖工厂\",\"promotion_price\":\"25.20\",\"sales\":100000,\"seller_id\":\"3937219703\"}],\"pagecount\":\"200\",\"item_weight_update\":0,\"real_total_results\":\"800000\",\"page\":\"1\",\"data_from\":\"cdy\",\"total_results\":\"800000\",\"page_size\":10},\"request_id\":\"gw-4.676d4d4dac500\",\"secache_time\":1735216463}\n";
        // 创建JSONObject实例
        JSONObject json = new JSONObject(originJson);
        JSONObject items = json.getJSONObject("items");
        JSONArray itemArray = items.getJSONArray("item");
        System.out.println("JSONArray is");
        System.out.println(json);
        System.out.println("开始处理");
        // 创建一个新的 JSONArray 用来保存处理后的数据
        JSONArray resultArray = new JSONArray();

        // 遍历原始的 item 数组，提取相关信息
        for (int i = 0; i < itemArray.length(); i++) {
            JSONObject item = itemArray.getJSONObject(i);
            String title = item.getString("title");
            String price = item.getString("price");
            String num_iid = item.getString("num_iid");

            // 创建一个新的 JSONObject 来保存提取的字段
            JSONObject itemNode = new JSONObject();
            itemNode.put("title", title);
            itemNode.put("price", price);
            itemNode.put("num_iid", num_iid);

            // 将处理后的 itemNode 添加到结果数组中
            resultArray.put(itemNode);
        }
            // 输出整合后的 JSON 数组
            System.out.println(resultArray.toString(4)); // 格式化输出

//        for (int i = 0; i < itemArray.length(); i++) {
//            JSONObject item = itemArray.getJSONObject(i);
//            String title = item.getString("title");
//            String price = item.getString("price");
//            String num_iid = item.getString("num_iid");
//
//            // 打印输出
//            System.out.println("Title: " + title);
//            System.out.println("Price: " + price);
//            System.out.println("Num Iid: " + num_iid);
//            System.out.println();
//        }
    }
}
