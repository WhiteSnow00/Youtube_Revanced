// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class Address extends AbstractSafeParcelable
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
    boolean j;
    String k;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(2);
    }
    
    Address() {
    }
    
    public Address(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final String i, final boolean j, final String k) {
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
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.ac(parcel, 4, this.c);
        kgk.ac(parcel, 5, this.d);
        kgk.ac(parcel, 6, this.e);
        kgk.ac(parcel, 7, this.f);
        kgk.ac(parcel, 8, this.g);
        kgk.ac(parcel, 9, this.h);
        kgk.ac(parcel, 10, this.i);
        kgk.K(parcel, 11, this.j);
        kgk.ac(parcel, 12, this.k);
        kgk.J(parcel, i);
    }
}
