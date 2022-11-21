// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import java.util.Arrays;
import android.text.TextUtils;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class VideoDetailsExpanded implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final VideoDetailsExpanded a;
    
    static {
        a = d().i();
        CREATOR = (Parcelable$Creator)new f(7);
    }
    
    public static pb d() {
        final pb pb = new pb((short[])null);
        pb.a = null;
        pb.b = null;
        pb.j(ahbt.b);
        return pb;
    }
    
    public abstract ahbt a();
    
    public abstract CharSequence b();
    
    public abstract CharSequence c();
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof VideoDetailsExpanded)) {
            return false;
        }
        final VideoDetailsExpanded videoDetailsExpanded = (VideoDetailsExpanded)o;
        return TextUtils.equals(this.c(), videoDetailsExpanded.c()) && TextUtils.equals(this.b(), videoDetailsExpanded.b()) && this.a().equals((Object)videoDetailsExpanded.a());
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
