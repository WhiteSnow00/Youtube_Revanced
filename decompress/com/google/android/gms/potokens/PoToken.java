// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.potokens;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PoToken extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final byte[] a;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(0);
    }
    
    public PoToken(final byte[] a) {
        this.a = a;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.S(parcel, 1, this.a);
        kgk.J(parcel, i);
    }
}
