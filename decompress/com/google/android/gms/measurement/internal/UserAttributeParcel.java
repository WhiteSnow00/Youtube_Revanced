// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class UserAttributeParcel extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    public final long c;
    public final Long d;
    public final String e;
    public final String f;
    public final Double g;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(16);
    }
    
    public UserAttributeParcel(final int a, final String b, final long c, final Long d, final Float n, final String e, final String f, final Double g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (a == 1) {
            Double value;
            if (n != null) {
                value = (double)n;
            }
            else {
                value = null;
            }
            this.g = value;
        }
        else {
            this.g = g;
        }
        this.e = e;
        this.f = f;
    }
    
    public UserAttributeParcel(final adik adik, final byte[] array, final byte[] array2) {
        this((String)adik.b, adik.a, adik.e, (String)adik.d);
    }
    
    public UserAttributeParcel(final String b, final long c, final Object o, final String f) {
        khl.aZ(b);
        this.a = 2;
        this.b = b;
        this.c = c;
        this.f = f;
        if (o == null) {
            this.d = null;
            this.g = null;
            this.e = null;
            return;
        }
        if (o instanceof Long) {
            this.d = (Long)o;
            this.g = null;
            this.e = null;
            return;
        }
        if (o instanceof String) {
            this.d = null;
            this.g = null;
            this.e = (String)o;
            return;
        }
        if (o instanceof Double) {
            this.d = null;
            this.g = (Double)o;
            this.e = null;
            return;
        }
        throw new IllegalArgumentException("User attribute given of un-supported type");
    }
    
    public final Object a() {
        final Long d = this.d;
        if (d != null) {
            return d;
        }
        final Double g = this.g;
        if (g != null) {
            return g;
        }
        final String e = this.e;
        if (e != null) {
            return e;
        }
        return null;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        nbu.b(this, parcel);
    }
}
