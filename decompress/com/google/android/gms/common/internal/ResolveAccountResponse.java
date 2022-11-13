// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.internal;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ResolveAccountResponse extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    IBinder b;
    public ConnectionResult c;
    public boolean d;
    public boolean e;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(19);
    }
    
    public ResolveAccountResponse(final int a, final IBinder b, final ConnectionResult c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final mup a() {
        final IBinder b = this.b;
        if (b == null) {
            return null;
        }
        final IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        mup mup;
        if (queryLocalInterface instanceof mup) {
            mup = (mup)queryLocalInterface;
        }
        else {
            mup = new mup(b);
        }
        return mup;
    }
    
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResolveAccountResponse)) {
            return false;
        }
        final ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse)o;
        return this.c.equals(resolveAccountResponse.c) && khl.be((Object)this.a(), (Object)resolveAccountResponse.a());
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.Y(parcel, 2, this.b);
        khl.af(parcel, 3, (Parcelable)this.c, n);
        khl.O(parcel, 4, this.d);
        khl.O(parcel, 5, this.e);
        khl.N(parcel, m);
    }
}
