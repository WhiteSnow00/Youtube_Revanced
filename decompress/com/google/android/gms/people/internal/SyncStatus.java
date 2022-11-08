// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SyncStatus extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    public final long c;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(2);
    }
    
    public SyncStatus(final int a, final String b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.O(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.P(parcel, 4, this.c);
        kgk.J(parcel, i);
    }
}
