// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.signin.internal;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SignInRequest extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final ResolveAccountRequest b;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(4);
    }
    
    public SignInRequest(final int a, final ResolveAccountRequest b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.O(parcel, 1, this.a);
        kgk.ab(parcel, 2, (Parcelable)this.b, n);
        kgk.J(parcel, i);
    }
}
