// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.vision.barcode;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Barcode$CalendarEvent extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Barcode$CalendarDateTime f;
    public Barcode$CalendarDateTime g;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(11);
    }
    
    public Barcode$CalendarEvent() {
    }
    
    public Barcode$CalendarEvent(final String a, final String b, final String c, final String d, final String e, final Barcode$CalendarDateTime f, final Barcode$CalendarDateTime g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.ac(parcel, 4, this.c);
        kgk.ac(parcel, 5, this.d);
        kgk.ac(parcel, 6, this.e);
        kgk.ab(parcel, 7, (Parcelable)this.f, n);
        kgk.ab(parcel, 8, (Parcelable)this.g, n);
        kgk.J(parcel, i);
    }
}
