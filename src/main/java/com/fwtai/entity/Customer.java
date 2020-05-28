package com.fwtai.entity;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-27 21:16
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
public final class Customer{

    private Integer id;

    private String name;
    private String sex;
    private String tell;
    private String addr;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getTell(){
        return tell;
    }

    public void setTell(String tell){
        this.tell = tell;
    }

    public String getAddr(){
        return addr;
    }

    public void setAddr(String addr){
        this.addr = addr;
    }
}