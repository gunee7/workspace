package com.example.simplemultitype;


import android.graphics.drawable.Drawable;

/**
 * Created by Administrator on 2018-01-10.
 */

public class ModelItem {

    // View type 을 위한 필드: 1 or 2
    private int type;

    // listview_item1.xml 의 데이터
    private String title;
    private String desc;

    // listview_item2.xml 의 데이터
    private Drawable image;
    private String name;

    public ModelItem() {
    }

    // type 1 생성자
    public ModelItem( String title, String desc ) {
        this.type  = AdapterItem.ITEM_VIEW_TYPE_TEXT;
        this.title = title;
        this.desc  = desc;
    }

    // type 2 생성자
    public ModelItem( Drawable image, String name ) {
        this.type  = AdapterItem.ITEM_VIEW_TYPE_IMAGES;
        this.image = image;
        this.name  = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ModelItem{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", image=" + image +
                ", name='" + name + '\'' +
                '}';
    }
}
