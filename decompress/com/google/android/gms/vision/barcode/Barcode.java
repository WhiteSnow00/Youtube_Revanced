// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.vision.barcode;

import android.os.Parcelable;
import android.os.Parcel;
import android.graphics.Point;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Barcode extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public String b;
    public String c;
    public int d;
    public Point[] e;
    public Barcode$Email f;
    public Barcode$Phone g;
    public Barcode$Sms h;
    public Barcode$WiFi i;
    public Barcode$UrlBookmark j;
    public Barcode$GeoPoint k;
    public Barcode$CalendarEvent l;
    public Barcode$ContactInfo m;
    public Barcode$DriverLicense n;
    public byte[] o;
    public boolean p;
    public double q;
    
    static {
        CREATOR = (Parcelable$Creator)new nms();
    }
    
    public Barcode() {
    }
    
    public Barcode(final int a, final String b, final String c, final int d, final Point[] e, final Barcode$Email f, final Barcode$Phone g, final Barcode$Sms h, final Barcode$WiFi i, final Barcode$UrlBookmark j, final Barcode$GeoPoint k, final Barcode$CalendarEvent l, final Barcode$ContactInfo m, final Barcode$DriverLicense n, final byte[] o, final boolean p17, final double q) {
        this.a = a;
        this.b = b;
        this.o = o;
        this.c = c;
        this.d = d;
        this.e = e;
        this.p = p17;
        this.q = q;
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
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.O(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.ac(parcel, 4, this.c);
        kgk.O(parcel, 5, this.d);
        kgk.af(parcel, 6, (Parcelable[])this.e, n);
        kgk.ab(parcel, 7, (Parcelable)this.f, n);
        kgk.ab(parcel, 8, (Parcelable)this.g, n);
        kgk.ab(parcel, 9, (Parcelable)this.h, n);
        kgk.ab(parcel, 10, (Parcelable)this.i, n);
        kgk.ab(parcel, 11, (Parcelable)this.j, n);
        kgk.ab(parcel, 12, (Parcelable)this.k, n);
        kgk.ab(parcel, 13, (Parcelable)this.l, n);
        kgk.ab(parcel, 14, (Parcelable)this.m, n);
        kgk.ab(parcel, 15, (Parcelable)this.n, n);
        kgk.S(parcel, 16, this.o);
        kgk.K(parcel, 17, this.p);
        kgk.L(parcel, 18, this.q);
        kgk.J(parcel, i);
    }
}
