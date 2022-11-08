// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class ProxyCard extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    String b;
    int c;
    int d;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(11);
    }
    
    public ProxyCard(final String a, final String b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.O(parcel, 4, this.c);
        kgk.O(parcel, 5, this.d);
        kgk.J(parcel, i);
    }
}
