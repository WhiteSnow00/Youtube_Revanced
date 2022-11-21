// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.f;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class SubscriptionNotificationButtonData implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final SubscriptionNotificationButtonData a;
    
    static {
        a = e().d();
        CREATOR = (Parcelable$Creator)new f(11);
    }
    
    public static qfs e() {
        final qfs qfs = new qfs();
        qfs.f(0);
        qfs.e(0);
        qfs.d = null;
        qfs.g(ahbt.b);
        return qfs;
    }
    
    public abstract int a();
    
    public abstract int b();
    
    public abstract ahbt c();
    
    public abstract String d();
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.b());
        parcel.writeInt(this.a());
        parcel.writeString(this.d());
        parcel.writeByteArray(this.c().I());
    }
}
