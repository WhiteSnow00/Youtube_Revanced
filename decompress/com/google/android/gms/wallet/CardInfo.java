// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.identity.intents.model.UserAddress;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CardInfo extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    String b;
    String c;
    int d;
    UserAddress e;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(3);
    }
    
    private CardInfo() {
    }
    
    public CardInfo(final String a, final String b, final String c, final int d, final UserAddress e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ac(parcel, 1, this.a);
        kgk.ac(parcel, 2, this.b);
        kgk.ac(parcel, 3, this.c);
        kgk.O(parcel, 4, this.d);
        kgk.ab(parcel, 5, (Parcelable)this.e, n);
        kgk.J(parcel, i);
    }
}
