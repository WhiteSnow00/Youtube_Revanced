// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mdisync;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SyncOptions extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(9);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        khl.N(parcel, khl.M(parcel));
    }
}
