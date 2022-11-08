// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class ControllerBatteryEvent extends ControllerEvent
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public boolean b;
    
    static {
        CREATOR = (Parcelable$Creator)new arao(3);
    }
    
    public ControllerBatteryEvent() {
    }
    
    public ControllerBatteryEvent(final Parcel parcel) {
        this.b(parcel);
    }
    
    public int a() {
        return 20;
    }
    
    public void b(final Parcel parcel) {
        super.b(parcel);
        this.a = parcel.readInt();
        this.b = (parcel.readInt() != 0);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        parcel.writeInt((int)(this.b ? 1 : 0));
    }
}
