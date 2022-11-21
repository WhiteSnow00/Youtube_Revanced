// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.model;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.f;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class ShareButtonData implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final ShareButtonData b;
    
    static {
        b = c().k();
        CREATOR = (Parcelable$Creator)new f(9);
    }
    
    public static aedz c() {
        final aedz aedz = new aedz();
        aedz.l(0);
        aedz.m(ahbt.b);
        return aedz;
    }
    
    public abstract int a();
    
    public abstract ahbt b();
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a());
        parcel.writeByteArray(this.b().I());
    }
}
