package com.example.retrofitdemo3;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TestModel {
    @SerializedName("support")
    public Support support;
    @SerializedName("data")
    public List<Data> data;
    @SerializedName("page")
    public int page;
    @SerializedName("total_pages")
    public int total_pages;
    @SerializedName("total")
    public int total;
    @SerializedName("per_page")
    public int per_page;

    public static class Support {
        @SerializedName("text")
        public String text;
        @SerializedName("url")
        public String url;
    }

    public static class Data {
        @SerializedName("avatar")
        public String avatar;
        @SerializedName("last_name")
        public String last_name;
        @SerializedName("first_name")
        public String first_name;
        @SerializedName("email")
        public String email;
        @SerializedName("id")
        public int id;
    }

    @Override
    public String toString() {
        return "TestModel{" +
                "support=" + support +
                ", data=" + data +
                ", page=" + page +
                ", total_pages=" + total_pages +
                ", total=" + total +
                ", per_page=" + per_page +
                '}';
    }

//    @SerializedName("name")
//    public String name;
//    @SerializedName("bio")
//    public String bio;
//    @SerializedName("imageurl")
//    public String imageurl;
//    @SerializedName("publisher")
//    public String publisher;
//    @SerializedName("createdby")
//    public String createdby;
//    @SerializedName("firstappearance")
//    public String firstappearance;
//    @SerializedName("team")
//    public String team;
//    @SerializedName("realname")
//    public String realname;
    // First to activate DTO generator. Open File-Settings-Plugins-DTO Generator and activate it.
    // Then Code->Generate->DTO from JSON- copy all the JSON data here- press Validate- Format- Generate- tick Single File With Inner Class- tick Gson- untick @Expose.
    // Then click generate in previous sheet. Delete abstract keyword before model class name.

//    @Override
//    public String toString() {
//        return "TestModel{" +
//                "bio='" + bio + '\'' +
//                ", imageurl='" + imageurl + '\'' +
//                ", publisher='" + publisher + '\'' +
//                ", createdby='" + createdby + '\'' +
//                ", firstappearance='" + firstappearance + '\'' +
//                ", team='" + team + '\'' +
//                ", realname='" + realname + '\'' +
//                ", name='" + name + '\'' +
//                '}';
//    }
    //    @SerializedName("data")
//    public ArrayList<Data> data;
//    public class Data {
//        @SerializedName("bio")
//        public String bio;
//        @SerializedName("imageurl")
//        public String imageurl;
//        @SerializedName("publisher")
//        public String publisher;
//        @SerializedName("createdby")
//        public String createdby;
//        @SerializedName("firstappearance")
//        public String firstappearance;
//        @SerializedName("team")
//        public String team;
//        @SerializedName("realname")
//        public String realname;
//    }
}
