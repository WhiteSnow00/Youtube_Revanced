// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.identity.intents.model.UserAddress;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    String b;
    String[] c;
    String d;
    Address e;
    Address f;
    LoyaltyWalletObject[] g;
    OfferWalletObject[] h;
    UserAddress i;
    UserAddress j;
    InstrumentInfo[] k;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(6);
    }
    
    private MaskedWallet() {
    }
    
    public MaskedWallet(final String a, final String b, final String[] c, final String d, final Address e, final Address f, final LoyaltyWalletObject[] g, final OfferWalletObject[] h, final UserAddress i, final UserAddress j, final InstrumentInfo[] k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.ad(parcel, 4, this.c);
        kgk.ac(parcel, 5, this.d);
        kgk.ab(parcel, 6, (Parcelable)this.e, n);
        kgk.ab(parcel, 7, (Parcelable)this.f, n);
        kgk.af(parcel, 8, (Parcelable[])this.g, n);
        kgk.af(parcel, 9, (Parcelable[])this.h, n);
        kgk.ab(parcel, 10, (Parcelable)this.i, n);
        kgk.ab(parcel, 11, (Parcelable)this.j, n);
        kgk.af(parcel, 12, (Parcelable[])this.k, n);
        kgk.J(parcel, i);
    }
}
