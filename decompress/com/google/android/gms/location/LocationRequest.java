// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.location;

import android.os.Parcelable;
import android.os.Parcel;
import java.lang.reflect.Method;
import android.util.Log;
import java.util.Arrays;
import android.os.SystemClock;
import com.google.android.gms.libs.identity.ClientIdentity;
import android.os.WorkSource;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public float g;
    public boolean h;
    public long i;
    public final int j;
    public final int k;
    public final String l;
    public final boolean m;
    public final WorkSource n;
    public final ClientIdentity o;
    
    static {
        CREATOR = (Parcelable$Creator)new nbt();
    }
    
    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }
    
    public LocationRequest(final int a, long n, final long c, final long d, final long n2, long min, final int f, final float g, final boolean h, final long n3, final int j, final int k, final String l, final boolean m, final WorkSource n4, final ClientIdentity o) {
        this.a = a;
        this.b = n;
        this.c = c;
        this.d = d;
        if (n2 != Long.MAX_VALUE) {
            min = Math.min(Math.max(1L, n2 - SystemClock.elapsedRealtime()), min);
        }
        this.e = min;
        this.f = f;
        this.g = g;
        this.h = h;
        if (n3 != -1L) {
            n = n3;
        }
        this.i = n;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n4;
        this.o = o;
    }
    
    @Deprecated
    public static LocationRequest a() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }
    
    private static String f(final long n) {
        if (n == Long.MAX_VALUE) {
            return "\u221e";
        }
        synchronized (ncj.a) {
            ncj.a.setLength(0);
            ncj.a(n, ncj.a);
            return ncj.a.toString();
        }
    }
    
    public final boolean b() {
        final long d = this.d;
        return d > 0L && d >> 1 >= this.b;
    }
    
    public final boolean c() {
        return this.a == 105;
    }
    
    @Deprecated
    public final void d(final long n) {
        khl.aR(n >= 0L, (Object)"intervalMillis must be greater than or equal to 0");
        final long c = this.c;
        final long b = this.b;
        if (c == b / 6L) {
            this.c = n / 6L;
        }
        if (this.i == b) {
            this.i = n;
        }
        this.b = n;
    }
    
    @Deprecated
    public final void e(final int a) {
        int n = 0;
        boolean b = false;
        Label_0041: {
            if (a != 100 && a != 102 && a != 104) {
                n = 105;
                if (a != 105) {
                    n = a;
                    b = false;
                    break Label_0041;
                }
            }
            else {
                n = a;
            }
            b = true;
        }
        khl.aS(b, "priority %d must be a Priority.PRIORITY_* constant", new Object[] { n });
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        if (o instanceof LocationRequest) {
            final LocationRequest locationRequest = (LocationRequest)o;
            if (this.a == locationRequest.a && (this.c() || this.b == locationRequest.b) && this.c == locationRequest.c && this.b() == locationRequest.b() && (!this.b() || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && this.h == locationRequest.h && this.j == locationRequest.j && this.k == locationRequest.k && this.m == locationRequest.m && this.n.equals((Object)locationRequest.n) && khl.be((Object)this.l, (Object)locationRequest.l) && khl.be((Object)this.o, (Object)locationRequest.o)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.n });
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (this.c()) {
            sb.append(nbr.ad(this.a));
        }
        else {
            sb.append("@");
            if (this.b()) {
                ncj.a(this.b, sb);
                sb.append("/");
                ncj.a(this.d, sb);
            }
            else {
                ncj.a(this.b, sb);
            }
            sb.append(" ");
            sb.append(nbr.ad(this.a));
        }
        if (this.c() || this.c != this.b) {
            sb.append(", minUpdateInterval=");
            sb.append(f(this.c));
        }
        if (this.g > 0.0) {
            sb.append(", minUpdateDistance=");
            sb.append(this.g);
        }
        Label_0236: {
            if (this.c()) {
                if (this.i == Long.MAX_VALUE) {
                    break Label_0236;
                }
            }
            else if (this.i == this.b) {
                break Label_0236;
            }
            sb.append(", maxUpdateAge=");
            sb.append(f(this.i));
        }
        if (this.e != Long.MAX_VALUE) {
            sb.append(", duration=");
            ncj.a(this.e, sb);
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f);
        }
        if (this.k != 0) {
            sb.append(", ");
            final int k = this.k;
            String s;
            if (k != 0) {
                if (k != 1) {
                    if (k != 2) {
                        throw new IllegalArgumentException();
                    }
                    s = "THROTTLE_NEVER";
                }
                else {
                    s = "THROTTLE_ALWAYS";
                }
            }
            else {
                s = "THROTTLE_BACKGROUND";
            }
            sb.append(s);
        }
        if (this.j != 0) {
            sb.append(", ");
            sb.append(nbr.ag(this.j));
        }
        if (this.h) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.m) {
            sb.append(", bypass");
        }
        if (this.l != null) {
            sb.append(", moduleId=");
            sb.append(this.l);
        }
        final WorkSource n = this.n;
        final Method b = mvq.b;
        Label_0539: {
            if (b != null) {
                try {
                    final Object invoke = b.invoke(n, new Object[0]);
                    khl.aP(invoke);
                    if (!(boolean)invoke) {
                        break Label_0539;
                    }
                    break Label_0539;
                }
                catch (final Exception ex) {
                    Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", (Throwable)ex);
                }
            }
            final Method a = mvq.a;
            if (a == null) {
                break Label_0539;
            }
            try {
                final Object invoke2 = a.invoke(n, new Object[0]);
                khl.aP(invoke2);
                if ((int)invoke2 != 0) {
                    sb.append(", ");
                    sb.append(this.n);
                }
            }
            catch (final Exception ex2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", (Throwable)ex2);
            }
        }
        if (this.o != null) {
            sb.append(", impersonation=");
            sb.append(this.o);
        }
        sb.append(']');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.T(parcel, 2, this.b);
        khl.T(parcel, 3, this.c);
        khl.S(parcel, 6, this.f);
        khl.Q(parcel, 7, this.g);
        khl.T(parcel, 8, this.d);
        khl.O(parcel, 9, this.h);
        khl.T(parcel, 10, this.e);
        khl.T(parcel, 11, this.i);
        khl.S(parcel, 12, this.j);
        khl.S(parcel, 13, this.k);
        khl.ag(parcel, 14, this.l);
        khl.O(parcel, 15, this.m);
        khl.af(parcel, 16, (Parcelable)this.n, n);
        khl.af(parcel, 17, (Parcelable)this.o, n);
        khl.N(parcel, m);
    }
}
