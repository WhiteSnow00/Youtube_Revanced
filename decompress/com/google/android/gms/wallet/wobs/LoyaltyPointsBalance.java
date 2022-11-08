// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LoyaltyPointsBalance extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    int a;
    String b;
    double c;
    String d;
    long e;
    int f;
    
    static {
        CREATOR = (Parcelable$Creator)new nnr(4);
    }
    
    LoyaltyPointsBalance() {
        this.f = -1;
        this.a = -1;
        this.c = -1.0;
    }
    
    public LoyaltyPointsBalance(final int a, final String b, final double c, final String d, final long e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.O(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.L(parcel, 4, this.c);
        kgk.ac(parcel, 5, this.d);
        kgk.P(parcel, 6, this.e);
        kgk.O(parcel, 7, this.f);
        kgk.J(parcel, i);
    }
}
