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
    final afoi a;
    private final afoj b;
    
    static {
        CREATOR = (Parcelable$Creator)new arao(14);
    }
    
    public VREventParcelable(final afoj b, final afoi a) {
        b.getClass();
        this.b = b;
        this.a = a;
    }
    
    public VREventParcelable(final Parcel parcel) {
        afoj b;
        if ((b = afoj.a(parcel.readInt())) == null) {
            b = afoj.a;
        }
        this.b = b;
        final afoi afoi = null;
        afoi a;
        try {
            final byte[] byteArray = parcel.createByteArray();
            a = afoi;
            if (byteArray != null) {
                a = (afoi)afot.c(byteArray).toBuilder();
            }
        }
        catch (final IOException ex) {
            ex.toString();
            a = afoi;
        }
        this.a = a;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.b.eD);
        final afoi a = this.a;
        byte[] byteArray;
        if (a == null) {
            byteArray = null;
        }
        else {
            byteArray = ((agza)a).build().toByteArray();
        }
        parcel.writeByteArray(byteArray);
    }
}
