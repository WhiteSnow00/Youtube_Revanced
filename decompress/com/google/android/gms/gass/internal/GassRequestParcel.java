// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GassRequestParcel extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    public final String c;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(7);
    }
    
    public GassRequestParcel(final int a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.ag(parcel, 2, this.b);
        khl.ag(parcel, 3, this.c);
        khl.N(parcel, m);
    }
}
