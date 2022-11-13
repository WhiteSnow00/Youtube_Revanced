// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ThemeSettings extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    int b;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(6);
    }
    
    public ThemeSettings() {
        this(3, 0);
    }
    
    public ThemeSettings(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 2, this.a);
        khl.S(parcel, 3, this.b);
        khl.N(parcel, m);
    }
}
