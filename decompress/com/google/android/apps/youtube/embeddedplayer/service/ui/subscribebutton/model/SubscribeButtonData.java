// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.a;
import com.google.android.apps.youtube.embeddedplayer.service.model.f;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class SubscribeButtonData implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final SubscribeButtonData a;
    
    static {
        a = e().d();
        CREATOR = (Parcelable$Creator)new f(10);
    }
    
    public static a e() {
        final a a = new a();
        a.e(0);
        a.a = null;
        a.b = null;
        a.f(ahab.b);
        return a;
    }
    
    public abstract int a();
    
    public abstract ahab b();
    
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
