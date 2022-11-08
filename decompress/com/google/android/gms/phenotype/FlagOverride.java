// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.phenotype;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FlagOverride extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final Flag c;
    public final boolean d;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(19);
    }
    
    public FlagOverride(final String a, final String b, final Flag c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final String a(final StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.a(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FlagOverride)) {
            return false;
        }
        final FlagOverride flagOverride = (FlagOverride)o;
        return nmr.q((Object)this.a, (Object)flagOverride.a) && nmr.q((Object)this.b, (Object)flagOverride.b) && nmr.q((Object)this.c, (Object)flagOverride.c) && this.d == flagOverride.d;
    }
    
    public final String toString() {
        return this.a(new StringBuilder());
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ac(parcel, 3, this.b);
        kgk.ab(parcel, 4, (Parcelable)this.c, n);
        kgk.K(parcel, 5, this.d);
        kgk.J(parcel, i);
    }
}
