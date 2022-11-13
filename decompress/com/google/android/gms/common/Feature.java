// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common;

import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Feature extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    @Deprecated
    public final int b;
    private final long c;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(3);
    }
    
    public Feature(final String a, final int b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Feature(final String a, final long c) {
        this.a = a;
        this.c = c;
        this.b = -1;
    }
    
    public final long a() {
        long c;
        if ((c = this.c) == -1L) {
            c = this.b;
        }
        return c;
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof Feature) {
            final Feature feature = (Feature)o;
            final String a = this.a;
            if (((a != null && a.equals(feature.a)) || (this.a == null && feature.a == null)) && this.a() == feature.a()) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.a() });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("name", (Object)this.a, (List)list);
        khl.bg("version", (Object)this.a(), (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 1, this.a);
        khl.S(parcel, 2, this.b);
        khl.T(parcel, 3, this.a());
        khl.N(parcel, m);
    }
}
