// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class SafeHtml extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(11);
    }
    
    private SafeHtml() {
    }
    
    public SafeHtml(final String a) {
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof SafeHtml && khl.be((Object)this.a, (Object)((SafeHtml)o).a));
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("Html", (Object)this.a, (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        khl.N(parcel, m);
    }
}
