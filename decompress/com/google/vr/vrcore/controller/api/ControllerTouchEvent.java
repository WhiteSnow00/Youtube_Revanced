// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class ControllerTouchEvent extends ControllerEvent
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public int b;
    public float c;
    public float f;
    
    static {
        CREATOR = (Parcelable$Creator)new ardl(11);
    }
    
    public ControllerTouchEvent() {
    }
    
    public ControllerTouchEvent(final Parcel parcel) {
        this.b(parcel);
    }
    
    public int a() {
        return 28;
    }
    
    @Override
    public void b(final Parcel parcel) {
        super.b(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readFloat();
        this.f = parcel.readFloat();
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.f);
    }
}
