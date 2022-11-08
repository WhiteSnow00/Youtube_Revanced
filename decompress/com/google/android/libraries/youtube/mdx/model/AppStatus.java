// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.mdx.model;

import java.util.Iterator;
import java.io.Serializable;
import android.os.Parcel;
import android.net.Uri;
import java.util.Map;
import java.util.HashMap;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class AppStatus implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new vho(14);
    }
    
    public static xgx c() {
        final xgx xgx = new xgx();
        xgx.f(true);
        xgx.d(false);
        xgx.c(false);
        return xgx;
    }
    
    public static AppStatus d(final int n) {
        final xgx c = c();
        c.e(n);
        c.b((Map)new HashMap());
        return c.a();
    }
    
    public abstract int a();
    
    public abstract Uri b();
    
    public final int describeContents() {
        return 0;
    }
    
    public abstract xha e();
    
    public abstract ScreenId f();
    
    public abstract String g();
    
    public abstract String h();
    
    public abstract Map i();
    
    public abstract boolean j();
    
    public abstract boolean k();
    
    public abstract boolean l();
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a());
        parcel.writeParcelable((Parcelable)this.b(), n);
        parcel.writeString(this.g());
        parcel.writeSerializable((Serializable)this.f());
        parcel.writeByte((byte)(byte)(this.l() ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.k() ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.j() ? 1 : 0));
        final Map i = this.i();
        parcel.writeInt(i.size());
        for (final Map.Entry<String, V> entry : i.entrySet()) {
            parcel.writeString((String)entry.getKey());
            parcel.writeString((String)entry.getValue());
        }
    }
}
