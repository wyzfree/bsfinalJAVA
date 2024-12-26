//package com.wyz.pojo;
//
//public class Product {
//}

package com.wyz.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
public class Product {

    private String pid;
    private String pname;
    private BigDecimal price;
    private LocalDateTime ptime;

    // 默认构造函数
    public Product() {}

    // 带参数的构造函数
    public Product(String pid, String pname, BigDecimal price, LocalDateTime ptime) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.ptime = ptime;
    }

    // Getter 和 Setter 方法
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getPtime() {
        return ptime;
    }

    public void setPtime(LocalDateTime ptime) {
        this.ptime = ptime;
    }

    // 可以重写 toString() 方法，便于调试和输出
    @Override
    public String toString() {
        return "Product{pid=" + pid + ", pname='" + pname + "', price=" + price + ", ptime=" + ptime + "}";
    }
}

