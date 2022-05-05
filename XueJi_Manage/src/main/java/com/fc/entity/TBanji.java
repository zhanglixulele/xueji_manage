package com.fc.entity;

public class TBanji {
    private Integer id;

    private String name;

    private Integer zhuanyeId;

    private String del;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getZhuanyeId() {
        return zhuanyeId;
    }

    public void setZhuanyeId(Integer zhuanyeId) {
        this.zhuanyeId = zhuanyeId;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del == null ? null : del.trim();
    }
}