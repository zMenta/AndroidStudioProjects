package com.example.heartattackrisk

import android.os.Parcel
import android.os.Parcelable


class Sum(var value: Int) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readInt()
    ){
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(value)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Sum> {
        override fun createFromParcel(parcel: Parcel): Sum {
            return Sum(parcel)
        }

        override fun newArray(size: Int): Array<Sum?> {
           return arrayOfNulls(size)
        }
    }

}


