// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan.payment;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class PaymentForm extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(12);
    }
    
    private PaymentForm() {
    }
    
    public PaymentForm(final int a) {
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof PaymentForm && khl.be((Object)this.a, (Object)((PaymentForm)o).a));
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.N(parcel, m);
    }
}
