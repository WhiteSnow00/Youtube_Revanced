// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.phenotype;

import android.os.Parcel;
import java.util.Arrays;
import android.util.Base64;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Flag extends AbstractSafeParcelable implements Comparable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(18);
    }
    
    public Flag(final String a, final long b, final boolean c, final double d, final String e, final byte[] f, final int g, final int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    private static int b(int n, final int n2) {
        if (n < n2) {
            n = -1;
        }
        else {
            if (n == n2) {
                return 0;
            }
            n = 1;
        }
        return n;
    }
    
    public final String a(StringBuilder sb) {
        sb.append("Flag(");
        sb.append(this.a);
        sb.append(", ");
        final int g = this.g;
        if (g != 1) {
            if (g != 2) {
                if (g != 3) {
                    if (g != 4) {
                        if (g != 5) {
                            final String a = this.a;
                            sb = new StringBuilder("Invalid type: ");
                            sb.append(a);
                            sb.append(", ");
                            sb.append(g);
                            throw new AssertionError((Object)sb.toString());
                        }
                        sb.append("'");
                        sb.append(Base64.encodeToString((byte[])kgk.aL((Object)this.f), 3));
                        sb.append("'");
                    }
                    else {
                        sb.append("'");
                        final String e = this.e;
                        kgk.aL((Object)e);
                        sb.append(e);
                        sb.append("'");
                    }
                }
                else {
                    sb.append(this.d);
                }
            }
            else {
                sb.append(this.c);
            }
        }
        else {
            sb.append(this.b);
        }
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof Flag) {
            final Flag flag = (Flag)o;
            if (nmr.q((Object)this.a, (Object)flag.a)) {
                final int g = this.g;
                if (g == flag.g) {
                    if (this.h == flag.h) {
                        if (g != 1) {
                            if (g == 2) {
                                return this.c == flag.c;
                            }
                            if (g == 3) {
                                return this.d == flag.d;
                            }
                            if (g == 4) {
                                return nmr.q((Object)this.e, (Object)flag.e);
                            }
                            if (g == 5) {
                                return Arrays.equals(this.f, flag.f);
                            }
                            final StringBuilder sb = new StringBuilder("Invalid enum value: ");
                            sb.append(g);
                            throw new AssertionError((Object)sb.toString());
                        }
                        else if (this.b == flag.b) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public final String toString() {
        return this.a(new StringBuilder());
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        final String a = this.a;
        if (!njx.b((Object)a)) {
            kgk.ac(parcel, 2, a);
        }
        final long b = this.b;
        if (b != 0L) {
            kgk.P(parcel, 3, b);
        }
        if (this.c) {
            kgk.K(parcel, 4, true);
        }
        final double d = this.d;
        if (d != 0.0) {
            kgk.L(parcel, 5, d);
        }
        final String e = this.e;
        if (!njx.b((Object)e)) {
            kgk.ac(parcel, 6, e);
        }
        final byte[] f = this.f;
        if (!njx.b((Object)f)) {
            kgk.S(parcel, 7, f);
        }
        final int g = this.g;
        if (!njx.a(g)) {
            kgk.O(parcel, 8, g);
        }
        final int h = this.h;
        if (!njx.a(h)) {
            kgk.O(parcel, 9, h);
        }
        kgk.J(parcel, i);
    }
}
