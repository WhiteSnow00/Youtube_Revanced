// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.wallet;

import android.os.Parcelable;
import android.os.Parcel;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PaymentCardRecognitionIntentResponse extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    PendingIntent a;
    
    static {
        CREATOR = (Parcelable$Creator)new nmx(8);
    }
    
    PaymentCardRecognitionIntentResponse() {
    }
    
    public PaymentCardRecognitionIntentResponse(final PendingIntent a) {
        this.a = a;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ab(parcel, 1, (Parcelable)this.a, n);
        kgk.J(parcel, i);
    }
}
