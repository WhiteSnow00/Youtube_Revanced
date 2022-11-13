// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class MethodInvocation extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(17);
    }
    
    public MethodInvocation(final int a, final int b, final int c, final long d, final long e, final String f, final String g, final int h, final int i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.S(parcel, 2, this.b);
        khl.S(parcel, 3, this.c);
        khl.T(parcel, 4, this.d);
        khl.T(parcel, 5, this.e);
        khl.ag(parcel, 6, this.f);
        khl.ag(parcel, 7, this.g);
        khl.S(parcel, 8, this.h);
        khl.S(parcel, 9, this.i);
        khl.N(parcel, m);
    }
}
