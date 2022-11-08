// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class InitializeBuyFlowRequest extends AbstractSafeParcelable implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    byte[][] b;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(16);
    }
    
    public InitializeBuyFlowRequest(final int a, final byte[][] b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.O(parcel, 1, this.a);
        kgk.T(parcel, 2, this.b);
        kgk.J(parcel, i);
    }
}
