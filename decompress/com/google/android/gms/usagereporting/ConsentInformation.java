// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.usagereporting;

import android.os.Parcel;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ConsentInformation extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public boolean a;
    public boolean b;
    private List c;
    
    static {
        new ConsentInformation(null, false, false);
        CREATOR = (Parcelable$Creator)new nkt(7);
    }
    
    public ConsentInformation(final List list, final boolean a, final boolean b) {
        ArrayList c;
        if (list == null) {
            c = new ArrayList(0);
        }
        else {
            c = new ArrayList(list);
        }
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ConsentInformation)) {
            return false;
        }
        final ConsentInformation consentInformation = (ConsentInformation)o;
        return kgk.ba((Object)this.c, (Object)consentInformation.c) && kgk.ba((Object)this.a, (Object)consentInformation.a);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.c, this.a });
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.ag(parcel, 1, (List)new ArrayList(this.c));
        kgk.K(parcel, 2, this.a);
        kgk.K(parcel, 3, this.b);
        kgk.J(parcel, i);
    }
}
