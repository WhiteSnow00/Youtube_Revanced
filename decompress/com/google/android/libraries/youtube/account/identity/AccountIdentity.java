// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.account.identity;

import java.util.List;
import java.io.Serializable;
import android.os.Parcelable;

public abstract class AccountIdentity implements Parcelable, Serializable, zme
{
    public static AccountIdentity A(final String s, final String s2, final String s3, final boolean b, final String s4) {
        return C(s, s2, s3, false, b, false, false, false, false, 2, s4);
    }
    
    public static AccountIdentity B(final String s, final String s2, String s3, final int n, final String s4) {
        if (s3 == null) {
            s3 = "";
        }
        return (AccountIdentity)new AutoValue_AccountIdentity(s, s2, "", false, false, false, s3, false, false, false, n, s4);
    }
    
    private static AccountIdentity C(final String s, final String s2, String s3, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final boolean b6, final int n, String s4) {
        if (s3 == null) {
            s3 = "";
        }
        if (s4 == null) {
            s4 = "";
        }
        return (AccountIdentity)new AutoValue_AccountIdentity(s, s2, s3, b, b2, b3, s4, b4, b5, b6, n, "NO_DELEGATION_CONTEXT");
    }
    
    private static AccountIdentity D(final String s, final String s2, final boolean b, final boolean b2, final boolean b3, final boolean b4, final int n, final String s3) {
        return C(s, s2, null, false, false, b, b2, b3, b4, n, s3);
    }
    
    public static AccountIdentity m(final aima aima) {
        if ((aima.c & 0x80) != 0x0) {
            final String h = aima.h;
            final String i = aima.i;
            ajci ajci;
            if ((ajci = aima.j) == null) {
                ajci = ajci.a;
            }
            final String b = ajci.b;
            int aw;
            if ((aw = aeuz.aw(aima.f)) == 0) {
                aw = 1;
            }
            return B(h, i, b, aw, aima.k);
        }
        if (((List)new ahbr((List)aima.g, aima.a)).contains(ahkf.e)) {
            final String h2 = aima.h;
            final String j = aima.i;
            final String d = aima.d;
            ajci ajci2;
            if ((ajci2 = aima.j) == null) {
                ajci2 = ajci.a;
            }
            return n(h2, j, d, ajci2.b);
        }
        if (((List)new ahbr((List)aima.g, aima.a)).contains(ahkf.d)) {
            final String d2 = aima.d;
            final String k = aima.i;
            ajci ajci3;
            if ((ajci3 = aima.j) == null) {
                ajci3 = ajci.a;
            }
            return s(d2, k, ajci3.b);
        }
        if (((List)new ahbr((List)aima.g, aima.a)).contains(ahkf.b)) {
            final int aw2 = aeuz.aw(aima.f);
            if (aw2 != 0) {
                if (aw2 == 3) {
                    final String d3 = aima.d;
                    final String l = aima.i;
                    ajci ajci4;
                    if ((ajci4 = aima.j) == null) {
                        ajci4 = ajci.a;
                    }
                    return p(d3, l, ajci4.b);
                }
            }
            final String h3 = aima.h;
            final String m = aima.i;
            ajci ajci5;
            if ((ajci5 = aima.j) == null) {
                ajci5 = ajci.a;
            }
            return u(h3, m, ajci5.b, ((List)new ahbr((List)aima.g, aima.a)).contains((Object)ahkf.c));
        }
        if (((List)new ahbr((List)aima.g, aima.a)).contains(ahkf.g)) {
            final int aw3 = aeuz.aw(aima.f);
            if (aw3 != 0) {
                if (aw3 == 3) {
                    final String d4 = aima.d;
                    final String i2 = aima.i;
                    ajci ajci6;
                    if ((ajci6 = aima.j) == null) {
                        ajci6 = ajci.a;
                    }
                    return o(d4, i2, ajci6.b);
                }
            }
            final String h4 = aima.h;
            final String i3 = aima.i;
            ajci ajci7;
            if ((ajci7 = aima.j) == null) {
                ajci7 = ajci.a;
            }
            return q(h4, i3, ajci7.b, ((List)new ahbr((List)aima.g, aima.a)).contains((Object)ahkf.c));
        }
        final String h5 = aima.h;
        final String i4 = aima.i;
        ajci ajci8;
        if ((ajci8 = aima.j) == null) {
            ajci8 = ajci.a;
        }
        return n(h5, i4, null, ajci8.b);
    }
    
    public static AccountIdentity n(final String s, final String s2, final String s3, final String s4) {
        return A(s, s2, s3, false, s4);
    }
    
    public static AccountIdentity o(final String s, final String s2, final String s3) {
        return D(s, s2, false, false, true, false, 3, s3);
    }
    
    public static AccountIdentity p(final String s, final String s2, final String s3) {
        return D(s, s2, false, true, false, false, 3, s3);
    }
    
    public static AccountIdentity q(final String s, final String s2, final String s3, final boolean b) {
        return D(s, s2, false, false, true, b, 2, s3);
    }
    
    public static AccountIdentity r(final String s, final String s2) {
        return C(s, "INCOGNITO_ACCOUNT_NAME", null, true, false, false, false, false, false, 2, s2);
    }
    
    public static AccountIdentity s(final String s, final String s2, final String s3) {
        return D(s, s2, true, false, false, false, 3, s3);
    }
    
    public static AccountIdentity t(final String s) {
        return A("PRIMORDIAL-".concat(String.valueOf(s)), s, "", false, "PRIMORDIAL-".concat(String.valueOf(s)));
    }
    
    public static AccountIdentity u(final String s, final String s2, final String s3, final boolean b) {
        return D(s, s2, false, true, false, b, 2, s3);
    }
    
    public abstract String a();
    
    public abstract String b();
    
    public abstract String c();
    
    public abstract String d();
    
    public abstract String e();
    
    public abstract boolean f();
    
    public abstract boolean g();
    
    public abstract boolean h();
    
    @Override
    public final int hashCode() {
        return this.d().hashCode();
    }
    
    public abstract boolean i();
    
    public abstract boolean j();
    
    public abstract boolean k();
    
    public abstract int l();
    
    public final boolean v() {
        return !"NO_DELEGATION_CONTEXT".equals(this.c());
    }
    
    public final boolean w() {
        return !this.e().equals("");
    }
    
    public final boolean x() {
        return this.w() || this.v() || this.h() || this.l() != 2;
    }
    
    public final boolean y() {
        return false;
    }
    
    public final boolean z() {
        return this.g();
    }
}
