// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import java.io.Serializable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public abstract class RelatedVideoItem implements BusSupported$Data
{
    public static final Parcelable$Creator CREATOR;
    public static final RelatedVideoItem a;
    
    static {
        a = kzr.k("", (CharSequence)"", (CharSequence)"", (CharSequence)"", new BitmapKey(0, 0), new SelectableItemKey(0, 0), ahab.b);
        CREATOR = (Parcelable$Creator)new f(1);
    }
    
    public abstract BitmapKey a();
    
    public abstract SelectableItemKey b();
    
    public abstract ahab c();
    
    @Override
    public final b d() {
        return b.h;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public abstract CharSequence e();
    
    public abstract CharSequence f();
    
    public abstract CharSequence g();
    
    public abstract String h();
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.h());
        TextUtils.writeToParcel(this.g(), parcel, n);
        TextUtils.writeToParcel(this.e(), parcel, n);
        TextUtils.writeToParcel(this.f(), parcel, n);
        parcel.writeParcelable((Parcelable)this.a(), n);
        parcel.writeParcelable((Parcelable)this.b(), n);
        parcel.writeSerializable((Serializable)this.c());
    }
}
