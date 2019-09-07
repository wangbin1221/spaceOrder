package com.example.imeeting.test;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * description:
 * created by wangbin on 2019/6/5
 */
public class Book implements Parcelable {
    private int bookId;
    private String name;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.bookId);
        dest.writeString(this.name);
    }

    public Book() {
    }

    protected Book(Parcel in) {
        this.bookId = in.readInt();
        this.name = in.readString();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel source) {
            return new Book(source);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };
}
