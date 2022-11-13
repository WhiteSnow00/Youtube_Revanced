// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ProgramRequest extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(9);
    }
    
    public ProgramRequest(final int a, final int b, final int e, final String c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.S(parcel, 2, this.b);
        khl.ag(parcel, 3, this.c);
        khl.ag(parcel, 4, this.d);
        khl.S(parcel, 5, this.e);
        khl.N(parcel, m);
    }
}
