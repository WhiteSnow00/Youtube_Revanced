// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.phenotype;

import android.os.Parcel;
import java.util.Iterator;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FlagOverrides extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final List a;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(20);
    }
    
    public FlagOverrides(final List a) {
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof FlagOverrides && this.a.equals(((FlagOverrides)o).a));
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FlagOverrides(");
        final Iterator iterator = this.a.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final FlagOverride flagOverride = (FlagOverride)iterator.next();
            if (n == 0) {
                sb.append(", ");
            }
            flagOverride.a(sb);
            n = 0;
        }
        sb.append(")");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.ag(parcel, 2, this.a);
        kgk.J(parcel, i);
    }
}
