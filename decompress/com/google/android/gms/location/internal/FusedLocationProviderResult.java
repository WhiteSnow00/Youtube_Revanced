// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.location.internal;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class FusedLocationProviderResult extends AbstractSafeParcelable implements mrg
{
    public static final Parcelable$Creator CREATOR;
    public final Status a;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(3);
    }
    
    public FusedLocationProviderResult(final Status a) {
        this.a = a;
    }
    
    public final Status a() {
        return this.a;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.af(parcel, 1, (Parcelable)this.a, n);
        khl.N(parcel, m);
    }
}
