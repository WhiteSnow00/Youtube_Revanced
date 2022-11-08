// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Barcode$PersonName extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(16);
    }
    
    public Barcode$PersonName() {
    }
    
    public Barcode$PersonName(final String a, final String b, final String c, final String d, final String e, final String f, final String g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.ac(parcel, 4, this.c);
        kgk.ac(parcel, 5, this.d);
        kgk.ac(parcel, 6, this.e);
        kgk.ac(parcel, 7, this.f);
        kgk.ac(parcel, 8, this.g);
        kgk.J(parcel, i);
    }
}
