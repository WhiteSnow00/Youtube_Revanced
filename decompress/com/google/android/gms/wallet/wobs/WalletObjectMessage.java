// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet.wobs;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class WalletObjectMessage extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    String b;
    TimeInterval c;
    @Deprecated
    UriData d;
    @Deprecated
    UriData e;
    
    static {
        CREATOR = (Parcelable$Creator)new nnr(9);
    }
    
    WalletObjectMessage() {
    }
    
    public WalletObjectMessage(final String a, final String b, final TimeInterval c, final UriData d, final UriData e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.ab(parcel, 4, (Parcelable)this.c, n);
        kgk.ab(parcel, 5, (Parcelable)this.d, n);
        kgk.ab(parcel, 6, (Parcelable)this.e, n);
        kgk.J(parcel, i);
    }
}
