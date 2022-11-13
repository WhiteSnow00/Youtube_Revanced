// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public class CommandWrapper extends ProtoWrapper
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new ics(6);
    }
    
    public CommandWrapper(final aiqj aiqj) {
        super((ahbh)aiqj);
    }
    
    public CommandWrapper(final Parcel parcel) {
        super((ahbh)vdh.bo(parcel, (ahbh)aiqj.a));
    }
}
