// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SyncResult extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final byte[] a;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(11);
    }
    
    public SyncResult(final byte[] a) {
        this.a = a;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.W(parcel, 1, this.a);
        khl.N(parcel, m);
    }
}
