import j$.util.Optional;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxn implements acxd, gbi
{
    public final boolean a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final View$OnClickListener e;
    public final aies f;
    public final CharSequence g;
    public final View$OnClickListener h;
    public final aies i;
    public final aowb j;
    public final int k;
    public final Optional l;
    public final xbg m;
    private final boolean n;
    private final int o;
    private final acxb p;
    
    public acxn() {
    }
    
    public acxn(final boolean n, final boolean a, final int o, final CharSequence b, final CharSequence c, final CharSequence d, final View$OnClickListener e, final aies f, final CharSequence g, final View$OnClickListener h, final aies i, final aowb j, final int k, final Optional l, final xbg m, final acxb p16) {
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
    
    public static acxm d() {
        final acxm acxm = new acxm((char[])null);
        acxm.m();
        acxm.k(true);
        acxm.m |= 0x2;
        acxm.l(false);
        return acxm.d(0);
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
        if (o instanceof acxn) {
            final acxn acxn = (acxn)o;
            if (this.n == acxn.n && this.a == acxn.a && this.o == acxn.o) {
                final CharSequence b = this.b;
                if (b == null) {
                    if (acxn.b != null) {
                        return false;
                    }
                }
                else if (!b.equals(acxn.b)) {
                    return false;
                }
                final CharSequence c = this.c;
                if (c == null) {
                    if (acxn.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(acxn.c)) {
                    return false;
                }
                final CharSequence d = this.d;
                if (d == null) {
                    if (acxn.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(acxn.d)) {
                    return false;
                }
                final View$OnClickListener e = this.e;
                if (e == null) {
                    if (acxn.e != null) {
                        return false;
                    }
                }
                else if (!e.equals(acxn.e)) {
                    return false;
                }
                final aies f = this.f;
                if (f == null) {
                    if (acxn.f != null) {
                        return false;
                    }
                }
                else if (!((ahcz)f).equals(acxn.f)) {
                    return false;
                }
                final CharSequence g = this.g;
                if (g == null) {
                    if (acxn.g != null) {
                        return false;
                    }
                }
                else if (!g.equals(acxn.g)) {
                    return false;
                }
                final View$OnClickListener h = this.h;
                if (h == null) {
                    if (acxn.h != null) {
                        return false;
                    }
                }
                else if (!h.equals(acxn.h)) {
                    return false;
                }
                final aies i = this.i;
                if (i == null) {
                    if (acxn.i != null) {
                        return false;
                    }
                }
                else if (!((ahcz)i).equals(acxn.i)) {
                    return false;
                }
                final aowb j = this.j;
                if (j == null) {
                    if (acxn.j != null) {
                        return false;
                    }
                }
                else if (!((ahcz)j).equals(acxn.j)) {
                    return false;
                }
                if (this.k == acxn.k && this.l.equals((Object)acxn.l)) {
                    final xbg m = this.m;
                    if (m == null) {
                        if (acxn.m != null) {
                            return false;
                        }
                    }
                    else if (!m.equals((Object)acxn.m)) {
                        return false;
                    }
                    final acxb p = this.p;
                    final acxb p2 = acxn.p;
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
    
    @Override
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
        final aies f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = ((ahcz)f).hashCode();
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
        final aies i = this.i;
        int hashCode9;
        if (i == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = ((ahcz)i).hashCode();
        }
        final aowb j = this.j;
        int hashCode10;
        if (j == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = ((ahcz)j).hashCode();
        }
        final int k = this.k;
        final int hashCode11 = this.l.hashCode();
        final xbg m = this.m;
        int a;
        if (m == null) {
            a = 0;
        }
        else {
            a = m.a;
        }
        final acxb p = this.p;
        if (p != null) {
            hashCode = p.hashCode();
        }
        return ((((((((((((((((n3 ^ 0xF4243) * 1000003 ^ 0x4D5) * 1000003 ^ n2) * 1000003 ^ o) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ k) * 1000003 ^ hashCode11) * 1000003 ^ a) * 1000003 ^ hashCode;
    }
    
    @Override
    public final acxb i() {
        return this.p;
    }
    
    @Override
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
