package com.fc.entity;

public class TChengji {
    private Integer id;

    private Integer stuId;

    private Integer kechengId;

    private Integer chengji;

    private String xuenian;

    private String del;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getKechengId() {
        return kechengId;
    }

    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }

    public Integer getChengji() {
        return chengji;
    }

    public void setChengji(Integer chengji) {
        this.chengji = chengji;
    }

    public String getXuenian() {
        return xuenian;
    }

    public void setXuenian(String xuenian) {
        this.xuenian = xuenian == null ? null : xuenian.trim();
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del == null ? null : del.trim();
    }
}