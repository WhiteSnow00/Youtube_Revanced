// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public abstract class AdEventData implements BusSupported$Data
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new idb(11);
    }
    
    public static a c() {
        return new a();
    }
    
    public abstract int a();
    
    public abstract int b();
    
    @Override
    public final b d() {
        return b.a;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public abstract String e();
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.b());
        parcel.writeInt(this.a());
        parcel.writeString(this.e());
    }
}
