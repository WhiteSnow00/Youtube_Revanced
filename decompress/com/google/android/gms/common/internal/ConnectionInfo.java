// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.internal;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ConnectionInfo extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public Bundle a;
    public Feature[] b;
    int c;
    public ConnectionTelemetryConfiguration d;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(14);
    }
    
    public ConnectionInfo() {
    }
    
    public ConnectionInfo(final Bundle a, final Feature[] b, final int c, final ConnectionTelemetryConfiguration d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.V(parcel, 1, this.a);
        khl.aj(parcel, 2, (Parcelable[])this.b, n);
        khl.S(parcel, 3, this.c);
        khl.af(parcel, 4, (Parcelable)this.d, n);
        khl.N(parcel, m);
    }
}
