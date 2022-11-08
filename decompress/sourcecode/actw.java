import j$.util.Optional;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class actw implements actm, gav
{
    public final boolean a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final View$OnClickListener e;
    public final aibb f;
    public final CharSequence g;
    public final View$OnClickListener h;
    public final aibb i;
    public final aorm j;
    public final int k;
    public final Optional l;
    public final wyb m;
    private final boolean n;
    private final int o;
    private final actk p;
    
    public actw() {
    }
    
    public actw(final boolean n, final boolean a, final int o, final CharSequence b, final CharSequence c, final CharSequence d, final View$OnClickListener e, final aibb f, final CharSequence g, final View$OnClickListener h, final aibb i, final aorm j, final int k, final Optional l, final wyb m, final actk p16) {
        this.n = n;
        this.a = a;
        this.o = o;
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
        this.l = l;
        this.m = m;
        this.p = p16;
    }
    
    public static actv d() {
        final actv actv = new actv((char[])null);
        actv.m();
        actv.k(true);
        actv.m |= 0x2;
        actv.l(false);
        return actv.d(0);
    }
    
    public final int a() {
        return 2;
    }
    
    public final boolean b() {
        return this.n;
    }
    
    public final boolean c() {
        return false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof actw) {
            final actw actw = (actw)o;
            if (this.n == actw.n && this.a == actw.a && this.o == actw.o) {
                final CharSequence b = this.b;
                if (b == null) {
                    if (actw.b != null) {
                        return false;
                    }
                }
                else if (!b.equals(actw.b)) {
                    return false;
                }
                final CharSequence c = this.c;
                if (c == null) {
                    if (actw.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(actw.c)) {
                    return false;
                }
                final CharSequence d = this.d;
                if (d == null) {
                    if (actw.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(actw.d)) {
                    return false;
                }
                final View$OnClickListener e = this.e;
                if (e == null) {
                    if (actw.e != null) {
                        return false;
                    }
                }
                else if (!e.equals(actw.e)) {
                    return false;
                }
                final aibb f = this.f;
                if (f == null) {
                    if (actw.f != null) {
                        return false;
                    }
                }
                else if (!((agzi)f).equals(actw.f)) {
                    return false;
                }
                final CharSequence g = this.g;
                if (g == null) {
                    if (actw.g != null) {
                        return false;
                    }
                }
                else if (!g.equals(actw.g)) {
                    return false;
                }
                final View$OnClickListener h = this.h;
                if (h == null) {
                    if (actw.h != null) {
                        return false;
                    }
                }
                else if (!h.equals(actw.h)) {
                    return false;
                }
                final aibb i = this.i;
                if (i == null) {
                    if (actw.i != null) {
                        return false;
                    }
                }
                else if (!((agzi)i).equals(actw.i)) {
                    return false;
                }
                final aorm j = this.j;
                if (j == null) {
                    if (actw.j != null) {
                        return false;
                    }
                }
                else if (!((agzi)j).equals(actw.j)) {
                    return false;
                }
                if (this.k == actw.k && this.l.equals((Object)actw.l)) {
                    final wyb m = this.m;
                    if (m == null) {
                        if (actw.m != null) {
                            return false;
                        }
                    }
                    else if (!m.equals((Object)actw.m)) {
                        return false;
                    }
                    final actk p = this.p;
                    final actk p2 = actw.p;
                    if (p == null) {
                        if (p2 != null) {
                            return false;
                        }
                    }
                    else if (!p.equals(p2)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int f() {
        return this.o;
    }
    
    @Override
    public final int hashCode() {
        final boolean n = this.n;
        int n2 = 1231;
        int n3;
        if (!n) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        if (!this.a) {
            n2 = 1237;
        }
        final int o = this.o;
        final CharSequence b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final CharSequence c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final CharSequence d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final View$OnClickListener e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final aibb f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = ((agzi)f).hashCode();
        }
        final CharSequence g = this.g;
        int hashCode7;
        if (g == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = g.hashCode();
        }
        final View$OnClickListener h = this.h;
        int hashCode8;
        if (h == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = h.hashCode();
        }
        final aibb i = this.i;
        int hashCode9;
        if (i == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = ((agzi)i).hashCode();
        }
        final aorm j = this.j;
        int hashCode10;
        if (j == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = ((agzi)j).hashCode();
        }
        final int k = this.k;
        final int hashCode11 = this.l.hashCode();
        final wyb m = this.m;
        int a;
        if (m == null) {
            a = 0;
        }
        else {
            a = m.a;
        }
        final actk p = this.p;
        if (p != null) {
            hashCode = p.hashCode();
        }
        return ((((((((((((((((n3 ^ 0xF4243) * 1000003 ^ 0x4D5) * 1000003 ^ n2) * 1000003 ^ o) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ k) * 1000003 ^ hashCode11) * 1000003 ^ a) * 1000003 ^ hashCode;
    }
    
    public final actk i() {
        return this.p;
    }
    
    public final boolean k() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final boolean n = this.n;
        final boolean a = this.a;
        final int o = this.o;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final String value4 = String.valueOf(this.e);
        final String value5 = String.valueOf(this.f);
        final String value6 = String.valueOf(this.g);
        final String value7 = String.valueOf(this.h);
        final String value8 = String.valueOf(this.i);
        final String value9 = String.valueOf(this.j);
        final int k = this.k;
        final String value10 = String.valueOf(this.l);
        final String value11 = String.valueOf(this.m);
        final String value12 = String.valueOf(this.p);
        final StringBuilder sb = new StringBuilder("MealbarBottomUiModel{rateLimited=");
        sb.append(n);
        sb.append(", shownOnFullscreen=false, counterfactual=");
        sb.append(a);
        sb.append(", duration=");
        sb.append(o);
        sb.append(", titleText=");
        sb.append(value);
        sb.append(", detailText=");
        sb.append(value2);
        sb.append(", actionText=");
        sb.append(value3);
        sb.append(", actionListener=");
        sb.append(value4);
        sb.append(", actionButtonRenderer=");
        sb.append(value5);
        sb.append(", dismissText=");
        sb.append(value6);
        sb.append(", dismissListener=");
        sb.append(value7);
        sb.append(", dismissButtonRenderer=");
        sb.append(value8);
        sb.append(", thumbnail=");
        sb.append(value9);
        sb.append(", icon=");
        sb.append(k);
        sb.append(", iconColorAttribute=");
        sb.append(value10);
        sb.append(", clientVeType=");
        sb.append(value11);
        sb.append(", transientUiCallback=");
        sb.append(value12);
        sb.append("}");
        return sb.toString();
    }
}
