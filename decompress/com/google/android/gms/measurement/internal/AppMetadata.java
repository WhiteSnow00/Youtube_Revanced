// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.text.TextUtils;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AppMetadata extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    @Deprecated
    public final long l;
    public final long m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final Boolean r;
    public final long s;
    public final List t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    
    static {
        CREATOR = (Parcelable$Creator)new nen();
    }
    
    public AppMetadata(final String a, String b, final String c, final long j, final String d, final long e, final long f, final String g, final boolean h, final boolean i, final String k, final long m, final int n, final boolean o, final boolean p22, final String q, final Boolean r, final long s, final List t, final String v, final String w, final String x) {
        khl.aZ(a);
        this.a = a;
        if (TextUtils.isEmpty((CharSequence)b)) {
            b = null;
        }
        this.b = b;
        this.c = c;
        this.j = j;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.k = k;
        this.l = 0L;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p22;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = null;
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public AppMetadata(final String a, final String b, final String c, final String d, final long e, final long f, final String g, final boolean h, final boolean i, final long j, final String k, final long l, final long m, final int n, final boolean o, final boolean p24, final String q, final Boolean r, final long s, final List t, final String u, final String v, final String w, final String x) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.j = j;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p24;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 2, this.a);
        khl.ag(parcel, 3, this.b);
        khl.ag(parcel, 4, this.c);
        khl.ag(parcel, 5, this.d);
        khl.T(parcel, 6, this.e);
        khl.T(parcel, 7, this.f);
        khl.ag(parcel, 8, this.g);
        khl.O(parcel, 9, this.h);
        khl.O(parcel, 10, this.i);
        khl.T(parcel, 11, this.j);
        khl.ag(parcel, 12, this.k);
        khl.T(parcel, 13, this.l);
        khl.T(parcel, 14, this.m);
        khl.S(parcel, 15, this.n);
        khl.O(parcel, 16, this.o);
        khl.O(parcel, 18, this.p);
        khl.ag(parcel, 19, this.q);
        khl.U(parcel, 21, this.r);
        khl.T(parcel, 22, this.s);
        khl.ai(parcel, 23, this.t);
        khl.ag(parcel, 24, this.u);
        khl.ag(parcel, 25, this.v);
        khl.ag(parcel, 26, this.w);
        khl.ag(parcel, 27, this.x);
        khl.N(parcel, m);
    }
}
