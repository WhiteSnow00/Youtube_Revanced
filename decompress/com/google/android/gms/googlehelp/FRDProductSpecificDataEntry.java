// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.googlehelp;

import android.os.Parcel;
import java.util.Arrays;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FRDProductSpecificDataEntry extends AbstractSafeParcelable implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    int a;
    int b;
    List c;
    List d;
    List e;
    List f;
    byte[][] g;
    Boolean h;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(12);
    }
    
    public FRDProductSpecificDataEntry(final int a, final int b, final List c, final List d, final List e, final List f, final byte[][] g, final boolean b2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = b2;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FRDProductSpecificDataEntry)) {
            return false;
        }
        final FRDProductSpecificDataEntry frdProductSpecificDataEntry = (FRDProductSpecificDataEntry)o;
        return this.a == frdProductSpecificDataEntry.a && this.b == frdProductSpecificDataEntry.b && adkp.ae(this.c, frdProductSpecificDataEntry.c) && adkp.ae(this.d, frdProductSpecificDataEntry.d) && adkp.ae(this.e, frdProductSpecificDataEntry.e) && adkp.ae(this.f, frdProductSpecificDataEntry.f) && Arrays.equals(this.g, frdProductSpecificDataEntry.g) && adkp.ae(this.h, frdProductSpecificDataEntry.h);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, Arrays.deepHashCode(this.g), this.h });
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 2, this.a);
        khl.S(parcel, 3, this.b);
        khl.ai(parcel, 4, this.c);
        khl.ad(parcel, 5, this.d);
        khl.ai(parcel, 6, this.e);
        khl.ad(parcel, 7, this.f);
        khl.X(parcel, 8, this.g);
        khl.U(parcel, 9, this.h);
        khl.N(parcel, m);
    }
}
