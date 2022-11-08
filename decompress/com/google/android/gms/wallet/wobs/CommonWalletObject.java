// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet.wobs;

import android.os.Parcelable;
import java.util.List;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class CommonWalletObject extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    @Deprecated
    String h;
    int i;
    ArrayList j;
    TimeInterval k;
    ArrayList l;
    @Deprecated
    String m;
    @Deprecated
    String n;
    ArrayList o;
    boolean p;
    ArrayList q;
    ArrayList r;
    ArrayList s;
    
    static {
        CREATOR = (Parcelable$Creator)new nns();
    }
    
    public CommonWalletObject() {
        this.j = kgk.F();
        this.l = kgk.F();
        this.o = kgk.F();
        this.q = kgk.F();
        this.r = kgk.F();
        this.s = kgk.F();
    }
    
    public CommonWalletObject(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final int i, final ArrayList j, final TimeInterval k, final ArrayList l, final String m, final String n, final ArrayList o, final boolean p19, final ArrayList q, final ArrayList r, final ArrayList s) {
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
        this.p = p19;
        this.q = q;
        this.r = r;
        this.s = s;
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
        kgk.O(parcel, 10, this.i);
        kgk.ag(parcel, 11, (List)this.j);
        kgk.ab(parcel, 12, (Parcelable)this.k, n);
        kgk.ag(parcel, 13, (List)this.l);
        kgk.ac(parcel, 14, this.m);
        kgk.ac(parcel, 15, this.n);
        kgk.ag(parcel, 16, (List)this.o);
        kgk.K(parcel, 17, this.p);
        kgk.ag(parcel, 18, (List)this.q);
        kgk.ag(parcel, 19, (List)this.r);
        kgk.ag(parcel, 20, (List)this.s);
        kgk.J(parcel, i);
    }
}
