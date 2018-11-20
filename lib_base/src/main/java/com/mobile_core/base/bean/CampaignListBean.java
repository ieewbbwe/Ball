package com.mobile_core.base.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by picher on 2018/7/27.
 * Describe：运动团列表对象
 */

public class CampaignListBean implements Parcelable {

    private String campaignId;
    private String title;
    private AddressBean address;
    private String price;
    private String join_num;

    private SocialBean social;
    private List<MediaGroup> mediaGroups;

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getJoin_num() {
        return join_num;
    }

    public void setJoin_num(String join_num) {
        this.join_num = join_num;
    }

    public SocialBean getSocial() {
        return social;
    }

    public void setSocial(SocialBean social) {
        this.social = social;
    }

    public List<MediaGroup> getMediaGroups() {
        return mediaGroups;
    }

    public void setMediaGroups(List<MediaGroup> mediaGroups) {
        this.mediaGroups = mediaGroups;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.campaignId);
        dest.writeString(this.title);
        dest.writeParcelable(this.address, flags);
        dest.writeString(this.price);
        dest.writeString(this.join_num);
        dest.writeParcelable(this.social, flags);
        dest.writeTypedList(this.mediaGroups);
    }

    public CampaignListBean() {
    }

    protected CampaignListBean(Parcel in) {
        this.campaignId = in.readString();
        this.title = in.readString();
        this.address = in.readParcelable(AddressBean.class.getClassLoader());
        this.price = in.readString();
        this.join_num = in.readString();
        this.social = in.readParcelable(SocialBean.class.getClassLoader());
        this.mediaGroups = in.createTypedArrayList(MediaGroup.CREATOR);
    }

    public static final Parcelable.Creator<CampaignListBean> CREATOR = new Parcelable.Creator<CampaignListBean>() {
        @Override
        public CampaignListBean createFromParcel(Parcel source) {
            return new CampaignListBean(source);
        }

        @Override
        public CampaignListBean[] newArray(int size) {
            return new CampaignListBean[size];
        }
    };
}
