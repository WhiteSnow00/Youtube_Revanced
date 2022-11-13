// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(7);
    }
    
    public Scope(final int a, final String b) {
        khl.ba(b, (Object)"scopeUri must not be null or empty");
        this.a = a;
        this.b = b;
    }
    
    public Scope(final String s) {
        this(1, s);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof Scope && this.b.equals(((Scope)o).b));
    }
    
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    public final String toString() {
        return this.b;
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.ag(parcel, 2, this.b);
        khl.N(parcel, m);
    }
}
