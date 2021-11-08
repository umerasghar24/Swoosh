package com.example.swoosh.Model

import android.os.Parcel
import android.os.Parcelable

class Player(var leaugue: String?, var skill: String?, var age: String?):Parcelable{ //after adding parcelable just press alt+enter



    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(leaugue)
        parcel.writeString(skill)
        parcel.writeString(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Player> {
        override fun createFromParcel(parcel: Parcel): Player {
            return Player(parcel)
        }

        override fun newArray(size: Int): Array<Player?> {
            return arrayOfNulls(size)
        }
    }


}