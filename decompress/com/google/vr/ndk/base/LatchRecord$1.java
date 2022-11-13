// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.Parcel;
import android.os.Parcelable$Creator;

class LatchRecord$1 implements Parcelable$Creator
{
    public LatchRecord$1() {
    }
    
    public LatchRecord createFromParcel(final Parcel parcel) {
        final int int1 = parcel.readInt();
        final LatchRecord instance = LatchRecord.instance;
        final byte[] serializedLatchRecord = instance.serializedLatchRecord;
        if (serializedLatchRecord == null || serializedLatchRecord.length != int1) {
            instance.serializedLatchRecord = new byte[int1];
        }
        parcel.readByteArray(instance.serializedLatchRecord);
        return LatchRecord.instance;
    }
    
    public /* bridge */ Object createFromParcel(final Parcel parcel) {
        return this.createFromParcel(parcel);
    }
    
    public LatchRecord[] newArray(final int n) {
        return new LatchRecord[n];
    }
    
    public /* bridge */ Object[] newArray(final int n) {
        return this.newArray(n);
    }
}
