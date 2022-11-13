// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class MdpDataPlanStatusResponse extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final MdpDataPlanStatus[] b;
    public final Bundle c;
    public final String d;
    public final WalletBalanceInfo e;
    public final Integer f;
    public final Long g;
    public final Long h;
    public CellularInfo[] i;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(20);
    }
    
    public MdpDataPlanStatusResponse(final String a, final MdpDataPlanStatus[] b, final Bundle c, final String d, final WalletBalanceInfo e, final Integer f, final Long g, final Long h, final CellularInfo[] i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MdpDataPlanStatusResponse)) {
            return false;
        }
        final MdpDataPlanStatusResponse mdpDataPlanStatusResponse = (MdpDataPlanStatusResponse)o;
        return khl.be((Object)this.a, (Object)mdpDataPlanStatusResponse.a) && Arrays.equals(this.b, mdpDataPlanStatusResponse.b) && ntc.z(this.c, mdpDataPlanStatusResponse.c) && khl.be((Object)this.d, (Object)mdpDataPlanStatusResponse.d) && khl.be((Object)this.e, (Object)mdpDataPlanStatusResponse.e) && khl.be((Object)this.f, (Object)mdpDataPlanStatusResponse.f) && khl.be((Object)this.g, (Object)mdpDataPlanStatusResponse.g) && khl.be((Object)this.h, (Object)mdpDataPlanStatusResponse.h) && Arrays.equals(this.i, mdpDataPlanStatusResponse.i);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, ntc.y(this.c), this.d, this.e, this.f, this.g, this.h }) ^ Arrays.hashCode(this.b) ^ Arrays.hashCode(this.i);
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("CarrierPlanId", (Object)this.a, (List)list);
        khl.bg("DataPlans", (Object)Arrays.toString(this.b), (List)list);
        khl.bg("ExtraInfo", (Object)this.c, (List)list);
        khl.bg("Title", (Object)this.d, (List)list);
        khl.bg("WalletBalanceInfo", (Object)this.e, (List)list);
        khl.bg("EventFlowId", (Object)this.f, (List)list);
        khl.bg("UniqueRequestId", (Object)this.g, (List)list);
        final Long h = this.h;
        ahdy c;
        if (h != null) {
            c = ahfb.c(h);
        }
        else {
            c = null;
        }
        khl.bg("UpdateTime", (Object)c, (List)list);
        khl.bg("CellularInfo", (Object)Arrays.toString(this.i), (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        khl.aj(parcel, 2, (Parcelable[])this.b, n);
        khl.V(parcel, 3, this.c);
        khl.ag(parcel, 4, this.d);
        khl.af(parcel, 5, (Parcelable)this.e, n);
        khl.ab(parcel, 6, this.f);
        khl.ae(parcel, 7, this.g);
        khl.ae(parcel, 8, this.h);
        khl.aj(parcel, 9, (Parcelable[])this.i, n);
        khl.N(parcel, m);
    }
}
