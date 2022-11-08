// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet.shared;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class BuyFlowConfig extends AbstractSafeParcelable implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public ApplicationParameters b;
    public String c;
    public String d;
    String e;
    
    static {
        CREATOR = (Parcelable$Creator)new nnr(0);
    }
    
    public BuyFlowConfig() {
    }
    
    public BuyFlowConfig(final String a, final ApplicationParameters b, final String c, final String d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ab(parcel, 3, (Parcelable)this.b, n);
        kgk.ac(parcel, 4, this.c);
        kgk.ac(parcel, 5, this.d);
        kgk.ac(parcel, 6, this.e);
        kgk.J(parcel, i);
    }
}
