// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Barcode$GeoPoint extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public double a;
    public double b;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(15);
    }
    
    public Barcode$GeoPoint() {
    }
    
    public Barcode$GeoPoint(final double a, final double b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.L(parcel, 2, this.a);
        kgk.L(parcel, 3, this.b);
        kgk.J(parcel, i);
    }
}
