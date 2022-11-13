// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class MdpUpsellPlan extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final String i;
    public final String j;
    public final int k;
    public final List l;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(4);
    }
    
    public MdpUpsellPlan(final String a, final String b, final String c, final long d, final String e, final String f, final long g, final long h, final String i, final String j, final int k, final List l) {
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
        this.k = k;
        this.l = l;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MdpUpsellPlan)) {
            return false;
        }
        final MdpUpsellPlan mdpUpsellPlan = (MdpUpsellPlan)o;
        return khl.be((Object)this.a, (Object)mdpUpsellPlan.a) && khl.be((Object)this.b, (Object)mdpUpsellPlan.b) && khl.be((Object)this.c, (Object)mdpUpsellPlan.c) && khl.be((Object)this.d, (Object)mdpUpsellPlan.d) && khl.be((Object)this.e, (Object)mdpUpsellPlan.e) && khl.be((Object)this.f, (Object)mdpUpsellPlan.f) && khl.be((Object)this.g, (Object)mdpUpsellPlan.g) && khl.be((Object)this.h, (Object)mdpUpsellPlan.h) && khl.be((Object)this.i, (Object)mdpUpsellPlan.i) && khl.be((Object)this.j, (Object)mdpUpsellPlan.j) && khl.be((Object)this.k, (Object)mdpUpsellPlan.k) && khl.be((Object)this.l, (Object)mdpUpsellPlan.l);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("PlanId", (Object)this.a, (List)list);
        khl.bg("PlanName", (Object)this.b, (List)list);
        khl.bg("PlanType", (Object)this.c, (List)list);
        khl.bg("Cost", (Object)this.d, (List)list);
        khl.bg("CostCurrency", (Object)this.e, (List)list);
        khl.bg("ConnectionType", (Object)this.f, (List)list);
        khl.bg("DurationInSeconds", (Object)this.g, (List)list);
        khl.bg("mQuotaBytes", (Object)this.h, (List)list);
        khl.bg("mOfferContext", (Object)this.i, (List)list);
        khl.bg("planDescription", (Object)this.j, (List)list);
        khl.bg("offerType", (Object)this.k, (List)list);
        khl.bg("filterTags", (Object)this.l, (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        khl.ag(parcel, 2, this.b);
        khl.ag(parcel, 3, this.c);
        khl.T(parcel, 4, this.d);
        khl.ag(parcel, 5, this.e);
        khl.ag(parcel, 6, this.f);
        khl.T(parcel, 7, this.g);
        khl.T(parcel, 8, this.h);
        khl.ag(parcel, 9, this.i);
        khl.ag(parcel, 10, this.j);
        khl.S(parcel, 11, this.k);
        khl.ai(parcel, 12, this.l);
        khl.N(parcel, m);
    }
}
