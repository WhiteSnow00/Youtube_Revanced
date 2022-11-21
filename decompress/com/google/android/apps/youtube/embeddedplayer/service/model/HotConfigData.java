// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import com.google.protobuf.MessageLite;
import android.os.Parcel;
import j$.util.Objects;
import android.os.Parcelable$Creator;

public class HotConfigData implements BusSupported$Data
{
    public static final Parcelable$Creator CREATOR;
    public final ajpe a;
    
    static {
        final ajpe a = ajpe.a;
        CREATOR = (Parcelable$Creator)new idb(16);
    }
    
    public HotConfigData(final ajpe a) {
        this.a = a;
    }
    
    @Override
    public final b d() {
        return b.c;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof HotConfigData && aexq.c(this.a, ((HotConfigData)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hashCode((Object)this.a);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ume.ad((MessageLite)this.a, parcel);
    }
}
