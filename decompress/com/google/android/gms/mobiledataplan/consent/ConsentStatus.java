// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ConsentStatus extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(9);
    }
    
    private ConsentStatus() {
    }
    
    public ConsentStatus(final int a) {
        switch (a) {
            default: {
                throw new IllegalArgumentException(String.format(Locale.US, "Illegal EnumVal value %d", a));
            }
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
                this.a = a;
            }
        }
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ConsentStatus && khl.be((Object)this.a, (Object)((ConsentStatus)o).a));
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("EnumVal", (Object)this.a, (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.N(parcel, m);
    }
}
