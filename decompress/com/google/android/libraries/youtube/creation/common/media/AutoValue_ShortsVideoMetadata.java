// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.common.media;

import android.os.Parcelable;
import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable$Creator;

public final class AutoValue_ShortsVideoMetadata extends $AutoValue_ShortsVideoMetadata
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new qzp(15);
    }
    
    public AutoValue_ShortsVideoMetadata(final Uri uri, final int n, final int n2, final long n3) {
        super(uri, n, n2, n3);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)super.a, n);
        parcel.writeInt(super.b);
        parcel.writeInt(super.c);
        parcel.writeLong(super.d);
    }
}
