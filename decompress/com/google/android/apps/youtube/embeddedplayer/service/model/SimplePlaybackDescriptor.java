// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Collection;
import java.util.List;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class SimplePlaybackDescriptor implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final int e;
    public final int f;
    public final int g;
    
    static {
        CREATOR = (Parcelable$Creator)new f(4);
    }
    
    public SimplePlaybackDescriptor(final int a, final String b, final String c, final ArrayList d, final int e, final int f, final int g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public SimplePlaybackDescriptor(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        parcel.readStringList((List)(this.d = new ArrayList()));
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }
    
    public static SimplePlaybackDescriptor b(final String s, final int n, final int n2, final int n3) {
        return jzq.u(2, (String)null, s, new ArrayList(), n, n2, n3);
    }
    
    public static SimplePlaybackDescriptor c(final String s, final int n) {
        return jzq.u(1, s, (String)null, new ArrayList(), n, 0, 0);
    }
    
    public static SimplePlaybackDescriptor d(final String s, final int n, final int n2) {
        return jzq.u(1, s, (String)null, new ArrayList(), n, 0, n2);
    }
    
    public static SimplePlaybackDescriptor e(final List list, final int n, final int n2, final int n3) {
        new ArrayList();
        return jzq.u(3, (String)null, (String)null, new ArrayList(list), n, n2, n3);
    }
    
    public static Optional f(String s, final List list, final String s2, final int n, int n2, final int n3) {
        if (TextUtils.isEmpty((CharSequence)s) && TextUtils.isEmpty((CharSequence)s2)) {
            return Optional.empty();
        }
        final ArrayList list2 = new ArrayList();
        String s3;
        ArrayList list3;
        int n4;
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            s3 = s2;
            list3 = list2;
            n4 = 2;
        }
        else if (list != null && !list.isEmpty()) {
            list3 = new ArrayList();
            if (s != null) {
                list3.add(s);
            }
            list3.addAll(list);
            s = null;
            s3 = null;
            n4 = 3;
        }
        else {
            s3 = null;
            list3 = list2;
            n4 = 1;
        }
        if (n4 == 1) {
            n2 = 0;
        }
        return Optional.of((Object)jzq.u(n4, s, s3, list3, n, n2, n3));
    }
    
    public final SimplePlaybackDescriptor a(final int n) {
        new ArrayList();
        final int a = this.a;
        final String b = this.b;
        final String c = this.c;
        final ArrayList list = new ArrayList();
        list.addAll(this.d);
        final int f = this.f;
        int g = this.g;
        if (n == 2) {
            g = 0;
        }
        return jzq.u(a, b, c, list, n, f, g);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringList((List)this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }
}
