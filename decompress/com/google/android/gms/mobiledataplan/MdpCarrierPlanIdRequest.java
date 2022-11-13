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

public class MdpCarrierPlanIdRequest extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public Bundle b;
    public Integer c;
    public Long d;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(18);
    }
    
    public MdpCarrierPlanIdRequest() {
    }
    
    public MdpCarrierPlanIdRequest(final String a, final Bundle b, final Integer c, final Long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MdpCarrierPlanIdRequest)) {
            return false;
        }
        final MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest = (MdpCarrierPlanIdRequest)o;
        return khl.be((Object)this.a, (Object)mdpCarrierPlanIdRequest.a) && ntc.z(this.b, mdpCarrierPlanIdRequest.b) && khl.be((Object)this.c, (Object)mdpCarrierPlanIdRequest.c) && khl.be((Object)this.d, (Object)mdpCarrierPlanIdRequest.d);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, ntc.y(this.b), this.c, this.d });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        final String a = this.a;
        khl.bg("apiKey", (Object)a.substring(Math.max(a.length() - 5, 0)), (List)list);
        khl.bg("ExtraInfo", (Object)this.b, (List)list);
        khl.bg("EventFlowId", (Object)this.c, (List)list);
        khl.bg("UniqueRequestId", (Object)this.d, (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        khl.V(parcel, 2, this.b);
        khl.ab(parcel, 3, this.c);
        khl.ae(parcel, 4, this.d);
        khl.N(parcel, m);
    }
}
