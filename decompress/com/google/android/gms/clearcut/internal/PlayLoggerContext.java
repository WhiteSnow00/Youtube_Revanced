// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PlayLoggerContext extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final int h;
    public final Integer i;
    public final boolean j;
    public final int k;
    
    static {
        CREATOR = (Parcelable$Creator)new mji(20);
    }
    
    public PlayLoggerContext(final String a, final int b, final int c, final String d, final boolean e, final String f, final boolean g, final int h, final Integer i, final boolean j, final int k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof PlayLoggerContext) {
            final PlayLoggerContext playLoggerContext = (PlayLoggerContext)o;
            if (khl.be((Object)this.a, (Object)playLoggerContext.a) && this.b == playLoggerContext.b && this.c == playLoggerContext.c && khl.be((Object)this.f, (Object)playLoggerContext.f) && khl.be((Object)this.d, (Object)playLoggerContext.d) && this.e == playLoggerContext.e && this.g == playLoggerContext.g && this.h == playLoggerContext.h && khl.be((Object)this.i, (Object)playLoggerContext.i) && this.j == playLoggerContext.j && this.k == playLoggerContext.k) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.f, this.d, this.e, this.g, this.h, this.i, this.j, this.k });
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("PlayLoggerContext[package=");
        sb.append(this.a);
        sb.append(",packageVersionCode=");
        sb.append(this.b);
        sb.append(",logSource=");
        sb.append(this.c);
        sb.append(",logSourceName=");
        sb.append(this.f);
        sb.append(",uploadAccount=");
        sb.append(this.d);
        sb.append(",logAndroidId=");
        sb.append(this.e);
        sb.append(",isAnonymous=");
        sb.append(this.g);
        sb.append(",qosTier=");
        sb.append(this.h);
        sb.append(",appMobilespecId=");
        sb.append(this.i);
        sb.append(",scrubMccMnc=");
        sb.append(this.j);
        sb.append("piiLevelset=");
        sb.append(this.k);
        sb.append("]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int m) {
        m = khl.M(parcel);
        khl.ag(parcel, 2, this.a);
        khl.S(parcel, 3, this.b);
        khl.S(parcel, 4, this.c);
        khl.ag(parcel, 5, this.d);
        khl.O(parcel, 7, this.e);
        khl.ag(parcel, 8, this.f);
        khl.O(parcel, 9, this.g);
        khl.S(parcel, 10, this.h);
        khl.ab(parcel, 11, this.i);
        khl.O(parcel, 12, this.j);
        khl.S(parcel, 13, this.k);
        khl.N(parcel, m);
    }
}
