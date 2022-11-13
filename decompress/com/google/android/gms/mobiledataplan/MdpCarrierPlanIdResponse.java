// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class MdpCarrierPlanIdResponse extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final long b;
    public String c;
    public String d;
    public long e;
    public String f;
    public int g;
    public CarrierSupportInfo h;
    public Integer i;
    public Long j;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(19);
    }
    
    public MdpCarrierPlanIdResponse(final String a, final long b, final String c, final String d, final long e, final String f, final int g, final CarrierSupportInfo h, final Integer i, final Long j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        if (g != 0 && g != 1 && g != 2) {
            throw new IllegalArgumentException("Response source must be a value in CpidResponseSource");
        }
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MdpCarrierPlanIdResponse)) {
            return false;
        }
        final MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = (MdpCarrierPlanIdResponse)o;
        return khl.be((Object)this.a, (Object)mdpCarrierPlanIdResponse.a) && khl.be((Object)this.b, (Object)mdpCarrierPlanIdResponse.b) && khl.be((Object)this.c, (Object)mdpCarrierPlanIdResponse.c) && khl.be((Object)this.d, (Object)mdpCarrierPlanIdResponse.d) && khl.be((Object)this.e, (Object)mdpCarrierPlanIdResponse.e) && khl.be((Object)this.f, (Object)mdpCarrierPlanIdResponse.f) && khl.be((Object)this.g, (Object)mdpCarrierPlanIdResponse.g) && khl.be((Object)this.h, (Object)mdpCarrierPlanIdResponse.h) && khl.be((Object)this.i, (Object)mdpCarrierPlanIdResponse.i) && khl.be((Object)this.j, (Object)mdpCarrierPlanIdResponse.j);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("CarrierPlanId", (Object)this.a, (List)list);
        khl.bg("TTL-in-Seconds", (Object)this.b, (List)list);
        khl.bg("CarrierName", (Object)this.c, (List)list);
        khl.bg("CarrierLogoImageURL", (Object)this.d, (List)list);
        khl.bg("CarrierId", (Object)this.e, (List)list);
        khl.bg("CarrierCpid", (Object)this.f, (List)list);
        khl.bg("ResponseSource", (Object)this.g, (List)list);
        khl.bg("CarrierSupportInfo", (Object)this.h, (List)list);
        khl.bg("EventFlowId", (Object)this.i, (List)list);
        khl.bg("UniqueRequestId", (Object)this.j, (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        khl.T(parcel, 2, this.b);
        khl.ag(parcel, 3, this.c);
        khl.ag(parcel, 4, this.d);
        khl.T(parcel, 5, this.e);
        khl.ag(parcel, 6, this.f);
        khl.S(parcel, 7, this.g);
        khl.af(parcel, 8, (Parcelable)this.h, n);
        khl.ab(parcel, 9, this.i);
        khl.ae(parcel, 10, this.j);
        khl.N(parcel, m);
    }
}
