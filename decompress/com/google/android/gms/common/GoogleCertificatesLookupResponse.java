// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GoogleCertificatesLookupResponse extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(5);
    }
    
    public GoogleCertificatesLookupResponse(final boolean a, final String b, final int n, final int n2) {
        this.a = a;
        this.b = b;
        this.c = jzg.O(n) - 1;
        this.d = jzg.P(n2) - 1;
    }
    
    public final int a() {
        return jzg.O(this.c);
    }
    
    public final void b() {
        jzg.P(this.d);
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.O(parcel, 1, this.a);
        khl.ag(parcel, 2, this.b);
        khl.S(parcel, 3, this.c);
        khl.S(parcel, 4, this.d);
        khl.N(parcel, m);
    }
}
