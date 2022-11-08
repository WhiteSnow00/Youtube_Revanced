// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SourceStatsEntity extends AbstractSafeParcelable implements SourceStats
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final Integer b;
    public final Integer c;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(13);
    }
    
    public SourceStatsEntity(final String a, final Integer b, final Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Integer a() {
        return this.b;
    }
    
    public final Integer b() {
        return this.c;
    }
    
    public final String c() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof SourceStats)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final SourceStats sourceStats = (SourceStats)o;
        return kgk.ba((Object)this.c(), (Object)sourceStats.c()) && kgk.ba((Object)this.a(), (Object)sourceStats.a()) && kgk.ba((Object)this.b(), (Object)sourceStats.b());
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.c(), this.a(), this.b() });
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.X(parcel, 3, this.b);
        kgk.X(parcel, 4, this.c);
        kgk.J(parcel, i);
    }
}
