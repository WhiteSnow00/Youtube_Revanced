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
        CREATOR = (Parcelable$Creator)new nlj(12);
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
        return khl.be((Object)((SourceStats)this).c(), (Object)sourceStats.c()) && khl.be((Object)((SourceStats)this).a(), (Object)sourceStats.a()) && khl.be((Object)((SourceStats)this).b(), (Object)sourceStats.b());
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { ((SourceStats)this).c(), ((SourceStats)this).a(), ((SourceStats)this).b() });
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 2, this.a);
        khl.ab(parcel, 3, this.b);
        khl.ab(parcel, 4, this.c);
        khl.N(parcel, m);
    }
}
