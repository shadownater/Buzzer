package com.learning.jlovas.buzzer;

import android.os.Parcel;
import android.os.Parcelable;



/**
 * This class is used to collect the stats of the gameshow buzzer.
 * Implementing of the interface for parcelable allows for movement of objects between activities with intents
 * Created by jlovas on 9/25/15.
 */
public class BuzzerStats implements Parcelable{
    private int twoPlayer1p;
    private int twoPlayer2p;

    //credit to implementing CREATOR:

    public static final Parcelable.Creator<BuzzerStats> CREATOR = new Parcelable.Creator<BuzzerStats>(){

        @Override
        public BuzzerStats createFromParcel(Parcel in) {
            return new BuzzerStats(in);
        }

        // We just need to copy this and change the type to match our class.
        @Override
        public BuzzerStats[] newArray(int size) {
            return new BuzzerStats[size];
        }
    };
    //constructor for the parcelable
    private BuzzerStats(Parcel in){
        twoPlayer1p = in.readInt();
        twoPlayer2p = in.readInt();
    }

    public BuzzerStats() {
        twoPlayer1p =0;
        twoPlayer2p=0;

    }

    public int getTwoPlayer1p() {
        return twoPlayer1p;

    }
    public int getTwoPlayer2p(){
        return twoPlayer2p;

    }

    public void increaseTwoPlayer1p(){
        twoPlayer1p++;
    }
    public void increaseTwoPlayer2p(){
        twoPlayer2p++;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int in) {
        parcel.writeInt(twoPlayer1p);
        parcel.writeInt(twoPlayer2p);
    }
}
