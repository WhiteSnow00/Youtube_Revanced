// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.location;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    public final long c;
    int d;
    public final NetworkLocationStatus[] e;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(1);
    }
    
    public LocationAvailability(final int n, final int a, final int b, final long c, final NetworkLocationStatus[] e) {
        int d = 1000;
        if (n < 1000) {
            d = 0;
        }
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    public final boolean a() {
        return this.d < 1000;
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof LocationAvailability) {
            final LocationAvailability locationAvailability = (LocationAvailability)o;
            if (this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && Arrays.equals(this.e, locationAvailability.e)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.d });
    }
    
    public final String toString() {
        final boolean a = this.a();
        final StringBuilder sb = new StringBuilder("LocationAvailability[");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.S(parcel, 2, this.b);
        khl.T(parcel, 3, this.c);
        khl.S(parcel, 4, this.d);
        khl.aj(parcel, 5, (Parcelable[])this.e, n);
        khl.O(parcel, 6, this.a());
        khl.N(parcel, m);
    }
}
