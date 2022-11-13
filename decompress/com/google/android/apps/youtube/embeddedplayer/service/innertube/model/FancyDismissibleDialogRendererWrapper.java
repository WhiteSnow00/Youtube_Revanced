// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.innertube.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public class FancyDismissibleDialogRendererWrapper extends ProtoWrapper
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new ics(7);
    }
    
    public FancyDismissibleDialogRendererWrapper(final ajrv ajrv) {
        super((ahbh)ajrv);
    }
    
    public FancyDismissibleDialogRendererWrapper(final Parcel parcel) {
        super((ahbh)vdh.bo(parcel, (ahbh)ajrv.a));
    }
}
