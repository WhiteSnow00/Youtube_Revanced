// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet.wobs;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LoyaltyPoints extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    LoyaltyPointsBalance b;
    @Deprecated
    TimeInterval c;
    
    static {
        CREATOR = (Parcelable$Creator)new nnr(5);
    }
    
    LoyaltyPoints() {
    }
    
    public LoyaltyPoints(final String a, final LoyaltyPointsBalance b, final TimeInterval c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ab(parcel, 3, (Parcelable)this.b, n);
        kgk.ab(parcel, 5, (Parcelable)this.c, n);
        kgk.J(parcel, i);
    }
}
