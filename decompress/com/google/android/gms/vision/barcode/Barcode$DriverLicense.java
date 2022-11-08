// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Barcode$DriverLicense extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(13);
    }
    
    public Barcode$DriverLicense() {
    }
    
    public Barcode$DriverLicense(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final String i, final String j, final String k, final String l, final String m, final String n) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
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
        kgk.ac(parcel, 9, this.h);
        kgk.ac(parcel, 10, this.i);
        kgk.ac(parcel, 11, this.j);
        kgk.ac(parcel, 12, this.k);
        kgk.ac(parcel, 13, this.l);
        kgk.ac(parcel, 14, this.m);
        kgk.ac(parcel, 15, this.n);
        kgk.J(parcel, i);
    }
}
