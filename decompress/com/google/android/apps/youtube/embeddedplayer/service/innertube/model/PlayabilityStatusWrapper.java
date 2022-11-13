// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class PlayabilityStatusWrapper extends ProtoWrapper
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new ics(9);
    }
    
    public PlayabilityStatusWrapper(final akwz akwz) {
        super((ahbh)akwz);
    }
    
    public PlayabilityStatusWrapper(final Parcel parcel) {
        super((ahbh)vdh.bo(parcel, (ahbh)akwz.a));
    }
}
