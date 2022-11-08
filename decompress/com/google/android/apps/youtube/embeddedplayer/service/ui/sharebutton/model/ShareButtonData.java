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
        CREATOR = (Parcelable$Creator)new f(10);
    }
    
    public static aeaf c() {
        final aeaf aeaf = new aeaf();
        aeaf.l(0);
        aeaf.m(agyc.b);
        return aeaf;
    }
    
    public abstract int a();
    
    public abstract agyc b();
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a());
        parcel.writeByteArray(this.b().I());
    }
}
