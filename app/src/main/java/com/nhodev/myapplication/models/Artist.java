package com.nhodev.myapplication.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Artist implements Parcelable {

    private String name;
    private String id;
    private int imgResource;
    private boolean isChecked;

    public Artist(String name, String id, int imgResource, boolean isChecked) {
        this.name = name;
        this.id = id;
        this.imgResource = imgResource;
        this.isChecked = isChecked;
    }

    protected Artist(Parcel in) {
        name = in.readString();
        id = in.readString();
        imgResource = in.readInt();
        isChecked = in.readByte() != 0;
    }

    public static final Creator<Artist> CREATOR = new Creator<Artist>() {
        @Override
        public Artist createFromParcel(Parcel in) {
            return new Artist(in);
        }

        @Override
        public Artist[] newArray(int size) {
            return new Artist[size];
        }
    };

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getImgResource() {
        return imgResource;
    }

    public boolean isChecked() {
        return isChecked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artist)) return false;
        Artist artist = (Artist) o;
        return getImgResource() == artist.getImgResource() &&
                isChecked() == artist.isChecked() &&
                getName().equals(artist.getName()) &&
                getId().equals(artist.getId());
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (isChecked() ? 1 : 0);
        return result;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(id);
        dest.writeInt(imgResource);
        dest.writeByte((byte) (isChecked ? 1 : 0));
    }
}

