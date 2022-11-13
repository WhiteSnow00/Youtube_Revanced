// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GetConsentInformationResponse extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public ConsentStatus a;
    public ConsentAgreementText b;
    public Long c;
    public Integer d;
    public Long e;
    public Integer f;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(10);
    }
    
    private GetConsentInformationResponse() {
    }
    
    public GetConsentInformationResponse(final ConsentStatus a, final ConsentAgreementText b, final Long c, final Integer d, final Long e, final Integer f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof GetConsentInformationResponse) {
            final GetConsentInformationResponse getConsentInformationResponse = (GetConsentInformationResponse)o;
            if (khl.be((Object)this.a, (Object)getConsentInformationResponse.a) && khl.be((Object)this.b, (Object)getConsentInformationResponse.b) && khl.be((Object)this.c, (Object)getConsentInformationResponse.c) && khl.be((Object)this.d, (Object)getConsentInformationResponse.d) && khl.be((Object)this.e, (Object)getConsentInformationResponse.e) && khl.be((Object)this.f, (Object)getConsentInformationResponse.f)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("ConsentStatus", (Object)this.a, (List)list);
        khl.bg("ConsentAgreementText", (Object)this.b, (List)list);
        khl.bg("ConsentChangeTime", (Object)this.c, (List)list);
        khl.bg("EventFlowId", (Object)this.d, (List)list);
        khl.bg("UniqueRequestId", (Object)this.e, (List)list);
        khl.bg("ConsentResponseSource", (Object)this.f, (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.af(parcel, 1, (Parcelable)this.a, n);
        khl.af(parcel, 2, (Parcelable)this.b, n);
        khl.ae(parcel, 3, this.c);
        khl.ab(parcel, 4, this.d);
        khl.ae(parcel, 5, this.e);
        khl.ab(parcel, 6, this.f);
        khl.N(parcel, m);
    }
}
