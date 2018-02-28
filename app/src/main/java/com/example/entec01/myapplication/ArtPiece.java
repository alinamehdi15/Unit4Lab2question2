package com.example.entec01.myapplication;

/**
 * Created by Entec01 on 2/7/2018.
 */


import android.os.Parcel;
import android.os.Parcelable;

public class ArtPiece implements Parcelable {
    private String name;
    private String artist;
    private int year;
    private int pictureID;

    public ArtPiece(String name, String artist, int year, int pictureID) {
        this.name = name;
        this.artist = artist;
        this.year = year;
        this.pictureID = pictureID;
    }

    protected ArtPiece(Parcel in) {
        name = in.readString();
        artist = in.readString();
        year = in.readInt();
        pictureID = in.readInt();
    }

    public static final Creator<ArtPiece> CREATOR = new Creator<ArtPiece>() {
        @Override
        public ArtPiece createFromParcel(Parcel in) {
            return new ArtPiece(in);
        }

        @Override
        public ArtPiece[] newArray(int size) {
            return new ArtPiece[size];
        }
    };

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public int getPictureID() {
        return pictureID;
    }

    @Override
    public String toString() {
        return "ArtPiece{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", year=" + year +
                ", pictureID='" + pictureID + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(artist);
        parcel.writeInt(year);
        parcel.writeInt(pictureID);
    }
}

