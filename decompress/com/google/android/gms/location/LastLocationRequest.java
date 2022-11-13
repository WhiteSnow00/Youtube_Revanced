// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.location;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import com.google.android.gms.libs.identity.ClientIdentity;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LastLocationRequest extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final long a;
    public final int b;
    public final boolean c;
    public final String d;
    public final ClientIdentity e;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(20);
    }
    
    public LastLocationRequest(final long a, final int b, final boolean c, final String d, final ClientIdentity e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof LastLocationRequest)) {
            return false;
        }
        final LastLocationRequest lastLocationRequest = (LastLocationRequest)o;
        return this.a == lastLocationRequest.a && this.b == lastLocationRequest.b && this.c == lastLocationRequest.c && khl.be((Object)this.d, (Object)lastLocationRequest.d) && khl.be((Object)this.e, (Object)lastLocationRequest.e);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c });
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        if (this.a != Long.MAX_VALUE) {
            sb.append("maxAge=");
            ncj.a(this.a, sb);
        }
        if (this.b != 0) {
            sb.append(", ");
            sb.append(nbr.ag(this.b));
        }
        if (this.c) {
            sb.append(", bypass");
        }
        if (this.d != null) {
            sb.append(", moduleId=");
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append(", impersonation=");
            sb.append(this.e);
        }
        sb.append(']');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.T(parcel, 1, this.a);
        khl.S(parcel, 2, this.b);
        khl.O(parcel, 3, this.c);
        khl.ag(parcel, 4, this.d);
        khl.af(parcel, 5, (Parcelable)this.e, n);
        khl.N(parcel, m);
    }
}
