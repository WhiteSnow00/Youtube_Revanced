// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Barcode$WiFi extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public String b;
    public int c;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(20);
    }
    
    public Barcode$WiFi() {
    }
    
    public Barcode$WiFi(final String a, final String b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.O(parcel, 4, this.c);
        kgk.J(parcel, i);
    }
}
