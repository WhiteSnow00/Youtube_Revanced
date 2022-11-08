import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.ref.WeakReference;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class orz
{
    public static final orz a;
    public final View b;
    public final Integer c;
    public final Integer d;
    public final oue e;
    public final asjf f;
    public final float g;
    public final oa h;
    public final boolean i;
    public final StringBuilder j;
    public final String k;
    public final String l;
    public final WeakReference m;
    public final WeakReference n;
    public final otg o;
    public final afcr p;
    public final osh q;
    public final String r;
    public final String s;
    public final boolean t;
    public final otb u;
    public final boolean v;
    public final int w;
    public final AtomicReference x;
    public final elw y;
    
    static {
        a = a().a();
    }
    
    public orz() {
    }
    
    public orz(final View b, final Integer c, final Integer d, final oue e, final asjf f, final float g, final elw y, final oa h, final boolean i, final StringBuilder j, final String k, final String l, final WeakReference m, final WeakReference n, final otg o, final afcr p27, final osh q, final String r, final String s, final boolean t, final otb u, final boolean v, final int w, final AtomicReference x, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.y = y;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p27;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public static ory a() {
        final ory ory = new ory();
        ory.b(true);
        ory.p |= 0x4;
        ory.i(true);
        ory.d = oue.b;
        ory.g = new StringBuilder();
        ory.d(0.0f);
        ory.b(false);
        ory.f(false);
        ory.i = "";
        ory.c(0);
        ory.h = "";
        return ory;
    }
    
    public final otg b() {
        final otb u = this.u;
        otg otg;
        if (u != null) {
            otg = u.d;
        }
        else {
            otg = this.o;
        }
        return otg;
    }
    
    public final afcr c() {
        final otb u = this.u;
        afcr afcr;
        if (u != null) {
            afcr = u.i;
        }
        else {
            afcr = this.p;
        }
        return afcr;
    }
    
    public final aqec d() {
        final WeakReference m = this.m;
        if (m == null) {
            return null;
        }
        return (aqec)m.get();
    }
    
    public final String e(String string) {
        synchronized (this) {
            final StringBuilder j = this.j;
            if (j == null) {
                return string;
            }
            string = j.toString();
            return string;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof orz) {
            final orz orz = (orz)o;
            final View b = this.b;
            if (b == null) {
                if (orz.b != null) {
                    return false;
                }
            }
            else if (!b.equals(orz.b)) {
                return false;
            }
            final Integer c = this.c;
            if (c == null) {
                if (orz.c != null) {
                    return false;
                }
            }
            else if (!c.equals(orz.c)) {
                return false;
            }
            final Integer d = this.d;
            if (d == null) {
                if (orz.d != null) {
                    return false;
                }
            }
            else if (!d.equals(orz.d)) {
                return false;
            }
            final oue e = this.e;
            if (e == null) {
                if (orz.e != null) {
                    return false;
                }
            }
            else if (!e.equals(orz.e)) {
                return false;
            }
            final asjf f = this.f;
            if (f == null) {
                if (orz.f != null) {
                    return false;
                }
            }
            else if (!f.equals(orz.f)) {
                return false;
            }
            if (Float.floatToIntBits(this.g) == Float.floatToIntBits(orz.g)) {
                final elw y = this.y;
                if (y == null) {
                    if (orz.y != null) {
                        return false;
                    }
                }
                else if (!y.equals((Object)orz.y)) {
                    return false;
                }
                final oa h = this.h;
                if (h == null) {
                    if (orz.h != null) {
                        return false;
                    }
                }
                else if (!h.equals(orz.h)) {
                    return false;
                }
                if (this.i == orz.i) {
                    final StringBuilder j = this.j;
                    if (j == null) {
                        if (orz.j != null) {
                            return false;
                        }
                    }
                    else if (!j.equals(orz.j)) {
                        return false;
                    }
                    if (this.k.equals(orz.k) && this.l.equals(orz.l)) {
                        final WeakReference m = this.m;
                        if (m == null) {
                            if (orz.m != null) {
                                return false;
                            }
                        }
                        else if (!m.equals(orz.m)) {
                            return false;
                        }
                        final WeakReference n = this.n;
                        if (n == null) {
                            if (orz.n != null) {
                                return false;
                            }
                        }
                        else if (!n.equals(orz.n)) {
                            return false;
                        }
                        final otg o2 = this.o;
                        if (o2 == null) {
                            if (orz.o != null) {
                                return false;
                            }
                        }
                        else if (!o2.equals(orz.o)) {
                            return false;
                        }
                        final afcr p = this.p;
                        if (p == null) {
                            if (orz.p != null) {
                                return false;
                            }
                        }
                        else if (!adwd.ar((List)p, orz.p)) {
                            return false;
                        }
                        final osh q = this.q;
                        if (q == null) {
                            if (orz.q != null) {
                                return false;
                            }
                        }
                        else if (!q.equals(orz.q)) {
                            return false;
                        }
                        final String r = this.r;
                        if (r == null) {
                            if (orz.r != null) {
                                return false;
                            }
                        }
                        else if (!r.equals(orz.r)) {
                            return false;
                        }
                        final String s = this.s;
                        if (s == null) {
                            if (orz.s != null) {
                                return false;
                            }
                        }
                        else if (!s.equals(orz.s)) {
                            return false;
                        }
                        if (this.t == orz.t) {
                            final otb u = this.u;
                            if (u == null) {
                                if (orz.u != null) {
                                    return false;
                                }
                            }
                            else if (!u.equals(orz.u)) {
                                return false;
                            }
                            if (this.v == orz.v && this.w == orz.w) {
                                final AtomicReference x = this.x;
                                final AtomicReference x2 = orz.x;
                                if (x == null) {
                                    if (x2 != null) {
                                        return false;
                                    }
                                }
                                else if (!x.equals(x2)) {
                                    return false;
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public final void f(final String... array) {
        monitorenter(this);
        try {
            final StringBuilder j = this.j;
            if (j != null) {
                for (int i = 0; i < 2; ++i) {
                    j.append(array[i]);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean g() {
        final otb u = this.u;
        boolean b;
        if (u != null) {
            b = u.e;
        }
        else {
            b = this.i;
        }
        return b;
    }
    
    public final ory h() {
        return new ory(this);
    }
    
    @Override
    public final int hashCode() {
        final View b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final Integer c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final Integer d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final oue e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final asjf f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        final int floatToIntBits = Float.floatToIntBits(this.g);
        final elw y = this.y;
        int hashCode7;
        if (y == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = y.hashCode();
        }
        final oa h = this.h;
        int hashCode8;
        if (h == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = h.hashCode();
        }
        final boolean i = this.i;
        int n = 1231;
        int n2;
        if (!i) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        final StringBuilder j = this.j;
        int hashCode9;
        if (j == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = j.hashCode();
        }
        final int hashCode10 = this.k.hashCode();
        final int hashCode11 = this.l.hashCode();
        final WeakReference m = this.m;
        int hashCode12;
        if (m == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = m.hashCode();
        }
        final WeakReference n3 = this.n;
        int hashCode13;
        if (n3 == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = n3.hashCode();
        }
        final otg o = this.o;
        int hashCode14;
        if (o == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = o.hashCode();
        }
        final afcr p = this.p;
        int hashCode15;
        if (p == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = p.hashCode();
        }
        final osh q = this.q;
        int hashCode16;
        if (q == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = q.hashCode();
        }
        final String r = this.r;
        int hashCode17;
        if (r == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = r.hashCode();
        }
        final String s = this.s;
        int hashCode18;
        if (s == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = s.hashCode();
        }
        int n4;
        if (!this.t) {
            n4 = 1237;
        }
        else {
            n4 = 1231;
        }
        final otb u = this.u;
        int hashCode19;
        if (u == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = u.hashCode();
        }
        if (!this.v) {
            n = 1237;
        }
        final int w = this.w;
        final AtomicReference x = this.x;
        if (x != null) {
            hashCode = x.hashCode();
        }
        return ((((((((((((((((((((((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ floatToIntBits) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ n2) * 1000003 ^ 0x4D5) * -721379959 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ hashCode11) * 1000003 ^ hashCode12) * 1000003 ^ hashCode13) * 1000003 ^ hashCode14) * 1000003 ^ hashCode15) * 1000003 ^ hashCode16) * 1000003 ^ hashCode17) * 1000003 ^ hashCode18) * 1000003 ^ n4) * 1000003 ^ hashCode19) * 1000003 ^ n) * 1000003 ^ w) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final Integer c = this.c;
        final Integer d = this.d;
        final String value2 = String.valueOf(this.e);
        final String value3 = String.valueOf(this.f);
        final float g = this.g;
        final String value4 = String.valueOf(this.y);
        final String value5 = String.valueOf(this.h);
        final boolean i = this.i;
        final String value6 = String.valueOf(this.j);
        final String k = this.k;
        final String l = this.l;
        final String value7 = String.valueOf(this.m);
        final String value8 = String.valueOf(this.n);
        final String value9 = String.valueOf(this.o);
        final String value10 = String.valueOf(this.p);
        final String value11 = String.valueOf(this.q);
        final String r = this.r;
        final String s = this.s;
        final boolean t = this.t;
        final String value12 = String.valueOf(this.u);
        final boolean v = this.v;
        final int w = this.w;
        final String value13 = String.valueOf(this.x);
        final StringBuilder sb = new StringBuilder("ConversionContext{container=");
        sb.append(value);
        sb.append(", widthConstraint=");
        sb.append(c);
        sb.append(", heightConstraint=");
        sb.append(d);
        sb.append(", templateLoggerFactory=");
        sb.append(value2);
        sb.append(", rootDisposableContainer=");
        sb.append(value3);
        sb.append(", imagePrefetchRangeRatio=");
        sb.append(g);
        sb.append(", horizontalCollectionTouchInterceptor=");
        sb.append(value4);
        sb.append(", horizontalCollectionSwipeProtector=");
        sb.append(value5);
        sb.append(", useIncrementalMountOnChildrenInternal=");
        sb.append(i);
        sb.append(", useLegacyVisibleInternal=false, recyclerBinderConfiguration=null, pathBuilder=");
        sb.append(value6);
        sb.append(", elementId=");
        sb.append(k);
        sb.append(", identifierProperty=");
        sb.append(l);
        sb.append(", loggingNodeInternal=");
        sb.append(value7);
        sb.append(", parentLoggingNodeInternal=");
        sb.append(value8);
        sb.append(", elementsInteractionLoggerInternal=");
        sb.append(value9);
        sb.append(", globalCommandDataDecoratorsInternal=");
        sb.append(value10);
        sb.append(", decoratingElementBuilder=");
        sb.append(value11);
        sb.append(", debugId=");
        sb.append(r);
        sb.append(", treeDebugId=");
        sb.append(s);
        sb.append(", shouldAddDebuggerViewTags=");
        sb.append(t);
        sb.append(", elementsConfig=");
        sb.append(value12);
        sb.append(", couldOverlapWithElementsConfig=");
        sb.append(v);
        sb.append(", elementDepthInTree=");
        sb.append(w);
        sb.append(", scrollStrategyListenerHolder=");
        sb.append(value13);
        sb.append("}");
        return sb.toString();
    }
}
