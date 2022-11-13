// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class PlayerViewModeData implements BusSupported$Data
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    
    static {
        CREATOR = (Parcelable$Creator)new ics(20);
    }
    
    public PlayerViewModeData(final int a) {
        this.a = a;
    }
    
    @Override
    public final b d() {
        return b.g;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof PlayerViewModeData && ((PlayerViewModeData)o).a == this.a;
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
    }
}
