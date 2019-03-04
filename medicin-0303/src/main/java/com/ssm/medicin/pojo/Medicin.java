package com.ssm.medicin.pojo;

import java.util.Date;

public class Medicin {

    /*

    `id`,
  `medicin_name`,
  `g_id`,
  `isChuFang`,
  `address`,
  `price`,
  `created_time`
     */
    private Integer id;
    private String medicinName;
    private Integer gId;
    private Integer isChuFang;
    private String address;
    private Integer price;
    private Date createdTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicinName() {
        return medicinName;
    }

    public void setMedicinName(String medicinName) {
        this.medicinName = medicinName;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getIsChuFang() {
        return isChuFang;
    }

    public void setIsChuFang(Integer isChuFang) {
        this.isChuFang = isChuFang;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
