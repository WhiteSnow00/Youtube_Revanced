// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Barcode$CalendarDateTime extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(10);
    }
    
    public Barcode$CalendarDateTime() {
    }
    
    public Barcode$CalendarDateTime(final int a, final int b, final int c, final int d, final int e, final int f, final boolean g, final String h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.O(parcel, 2, this.a);
        kgk.O(parcel, 3, this.b);
        kgk.O(parcel, 4, this.c);
        kgk.O(parcel, 5, this.d);
        kgk.O(parcel, 6, this.e);
        kgk.O(parcel, 7, this.f);
        kgk.K(parcel, 8, this.g);
        kgk.ac(parcel, 9, this.h);
        kgk.J(parcel, i);
    }
}
