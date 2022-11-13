// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.internal;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final RootTelemetryConfiguration a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(15);
    }
    
    public ConnectionTelemetryConfiguration(final RootTelemetryConfiguration a, final boolean b, final boolean c, final int[] d, final int e, final int[] f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.af(parcel, 1, (Parcelable)this.a, n);
        khl.O(parcel, 2, this.b);
        khl.O(parcel, 3, this.c);
        khl.Z(parcel, 4, this.d);
        khl.S(parcel, 5, this.e);
        khl.Z(parcel, 6, this.f);
        khl.N(parcel, m);
    }
}
