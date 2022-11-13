// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SyncStatus extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    public final long c;
    
    static {
        CREATOR = (Parcelable$Creator)new nlj(0);
    }
    
    public SyncStatus(final int a, final String b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 2, this.a);
        khl.ag(parcel, 3, this.b);
        khl.T(parcel, 4, this.c);
        khl.N(parcel, m);
    }
}
