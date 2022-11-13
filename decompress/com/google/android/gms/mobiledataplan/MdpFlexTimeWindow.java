// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class MdpFlexTimeWindow extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(1);
    }
    
    public MdpFlexTimeWindow(final String a, final String b, final String c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final MdpFlexTimeWindow mdpFlexTimeWindow = (MdpFlexTimeWindow)o;
                if (khl.be((Object)this.a, (Object)mdpFlexTimeWindow.a) && khl.be((Object)this.b, (Object)mdpFlexTimeWindow.b) && khl.be((Object)this.c, (Object)mdpFlexTimeWindow.c) && khl.be((Object)this.d, (Object)mdpFlexTimeWindow.d)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("RecurrenceType", (Object)this.a, (List)list);
        khl.bg("StartTime", (Object)this.b, (List)list);
        khl.bg("EndTime", (Object)this.c, (List)list);
        khl.bg("DiscountPercentage", (Object)this.d, (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        khl.ag(parcel, 2, this.b);
        khl.ag(parcel, 3, this.c);
        khl.S(parcel, 4, this.d);
        khl.N(parcel, m);
    }
}
