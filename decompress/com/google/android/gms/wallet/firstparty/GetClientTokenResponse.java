// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GetClientTokenResponse extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public byte[] a;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(15);
    }
    
    GetClientTokenResponse() {
        this(new byte[0]);
    }
    
    public GetClientTokenResponse(final byte[] a) {
        this.a = a;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.S(parcel, 2, this.a);
        kgk.J(parcel, i);
    }
}
