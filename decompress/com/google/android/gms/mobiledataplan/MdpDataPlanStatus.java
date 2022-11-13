// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class MdpDataPlanStatus extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    private static final Map t;
    private static final Map u;
    public String a;
    public String b;
    public String c;
    public long d;
    public long e;
    public MdpFlexTimeWindow[] f;
    public int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l;
    public List m;
    public long n;
    public long o;
    public long p;
    public String q;
    public String r;
    public boolean s;
    
    static {
        final HashMap t2 = new HashMap();
        (t = t2).put(0, "UNSPECIFIED");
        t2.put(1, "THROTTLED");
        t2.put(2, "BLOCKED");
        t2.put(3, "PAY_AS_YOU_GO");
        u = new HashMap();
        for (final Map.Entry<K, String> entry : t2.entrySet()) {
            MdpDataPlanStatus.u.put(entry.getValue(), entry.getKey());
        }
        CREATOR = (Parcelable$Creator)new njx();
    }
    
    private MdpDataPlanStatus() {
        this.s = true;
    }
    
    public MdpDataPlanStatus(final String a, final String b, final String c, final long d, final long e, final MdpFlexTimeWindow[] f, final int g, final String h, final String i, final String j, final String k, final int l, final List m, final long n, final long o, final long p19, final String q, final String r, final boolean s) {
        this.s = true;
        this.a = a;
        this.h = h;
        this.i = i;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        if (MdpDataPlanStatus.t.keySet().contains(g)) {
            this.g = g;
            this.n = n;
            this.o = o;
            this.p = p19;
            this.q = q;
            this.r = r;
            this.j = j;
            this.s = s;
            this.k = k;
            this.l = l;
            this.m = m;
            return;
        }
        final StringBuilder sb = new StringBuilder("Illegal overusage policy: ");
        sb.append(g);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final MdpDataPlanStatus mdpDataPlanStatus = (MdpDataPlanStatus)o;
                if (khl.be((Object)this.a, (Object)mdpDataPlanStatus.a) && khl.be((Object)this.b, (Object)mdpDataPlanStatus.b) && khl.be((Object)this.c, (Object)mdpDataPlanStatus.c) && khl.be((Object)this.d, (Object)mdpDataPlanStatus.d) && khl.be((Object)this.e, (Object)mdpDataPlanStatus.e) && Arrays.equals(this.f, mdpDataPlanStatus.f) && khl.be((Object)this.g, (Object)mdpDataPlanStatus.g) && khl.be((Object)this.n, (Object)mdpDataPlanStatus.n) && khl.be((Object)this.o, (Object)mdpDataPlanStatus.o) && khl.be((Object)this.p, (Object)mdpDataPlanStatus.p) && khl.be((Object)this.q, (Object)mdpDataPlanStatus.q) && khl.be((Object)this.h, (Object)mdpDataPlanStatus.h) && khl.be((Object)this.r, (Object)mdpDataPlanStatus.r) && khl.be((Object)this.i, (Object)mdpDataPlanStatus.i) && khl.be((Object)this.s, (Object)mdpDataPlanStatus.s) && khl.be((Object)this.j, (Object)mdpDataPlanStatus.j) && khl.be((Object)this.k, (Object)mdpDataPlanStatus.k) && khl.be((Object)this.l, (Object)mdpDataPlanStatus.l) && khl.be((Object)this.m, (Object)mdpDataPlanStatus.m)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { Arrays.hashCode(new Object[] { Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.h, this.i, this.j, this.k, this.l, this.m }), Arrays.hashCode(this.f) }), this.g, this.n, this.o, this.p, this.q, this.r, this.s });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("PlanName", (Object)this.a, (List)list);
        khl.bg("ExpirationTime", (Object)this.b, (List)list);
        khl.bg("TrafficCategory", (Object)this.c, (List)list);
        khl.bg("QuotaBytes", (Object)this.d, (List)list);
        khl.bg("QuotaMinutes", (Object)this.e, (List)list);
        khl.bg("FlexTimeWindows", (Object)Arrays.toString(this.f), (List)list);
        final int g = this.g;
        final String s = MdpDataPlanStatus.t.get(g);
        if (s != null) {
            khl.bg("OverUsagePolicy", (Object)s, (List)list);
            khl.bg("RemainingBytes", (Object)this.o, (List)list);
            khl.bg("RemainingMinutes", (Object)this.p, (List)list);
            khl.bg("ShortDescription", (Object)this.j, (List)list);
            khl.bg("DisplayRefreshPeriod", (Object)this.k, (List)list);
            khl.bg("PlanType", (Object)this.l, (List)list);
            khl.bg("Pmtcs", (Object)this.m, (List)list);
            khl.bg("SnapshotTime", (Object)this.n, (List)list);
            khl.bg("Description", (Object)this.q, (List)list);
            khl.bg("PlanId", (Object)this.h, (List)list);
            khl.bg("Balance", (Object)this.r, (List)list);
            khl.bg("ModuleName", (Object)this.i, (List)list);
            khl.bg("IsActive", (Object)this.s, (List)list);
            return khl.bf((List)list, (Object)this);
        }
        final StringBuilder sb = new StringBuilder("Illegal overusage policy string: ");
        sb.append(g);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        khl.ag(parcel, 2, this.b);
        khl.ag(parcel, 3, this.c);
        khl.T(parcel, 4, this.d);
        khl.T(parcel, 5, this.e);
        khl.aj(parcel, 6, (Parcelable[])this.f, n);
        khl.S(parcel, 7, this.g);
        khl.ag(parcel, 8, this.h);
        khl.ag(parcel, 9, this.i);
        khl.ag(parcel, 10, this.j);
        khl.ag(parcel, 11, this.k);
        khl.S(parcel, 12, this.l);
        khl.aa(parcel, 13, this.m);
        khl.T(parcel, 20, this.n);
        khl.T(parcel, 21, this.o);
        khl.T(parcel, 22, this.p);
        khl.ag(parcel, 23, this.q);
        khl.ag(parcel, 24, this.r);
        khl.O(parcel, 25, this.s);
        khl.N(parcel, m);
    }
}
