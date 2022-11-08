// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.vision.barcode;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Barcode$ContactInfo extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public Barcode$PersonName a;
    public String b;
    public String c;
    public Barcode$Phone[] d;
    public Barcode$Email[] e;
    public String[] f;
    public Barcode$Address[] g;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(12);
    }
    
    public Barcode$ContactInfo() {
    }
    
    public Barcode$ContactInfo(final Barcode$PersonName a, final String b, final String c, final Barcode$Phone[] d, final Barcode$Email[] e, final String[] f, final Barcode$Address[] g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ab(parcel, 2, (Parcelable)this.a, n);
        kgk.ac(parcel, 3, this.b);
        kgk.ac(parcel, 4, this.c);
        kgk.af(parcel, 5, (Parcelable[])this.d, n);
        kgk.af(parcel, 6, (Parcelable[])this.e, n);
        kgk.ad(parcel, 7, this.f);
        kgk.af(parcel, 8, (Parcelable[])this.g, n);
        kgk.J(parcel, i);
    }
}
