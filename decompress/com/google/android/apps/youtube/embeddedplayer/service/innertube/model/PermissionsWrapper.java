// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public class PermissionsWrapper extends ProtoWrapper
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new ics(8);
    }
    
    public PermissionsWrapper(final ajnl ajnl) {
        super((ahbh)ajnl);
    }
    
    public PermissionsWrapper(final Parcel parcel) {
        super((ahbh)vdh.bo(parcel, (ahbh)ajnl.a));
    }
}
