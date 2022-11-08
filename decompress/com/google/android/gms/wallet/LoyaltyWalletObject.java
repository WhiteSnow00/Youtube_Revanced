// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet;

import android.os.Parcelable;
import java.util.List;
import android.os.Parcel;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LoyaltyWalletObject extends AbstractSafeParcelable
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
    @Deprecated
    String i;
    String j;
    int k;
    ArrayList l;
    TimeInterval m;
    ArrayList n;
    @Deprecated
    String o;
    @Deprecated
    String p;
    ArrayList q;
    boolean r;
    ArrayList s;
    ArrayList t;
    ArrayList u;
    LoyaltyPoints v;
    
    static {
        CREATOR = (Parcelable$Creator)new nmz();
    }
    
    LoyaltyWalletObject() {
        this.l = kgk.F();
        this.n = kgk.F();
        this.q = kgk.F();
        this.s = kgk.F();
        this.t = kgk.F();
        this.u = kgk.F();
    }
    
    public LoyaltyWalletObject(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final String i, final String j, final int k, final ArrayList l, final TimeInterval m, final ArrayList n, final String o, final String p22, final ArrayList q, final boolean r, final ArrayList s, final ArrayList t, final ArrayList u, final LoyaltyPoints v) {
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
        this.p = p22;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.ac(parcel, 4, this.c);
        kgk.ac(parcel, 5, this.d);
        kgk.ac(parcel, 6, this.e);
        kgk.ac(parcel, 7, this.f);
        kgk.ac(parcel, 8, this.g);
        kgk.ac(parcel, 9, this.h);
        kgk.ac(parcel, 10, this.i);
        kgk.ac(parcel, 11, this.j);
        kgk.O(parcel, 12, this.k);
        kgk.ag(parcel, 13, (List)this.l);
        kgk.ab(parcel, 14, (Parcelable)this.m, n);
        kgk.ag(parcel, 15, (List)this.n);
        kgk.ac(parcel, 16, this.o);
        kgk.ac(parcel, 17, this.p);
        kgk.ag(parcel, 18, (List)this.q);
        kgk.K(parcel, 19, this.r);
        kgk.ag(parcel, 20, (List)this.s);
        kgk.ag(parcel, 21, (List)this.t);
        kgk.ag(parcel, 22, (List)this.u);
        kgk.ab(parcel, 23, (Parcelable)this.v, n);
        kgk.J(parcel, i);
    }
}
