// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.signin.internal;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.ConnectionResult;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SignInResponse extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    public final ConnectionResult b;
    public final ResolveAccountResponse c;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(5);
    }
    
    public SignInResponse(final int a, final ConnectionResult b, final ResolveAccountResponse c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.O(parcel, 1, this.a);
        kgk.ab(parcel, 2, (Parcelable)this.b, n);
        kgk.ab(parcel, 3, (Parcelable)this.c, n);
        kgk.J(parcel, i);
    }
}
