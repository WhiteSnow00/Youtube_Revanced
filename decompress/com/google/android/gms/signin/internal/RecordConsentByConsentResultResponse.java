// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class RecordConsentByConsentResultResponse extends AbstractSafeParcelable implements mqb
{
    public static final Parcelable$Creator CREATOR;
    public final List a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(3);
    }
    
    public RecordConsentByConsentResultResponse(final List a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final Status a() {
        if (this.b != null) {
            return Status.a;
        }
        return Status.e;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.ae(parcel, 1, this.a);
        kgk.ac(parcel, 2, this.b);
        kgk.J(parcel, i);
    }
}
