// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.signin.internal;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.content.Intent;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AuthAccountResult extends AbstractSafeParcelable implements mqb
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    public int b;
    public Intent c;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(2);
    }
    
    public AuthAccountResult() {
        this(2, 0, null);
    }
    
    public AuthAccountResult(final int a, final int b, final Intent c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Status a() {
        if (this.b == 0) {
            return Status.a;
        }
        return Status.e;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.O(parcel, 1, this.a);
        kgk.O(parcel, 2, this.b);
        kgk.ab(parcel, 3, (Parcelable)this.c, n);
        kgk.J(parcel, i);
    }
}
