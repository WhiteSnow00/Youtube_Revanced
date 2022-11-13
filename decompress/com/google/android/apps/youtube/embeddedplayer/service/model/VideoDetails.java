// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class VideoDetails implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final VideoDetails a;
    
    static {
        a = c().c();
        CREATOR = (Parcelable$Creator)new f(5);
    }
    
    public static mqu c() {
        final mqu mqu = new mqu();
        mqu.d(VideoDetailsCollapsed.a);
        mqu.e(VideoDetailsExpanded.a);
        return mqu;
    }
    
    public abstract VideoDetailsCollapsed a();
    
    public abstract VideoDetailsExpanded b();
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        this.a().writeToParcel(parcel, n);
        this.b().writeToParcel(parcel, n);
    }
}
