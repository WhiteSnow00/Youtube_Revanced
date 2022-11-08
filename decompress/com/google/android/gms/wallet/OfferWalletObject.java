// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class OfferWalletObject extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    String b;
    CommonWalletObject c;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(7);
    }
    
    OfferWalletObject() {
        this.a = 3;
    }
    
    public OfferWalletObject(final int a, final String a2, final String b, final CommonWalletObject c) {
        this.a = a;
        this.b = b;
        if (a < 3) {
            final CommonWalletObject c2 = new CommonWalletObject();
            c2.a = a2;
            this.c = c2;
            return;
        }
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.O(parcel, 1, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.ab(parcel, 4, (Parcelable)this.c, n);
        kgk.J(parcel, i);
    }
}
