// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ClientIdentity extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(13);
    }
    
    public ClientIdentity(final int a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ClientIdentity)) {
            return false;
        }
        final ClientIdentity clientIdentity = (ClientIdentity)o;
        return clientIdentity.a == this.a && khl.be((Object)clientIdentity.b, (Object)this.b);
    }
    
    public final int hashCode() {
        return this.a;
    }
    
    public final String toString() {
        final int a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(":");
        sb.append(b);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.ag(parcel, 2, this.b);
        khl.N(parcel, m);
    }
}
