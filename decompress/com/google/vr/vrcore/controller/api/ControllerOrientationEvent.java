// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class ControllerOrientationEvent extends ControllerEvent
{
    public static final Parcelable$Creator CREATOR;
    public float a;
    public float b;
    public float c;
    public float f;
    
    static {
        CREATOR = (Parcelable$Creator)new arao(9);
    }
    
    public ControllerOrientationEvent() {
    }
    
    public ControllerOrientationEvent(final Parcel parcel) {
        this.b(parcel);
    }
    
    public int a() {
        return 28;
    }
    
    public void b(final Parcel parcel) {
        super.b(parcel);
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.f = parcel.readFloat();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.f);
    }
}
