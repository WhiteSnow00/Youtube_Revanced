// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mdisync;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class CallerInfo extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final long b;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(8);
    }
    
    public CallerInfo(final String a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        khl.T(parcel, 2, this.b);
        khl.N(parcel, m);
    }
}
