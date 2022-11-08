// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class ControllerButtonEvent extends ControllerEvent
{
    public static final Parcelable$Creator CREATOR;
    public static final int[] a;
    public int b;
    public boolean c;
    
    static {
        a = new int[] { 0, 1, 2, 3, 5, 6 };
        CREATOR = (Parcelable$Creator)new arao(4);
    }
    
    public ControllerButtonEvent() {
    }
    
    public ControllerButtonEvent(final Parcel parcel) {
        this.b(parcel);
    }
    
    public int a() {
        return 20;
    }
    
    public void b(final Parcel parcel) {
        super.b(parcel);
        this.b = parcel.readInt();
        this.c = (parcel.readInt() != 0);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.b);
        parcel.writeInt((int)(this.c ? 1 : 0));
    }
}
