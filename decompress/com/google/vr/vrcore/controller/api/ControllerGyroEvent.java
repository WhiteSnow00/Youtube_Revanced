// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class ControllerGyroEvent extends ControllerEvent
{
    public static final Parcelable$Creator CREATOR;
    public float a;
    public float b;
    public float c;
    
    static {
        CREATOR = (Parcelable$Creator)new ardl(6);
    }
    
    public ControllerGyroEvent() {
    }
    
    public ControllerGyroEvent(final Parcel parcel) {
        this.b(parcel);
    }
    
    public int a() {
        return 24;
    }
    
    @Override
    public void b(final Parcel parcel) {
        super.b(parcel);
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
    }
}
