// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.camera;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class ProgressBarData implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new ulj(2);
    }
    
    public static ulq e() {
        final ulq ulq = new ulq();
        ulq.d(0);
        ulq.c(0);
        ulq.b(0);
        ulq.e(0);
        return ulq;
    }
    
    public abstract int a();
    
    public abstract int b();
    
    public abstract int c();
    
    public abstract int d();
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.c());
        parcel.writeInt(this.b());
        parcel.writeInt(this.a());
        parcel.writeInt(this.d());
    }
}
