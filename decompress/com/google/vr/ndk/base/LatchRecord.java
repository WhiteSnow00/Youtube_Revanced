// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class LatchRecord implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static LatchRecord instance;
    public byte[] serializedLatchRecord;
    
    static {
        LatchRecord.instance = new LatchRecord();
        CREATOR = (Parcelable$Creator)new LatchRecord$1();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.serializedLatchRecord.length);
        parcel.writeByteArray(this.serializedLatchRecord);
    }
}
