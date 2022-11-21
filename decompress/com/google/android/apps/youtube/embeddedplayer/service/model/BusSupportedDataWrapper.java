// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class BusSupportedDataWrapper implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final BusSupported$Data a;
    private final b b;
    
    static {
        CREATOR = (Parcelable$Creator)new idb(13);
    }
    
    public BusSupportedDataWrapper(final BusSupported$Data a) {
        this.b = a.d();
        this.a = a;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof BusSupportedDataWrapper)) {
            return false;
        }
        final BusSupportedDataWrapper busSupportedDataWrapper = (BusSupportedDataWrapper)o;
        return this.b == busSupportedDataWrapper.b && this.a.equals(busSupportedDataWrapper.a);
    }
    
    @Override
    public final int hashCode() {
        return (this.b.hashCode() + 527) * 31 + this.a.hashCode();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.b.toString());
        this.a.writeToParcel(parcel, n);
    }
}
