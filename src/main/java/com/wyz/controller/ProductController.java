package com.wyz.controller;

import com.alibaba.fastjson.JSON;
import com.wyz.pojo.Product;
import com.wyz.pojo.Result;
import com.wyz.service.ProductService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import static com.wyz.utils.APIUtil.getRequestFromUrl;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:5173", allowedHeaders = "*", allowCredentials = "true")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.OPTIONS)
    public ResponseEntity<Void> handleOptions() {
        System.out.println("Received OPTIONS request");  // 你可以在这里打印日志
        return ResponseEntity.ok()
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, OPTIONS")
                .header("Access-Control-Allow-Headers", "Content-Type, Authorization")
                .build();
    }

    @GetMapping("/list")
    public Result<String> list() {

        return Result.success("所有商品数据...");

    }
    @PostMapping("/show")
    public Result<String> show(@RequestBody String keyword) {
        System.out.println("终端输出："+keyword);
        return Result.success("show: " + keyword);
    }

    @PostMapping("/tbsearch")
    public Result<String> TBsearch(String keyword) throws IOException {


        System.out.println("查询关键词为"+keyword);
        String kyckey = "t8049088306";
        String kycsecret = "8306c88e";
        String url = "https://api-gw.onebound.cn/taobao/item_search/?key="+kyckey+"&secret="+kycsecret+"&q="+keyword+"&start_price=0&end_price=0&page=1&cat=0&discount_only=&sort=&page_size=&seller_info=&nick=&ppath=&imgid=&filter=";
        JSONObject json = getRequestFromUrl(url);

        //
        //String originJson = "{\"reason\":\"ok\",\"secache_date\":\"2024-12-26 20:34:23\",\"server_time\":\"Beijing/2024-12-26 20:34:23\",\"server_memory\":\"1.05MB\",\"cache\":0,\"call_args\":{\"q\":\"围巾\",\"cat\":\"0\",\"end_price\":\"0\",\"start_price\":\"0\",\"page\":\"1\"},\"translate_time\":0,\"language\":{\"default_lang\":\"cn\",\"current_lang\":\"cn\"},\"error\":\"\",\"execution_time\":\"1.596\",\"translate_status\":\"\",\"api_type\":\"taobao\",\"last_id\":\"3873465358\",\"secache\":\"675e5f871003a1bf826532808993cf15\",\"api_info\":\"today:8 max:110 all[9=8+1+0];expires:2024-12-29\",\"error_code\":\"0000\",\"client_ip\":\"39.174.145.36\",\"items\":{\"item\":[{\"detail_url\":\"https://item.taobao.com/item.htm?id=760287557316\",\"price\":\"29.99\",\"num_iid\":\"760287557316\",\"orginal_price\":\"29.99\",\"title\":\"保暖大耳狗甜美软妹围脖M\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01VB02o81XuGNPkFsUv_!!2206927662983.jpg\",\"seller_nick\":\"进店\",\"promotion_price\":\"29.99\",\"sales\":100,\"seller_id\":\"2206927662983\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=837455435787\",\"price\":\"88.50\",\"num_iid\":\"837455435787\",\"orginal_price\":\"88.50\",\"title\":\"精选澳洲wool纯羊毛格纹围巾英伦经典男女通用情侣款冬季保暖围脖\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01VoculQ1mQEjRgaKul_!!2206588314948-2-C2M.png\",\"seller_nick\":\"官方国货甄选\",\"promotion_price\":\"88.50\",\"sales\":100000,\"seller_id\":\"2206588314948\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=834836684965\",\"price\":\"44.00\",\"num_iid\":\"834836684965\",\"orginal_price\":\"44.00\",\"title\":\"李宁骑行围脖套男士秋冬季护颈\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01WS6w0M1KvYajx4VVR_!!4611686018427382826-0-item_pic.jpg\",\"seller_nick\":null,\"promotion_price\":\"44.00\",\"sales\":1000,\"seller_id\":\"893021226\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=852701518182\",\"price\":\"8.70\",\"num_iid\":\"852701518182\",\"orginal_price\":\"8.70\",\"title\":\"冬季围脖男女通用加绒加厚脖套户外骑行面罩百搭针织护颈套头围巾\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01FqtD5s2LY22GGAiGx_!!3937219703-0-C2M.jpg\",\"seller_nick\":\"天天特卖工厂\",\"promotion_price\":\"8.70\",\"sales\":10000,\"seller_id\":\"3937219703\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=853033517106\",\"price\":\"79.00\",\"num_iid\":\"853033517106\",\"orginal_price\":\"79.00\",\"title\":\"真蔚冬季新款韩版保暖围巾初恋蓝\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01iCmqt11yegcywP4Ye_!!4611686018427386748-0-item_pic.jpg\",\"seller_nick\":\"真蔚旗舰店\",\"promotion_price\":\"79.00\",\"sales\":1000,\"seller_id\":\"4099316604\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=836549185011\",\"price\":\"88.50\",\"num_iid\":\"836549185011\",\"orginal_price\":\"88.50\",\"title\":\"冬季格子韩版女100%羊毛围巾\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01OnHdaU1h1tcDwsuBN_!!2206584264218-0-C2M.jpg\",\"seller_nick\":\"好货严选工厂\",\"promotion_price\":\"88.50\",\"sales\":100000,\"seller_id\":\"2206584264218\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=835169404540\",\"price\":\"73.50\",\"num_iid\":\"835169404540\",\"orginal_price\":\"73.50\",\"title\":\"英国100%羊毛格子围巾女冬季学生百搭男保暖情侣围脖生日礼物冬日\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN017esdrJ1h1tbiATkwO_!!2206584264218-0-C2M.jpg\",\"seller_nick\":\"好货严选工厂\",\"promotion_price\":\"73.50\",\"sales\":100000,\"seller_id\":\"2206584264218\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=741990949689\",\"price\":\"199.00\",\"num_iid\":\"741990949689\",\"orginal_price\":\"199.00\",\"title\":\"尖货！100%澳洲wool纯羊毛围巾女冬季高级感2024新款围脖生日礼物\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01FIFDmD1hHvLyziaTx_!!0-item_pic.jpg\",\"seller_nick\":\"时岚旗舰店\",\"promotion_price\":\"199.00\",\"sales\":10000,\"seller_id\":\"2206533274253\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=740463295406\",\"price\":\"79.00\",\"num_iid\":\"740463295406\",\"orginal_price\":\"79.00\",\"title\":\"围巾披肩一体加大加宽\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN01QXiHSA1yegV8cGLdh_!!0-item_pic.jpg\",\"seller_nick\":\"真蔚旗舰店\",\"promotion_price\":\"79.00\",\"sales\":10000,\"seller_id\":\"4099316604\"},{\"detail_url\":\"https://item.taobao.com/item.htm?id=840601682763\",\"price\":\"25.20\",\"num_iid\":\"840601682763\",\"orginal_price\":\"25.20\",\"title\":\"秋冬季围脖女士围巾骑车挂耳面罩\",\"pic_url\":\"https://img.alicdn.com/img/bao/uploaded/i4/O1CN019SCAET2LY22oOdTi4_!!3937219703-0-C2M.jpg\",\"seller_nick\":\"天天特卖工厂\",\"promotion_price\":\"25.20\",\"sales\":100000,\"seller_id\":\"3937219703\"}],\"pagecount\":\"200\",\"item_weight_update\":0,\"real_total_results\":\"800000\",\"page\":\"1\",\"data_from\":\"cdy\",\"total_results\":\"800000\",\"page_size\":10},\"request_id\":\"gw-4.676d4d4dac500\",\"secache_time\":1735216463}\n";
        //JSONObject json = new JSONObject(originJson);

        System.out.println("原始json为");
        System.out.println(json);

        System.out.println("开始处理");
        JSONObject items = json.getJSONObject("items");
        JSONArray itemArray = items.getJSONArray("item");


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
        System.out.println(resultArray.toString());
        return Result.success(resultArray.toString());

    }

//    @PostMapping("/jdsearch")
//    public Result<String> JDsearch(String keyword) throws IOException {
//        //public Result<JSONArray> search(String keyword) throws IOException {
//        //public Result<JSONObject> search(String keyword) throws IOException {
//        System.out.println("查询关键词为"+keyword);
//        String kyckey = "t8049088306";
//        String kycsecret = "8306c88e";
//        String url = "https://api-gw.onebound.cn/jd/item_search/?key="+kyckey+"&secret="+kycsecret+"&q="+keyword+"&start_price=0&end_price=0&page=1&cat=0&discount_only=&sort=&seller_info=no&nick=&seller_info=&nick=&ppath=&imgid=&filter=";
//        JSONObject json = getRequestFromUrl(url);
//        //System.out.println("原始json为"+json.toString());
//        JSONObject items = json.getJSONObject("items");
//        JSONArray itemArray = items.getJSONArray("item");
//        //System.out.println("JSONArray is");
//        //System.out.println(json);
//       // System.out.println("开始处理");
//        // 创建一个新的 JSONArray 用来保存处理后的数据
//        JSONArray resultArray = new JSONArray();
//
//        // 遍历原始的 item 数组，提取相关信息
//        for (int i = 0; i < itemArray.length(); i++) {
//            JSONObject item = itemArray.getJSONObject(i);
//            String title = item.getString("title");
//            String price = item.getString("price");
//            String num_iid = item.getString("num_iid");
//
//            // 创建一个新的 JSONObject 来保存提取的字段
//            JSONObject itemNode = new JSONObject();
//            itemNode.put("title", title);
//            itemNode.put("price", price);
//            itemNode.put("num_iid", num_iid);
//
//            // 将处理后的 itemNode 添加到结果数组中
//            resultArray.put(itemNode);
//        }
//        // 输出整合后的 JSON 数组
//        System.out.println(resultArray.toString(4));
//
//
//        /* for test */
//        // 这是你提供的字符串
////        String jsonString = "[{\"price\":\"8.22\",\"num_iid\":\"841530051846\",\"title\":\"【最强大脑】得力魔方三阶儿童益智玩具二四阶234阶正品比赛专用\"},"
////                + "{\"price\":\"8.09\",\"num_iid\":\"623396422427\",\"title\":\"马卡龙魔方二三阶34阶四五顺滑三角金字塔组合初学者儿童益智玩具\"},"
////                + "{\"price\":\"27.60\",\"num_iid\":\"620705886368\",\"title\":\"魔域魔方三阶3四4丝滑比赛专用磁力益智块小学生儿童入门玩具正品\"},"
////                + "{\"price\":\"9.16\",\"num_iid\":\"537228718833\",\"title\":\"圣手魔方二三四五2453阶儿童益智玩具磁力初学者套装百变无限比赛\"}]";
//
//        // 将字符串转换成 JSONArray
//        //JSONArray jsonArray = new JSONArray(jsonString);
//
//        // 如果需要访问其中的某个字段
////        for (int i = 0; i < jsonArray.length(); i++) {
////            JSONObject item = jsonArray.getJSONObject(i);
////            System.out.println("Price: " + item.getString("price"));
////            System.out.println("Title: " + item.getString("title"));
////            System.out.println("Num Iid: " + item.getString("num_iid"));
////        }
//
//        return Result.success(resultArray.toString());
//    }


    @PostMapping("/add")
    public Result<String> add(String num_iid, String title, String price){   // 注意这里一定要和前端对上
        /*
        *   private int pid;
            private String pname;
            private BigDecimal price;
            private LocalDateTime ptime;
        * */
        // 格式转换
        //Long sql_pid = Long.parseLong(num_iid);
        String sql_pid = num_iid;
        String sql_pname = title;
        BigDecimal sql_price = BigDecimal.valueOf(Double.parseDouble(price));


        //Product pidProduct = productService.findByPid(sql_pid);
        productService.add(sql_pid, sql_pname, sql_price);
        return Result.success("后端接收");

    }


    @PostMapping("readmysql")
    public Result readMysql(){
        System.out.println("in readmysql");
        // 从 Service 获取数据
        List<Product> products = productService.getAllProducts();

        // 转换成JSON数组
        String JSONproducts = JSON.toJSONString(products);

        // 返回封装好的 Result 对象
        System.out.println(JSONproducts);
        return Result.success(JSONproducts);
    }


    @PostMapping("deletemysql")
    public Result deleteMysql(@RequestParam("pid") String pid){
        System.out.println("in deletemysql，string pid=" + pid);
        // 在数据库查找
        List<Product> productList = productService.findByPid(pid);
        if(productList == null){
            return Result.error("在数据库中未找到pid为"+pid+"的商品");
        }else{
            System.out.println("发现id为" + pid + "的商品");
        }
        productService.deleteProduct(pid);
        return Result.success();
    }


    @PostMapping("getcertain")
    public Result getCertain(@RequestParam("pid") String pid){
        System.out.println("into 后端的getcertain");
        List<Product> productList = productService.findByPid(pid);
        for (Product product : productList) {
            // 打印Product对象的各个属性，这里假设Product类有name和price属性
            System.out.println("Product Name: " + product.getPname() + ", Product Price: " + product.getPrice());
        }
        // 转换成JSON数组
        String JSONproducts = JSON.toJSONString(productList);

        // 返回封装好的 Result 对象
        System.out.println(JSONproducts);
        return Result.success(JSONproducts);
    }
}
