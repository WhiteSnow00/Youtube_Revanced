// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public class PlayerErrorMessageRendererWrapper extends ProtoWrapper
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new ics(10);
    }
    
    public PlayerErrorMessageRendererWrapper(final Parcel parcel) {
        super((ahbh)vdh.bo(parcel, (ahbh)anew.a));
    }
    
    public PlayerErrorMessageRendererWrapper(final anew anew) {
        super((ahbh)anew);
    }
}
