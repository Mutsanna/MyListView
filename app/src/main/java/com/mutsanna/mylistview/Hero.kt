package com.mutsanna.mylistview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero(
    val photo: Int,
    val name: String?,
    val description: String?
) : Parcelable
//    {
//        constructor(parcel: Parcel) : this(
//            parcel.readInt(),
//            parcel.readString(),
//            parcel.readString()
//        ) {
//        }
//
//        override fun writeToParcel(parcel: Parcel, flags: Int) {
//            parcel.writeInt(photo)
//            parcel.writeString(name)
//            parcel.writeString(description)
//        }
//
//        override fun describeContents(): Int {
//            return 0
//        }
//
//        companion object CREATOR : Parcelable.Creator<Hero> {
//            override fun createFromParcel(parcel: Parcel): Hero {
//                return Hero(parcel)
//            }
//
//            override fun newArray(size: Int): Array<Hero?> {
//                return arrayOfNulls(size)
//            }
//        }
//    }