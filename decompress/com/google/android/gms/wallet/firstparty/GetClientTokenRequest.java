// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GetClientTokenRequest extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    WalletCustomTheme a;
    boolean b;
    int c;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(14);
    }
    
    GetClientTokenRequest() {
        this.c = 1;
    }
    
    public GetClientTokenRequest(final WalletCustomTheme a, final boolean b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a != null) {
            return;
        }
        throw new NullPointerException("WalletCustomTheme is required");
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ab(parcel, 2, (Parcelable)this.a, n);
        kgk.K(parcel, 3, this.b);
        kgk.O(parcel, 4, this.c);
        kgk.J(parcel, i);
    }
}
