// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.cloudmessaging;

import android.os.Parcelable;
import android.os.Parcel;
import android.content.Intent;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CloudMessage extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public Intent a;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(1);
    }
    
    public CloudMessage(final Intent a) {
        this.a = a;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.af(parcel, 1, (Parcelable)this.a, n);
        khl.N(parcel, m);
    }
}
