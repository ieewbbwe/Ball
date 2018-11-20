package com.mobile_core.base.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by picher on 2018/7/27.
 * Describe：交互类，点赞 点击量
 */

public class SocialBean implements Parcelable {

    private String viewCount;
    private String likeCount;
    private String commentCount;

    public String getViewCount() {
        return viewCount;
    }

    public void setViewCount(String viewCount) {
        this.viewCount = viewCount;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.viewCount);
        dest.writeString(this.likeCount);
        dest.writeString(this.commentCount);
    }

    public SocialBean() {
    }

    protected SocialBean(Parcel in) {
        this.viewCount = in.readString();
        this.likeCount = in.readString();
        this.commentCount = in.readString();
    }

    public static final Parcelable.Creator<SocialBean> CREATOR = new Parcelable.Creator<SocialBean>() {
        @Override
        public SocialBean createFromParcel(Parcel source) {
            return new SocialBean(source);
        }

        @Override
        public SocialBean[] newArray(int size) {
            return new SocialBean[size];
        }
    };
}
