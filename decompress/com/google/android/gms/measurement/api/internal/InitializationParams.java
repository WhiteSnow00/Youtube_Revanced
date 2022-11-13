// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement.api.internal;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class InitializationParams extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final long a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Bundle g;
    public final String h;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(12);
    }
    
    public InitializationParams(final long a, final long b, final boolean c, final String d, final String e, final String f, final Bundle g, final String h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.T(parcel, 1, this.a);
        khl.T(parcel, 2, this.b);
        khl.O(parcel, 3, this.c);
        khl.ag(parcel, 4, this.d);
        khl.ag(parcel, 5, this.e);
        khl.ag(parcel, 6, this.f);
        khl.V(parcel, 7, this.g);
        khl.ag(parcel, 8, this.h);
        khl.N(parcel, m);
    }
}
