// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcelable;
import android.os.Parcel;
import android.content.Intent;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class OverflowMenuItem extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final String b;
    final Intent c;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(16);
    }
    
    public OverflowMenuItem(final int a, final String b, final Intent c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.S(parcel, 2, this.a);
        khl.ag(parcel, 3, this.b);
        khl.af(parcel, 4, (Parcelable)this.c, n);
        khl.N(parcel, m);
    }
}
