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

public class ConsentInformation$AccountConsentInformation extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final byte[] b;
    public List c;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(6);
    }
    
    public ConsentInformation$AccountConsentInformation(final String a, final byte[] b, final List list) {
        this.a = a;
        this.b = b;
        ArrayList c;
        if (list == null) {
            c = new ArrayList(0);
        }
        else {
            c = new ArrayList(list);
        }
        this.c = c;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ConsentInformation$AccountConsentInformation)) {
            return false;
        }
        final ConsentInformation$AccountConsentInformation consentInformation$AccountConsentInformation = (ConsentInformation$AccountConsentInformation)o;
        return kgk.ba((Object)this.a, (Object)consentInformation$AccountConsentInformation.a) && kgk.ba((Object)this.b, (Object)consentInformation$AccountConsentInformation.b) && kgk.ba((Object)this.c, (Object)consentInformation$AccountConsentInformation.c);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c });
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.ac(parcel, 1, this.a);
        kgk.S(parcel, 2, this.b);
        kgk.W(parcel, 3, (List)new ArrayList(this.c));
        kgk.J(parcel, i);
    }
}
