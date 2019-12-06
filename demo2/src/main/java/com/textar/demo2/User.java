package com.textar.demo2;

import java.util.Date;

public class User {
    private String id;
    private String username;
    private String password;
    private Date createTime;
/**
* 自行补充构造器和 get/set方法..
* 再说一遍：请读者自行补充构造器和 get/set方法..
*/
    public User(String id, String username, String password,Date createTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createTime=createTime;
    }

    public String getId() { return id;  }
    public void setId(String id) {  this.id = id;   }
    public String getUsername() { return username;  }
    public void setUsername(String id) {  this.username = id;   }
    public String getPassword() { return password;  }
    public void setPassword(String id) {  this.password = id;   }
    public Date getCreateTime() { return createTime;  }
    public void setCreateTime(Date id) {  this.createTime = id;   }

}