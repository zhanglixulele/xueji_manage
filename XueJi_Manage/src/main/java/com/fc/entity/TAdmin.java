package com.fc.entity;

public class TAdmin {
    private Integer userid;

    private String username;

    private String userpw;

    @Override
    public String toString() {
        return "TAdmin{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpw='" + userpw + '\'' +
                ", userpw1='" + userpw1 + '\'' +
                '}';
    }

    public String getUserpw1() {
        return userpw1;
    }

    public void setUserpw1(String userpw1) {
        this.userpw1 = userpw1;
    }

    private String userpw1;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw == null ? null : userpw.trim();
    }
}