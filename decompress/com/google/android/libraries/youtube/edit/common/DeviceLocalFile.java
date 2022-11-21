// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.common;

import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class DeviceLocalFile implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new ulj(3);
    }
    
    public static umc i() {
        final umc umc = new umc();
        umc.e(Long.MIN_VALUE);
        return umc;
    }
    
    public abstract int a();
    
    public abstract long b();
    
    public abstract long c();
    
    public abstract long d();
    
    public final int describeContents() {
        return 0;
    }
    
    public abstract long e();
    
    public abstract Uri f();
    
    public abstract String g();
    
    public abstract String h();
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.c());
        parcel.writeParcelable((Parcelable)this.f(), 0);
        parcel.writeString(this.h());
        parcel.writeString(this.g());
        parcel.writeLong(this.e());
        parcel.writeLong(this.b());
        parcel.writeLong(this.d());
        parcel.writeInt(this.a());
    }
}
