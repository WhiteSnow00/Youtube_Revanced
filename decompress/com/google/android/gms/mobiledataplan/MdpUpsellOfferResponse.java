// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class MdpUpsellOfferResponse extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final MdpUpsellPlan[] e;
    public final Bundle f;
    public final Integer g;
    public final Long h;
    public final PaymentForm[] i;
    public final List j;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(3);
    }
    
    public MdpUpsellOfferResponse(final String a, final String b, final String c, final String d, final MdpUpsellPlan[] e, final Bundle f, final Integer g, final Long h, final PaymentForm[] i, final List j) {
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
        if (!(o instanceof MdpUpsellOfferResponse)) {
            return false;
        }
        final MdpUpsellOfferResponse mdpUpsellOfferResponse = (MdpUpsellOfferResponse)o;
        return khl.be((Object)this.a, (Object)mdpUpsellOfferResponse.a) && khl.be((Object)this.b, (Object)mdpUpsellOfferResponse.b) && khl.be((Object)this.c, (Object)mdpUpsellOfferResponse.c) && khl.be((Object)this.d, (Object)mdpUpsellOfferResponse.d) && Arrays.equals(this.e, mdpUpsellOfferResponse.e) && ntc.z(this.f, mdpUpsellOfferResponse.f) && khl.be((Object)this.g, (Object)mdpUpsellOfferResponse.g) && khl.be((Object)this.h, (Object)mdpUpsellOfferResponse.h) && Arrays.equals(this.i, mdpUpsellOfferResponse.i) && khl.be((Object)this.j, (Object)mdpUpsellOfferResponse.j);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, ntc.y(this.f), this.g, this.h, Arrays.hashCode(this.e), Arrays.hashCode(this.i), this.j });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("CarrierName", (Object)this.a, (List)list);
        khl.bg("CarrierLogoUrl", (Object)this.b, (List)list);
        khl.bg("PromoMessage", (Object)this.c, (List)list);
        khl.bg("Info", (Object)this.d, (List)list);
        khl.bg("UpsellPlans", (Object)Arrays.toString(this.e), (List)list);
        khl.bg("ExtraInfo", (Object)this.f, (List)list);
        khl.bg("EventFlowId", (Object)this.g, (List)list);
        khl.bg("UniqueRequestId", (Object)this.h, (List)list);
        khl.bg("PaymentForms", (Object)Arrays.toString(this.i), (List)list);
        khl.bg("Filters", (Object)this.j.toString(), (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        khl.ag(parcel, 2, this.b);
        khl.ag(parcel, 3, this.c);
        khl.ag(parcel, 4, this.d);
        khl.aj(parcel, 5, (Parcelable[])this.e, n);
        khl.V(parcel, 6, this.f);
        khl.ab(parcel, 7, this.g);
        khl.ae(parcel, 8, this.h);
        khl.aj(parcel, 9, (Parcelable[])this.i, n);
        khl.ak(parcel, 10, this.j);
        khl.N(parcel, m);
    }
}
