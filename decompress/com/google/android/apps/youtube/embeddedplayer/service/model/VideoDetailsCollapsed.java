// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import java.util.Arrays;
import android.text.TextUtils;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class VideoDetailsCollapsed implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final VideoDetailsCollapsed a;
    
    static {
        a = d().k();
        CREATOR = (Parcelable$Creator)new f(6);
    }
    
    public static pa d() {
        final pa pa = new pa((short[])null);
        pa.b = null;
        pa.c = null;
        pa.l(ahab.b);
        return pa;
    }
    
    public abstract ahab a();
    
    public abstract CharSequence b();
    
    public abstract CharSequence c();
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof VideoDetailsCollapsed)) {
            return false;
        }
        final VideoDetailsCollapsed videoDetailsCollapsed = (VideoDetailsCollapsed)o;
        return TextUtils.equals(this.c(), videoDetailsCollapsed.c()) && TextUtils.equals(this.b(), videoDetailsCollapsed.b()) && this.a().equals((Object)videoDetailsCollapsed.a());
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.c(), this.b(), this.a() });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        TextUtils.writeToParcel(this.c(), parcel, n);
        TextUtils.writeToParcel(this.b(), parcel, n);
        parcel.writeByteArray(this.a().I());
    }
}
