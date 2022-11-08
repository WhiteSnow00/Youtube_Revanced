// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GenericDimension extends AbstractSafeParcelable implements Comparable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    
    static {
        CREATOR = (Parcelable$Creator)new nkt(1);
    }
    
    public GenericDimension(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a(final GenericDimension genericDimension) {
        final int a = this.a;
        final int a2 = genericDimension.a;
        if (a < a2) {
            return -1;
        }
        if (a > a2) {
            return 1;
        }
        final int b = this.b;
        final int b2 = genericDimension.b;
        if (b < b2) {
            return -1;
        }
        if (b > b2) {
            return 1;
        }
        return 0;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof GenericDimension && this.a((GenericDimension)o) == 0;
    }
    
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("GenericDimension(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.O(parcel, 1, this.a);
        kgk.O(parcel, 2, this.b);
        kgk.J(parcel, i);
    }
}
