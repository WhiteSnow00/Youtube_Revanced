// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class TogglingData extends AbstractSafeParcelable implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    String b;
    public String c;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(17);
    }
    
    private TogglingData() {
    }
    
    public TogglingData(final String a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 2, this.a);
        khl.ag(parcel, 3, this.b);
        khl.ag(parcel, 4, this.c);
        khl.N(parcel, m);
    }
}
