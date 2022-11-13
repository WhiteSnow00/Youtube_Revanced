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

public class CellularInfo extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final Integer a;
    public final Integer b;
    
    static {
        CREATOR = (Parcelable$Creator)new nbu(17);
    }
    
    public CellularInfo(final Integer a, final Integer b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CellularInfo)) {
            return false;
        }
        final CellularInfo cellularInfo = (CellularInfo)o;
        return khl.be((Object)this.a, (Object)cellularInfo.a) && khl.be((Object)this.b, (Object)cellularInfo.b);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("connectionType", (Object)this.a, (List)list);
        khl.bg("meteredness", (Object)this.b, (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ab(parcel, 1, this.a);
        khl.ab(parcel, 2, this.b);
        khl.N(parcel, m);
    }
}
