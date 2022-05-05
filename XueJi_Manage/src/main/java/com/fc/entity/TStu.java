package com.fc.entity;

public class TStu {
    private Integer id;

    private String xuehao;

    private String name1;

    private String sex;

    private String age;

    private String banjiId;

    private String ruxueshijian;

    private String biyeshijian;

    private String xuezhi;

    private String xuexiao;

    private String del;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao == null ? null : xuehao.trim();
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1 == null ? null : name1.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getBanjiId() {
        return banjiId;
    }

    public void setBanjiId(String banjiId) {
        this.banjiId = banjiId == null ? null : banjiId.trim();
    }

    public String getRuxueshijian() {
        return ruxueshijian;
    }

    public void setRuxueshijian(String ruxueshijian) {
        this.ruxueshijian = ruxueshijian == null ? null : ruxueshijian.trim();
    }

    public String getBiyeshijian() {
        return biyeshijian;
    }

    public void setBiyeshijian(String biyeshijian) {
        this.biyeshijian = biyeshijian == null ? null : biyeshijian.trim();
    }

    public String getXuezhi() {
        return xuezhi;
    }

    public void setXuezhi(String xuezhi) {
        this.xuezhi = xuezhi == null ? null : xuezhi.trim();
    }

    public String getXuexiao() {
        return xuexiao;
    }

    public void setXuexiao(String xuexiao) {
        this.xuexiao = xuexiao == null ? null : xuexiao.trim();
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del == null ? null : del.trim();
    }
}