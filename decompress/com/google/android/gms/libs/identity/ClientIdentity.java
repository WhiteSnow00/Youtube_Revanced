// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.libs.identity;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import java.util.Collection;
import android.os.Process;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ClientIdentity extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final ClientIdentity g;
    public final List h;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(19);
        Process.myUid();
        Process.myPid();
    }
    
    public ClientIdentity(final int a, final int b, final String c, final String d, final String f, final int e, final List list, final ClientIdentity g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.e = e;
        this.h = (List)afeq.o((Collection)list);
        this.g = g;
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof ClientIdentity) {
            final ClientIdentity clientIdentity = (ClientIdentity)o;
            if (this.a == clientIdentity.a && this.b == clientIdentity.b && this.e == clientIdentity.e && this.c.equals(clientIdentity.c) && adkp.ae(this.d, clientIdentity.d) && adkp.ae(this.f, clientIdentity.f) && adkp.ae(this.g, clientIdentity.g) && this.h.equals(clientIdentity.h)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.c, this.d, this.f });
    }
    
    public final String toString() {
        final int n = this.c.length() + 18;
        final String d = this.d;
        int n2 = n;
        if (d != null) {
            n2 = n + d.length();
        }
        final StringBuilder sb = new StringBuilder(n2);
        sb.append(this.a);
        sb.append("/");
        sb.append(this.c);
        if (this.d != null) {
            sb.append("[");
            if (this.d.startsWith(this.c)) {
                sb.append(this.d, this.c.length(), this.d.length());
            }
            else {
                sb.append(this.d);
            }
            sb.append("]");
        }
        if (this.f != null) {
            sb.append("/");
            sb.append(Integer.toHexString(this.f.hashCode()));
        }
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.S(parcel, 2, this.b);
        khl.ag(parcel, 3, this.c);
        khl.ag(parcel, 4, this.d);
        khl.S(parcel, 5, this.e);
        khl.ag(parcel, 6, this.f);
        khl.af(parcel, 7, (Parcelable)this.g, n);
        khl.ak(parcel, 8, this.h);
        khl.N(parcel, m);
    }
}
