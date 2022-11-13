// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public abstract class PlaybackEventData implements BusSupported$Data
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new ics(19);
    }
    
    public static e g() {
        return new e();
    }
    
    public abstract float a();
    
    public abstract int b();
    
    public abstract long c();
    
    @Override
    public final b d() {
        return b.f;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public abstract long e();
    
    public abstract String f();
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.b());
        parcel.writeString(this.f());
        parcel.writeLong(this.e());
        parcel.writeLong(this.c());
        parcel.writeFloat(this.a());
    }
}
