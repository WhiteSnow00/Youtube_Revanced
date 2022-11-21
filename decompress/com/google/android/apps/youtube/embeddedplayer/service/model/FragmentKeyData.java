// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public abstract class FragmentKeyData implements BusSupported$Data
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new idb(15);
    }
    
    public static ema b() {
        return new ema();
    }
    
    public abstract String a();
    
    @Override
    public final b d() {
        return b.d;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a());
    }
}
