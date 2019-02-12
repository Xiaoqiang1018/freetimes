package com.exam5.xiaoqiang.pojo;

import java.util.Date;

public class CarSchool {
    private Integer id;
    private String subject;
    private Integer comId;
    private Integer price;
    private Date date;
    private Date sdate;
    private Integer status;
    private Company company;

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CarSchool{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", comId=" + comId +
                ", price=" + price +
                ", date=" + date +
                ", sdate=" + sdate +
                ", status=" + status +
                ", company=" + company +
                '}';
    }
}
