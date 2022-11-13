// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class CallStatus extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    
    static {
        CREATOR = (Parcelable$Creator)new acao(14);
    }
    
    public CallStatus(final int a) {
        this.a = a;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.N(parcel, m);
    }
}
