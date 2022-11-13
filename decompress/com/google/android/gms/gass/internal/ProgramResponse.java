// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.gass.internal;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ProgramResponse extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final byte[] b;
    public final int c;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(10);
    }
    
    public ProgramResponse(final int a, byte[] copy, final int c) {
        this.a = a;
        if (copy == null) {
            copy = null;
        }
        else {
            copy = Arrays.copyOf(copy, copy.length);
        }
        this.b = copy;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.W(parcel, 2, this.b);
        khl.S(parcel, 3, this.c);
        khl.N(parcel, m);
    }
}
