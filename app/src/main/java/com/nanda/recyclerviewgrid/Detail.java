package com.nanda.recyclerviewgrid;

/**
 * Created by Nandagopal on 28/1/16.
 */
public class Detail {
    String mName;
    int mPosition;

    public Detail(String mName, int mPosition) {
        this.mName = mName;
        this.mPosition = mPosition;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        mName = mName;
    }

    public int getPosition() {
        return mPosition;
    }

    public void setPosition(int number) {
        mPosition = mPosition;
    }


}
