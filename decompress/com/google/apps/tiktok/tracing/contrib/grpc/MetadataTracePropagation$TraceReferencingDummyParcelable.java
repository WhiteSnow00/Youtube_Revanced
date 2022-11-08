// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.tracing.contrib.grpc;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class MetadataTracePropagation$TraceReferencingDummyParcelable implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new abyl(12);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
    }
}
