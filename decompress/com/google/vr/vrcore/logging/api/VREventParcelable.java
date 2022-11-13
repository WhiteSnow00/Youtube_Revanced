// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.logging.api;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class VREventParcelable implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    final afqj a;
    private final afqk b;
    
    static {
        CREATOR = (Parcelable$Creator)new ardl(13);
    }
    
    public VREventParcelable(final afqk b, final afqj a) {
        b.getClass();
        this.b = b;
        this.a = a;
    }
    
    public VREventParcelable(final Parcel parcel) {
        afqk b;
        if ((b = afqk.a(parcel.readInt())) == null) {
            b = afqk.a;
        }
        this.b = b;
        final afqj afqj = null;
        afqj a;
        try {
            final byte[] byteArray = parcel.createByteArray();
            a = afqj;
            if (byteArray != null) {
                a = (afqj)afqu.c(byteArray).toBuilder();
            }
        }
        catch (final IOException ex) {
            ex.toString();
            a = afqj;
        }
        this.a = a;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.b.eD);
        final afqj a = this.a;
        byte[] byteArray;
        if (a == null) {
            byteArray = null;
        }
        else {
            byteArray = ((agzk)((ahaz)a).build()).toByteArray();
        }
        parcel.writeByteArray(byteArray);
    }
}
