// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.droidguard.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class DroidGuardInitReply implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final ParcelFileDescriptor a;
    public final Parcelable b;
    
    static {
        CREATOR = (Parcelable$Creator)new mtw(3);
    }
    
    public DroidGuardInitReply(final ParcelFileDescriptor a, final Parcelable b) {
        this.a = a;
        this.b = b;
    }
    
    public final int describeContents() {
        final ParcelFileDescriptor a = this.a;
        int describeContents = false ? 1 : 0;
        final boolean b = a != null;
        final Parcelable b2 = this.b;
        if (b2 != null) {
            describeContents = b2.describeContents();
        }
        return (b ? 1 : 0) | describeContents;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.a, n);
        parcel.writeParcelable(this.b, n);
    }
}
