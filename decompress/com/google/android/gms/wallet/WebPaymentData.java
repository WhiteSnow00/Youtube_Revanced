// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class WebPaymentData extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    String a;
    Bundle b;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(12);
    }
    
    private WebPaymentData() {
    }
    
    public WebPaymentData(final String a, final Bundle b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.R(parcel, 3, this.b);
        kgk.J(parcel, i);
    }
}
