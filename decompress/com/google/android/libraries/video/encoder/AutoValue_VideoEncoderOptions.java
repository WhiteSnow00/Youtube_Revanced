// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.video.encoder;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class AutoValue_VideoEncoderOptions extends $AutoValue_VideoEncoderOptions
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new qzp(1);
    }
    
    public AutoValue_VideoEncoderOptions(final int n, final int n2, final int n3, final Float n4, final int n5) {
        super(n, n2, n3, n4, n5);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(super.a);
        parcel.writeInt(super.b);
        parcel.writeString(qhd.i(super.e));
        if (super.c == null) {
            parcel.writeInt(1);
        }
        else {
            parcel.writeInt(0);
            parcel.writeFloat((float)super.c);
        }
        parcel.writeInt(super.d);
    }
}
