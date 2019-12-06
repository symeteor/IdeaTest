package com.textar.demo2;

public class Article {
    private String Id;
    private String Title;
    private String CreateDate;
    //请读者自行补充 构造器和 get/set方法..
    public Article(String Id, String Title,String CreateDate) {
        this.Id = Id;
        this.Title = Title;
        this.CreateDate =CreateDate;
    }

    public String getId() { return Id;  }
    public void setId(String id) {  this.Id = id;   }
    public String getTitle() { return Title;  }
    public void setTitle(String id) {  this.Id = id;   }
    public String getCreateDate() { return CreateDate;  }
    public void setCreateDate(String id) {  this.CreateDate = id;   }

}