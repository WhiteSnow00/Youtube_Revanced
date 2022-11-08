// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class InstrumentInfo extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public String b;
    private int c;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(5);
    }
    
    private InstrumentInfo() {
    }
    
    public InstrumentInfo(final String a, final String b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int c) {
        final int i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        final int n = c = this.c;
        if (n != 1 && (c = n) != 2 && (c = n) != 3) {
            c = 0;
        }
        kgk.O(parcel, 4, c);
        kgk.J(parcel, i);
    }
}
