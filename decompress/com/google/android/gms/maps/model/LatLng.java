// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final double a;
    public final double b;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(7);
    }
    
    public LatLng(final double n, double b) {
        if (b < -180.0 || b >= 180.0) {
            b = ((b - 180.0) % 360.0 + 360.0) % 360.0 - 180.0;
        }
        this.b = b;
        this.a = Math.max(-90.0, Math.min(90.0, n));
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LatLng)) {
            return false;
        }
        final LatLng latLng = (LatLng)o;
        return Double.doubleToLongBits(this.a) == Double.doubleToLongBits(latLng.a) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(latLng.b);
    }
    
    public final int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.a);
        final long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        return ((int)(doubleToLongBits ^ doubleToLongBits >>> 32) + 31) * 31 + (int)(doubleToLongBits2 ^ doubleToLongBits2 >>> 32);
    }
    
    public final String toString() {
        final double a = this.a;
        final double b = this.b;
        final StringBuilder sb = new StringBuilder("lat/lng: (");
        sb.append(a);
        sb.append(",");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.P(parcel, 2, this.a);
        khl.P(parcel, 3, this.b);
        khl.N(parcel, m);
    }
}
