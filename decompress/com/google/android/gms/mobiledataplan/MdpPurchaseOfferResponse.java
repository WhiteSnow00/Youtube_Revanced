// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class MdpPurchaseOfferResponse extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public Bundle h;
    public final Integer i;
    public final Long j;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(0);
    }
    
    public MdpPurchaseOfferResponse(final String a, final String b, final String c, final String d, final long e, final String f, final String g, final Bundle h, final Integer i, final Long j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MdpPurchaseOfferResponse)) {
            return false;
        }
        final MdpPurchaseOfferResponse mdpPurchaseOfferResponse = (MdpPurchaseOfferResponse)o;
        return khl.be((Object)this.a, (Object)mdpPurchaseOfferResponse.a) && khl.be((Object)this.b, (Object)mdpPurchaseOfferResponse.b) && khl.be((Object)this.c, (Object)mdpPurchaseOfferResponse.c) && khl.be((Object)this.d, (Object)mdpPurchaseOfferResponse.d) && khl.be((Object)this.e, (Object)mdpPurchaseOfferResponse.e) && khl.be((Object)this.f, (Object)mdpPurchaseOfferResponse.f) && khl.be((Object)this.g, (Object)mdpPurchaseOfferResponse.g) && ntc.z(this.h, mdpPurchaseOfferResponse.h) && khl.be((Object)this.i, (Object)mdpPurchaseOfferResponse.i) && khl.be((Object)this.j, (Object)mdpPurchaseOfferResponse.j);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("CarrierName", (Object)this.a, (List)list);
        khl.bg("TransactionId", (Object)this.b, (List)list);
        khl.bg("ConfirmationCode", (Object)this.c, (List)list);
        khl.bg("TransactionMsg", (Object)this.d, (List)list);
        khl.bg("RemainingBalance", (Object)this.e, (List)list);
        khl.bg("CostCurrency", (Object)this.f, (List)list);
        khl.bg("PlanActivationTime", (Object)this.g, (List)list);
        khl.bg("ExtraInfo", (Object)this.h, (List)list);
        khl.bg("EventFlowId", (Object)this.i, (List)list);
        khl.bg("UniqueRequestId", (Object)this.j, (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        khl.ag(parcel, 2, this.b);
        khl.ag(parcel, 3, this.c);
        khl.ag(parcel, 4, this.d);
        khl.T(parcel, 5, this.e);
        khl.ag(parcel, 6, this.f);
        khl.ag(parcel, 7, this.g);
        khl.V(parcel, 8, this.h);
        khl.ab(parcel, 9, this.i);
        khl.ae(parcel, 10, this.j);
        khl.N(parcel, m);
    }
}
