// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.internal;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.accounts.Account;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ResolveAccountRequest extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(18);
    }
    
    public ResolveAccountRequest(final int a, final Account b, final int c, final GoogleSignInAccount d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.af(parcel, 2, (Parcelable)this.b, n);
        khl.S(parcel, 3, this.c);
        khl.af(parcel, 4, (Parcelable)this.d, n);
        khl.N(parcel, m);
    }
}
