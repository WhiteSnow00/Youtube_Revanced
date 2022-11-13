// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.common.api;

import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.vr.vrcore.base.api.ParcelableProtoLite;

public class HeadTrackingState extends ParcelableProtoLite
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new ardl(1);
    }
    
    public HeadTrackingState() {
    }
    
    public HeadTrackingState(final Parcel parcel) {
        super(parcel);
    }
    
    public HeadTrackingState(final byte[] array) {
        super(array);
    }
    
    @Override
    protected final boolean d() {
        return true;
    }
    
    @Override
    protected final boolean e() {
        return true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof HeadTrackingState && Arrays.equals(((HeadTrackingState)o).a, super.a));
    }
    
    @Override
    public final String toString() {
        final int a = this.a();
        final StringBuilder sb = new StringBuilder("HeadTrackingState[");
        sb.append(a);
        sb.append(" bytes]");
        return sb.toString();
    }
}
