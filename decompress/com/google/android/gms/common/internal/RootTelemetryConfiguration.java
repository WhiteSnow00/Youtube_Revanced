// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class RootTelemetryConfiguration extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(20);
    }
    
    public RootTelemetryConfiguration(final int a, final boolean b, final boolean c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.O(parcel, 2, this.b);
        khl.O(parcel, 3, this.c);
        khl.S(parcel, 4, this.d);
        khl.S(parcel, 5, this.e);
        khl.N(parcel, m);
    }
}
