// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.messaging;

import android.os.Parcel;
import java.util.Map;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class RemoteMessage extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public Bundle a;
    public Map b;
    
    static {
        CREATOR = (Parcelable$Creator)new acao(19);
    }
    
    public RemoteMessage(final Bundle a) {
        this.a = a;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.V(parcel, 2, this.a);
        khl.N(parcel, m);
    }
}
