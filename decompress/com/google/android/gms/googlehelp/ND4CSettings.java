// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ND4CSettings extends AbstractSafeParcelable implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    boolean a;
    String b;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(14);
    }
    
    public ND4CSettings() {
        this(true, "");
    }
    
    public ND4CSettings(final boolean a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.O(parcel, 2, this.a);
        khl.ag(parcel, 3, this.b);
        khl.N(parcel, m);
    }
}
