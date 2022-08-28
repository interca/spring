package com.it.domain;

import java.sql.Timestamp;

public class Log {
    private  int id=0;
    private String info;
    private Timestamp time;

    public Log() {
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", info='" + info + '\'' +
                ", time=" + time +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Log(int id, String info, Timestamp time) {
        this.id = id;
        this.info = info;
        this.time = time;
    }
}
