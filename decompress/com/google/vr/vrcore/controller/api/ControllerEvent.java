// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class ControllerEvent implements Parcelable
{
    public long d;
    public int e;
    
    public ControllerEvent() {
        this.e = 0;
    }
    
    public void b(final Parcel parcel) {
        this.d = parcel.readLong();
        this.e = parcel.readInt();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
    }
}
