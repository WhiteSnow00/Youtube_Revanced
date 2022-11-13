// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class LogOptions extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(5);
    }
    
    public LogOptions(final String a, final boolean b, final boolean c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 2, this.a);
        khl.O(parcel, 3, this.b);
        khl.O(parcel, 4, this.c);
        khl.O(parcel, 5, this.d);
        khl.O(parcel, 6, this.e);
        khl.N(parcel, m);
    }
}
