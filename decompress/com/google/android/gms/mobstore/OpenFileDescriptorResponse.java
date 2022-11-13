// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobstore;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OpenFileDescriptorResponse extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final ParcelFileDescriptor a;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(15);
    }
    
    public OpenFileDescriptorResponse(final ParcelFileDescriptor a) {
        this.a = a;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.af(parcel, 1, (Parcelable)this.a, n | 0x1);
        khl.N(parcel, m);
    }
}
