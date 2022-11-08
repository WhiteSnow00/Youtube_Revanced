// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Barcode$Phone extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public String b;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(17);
    }
    
    public Barcode$Phone() {
    }
    
    public Barcode$Phone(final int a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.O(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.J(parcel, i);
    }
}
