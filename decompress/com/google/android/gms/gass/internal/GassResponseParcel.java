// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GassResponseParcel extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public eht b;
    public byte[] c;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(8);
    }
    
    public GassResponseParcel(final int a, final byte[] c) {
        this.a = a;
        this.b = null;
        this.c = c;
        this.a();
    }
    
    public final void a() {
        final eht b = this.b;
        if (b == null && this.c != null) {
            return;
        }
        if (b != null && this.c == null) {
            return;
        }
        if (b != null && this.c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        }
        if (b == null && this.c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        }
        throw new IllegalStateException("Impossible");
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        byte[] array = this.c;
        if (array == null) {
            array = ((agzk)this.b).toByteArray();
        }
        khl.W(parcel, 2, array);
        khl.N(parcel, m);
    }
}
