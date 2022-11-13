// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    String k;
    String l;
    boolean m;
    String n;
    String o;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(18);
    }
    
    UserAddress() {
    }
    
    public UserAddress(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final String i, final String j, final String k, final String l, final boolean m, final String n, final String o) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 2, this.a);
        khl.ag(parcel, 3, this.b);
        khl.ag(parcel, 4, this.c);
        khl.ag(parcel, 5, this.d);
        khl.ag(parcel, 6, this.e);
        khl.ag(parcel, 7, this.f);
        khl.ag(parcel, 8, this.g);
        khl.ag(parcel, 9, this.h);
        khl.ag(parcel, 10, this.i);
        khl.ag(parcel, 11, this.j);
        khl.ag(parcel, 12, this.k);
        khl.ag(parcel, 13, this.l);
        khl.O(parcel, 14, this.m);
        khl.ag(parcel, 15, this.n);
        khl.ag(parcel, 16, this.o);
        khl.N(parcel, m);
    }
}
