// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class TimeInterval extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    long a;
    long b;
    
    static {
        CREATOR = (Parcelable$Creator)new nnr(7);
    }
    
    TimeInterval() {
    }
    
    public TimeInterval(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.P(parcel, 2, this.a);
        kgk.P(parcel, 3, this.b);
        kgk.J(parcel, i);
    }
}
