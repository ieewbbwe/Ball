package com.mobile_core.base.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by picher on 2018/7/27.
 * Describe：
 */

public class AddressBean implements Parcelable {

    private String Latitude;//经度
    private String longitude;//纬度
    private String name;

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.Latitude);
        dest.writeString(this.longitude);
        dest.writeString(this.name);
    }

    public AddressBean() {
    }

    protected AddressBean(Parcel in) {
        this.Latitude = in.readString();
        this.longitude = in.readString();
        this.name = in.readString();
    }

    public static final Parcelable.Creator<AddressBean> CREATOR = new Parcelable.Creator<AddressBean>() {
        @Override
        public AddressBean createFromParcel(Parcel source) {
            return new AddressBean(source);
        }

        @Override
        public AddressBean[] newArray(int size) {
            return new AddressBean[size];
        }
    };
}
