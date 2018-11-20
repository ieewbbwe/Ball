package com.mobile_core.base.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by picher on 2018/7/27.
 * Describe：多媒体类 音视频图片
 */

public class MediaGroup implements Parcelable {

    private String mediaId;
    private String smallPath;
    private String lagerPath;
    private String type;
    private String width;
    private String height;
    private String url;

    public String getSmallPath() {
        return smallPath;
    }

    public void setSmallPath(String smallPath) {
        this.smallPath = smallPath;
    }

    public String getLagerPath() {
        return lagerPath;
    }

    public void setLagerPath(String lagerPath) {
        this.lagerPath = lagerPath;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.smallPath);
        dest.writeString(this.lagerPath);
        dest.writeString(this.type);
        dest.writeString(this.width);
        dest.writeString(this.height);
    }

    public MediaGroup() {
    }

    protected MediaGroup(Parcel in) {
        this.smallPath = in.readString();
        this.lagerPath = in.readString();
        this.type = in.readString();
        this.width = in.readString();
        this.height = in.readString();
    }

    public static final Parcelable.Creator<MediaGroup> CREATOR = new Parcelable.Creator<MediaGroup>() {
        @Override
        public MediaGroup createFromParcel(Parcel source) {
            return new MediaGroup(source);
        }

        @Override
        public MediaGroup[] newArray(int size) {
            return new MediaGroup[size];
        }
    };
}
