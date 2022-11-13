// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.vr.vrcore.base.api.ParcelableProtoLite;

public class ControllerRequest extends ParcelableProtoLite
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new ardl(10);
    }
    
    public ControllerRequest() {
    }
    
    public ControllerRequest(final Parcel parcel) {
        super(parcel);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof ControllerRequest && Arrays.equals(((ControllerRequest)o).a, super.a));
    }
}
