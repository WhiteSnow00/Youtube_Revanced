// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Bundle;
import com.google.android.gms.identity.intents.model.UserAddress;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class PaymentData extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    CardInfo b;
    UserAddress c;
    PaymentMethodToken d;
    String e;
    Bundle f;
    String g;
    Bundle h;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(9);
    }
    
    private PaymentData() {
    }
    
    public PaymentData(final String a, final CardInfo b, final UserAddress c, final PaymentMethodToken d, final String e, final Bundle f, final String g, final Bundle h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ac(parcel, 1, this.a);
        kgk.ab(parcel, 2, (Parcelable)this.b, n);
        kgk.ab(parcel, 3, (Parcelable)this.c, n);
        kgk.ab(parcel, 4, (Parcelable)this.d, n);
        kgk.ac(parcel, 5, this.e);
        kgk.R(parcel, 6, this.f);
        kgk.ac(parcel, 7, this.g);
        kgk.R(parcel, 8, this.h);
        kgk.J(parcel, i);
    }
}
