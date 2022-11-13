// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.location;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class NetworkLocationStatus extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(2);
    }
    
    public NetworkLocationStatus(final int a, final int b, final long c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof NetworkLocationStatus) {
            final NetworkLocationStatus networkLocationStatus = (NetworkLocationStatus)o;
            if (this.a == networkLocationStatus.a && this.b == networkLocationStatus.b && this.c == networkLocationStatus.c && this.d == networkLocationStatus.d) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.a, this.d, this.c });
    }
    
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final long d = this.d;
        final long c = this.c;
        final StringBuilder sb = new StringBuilder("NetworkLocationStatus: Wifi status: ");
        sb.append(a);
        sb.append(" Cell status: ");
        sb.append(b);
        sb.append(" elapsed time NS: ");
        sb.append(d);
        sb.append(" system time ms: ");
        sb.append(c);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.S(parcel, 2, this.b);
        khl.T(parcel, 3, this.c);
        khl.T(parcel, 4, this.d);
        khl.N(parcel, m);
    }
}
