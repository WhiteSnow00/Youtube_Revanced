// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Barcode$Email extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public String b;
    public String c;
    public String d;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(14);
    }
    
    public Barcode$Email() {
    }
    
    public Barcode$Email(final int a, final String b, final String c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.O(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.ac(parcel, 4, this.c);
        kgk.ac(parcel, 5, this.d);
        kgk.J(parcel, i);
    }
}
