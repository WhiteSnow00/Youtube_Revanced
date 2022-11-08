// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.video.encoder;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class AutoValue_AudioEncoderOptions extends $AutoValue_AudioEncoderOptions
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new nnr(20);
    }
    
    public AutoValue_AudioEncoderOptions(final Integer n, final Integer n2, final int n3) {
        super(n, n2, n3);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        if (super.a == null) {
            parcel.writeInt(1);
        }
        else {
            parcel.writeInt(0);
            parcel.writeInt((int)super.a);
        }
        if (super.b == null) {
            parcel.writeInt(1);
        }
        else {
            parcel.writeInt(0);
            parcel.writeInt((int)super.b);
        }
        parcel.writeInt(super.c);
    }
}
