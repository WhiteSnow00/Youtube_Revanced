// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class BinderWrapper implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private IBinder a;
    
    static {
        CREATOR = (Parcelable$Creator)new mob(13);
    }
    
    public BinderWrapper(final IBinder a) {
        this.a = a;
    }
    
    public BinderWrapper(final Parcel parcel) {
        this.a = parcel.readStrongBinder();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeStrongBinder(this.a);
    }
}
