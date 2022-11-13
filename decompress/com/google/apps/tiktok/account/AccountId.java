// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.account;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class AccountId implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new acao(8);
    }
    
    public static AccountId b(final int n) {
        adkp.R(n >= -1, "Invalid AccountId");
        return (AccountId)new AutoValue_AccountId(n);
    }
    
    @Deprecated
    public abstract int a();
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a());
    }
}
