// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.f;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class WatchLaterButtonData implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final WatchLaterButtonData a;
    
    static {
        a = e().a();
        CREATOR = (Parcelable$Creator)new f(15);
    }
    
    public static a e() {
        final a a = new a();
        a.b(0);
        a.a = null;
        a.b = null;
        a.c(agyc.b);
        return a;
    }
    
    public abstract int a();
    
    public abstract agyc b();
    
    public abstract String c();
    
    public abstract String d();
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a());
        parcel.writeString(this.d());
        parcel.writeString(this.c());
        parcel.writeByteArray(this.b().I());
    }
}
