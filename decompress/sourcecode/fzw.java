import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzw
{
    public final fzb a;
    public final fzl b;
    public final fzn c;
    public final fzr d;
    public final fzs e;
    public final boolean f;
    public final boolean g;
    public final Object h;
    public final fzh i;
    public final ActionBarColor j;
    public final ActionBarColor k;
    public final int l;
    public final ActionBarColor m;
    public final int n;
    public final ActionBarColor o;
    public final ActionBarColor p;
    public final boolean q;
    public final boolean r;
    
    public fzw() {
    }
    
    public fzw(final fzb a, final fzl b, final fzn c, final fzr d, final fzs e, final boolean f, final boolean g, final Object h, final fzh i, final ActionBarColor j, final ActionBarColor k, final int l, final ActionBarColor m, final int n, final ActionBarColor o, final ActionBarColor p18, final boolean q, final boolean r) {
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
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p18;
        this.q = q;
        this.r = r;
    }
    
    public static fzv a() {
        final fzv fzv = new fzv();
        fzv.b(fzb.a().b());
        fzv.d(false);
        fzv.e(false);
        fzv.f = fzh.a().a();
        fzv.c(ezp.u());
        fzv.k(ezp.u());
        fzv.h(0);
        fzv.g(ezp.u());
        fzv.j(0);
        fzv.i(ezp.u());
        fzv.f(ezp.u());
        fzv.l(false);
        fzv.m(true);
        return fzv;
    }
    
    public final fzv b() {
        return new fzv(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fzw) {
            final fzw fzw = (fzw)o;
            if (this.a.equals(fzw.a)) {
                final fzl b = this.b;
                if (b == null) {
                    if (fzw.b != null) {
                        return false;
                    }
                }
                else if (!b.equals(fzw.b)) {
                    return false;
                }
                final fzn c = this.c;
                if (c == null) {
                    if (fzw.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(fzw.c)) {
                    return false;
                }
                final fzr d = this.d;
                if (d == null) {
                    if (fzw.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(fzw.d)) {
                    return false;
                }
                final fzs e = this.e;
                if (e == null) {
                    if (fzw.e != null) {
                        return false;
                    }
                }
                else if (!e.equals(fzw.e)) {
                    return false;
                }
                if (this.f == fzw.f && this.g == fzw.g) {
                    final Object h = this.h;
                    if (h == null) {
                        if (fzw.h != null) {
                            return false;
                        }
                    }
                    else if (!h.equals(fzw.h)) {
                        return false;
                    }
                    if (this.i.equals(fzw.i) && this.j.equals(fzw.j) && this.k.equals(fzw.k) && this.l == fzw.l && this.m.equals(fzw.m) && this.n == fzw.n && this.o.equals(fzw.o) && this.p.equals(fzw.p) && this.q == fzw.q && this.r == fzw.r) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final fzl b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final fzn c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final fzr d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final fzs e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final boolean f = this.f;
        int n = 1237;
        int n2;
        if (!f) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.g) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        final Object h = this.h;
        if (h != null) {
            hashCode2 = h.hashCode();
        }
        final int hashCode7 = this.i.hashCode();
        final int hashCode8 = this.j.hashCode();
        final int hashCode9 = this.k.hashCode();
        final int l = this.l;
        final int hashCode10 = this.m.hashCode();
        final int n4 = this.n;
        final int hashCode11 = this.o.hashCode();
        final int hashCode12 = this.p.hashCode();
        int n5;
        if (!this.q) {
            n5 = 1237;
        }
        else {
            n5 = 1231;
        }
        if (this.r) {
            n = 1231;
        }
        return (((((((((((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ hashCode2) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ l) * 1000003 ^ hashCode10) * 1000003 ^ n4) * 1000003 ^ hashCode11) * 1000003 ^ hashCode12) * 1000003 ^ n5) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.e);
        final boolean f = this.f;
        final boolean g = this.g;
        final String value6 = String.valueOf(this.h);
        final String value7 = String.valueOf(this.i);
        final String value8 = String.valueOf(this.j);
        final String value9 = String.valueOf(this.k);
        final int l = this.l;
        final String value10 = String.valueOf(this.m);
        final int n = this.n;
        final String value11 = String.valueOf(this.o);
        final String value12 = String.valueOf(this.p);
        final boolean q = this.q;
        final boolean r = this.r;
        final StringBuilder sb = new StringBuilder("TopBarModel{actionBarModel=");
        sb.append(value);
        sb.append(", feedFilterBarModel=");
        sb.append(value2);
        sb.append(", mySubsFilterBarModel=");
        sb.append(value3);
        sb.append(", searchResultsChipBarModel=");
        sb.append(value4);
        sb.append(", tabHeaderElementBarModel=");
        sb.append(value5);
        sb.append(", enableTranslucentActionBar=");
        sb.append(f);
        sb.append(", hideTitleOnTranslucentActionBar=");
        sb.append(g);
        sb.append(", headerRenderer=");
        sb.append(value6);
        sb.append(", collapseBehavior=");
        sb.append(value7);
        sb.append(", backgroundColor=");
        sb.append(value8);
        sb.append(", statusBarColor=");
        sb.append(value9);
        sb.append(", primaryTextStyleResId=");
        sb.append(l);
        sb.append(", primaryTextColor=");
        sb.append(value10);
        sb.append(", secondaryTextStyleResId=");
        sb.append(n);
        sb.append(", secondaryTextColor=");
        sb.append(value11);
        sb.append(", indicatorColor=");
        sb.append(value12);
        sb.append(", translucentWhenAccessibilityEnabled=");
        sb.append(q);
        sb.append(", visible=");
        sb.append(r);
        sb.append("}");
        return sb.toString();
    }
}
