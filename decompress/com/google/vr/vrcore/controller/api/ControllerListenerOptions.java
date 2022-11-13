// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

import java.util.Locale;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ControllerListenerOptions implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    
    static {
        CREATOR = (Parcelable$Creator)new ardl(7);
    }
    
    public ControllerListenerOptions() {
        this.a = true;
        this.d = true;
    }
    
    public ControllerListenerOptions(final int n) {
        if ((n & 0x1) != 0x0) {
            this.a = true;
        }
        if ((n & 0x2) != 0x0) {
            this.d = true;
        }
        if ((n & 0x4) != 0x0) {
            this.b = true;
        }
        if ((n & 0x8) != 0x0) {
            this.c = true;
        }
        if ((n & 0x10) != 0x0) {
            this.e = true;
        }
    }
    
    public ControllerListenerOptions(final Parcel parcel) {
        final int int1 = parcel.readInt();
        final boolean b = true;
        this.a = (int1 != 0);
        this.b = (parcel.readInt() != 0);
        this.c = (parcel.readInt() != 0);
        this.d = (parcel.readInt() != 0);
        this.e = (parcel.readInt() != 0 && b);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        return String.format(Locale.US, "ori=%b, gyro=%b, accel=%b, touch=%b, gestures=%b", this.a, this.b, this.c, this.d, this.e);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt((int)(this.a ? 1 : 0));
        parcel.writeInt((int)(this.b ? 1 : 0));
        parcel.writeInt((int)(this.c ? 1 : 0));
        parcel.writeInt((int)(this.d ? 1 : 0));
        parcel.writeInt((int)(this.e ? 1 : 0));
    }
}
