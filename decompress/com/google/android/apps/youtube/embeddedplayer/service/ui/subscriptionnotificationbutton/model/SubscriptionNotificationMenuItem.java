// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model;

import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.f;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class SubscriptionNotificationMenuItem implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        g().a();
        CREATOR = (Parcelable$Creator)new f(14);
    }
    
    public static a g() {
        final a a = new a();
        a.d(0);
        a.c(false);
        a.b(0);
        a.a = null;
        a.b = null;
        a.e(agyc.b);
        return a;
    }
    
    public abstract int a();
    
    public abstract int b();
    
    public abstract agyc c();
    
    public abstract String d();
    
    public final int describeContents() {
        return 0;
    }
    
    public abstract String e();
    
    public abstract boolean f();
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.b());
        parcel.writeByte((byte)(byte)(this.f() ? 1 : 0));
        parcel.writeInt(this.a());
        parcel.writeString(this.e());
        parcel.writeString(this.d());
        parcel.writeByteArray(this.c().I());
    }
}
