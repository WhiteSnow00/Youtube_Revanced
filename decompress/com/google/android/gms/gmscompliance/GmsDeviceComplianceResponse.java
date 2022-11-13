// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.gmscompliance;

import android.os.Parcelable;
import android.os.Parcel;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GmsDeviceComplianceResponse extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    public boolean b;
    public PendingIntent c;
    public boolean d;
    public long e;
    public byte[] f;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(11);
    }
    
    public GmsDeviceComplianceResponse() {
        this(1, true, null, false, 0L, null);
    }
    
    public GmsDeviceComplianceResponse(final int a, final boolean b, final PendingIntent c, final boolean d, final long e, final byte[] f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.O(parcel, 2, this.b);
        khl.af(parcel, 3, (Parcelable)this.c, n);
        khl.O(parcel, 4, this.d);
        khl.T(parcel, 5, this.e);
        khl.W(parcel, 6, this.f);
        khl.N(parcel, m);
    }
}
