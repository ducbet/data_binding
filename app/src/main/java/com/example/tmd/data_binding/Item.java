package com.example.tmd.data_binding;

/**
 * Created by tmd on 12/07/2017.
 */

public class Item {
    private int mAvatar;
    private String mName;

    public Item(int avatar, String name) {
        mAvatar = avatar;
        mName = name;
    }

    public int getAvatar() {
        return mAvatar;
    }

    public void setAvatar(int avatar) {
        mAvatar = avatar;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
