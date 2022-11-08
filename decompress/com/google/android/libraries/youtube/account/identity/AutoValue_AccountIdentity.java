// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.account.identity;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class AutoValue_AccountIdentity extends $AutoValue_AccountIdentity
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new qzp(2);
    }
    
    public AutoValue_AccountIdentity(final String s, final String s2, final String s3, final boolean b, final boolean b2, final boolean b3, final String s4, final boolean b4, final boolean b5, final boolean b6, final int n, final String s5) {
        super(s, s2, s3, b, b2, b3, s4, b4, b5, b6, n, s5);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, int l) {
        parcel.writeString(super.a);
        parcel.writeString(super.b);
        parcel.writeString(super.c);
        parcel.writeInt((int)(super.d ? 1 : 0));
        parcel.writeInt((int)(super.e ? 1 : 0));
        parcel.writeInt((int)(super.f ? 1 : 0));
        parcel.writeString(super.g);
        parcel.writeInt((int)(super.h ? 1 : 0));
        parcel.writeInt((int)(super.i ? 1 : 0));
        parcel.writeInt((int)(super.j ? 1 : 0));
        l = super.l;
        String s;
        if (l != 1) {
            if (l != 2) {
                if (l != 3) {
                    s = "GAIA_DELEGATION_TYPE_LATE";
                }
                else {
                    s = "GAIA_DELEGATION_TYPE_EARLY";
                }
            }
            else {
                s = "GAIA_DELEGATION_TYPE_NONE";
            }
        }
        else {
            s = "GAIA_DELEGATION_TYPE_UNKNOWN";
        }
        parcel.writeString(s);
        parcel.writeString(super.k);
    }
}
